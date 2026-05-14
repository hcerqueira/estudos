#!/bin/bash
# ============================================================
# coletar_metricas.sh — Coleta métricas dos experimentos TCC
# Uso: ./coletar_metricas.sh <modo> <rodada> [playbook]
#   modo:    ansible | manual | ansible_ia
#   rodada:  1 | 2
#   playbook: site.yml (obrigatório para modos ansible*)
# ============================================================

MODO=$1
RODADA=$2
PLAYBOOK=${3:-site.yml}
CSV="logs/metricas_consolidadas.csv"
TIMESTAMP=$(date +%Y%m%d_%H%M%S)
LOG="logs/${MODO}_R${RODADA}_${TIMESTAMP}.log"

mkdir -p logs

# Cria CSV com header se não existir
if [ ! -f "$CSV" ]; then
  echo "timestamp,modo,rodada,tempo_real,tempo_user,tempo_sys,tasks_ok,tasks_changed,tasks_failed,erros,status" > "$CSV"
fi

if [[ "$MODO" == "ansible" || "$MODO" == "ansible_ia" ]]; then

  echo "▶ Iniciando experimento: $MODO | Rodada $RODADA | Playbook: $PLAYBOOK"
  START=$(date +%s%N)

  /usr/bin/time -f "%e %U %S" -o /tmp/time_output.txt \
    ansible-playbook "$PLAYBOOK" --ask-vault-pass 2>&1 | tee "$LOG"

  END=$(date +%s%N)
  TEMPO_REAL=$(cat /tmp/time_output.txt | awk '{print $1}')
  TEMPO_USER=$(cat /tmp/time_output.txt | awk '{print $2}')
  TEMPO_SYS=$(cat /tmp/time_output.txt  | awk '{print $3}')

  TASKS_OK=$(grep -oP 'ok=\K[0-9]+' "$LOG" | tail -1)
  TASKS_CHANGED=$(grep -oP 'changed=\K[0-9]+' "$LOG" | tail -1)
  TASKS_FAILED=$(grep -oP 'failed=\K[0-9]+' "$LOG" | tail -1)
  ERROS=$(grep -c "FAILED\|ERROR" "$LOG" || true)
  STATUS=$( [ "$TASKS_FAILED" == "0" ] && echo "sucesso" || echo "falha" )

  echo "$TIMESTAMP,$MODO,$RODADA,$TEMPO_REAL,$TEMPO_USER,$TEMPO_SYS,$TASKS_OK,$TASKS_CHANGED,$TASKS_FAILED,$ERROS,$STATUS" >> "$CSV"

  echo ""
  echo "✅ Métricas salvas em $CSV"
  echo "   Log completo: $LOG"

elif [[ "$MODO" == "manual" ]]; then

  echo "▶ Modo MANUAL — Rodada $RODADA"
  echo "   Cronômetro iniciado. Execute os passos manualmente."
  echo "   Quando terminar, pressione ENTER para registrar o tempo."
  echo ""
  START_EPOCH=$(date +%s)

  read -p "   ⏎ Pressione ENTER quando o deploy manual estiver concluído..."

  END_EPOCH=$(date +%s)
  TEMPO_REAL=$((END_EPOCH - START_EPOCH))

  read -p "   Nº de comandos executados: " N_CMDS
  read -p "   Nº de erros/retrabalhos:   " N_ERROS
  read -p "   Status (sucesso/falha):     " STATUS

  echo "$TIMESTAMP,$MODO,$RODADA,$TEMPO_REAL,0,0,$N_CMDS,$N_CMDS,$N_ERROS,$N_ERROS,$STATUS" >> "$CSV"

  echo ""
  echo "✅ Métricas manuais salvas em $CSV"

else
  echo "Uso: $0 <ansible|manual|ansible_ia> <rodada> [playbook]"
  exit 1
fi
