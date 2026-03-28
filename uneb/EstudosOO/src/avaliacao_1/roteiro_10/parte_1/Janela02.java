package avaliacao_1.roteiro_10.parte_1;
import javax.swing.*;

public class Janela02 extends JFrame {
    private int largura = 300;                                // Largura da janela
    private int altura = 300;                                 // Altura da janela
    private JButton btn01;                                    // Botão 01
    private JButton btn02;                                    // Botão 02

    public Janela02() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define a operação padrão de fechamento
        this.setSize(largura, altura);                        // Define o tamanho da janela
        this.setVisible(true);                                // Torna a janela visível
        this.setTitle("Janela 02");                           // Define o título da janela
        this.setLayout(null);                                 // Define o layout como nulo (posições absolutas)

        btn01 = new JButton("Botão 01");                 // Cria o primeiro botão com texto "Botão 01"
        btn02 = new JButton("Botão 02");                 // Cria o segundo botão com texto "Botão 02"

        /* Define as dimensões e posição dos botões usando setBounds(posição x, posição y, largura e altura) */
        btn01.setBounds(20, 50, 100, 40);  // Define a posição e o tamanho do botão 01
        btn02.setBounds(130, 50, 100, 40); // Define a posição e o tamanho do botão 02

        this.add(btn01);                                      // Adiciona o botão 01 à janela
        this.add(btn02);                                      // Adiciona o botão 02 à janela

        this.setVisible(true);                                // Torna a janela visível novamente
    }
}