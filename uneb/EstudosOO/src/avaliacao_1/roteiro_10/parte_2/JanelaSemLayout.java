package avaliacao_1.roteiro_10.parte_2;
import javax.swing.*;

public class JanelaSemLayout extends JFrame {
    private int largura = 500;      // Largura da janela
    private int altura = 500;       // Altura da janela
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaSemLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define a operação padrão de fechamento
        this.setSize(largura, altura);                        // Define o tamanho da janela
        this.setTitle("Janela Sem Layout");                   // Define o título da janela
        this.setLayout(null);                                 // Define o layout da janela como nulo (posições absolutas)
        this.iniciarComponentes();                            // Inicializa os componentes da janela
        this.setVisible(true);                                // Torna a janela visível
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");                 // Cria o botão 01 com texto "Botão 01"
        btn02 = new JButton("Botão 02");                 // Cria o botão 02 com texto "Botão 02"
        btn03 = new JButton("Botão 03");                 // Cria o botão 03 com texto "Botão 03"
        btn04 = new JButton("Botão 04");                 // Cria o botão 04 com texto "Botão 04"
        btn05 = new JButton("Botão 05");                 // Cria o botão 05 com texto "Botão 05"
        btn06 = new JButton("Botão 06");                 // Cria o botão 06 com texto "Botão 06"

        // Define as posições e tamanhos absolutos dos botões usando setBounds(x, y, largura, altura)
        btn01.setBounds(20, 50, 90, 30);
        btn02.setBounds(130, 50, 90, 30);
        btn03.setBounds(30, 90, 90, 30);
        btn04.setBounds(140, 90, 90, 30);
        btn05.setBounds(40, 130, 90, 30);
        btn06.setBounds(150, 130, 90, 30);

        // Adiciona os botões à janela
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
    }
}
