package avaliacao_1.roteiro_10.parte_2;
import java.awt.BorderLayout;
import javax.swing.*;

public class JanelaBorderLayout extends JFrame {
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;

    public JanelaBorderLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define a operação padrão de fechamento
        this.setTitle("Janela BorderLayout");                 // Define o título da janela
        this.setLayout(new BorderLayout());                   // Define o layout da janela como BorderLayout
        this.iniciarComponentes();                            // Inicializa os componentes da janela
        this.pack();                                          // Ajusta o tamanho da janela automaticamente
        this.setVisible(true);                                // Torna a janela visível
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");                 // Cria o botão 01 com texto "Botão 01"
        btn02 = new JButton("Botão 02");                 // Cria o botão 02 com texto "Botão 02"
        btn03 = new JButton("Botão 03");                 // Cria o botão 03 com texto "Botão 03"
        btn04 = new JButton("Botão 04");                 // Cria o botão 04 com texto "Botão 04"
        btn05 = new JButton("Botão 05");                 // Cria o botão 05 com texto "Botão 05"

        // Adiciona os botões aos diferentes locais do layout BorderLayout
        this.add(btn01, BorderLayout.PAGE_START);             // Adiciona btn01 à parte superior
        this.add(btn02, BorderLayout.PAGE_END);               // Adiciona btn02 à parte inferior
        this.add(btn03, BorderLayout.LINE_START);             // Adiciona btn03 à parte esquerda
        this.add(btn04, BorderLayout.LINE_END);               // Adiciona btn04 à parte direita
        this.add(btn05, BorderLayout.CENTER);                 // Adiciona btn05 ao centro
    }
}
