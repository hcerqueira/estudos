package avaliacao_1.roteiro_10.parte_3;
import javax.swing.*;
import java.awt.*;

public class JanelaBorderLayout_v2 extends JFrame {
    private JPanel pnCabecalho;                             // Painel para o cabeçalho
    private JPanel pnRodape;                                // Painel para o rodapé
    private JPanel pnEsquerda;                              // Painel para a área esquerda
    private JPanel pnDireita;                               // Painel para a área direita
    private JPanel pnCentro;                                // Painel para a área central

    public JanelaBorderLayout_v2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação padrão de fechamento
        this.setTitle("Janela BorderLayout_v2");             // Define o título da janela
        this.setLayout(new BorderLayout());                  // Define o layout da janela como BorderLayout
        this.iniciarComponentes();                           // Inicializa os componentes da janela
        this.pack();                                         // Ajusta o tamanho da janela automaticamente
        this.setVisible(true);                               // Torna a janela visível
    }

    public void iniciarComponentes() {
        this.pnCabecalho = new JPanel();                      // Cria um painel para o cabeçalho
        this.pnRodape = new JPanel();                         // Cria um painel para o rodapé
        this.pnEsquerda = new JPanel();                       // Cria um painel para a área esquerda
        this.pnDireita = new JPanel();                        // Cria um painel para a área direita
        this.pnCentro = new JPanel();                         // Cria um painel para a área central

        // Define cores de fundo diferentes para cada painel
        this.pnCabecalho.setBackground(Color.red);
        this.pnRodape.setBackground(Color.blue);
        this.pnEsquerda.setBackground(Color.yellow);
        this.pnDireita.setBackground(Color.gray);
        this.pnCentro.setBackground(Color.green);

        // Adiciona os painéis às diferentes regiões do BorderLayout
        this.add(pnCabecalho, BorderLayout.PAGE_START);      // Cabeçalho na parte superior
        this.add(pnRodape, BorderLayout.PAGE_END);           // Rodapé na parte inferior
        this.add(pnEsquerda, BorderLayout.LINE_START);       // Área esquerda a esquerda
        this.add(pnDireita, BorderLayout.LINE_END);          // Área direita a direita
        this.add(pnCentro, BorderLayout.CENTER);             // Área central no centro

        // Chama métodos para inicializar os componentes em cada painel
        iniciarCabecalho();
        iniciarRodape();
        iniciarCentro();
    }

    public void iniciarCabecalho() {
        this.pnCabecalho.setLayout(new FlowLayout(FlowLayout.LEFT)); // Define o layout do cabeçalho como FlowLayout à esquerda
        this.pnCabecalho.add(new JLabel("Curso"));              // Adiciona um rótulo "Curso"
        this.pnCabecalho.add(new JTextField(10));            // Adiciona um campo de texto com 10 colunas
        this.pnCabecalho.add(new JLabel("Observações"));        // Adiciona um rótulo "Observações"
        this.pnCabecalho.add(new JTextField(25));            // Adiciona um campo de texto com 25 colunas
    }

    public void iniciarRodape() {
        this.pnRodape.setLayout(new FlowLayout(FlowLayout.RIGHT));    // Define o layout do rodapé como FlowLayout à direita
        this.pnRodape.add(new JButton("Botão 04"));              // Adiciona um botão "Botão 04"
        this.pnRodape.add(new JButton("Botão 05"));              // Adiciona um botão "Botão 05"
    }

    public void iniciarCentro() {
        this.pnCentro.setLayout(new GridLayout(3, 2));    // Define o layout do centro como GridLayout de 3 linhas e 2 colunas
        this.pnCentro.add(new JLabel("Matrícula"));             // Adiciona um rótulo "Matrícula"
        this.pnCentro.add(new JTextField());                         // Adiciona um campo de texto
        this.pnCentro.add(new JLabel("Nome"));                  // Adiciona um rótulo "Nome"
        this.pnCentro.add(new JTextField());                         // Adiciona um campo de texto
        this.pnCentro.add(new JLabel("Idade"));                 // Adiciona um rótulo "Idade"
        this.pnCentro.add(new JTextField());                         // Adiciona um campo de texto
    }
}
