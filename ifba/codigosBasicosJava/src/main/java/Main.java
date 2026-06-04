import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.forLanguageTag("pt-BR")); // Definindo o local para o padrão brasileiro

        double gastosPessoa1 = obterGastos(scanner, "Digite os gastos da Pessoa 1 (0 para mudar): ");
        double gastosPessoa2 = obterGastos(scanner, "Digite os gastos da Pessoa 2 (0 para mudar): ");

        // Mudando para gastos em conjunto
        double gastosConjuntos = obterGastos(scanner, "Digite os gastos em conjunto: ");

        // Exibindo os gastos individuais e em conjunto
        System.out.println("\nGastos da Pessoa 1: R$" + gastosPessoa1);
        System.out.println("Gastos da Pessoa 2: R$" + gastosPessoa2);
        System.out.println("Gastos em Conjunto: R$" + gastosConjuntos);

        scanner.close();
    }

    public static double obterGastos(Scanner scanner, String mensagem) {
        double totalGastos = 0;
        double gastoAtual;

        do {
            System.out.print(mensagem);
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, digite um número válido.");
                scanner.next(); // Limpa o buffer
            }
            gastoAtual = scanner.nextDouble();
            totalGastos += gastoAtual;
        } while (gastoAtual != 0);

        return totalGastos;
    }
}
