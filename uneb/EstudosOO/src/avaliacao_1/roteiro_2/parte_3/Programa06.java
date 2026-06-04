package avaliacao_1.roteiro_2.parte_3;
import java.util.*;

public class Programa06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe uma nota ");
            int nota = sc.nextInt();

                // Verifica se a nota está no intervalo de aprovação (7 a 10)
            if (nota >= 0 && nota <= 10) {
                if (nota >= 7) {
                    System.out.println("Aprovado \n");
                } else {
                    System.out.println("Reprovado \n");
                }
            }else if(nota == -1){
                System.out.println("Programa encerrado!");
                System.exit(0);
            }else {
                System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
            }
        }
    }
}
