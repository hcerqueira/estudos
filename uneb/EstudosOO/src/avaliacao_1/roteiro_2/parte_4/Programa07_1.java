package avaliacao_1.roteiro_2.parte_4;
import java.util.*;

public class Programa07_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNotas = 0;
        int contador = 0;
        int acimaDaMedia = 0; // Variável para contar quantas notas estão acima da média

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe uma nota (-1 para encerrar): ");
            int nota = sc.nextInt();

            if (nota == -1) {
                System.out.println("Programa encerrado!");
                break;
            }

            if (nota >= 0 && nota <= 10) {
                totalNotas += nota;
                contador++;

                // Verifica se a nota está acima da média (7 ou superior)
                if (nota >= 7) {
                    acimaDaMedia++;
                }
            } else {
                System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
            }
        }

        if (contador > 0) {
            double media = (double) totalNotas / contador; // Calcula a média
            System.out.println("Média das notas: " + media);
            System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);
            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    }
}



