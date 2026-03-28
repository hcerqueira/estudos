package avaliacao_1.roteiro_8.parte_1;

public class VeiculoPequeno extends Veiculo {
   private String modelo;

   public VeiculoPequeno(String placa, int anoFabricacao, String modelo) {
      super(placa, anoFabricacao);
      this.modelo = modelo;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public double calcularPedagio() {
      return 6.0; // Taxa única de R$ 6,00
   }
}