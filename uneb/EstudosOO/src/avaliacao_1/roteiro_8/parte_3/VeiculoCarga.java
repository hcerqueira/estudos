package avaliacao_1.roteiro_8.parte_3;

import avaliacao_1.roteiro_8.parte_2.Veiculo;

public class VeiculoCarga extends Veiculo {
   private double pesoMaximo;

   public VeiculoCarga(String placa, int anoFabricacao, double pesoMaximo) {
      super(placa, anoFabricacao);
      this.pesoMaximo = pesoMaximo;
      this.taxaPedagio = pesoMaximo * 2.0; // Taxa específica para VeiculoCarga
   }

   public double getPesoMaximo() {
      return pesoMaximo;
   }

   @Override
   public double calcPedagio() {
      super.taxaPedagio = 2.0;
      return super.taxaPedagio * this.pesoMaximo;
   }
}