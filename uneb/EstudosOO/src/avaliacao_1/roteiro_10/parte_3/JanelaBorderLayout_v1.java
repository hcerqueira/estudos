package avaliacao_1.roteiro_10.parte_3;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class JanelaBorderLayout_v1 extends JFrame {
    private JPanel pnCabecalho;                              // Painel para o cabeçalho
    private JPanel pnRodape;                                 // Painel para o rodapé
    private JPanel pnEsquerda;                               // Painel para a área esquerda
    private JPanel pnDireita;                                // Painel para a área direita
    private JPanel pnCentro;                                 // Painel para a área central

    public JanelaBorderLayout_v1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define a operação padrão de fechamento
        this.setTitle("Janela BorderLayout_v1");             // Define o título da janela
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
        this.add(pnEsquerda, BorderLayout.LINE_START);       // Área esquerda à esquerda
        this.add(pnDireita, BorderLayout.LINE_END);          // Área direita à direita
        this.add(pnCentro, BorderLayout.CENTER);             // Área central no centro
    }
}
