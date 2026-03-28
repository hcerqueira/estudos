package avaliacao_1.roteiro_10.parte_2;
import java.awt.GridLayout;
import javax.swing.*;

public class JanelaGridLayout extends JFrame {
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Define a operação padrão de fechamento
        this.setTitle("Janela GridLayout");                    // Define o título da janela
        this.setLayout(new GridLayout(2, 3));        // Define o layout da janela como GridLayout com 2 linhas e 3 colunas
        this.iniciarComponentes();                             // Inicializa os componentes da janela
        this.pack();                                           // Ajusta o tamanho da janela automaticamente
        this.setVisible(true);                                 // Torna a janela visível
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");                  // Cria o botão 01 com texto "Botão 01"
        btn02 = new JButton("Botão 02");                  // Cria o botão 02 com texto "Botão 02"
        btn03 = new JButton("Botão 03");                  // Cria o botão 03 com texto "Botão 03"
        btn04 = new JButton("Botão 04");                  // Cria o botão 04 com texto "Botão 04"
        btn05 = new JButton("Botão 05");                  // Cria o botão 05 com texto "Botão 05"
        btn06 = new JButton("Botão 06");                  // Cria o botão 06 com texto "Botão 06"

        // Adiciona os botões ao layout GridLayout (eles serão organizados em 2 linhas e 3 colunas)
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }
}
