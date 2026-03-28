package avaliacao_1.roteiro_2.parte_4;
import java.util.Scanner;

public class Programa09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorNotas = new int[5];

        for (int cont = 0; cont < 5; cont++){
            int nota;

                //Utilizei um loop do-while para solicitar a nota repetidamente até que seja inserida uma nota válida (entre 0 e 10)
            do {
                System.out.println("Informe uma nota: ");
                nota = sc.nextInt();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            vetorNotas[cont] = nota;
        }

        //Implemente um novo laço de repetição apenas para exibir os valores armazenados no vetor
        System.out.println("Notas armazenadas no vetor:");
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + vetorNotas[i]);
        }
    }
}