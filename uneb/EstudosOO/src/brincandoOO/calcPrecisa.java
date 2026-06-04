package testandoOO;
import java.util.Scanner;
public class calcPrecisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0; double valor;
        System.out.println("Digite um valor em double (ou 0 para encerrar):");
        do {
            valor = scanner.nextDouble();soma += valor;
            System.out.println("Soma atual: " + soma);
            System.out.println("Digite um valor em double (ou 0 para encerrar):");
        } while (valor != 0);
        System.out.println("Soma final: " + soma);
        System.out.println("Calculadora encerrada.");
    }
}