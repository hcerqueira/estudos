package avaliacao_1.roteiro_8.parte_2;

public class VeiculoPequeno extends Veiculo {
   private String modelo;

   public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
      super(placa, anoFabricacao);
      this.modelo = modelo;
      this.taxaPedagio = 6.0; // Taxa única para VeiculoPequeno
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }
}