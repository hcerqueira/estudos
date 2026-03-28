package avaliacao_1.roteiro_2.parte_3;
import java.util.*;

public class Programa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNotas = 0;
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe uma nota (-1 para encerrar): ");
            int nota = sc.nextInt();

            if (nota == -1) {
                System.out.println("Programa encerrado!");
                System.exit(0); //break;
            }

            if (nota >= 0 && nota <= 10) {
                totalNotas += nota;
                contador++;
            } else {
                System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
            }
        }

        if (contador > 0) {
            double media = (double) totalNotas / contador; // Calcula a média
            System.out.println("Média das notas: " + media);
            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}

