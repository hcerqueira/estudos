package avaliacao_1.roteiro_2.parte_4;
import java.util.*;

public class Exercicio02 {
    public static void main(String[] args) {
            // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int palpite; // Armazena o palpite do jogador
        int tentativas = 0; // Contador de tentativas do jogador

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

            // Loop principal do jogo que continua até o jogador adivinhar corretamente
        while (true) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt(); // Lê o palpite do jogador
            tentativas++; // Incrementa o contador de tentativas

            // Verifica se o palpite do jogador é igual ao número secreto
            if (palpite == numeroSecreto) {
                // Exibe uma mensagem de parabéns e informa o número de tentativas
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break; // Sai do loop
            } else if (palpite < numeroSecreto) {
                // Se o palpite for menor que o número secreto, sugere um número mais alto
                System.out.println("Tente um número mais alto.");
            } else {
                // Se o palpite for maior que o número secreto, sugere um número mais baixo
                System.out.println("Tente um número mais baixo.");
            }
        }
        sc.close();
    }
}