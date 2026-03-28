package avaliacao_1.roteiro_2.parte_2;
import javax.swing.*;

public class Programa03 {

    public static void main(String[] args) {

            // Solicita o nome do usuário por meio de uma caixa de diálogo e armazena na variável "nome"
        String nome = JOptionPane.showInputDialog("Informe seu nome ");
            // Exibe o nome informado pelo usuário em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Nome informado: " + nome);
            // Solicita a idade do usuário por meio de uma caixa de diálogo e armazena como uma string em "strIdade"
        String strIdade = JOptionPane.showInputDialog("Informe sua idade ");
            /* Converte a string "strIdade" para um valor inteiro e armazena em "idade"
        int idade = Integer.parseInt(strIdade); */
            // Exibe a idade informada pelo usuário em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Idade informada: " + strIdade);

    }
}
