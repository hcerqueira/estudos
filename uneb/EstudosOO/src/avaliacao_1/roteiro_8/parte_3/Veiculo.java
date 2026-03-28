package avaliacao_1.roteiro_8.parte_3;

public class Veiculo {
   protected double taxaPedagio; // Atributo protegido para a taxa de pedágio
   private String placa;
   private int anoFabricacao;

   public Veiculo(String placa, int anoFabricacao) {
      this.placa = placa;
      this.anoFabricacao = anoFabricacao;
   }

   public String getPlaca() {
      return placa;
   }

   public void setPlaca(String placa) {
      this.placa = placa;
   }

   public int getAnoFabricacao() {
      return anoFabricacao;
   }

   public void setAnoFabricacao(int anoFabricacao) {
      this.anoFabricacao = anoFabricacao;
   }

   // Método para calcular o pedágio
   public double calcPedagio() {
      return this.taxaPedagio;
   }
}