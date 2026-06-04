package avaliacao_1.roteiro_9.parte_2;

public class Principal {
   public static void main(String[] args) {

         // Criando um objeto Quadrado
      Quadrado quadrado = new Quadrado(5.0);

         // Imprimindo informações sobre o Quadrado
      System.out.println("Figura: " + quadrado.getNomeFigura());
      System.out.println("Lado: " + quadrado.getLado());
      System.out.println("Área: " + quadrado.getArea());
      System.out.println("Perímetro: " + quadrado.getPerimetro());
      System.out.println();

         // Criando um objeto Retangulo
      Retangulo retangulo = new Retangulo(5.0, 6.0);

         // Imprimindo informações sobre o Retângulo
      System.out.println("Figura: " + retangulo.getNomeFigura());
      System.out.println("Altura: " + retangulo.getAltura());
      System.out.println("Largura: " + retangulo.getLargura());
      System.out.println("Área: " + retangulo.getArea());
      System.out.println("Perímetro: " + retangulo.getPerimetro());
      System.out.println();

      //Criando um objeto Circulo
      Circulo circulo = new Circulo(9.0);

      //Imprimindo informações sobre o Círculo
      System.out.println("Figura: " + circulo.getNomeFigura());
      System.out.println("Raio: " + circulo.getRaio());
      System.out.println("Área: " + circulo.getArea());
      System.out.println("Perímetro: " + circulo.getPerimetro());
   }
}
