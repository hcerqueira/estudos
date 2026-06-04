package avaliacao_1.roteiro_6.parte_2;

public class Ligacao {

   private String numOrigem;
   private String numDestino;
   private String localOrigem;
   private String localDestino;
   private Tempo horaInicio;
   private Tempo horaFim;

      //Construtor
   public Ligacao(String numOrigem, String numDestino, String localOrigem,
                  String localDestino, Tempo horaInicio) {

      this.numOrigem = numOrigem;
      this.numDestino = numDestino;
      this.localOrigem = localOrigem;
      this.localDestino = localDestino;
      this.horaInicio = horaInicio;
      this.horaFim = null;
   }

      //Gets e sets
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
}