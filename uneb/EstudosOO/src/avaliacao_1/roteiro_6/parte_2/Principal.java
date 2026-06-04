package avaliacao_1.roteiro_6.parte_2;

public class Principal {

   public static void main(String[] args) {

      Tempo horaInicio = new Tempo(20, 30, 40);
      Ligacao lig01 = new Ligacao("121212", "565656", "A", "B", horaInicio);

      System.out.println("Número de origem: " + lig01.getNumOrigem());
      System.out.println("Número de destino: " + lig01.getNumDestino());
      System.out.println("Local de origem: " + lig01.getLocalOrigem());
      System.out.println("Local de destino: " + lig01.getLocalDestino());
      System.out.println("Hora do fim: " + lig01.getHoraFim());

   }
}