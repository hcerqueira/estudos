package avaliacao_1.roteiro_8.parte_2;

public class VeiculoPasseio extends Veiculo {
   private int passageirosMaximos;

   public VeiculoPasseio(String placa, int anoFabricacao, int passageirosMaximos) {
      super(placa, anoFabricacao);
      this.passageirosMaximos = passageirosMaximos;
      this.taxaPedagio = passageirosMaximos * 5.0; // Taxa específica para VeiculoPasseio
   }

   public int getPassageirosMaximos() {
      return passageirosMaximos;
   }

   @Override
   public double calcPedagio() {
      super.taxaPedagio = 5.0;
      return super.taxaPedagio * this.passageirosMaximos;
   }
}