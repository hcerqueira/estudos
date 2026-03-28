package avaliacao_1.roteiro_2.parte_1;
import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome informado: " + nome+" \n");

        //Testando com tipos numéricos agora...
        System.out.println("Informe a idade");
        int idade = sc.nextInt();
        System.out.println("Idade informada: "+idade+" \n");

        sc.close();
    }
}
