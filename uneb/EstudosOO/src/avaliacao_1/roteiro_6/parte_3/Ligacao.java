package avaliacao_1.roteiro_6.parte_3;

public class Ligacao {

   private String numOrigem;
   private String numDestino;
   private String localOrigem;
   private String localDestino;
   private Tempo horaInicio;
   private Tempo horaFim;

   public Ligacao(String numOrigem, String numDestino, String localOrigem,
                  String localDestino, Tempo horaInicio, Tempo horaFim) {

      this.numOrigem = numOrigem;
      this.numDestino = numDestino;
      this.localOrigem = localOrigem;
      this.localDestino = localDestino;
      this.horaInicio = horaInicio;
      this.horaFim = horaFim;
   }

   public double calcularValorLigacao() {
      int minutosInicio = horaInicio.getHora() * 60 + horaInicio.getMinutos();
      int minutosFim = horaFim.getHora() * 60 + horaFim.getMinutos();
      int duracaoMinutos = minutosFim - minutosInicio;

      // Verifica se a duração é menor que 1 minuto (60 segundos) e, se for, arredonda para 1 minuto
      if (duracaoMinutos == 0 && horaFim.getSegundos() < 20) {
         duracaoMinutos = 1;
      }
      return duracaoMinutos * 1.0; // Valor por minuto é R$1,00
   }

   public String getNumOrigem() {
      return numOrigem;
   }
   public void setNumOrigem(String numOrigem) {
      this.numOrigem = numOrigem;
   }
   public String getNumDestino() {
      return numDestino;
   }
   public void setNumDestino(String numDestino) {
      this.numDestino = numDestino;
   }
   public String getLocalOrigem() {
      return localOrigem;
   }
   public void setLocalOrigem(String localOrigem) {
      this.localOrigem = localOrigem;
   }
   public String getLocalDestino() {
      return localDestino;
   }
   public void setLocalDestino(String localDestino) {
      this.localDestino = localDestino;
   }
   public Tempo getHoraInicio() {
      return horaInicio;
   }
   public void setHoraInicio(Tempo horaInicio) {
      this.horaInicio = horaInicio;
   }
   public Tempo getHoraFim() {
      return horaFim;
   }
   public void setHoraFim(Tempo horaFim) {
      this.horaFim = horaFim;
   }

   // Método para verificar se um número faz parte da ligação
   public void verificarNumero(String numero) {
      if (numero.equals(numOrigem) || numero.equals(numDestino)) {
         System.out.println(numero + " faz parte da ligação.");
      } else {
         System.out.println(numero + " não faz parte da ligação.");
      }
   }
}