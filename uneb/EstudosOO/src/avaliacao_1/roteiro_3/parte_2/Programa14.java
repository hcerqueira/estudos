package avaliacao_1.roteiro_3.parte_2;
import java.util.*;

public class Programa14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de x ");
        double x = sc.nextDouble();
        System.out.println("Informe a operação (+, -, *, /) ");
        String op = sc.next();
        System.out.println("Informe o valor de y ");
        double y = sc.nextDouble();

        double resultado = 0; // Variável para armazenar o resultado da operação

        switch (op) {
            case "+":
                resultado = soma(x, y); // Chama a função soma e armazena o resultado
                break;

            case "-":
                resultado = subtracao(x, y); // Chama a função subtracao e armazena o resultado
                break;

            case "*":
                resultado = multiplicacao(x, y); // Chama a função multiplicacao e armazena o resultado
                break;

            case "/":
                resultado = divisao(x, y); // Chama a função divisao e armazena o resultado
                break;

            default:

                System.out.println("Operacao invalida");
        }

        System.out.println("Resultado : " + resultado); // Imprime o resultado da operação

    }

    public static double soma(double x, double y) {
        return x + y; // Retorna o resultado da soma
    }

    public static double subtracao(double x, double y) {
        return x - y; // Retorna o resultado da subtração
    }

    public static double multiplicacao(double x, double y) {
        return x * y; // Retorna o resultado da multiplicação
    }

    public static double divisao(double x, double y) {
        if (y != 0) {
            return x / y; // Retorna o resultado da divisão (se y não for zero)
        } else {
            System.out.println("Divisão por zero não é permitida.");
            return 0; // Retorna um valor qualquer para indicar erro


        }
    }
}