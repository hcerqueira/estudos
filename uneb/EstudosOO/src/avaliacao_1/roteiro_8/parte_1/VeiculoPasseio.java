package avaliacao_1.roteiro_8.parte_1;

public class VeiculoPasseio extends Veiculo {
   private int passageirosMaximos;

   public VeiculoPasseio(String placa, int anoFabricacao, int passageirosMaximos) {
      super(placa, anoFabricacao);
      this.passageirosMaximos = passageirosMaximos;
   }

   public int getPassageirosMaximos() {
      return passageirosMaximos;
   }

   public void setPassageirosMaximos(int passageirosMaximos) {
      this.passageirosMaximos = passageirosMaximos;
   }

   public double calcularPedagio() {
      return passageirosMaximos * 5.0; // R$ 5,00 por pessoa
   }
}

