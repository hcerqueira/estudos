package avaliacao_1.roteiro_2.parte_3;
import java.util.*;

public class Programa05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe uma nota ");
            int nota = sc.nextInt(); // Lê a nota fornecida pelo usuário

            if (nota >= 7 ) {
                System.out.println("Aprovado");
            }

            else {
                System.out.println("Reprovado");
            }
        }
    }
}

