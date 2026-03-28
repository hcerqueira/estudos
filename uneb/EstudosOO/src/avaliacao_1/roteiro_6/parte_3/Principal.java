package avaliacao_1.roteiro_6.parte_3;

public class Principal {
   public static void main(String[] args) {

      Tempo horaInicio = new Tempo(10, 10, 0);
      Tempo horaFim = new Tempo(12, 30, 59);

      Ligacao lig01 = new Ligacao("71982472118", "71993643209", "Salvador", "São Francisco do Conde", horaInicio, horaFim);

      double valorLigacao = lig01.calcularValorLigacao();

      System.out.println("Valor da ligação: R$" + valorLigacao);

      String numeroVerificar = "71982472118";
      lig01.verificarNumero(numeroVerificar);

      System.out.println("Número de origem: " + lig01.getNumOrigem());
      System.out.println("Número de destino: " + lig01.getNumDestino());
      System.out.println("Local de origem: " + lig01.getLocalOrigem());
      System.out.println("Local de destino: " + lig01.getLocalDestino());
      System.out.println("Hora do fim: " + lig01.getHoraFim().getHora() + ":" + lig01.getHoraFim().getMinutos() + ":" + lig01.getHoraFim().getSegundos());
   }
}