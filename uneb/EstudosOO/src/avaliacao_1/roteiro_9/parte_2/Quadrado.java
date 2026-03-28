package avaliacao_1.roteiro_9.parte_2;

public class Quadrado implements FiguraGeometrica {
   private double lado;

   public Quadrado(double lado) {
      this.lado = lado;
   }
   // Método para obter o lado do quadrado
   public double getLado() {
      return lado;
   }
   // Implementação do método da interface para obter o nome da figura
   @Override
   public String getNomeFigura() {
      return "Quadrado";
   }
   // Implementação do método da interface para calcular a área
   @Override
   public double getArea() {
      return this.lado * this.lado;
   }
   // Implementação do método da interface para calcular o perímetro
   @Override
   public double getPerimetro() {
      return this.lado * 4;
   }
}