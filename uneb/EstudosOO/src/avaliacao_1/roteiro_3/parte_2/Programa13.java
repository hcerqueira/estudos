package avaliacao_1.roteiro_3.parte_2;
import java.util.*;

public class Programa13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de x ");
        double x = sc.nextDouble();

        System.out.println("Informe a operação (+, -, *, /) ");
        String op = sc.next();

        System.out.println("Informe o valor de y ");
        double y = sc.nextDouble();

        switch (op) {  // Há como reduzir o código
            case "+":
                soma(x, y);
                break;
            case "-":
                subtracao(x, y);
                break;
            case "*":
                multiplicacao(x, y);
                break;
            case "/":
                divisao(x, y);
                break;
            default:
                System.out.println("Operacao invalida");
        }
    }

    public static void soma(double x, double y) {
        System.out.println("Resultado : " + (x + y));
    }
    public static void subtracao(double x, double y) {
        System.out.println("Resultado : " + (x - y));
    }
    public static void multiplicacao(double x, double y) {
        System.out.println("Resultado : " + (x * y));
    }
    public static void divisao(double x, double y) {
        System.out.println("Resultado : " + (x / y));
    }
}