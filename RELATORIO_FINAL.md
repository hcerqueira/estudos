# Relatório Final - Projeto Ansible LAMP (TCC)

## 📅 Informações do Teste
- **Data:** 15/05/2026
- **Ambiente:** 2 VMs (web01 e web02)
- **Playbook:** site.yml
- **Status:** ✅ SUCESSO TOTAL

## 📈 Estatísticas de Execução
- **Total de tasks:** 41 tasks por host
- **Tasks alteradas:** 19 por host
- **Falhas:** 0
- **Ignoradas:** 0
- **Tempo estimado:** ~3 minutos

## 🔧 Componentes Provisionados

### Serviços
- Apache2: active (PID: rodando)
- MySQL: active (PID: rodando)
- UFW: enabled (regras: 22,80,443)

### Banco de Dados
- Database: appdb
- User: appuser@localhost
- Permissões: ALL on appdb.*
- Senha: Gerenciada via Ansible Vault

### Usuário Deployer
- Nome: deployer
- Grupos: www-data
- Sudo: NOPASSWD para restart/reload apache2

### Aplicação Web
- Path: /var/www/html/index.php
- Template: index.php.j2
- Features: Exibe informações do servidor e status MySQL

## ✅ Testes Realizados
- [x] Provisionamento do zero
- [x] Teardown completo
- [x] Conexão HTTP nas duas VMs
- [x] Conexão MySQL via appuser
- [x] Firewall configurado e ativo
- [x] Usuário deployer com permissões corretas
- [x] Idempotência (segunda execução sem mudanças)

## 🚀 Próximos Passos
1. Commitar código no GitHub
2. Documentar no README
3. Apresentar TCC

