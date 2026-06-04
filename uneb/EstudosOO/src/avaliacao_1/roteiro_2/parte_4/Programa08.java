package avaliacao_1.roteiro_2.parte_4;
import java.util.Scanner;

public class Programa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorNotas = new int[5];

        for (int cont = 0; cont < 5; cont++){
            System.out.println("Informe uma nota " + (cont + 1) + ":");
            int nota = sc.nextInt();
            vetorNotas[cont] = nota;
        }
            //Implemente um novo laço de repetição apenas para exibir os valores armazenados no vetor
        System.out.println("Notas armazenadas no vetor:");
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + vetorNotas[i]);
        }
    }
}