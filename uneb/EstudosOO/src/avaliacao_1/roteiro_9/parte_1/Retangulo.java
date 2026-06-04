package avaliacao_1.roteiro_9.parte_1;

public class Retangulo implements FiguraGeometrica {
   private double altura;
   private double largura;

   public Retangulo(double altura, double largura) {
      this.altura = altura;
      this.largura = largura;
   }
   // Método para obter a altura do retângulo
   public double getAltura() {
      return altura;
   }
   // Método para obter a largura do retângulo
   public double getLargura() {
      return largura;
   }
   // Implementação do método da interface para obter o nome da figura
   @Override
   public String getNomeFigura() {
      return "Retângulo";
   }
   // Implementação do método da interface para calcular a área
   @Override
   public double getArea() {
      return this.altura * this.largura;
   }
   // Implementação do método da interface para calcular o perímetro
   @Override
   public double getPerimetro() {
      return 2 * (this.altura + this.largura);
   }
}