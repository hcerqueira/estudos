package avaliacao_1.roteiro_9.parte_2;

// Classe Circulo que implementa a interface FiguraGeometrica
public class Circulo implements FiguraGeometrica {
   private double raio;

   // Construtor que recebe o raio do círculo como parâmetro
   public Circulo(double raio) {
      this.raio = raio;
   }
   // Método para obter o raio do círculo
   public double getRaio() {
      return raio;
   }
   // Método para definir o raio do círculo
   public void setRaio(double raio) {
      this.raio = raio;
   }
   // Implementação do método da interface para obter o nome da figura
   @Override
   public String getNomeFigura() {
      return "Círculo";
   }
   // Implementação do método da interface para calcular a área do círculo
   @Override
   public double getArea() {
      // A fórmula da área de um círculo é π * raio * raio
      return 3.1416 * (this.raio * this.raio);
   }
   // Implementação do método da interface para calcular o perímetro (circunferência) do círculo
   @Override
   public double getPerimetro() {
      // A fórmula da circunferência de um círculo é 2 * π * raio
      return 2 * 3.1416 * this.raio;
   }
}