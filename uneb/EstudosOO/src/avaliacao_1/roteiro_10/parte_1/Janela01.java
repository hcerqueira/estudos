package avaliacao_1.roteiro_10.parte_1;
import javax.swing.*;

public class Janela01 extends JFrame {
    private int largura = 600;                                // Largura da janela
    private int altura = 500;                                 // Altura da janela

    public Janela01() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define a operação padrão de fechamento
        this.setSize(largura, altura);                        // Define o tamanho da janela
        this.setVisible(true);                                // Torna a janela visível
    }
}
