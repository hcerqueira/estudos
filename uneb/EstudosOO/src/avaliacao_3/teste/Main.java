package teste;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = "";

    // Cria as duas threads que vão escutar a modificação da variável
    Thread thread1 = new Thread(new PrintValue("Thread1"));
    Thread thread2 = new Thread(new PrintValue("Thread2"));

    // Inicia as duas threads
    thread1.start();
    thread2.start();

    // Loop infinito para receber inputs do usuário
    while (true) {
      input = scanner.nextLine();

      // Atualiza a variável compartilhada pelas threads
      SharedVariable.setValue(input);
    }
  }
}
