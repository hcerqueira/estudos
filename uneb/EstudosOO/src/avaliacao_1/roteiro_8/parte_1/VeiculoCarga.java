package avaliacao_1.roteiro_8.parte_1;

public class VeiculoCarga extends Veiculo {
   private double pesoMaximo;

   public VeiculoCarga(String placa, int anoFabricacao, double pesoMaximo) {
      super(placa, anoFabricacao);
      this.pesoMaximo = pesoMaximo;
   }

   public double getPesoMaximo() {
      return pesoMaximo;
   }

   public void setPesoMaximo(double pesoMaximo) {
      this.pesoMaximo = pesoMaximo;
   }

   public double calcularPedagio() {
      return pesoMaximo * 2.0; // R$ 2,00 por quilo
   }
}