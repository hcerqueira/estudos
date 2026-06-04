package avaliacao_1.roteiro_10.parte_4;

import javax.swing.*;
import java.awt.event.*;

public class JanelaSemLayout extends JFrame implements ActionListener {
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaSemLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Janela Sem Layout");
        this.setLayout(null);
        this.iniciarComponentes();
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");
        btn01.setBounds(20, 50, 90, 30); // (x,y, largura, altura)
        btn02.setBounds(130, 50, 90, 30); // (x,y, largura, altura)
        btn03.setBounds(30, 90, 90, 30); // (x,y, largura, altura)
        btn04.setBounds(140, 90, 90, 30); // (x,y, largura, altura)
        btn05.setBounds(40, 130, 90, 30); // (x,y, largura, altura)
        btn06.setBounds(150, 130, 90, 30); // (x,y, largura, altura)

        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);

        btn01.addActionListener(this);
        btn02.addActionListener(this);
    }
    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    */
    public void actionPerformed(ActionEvent e) {
        System.out.println("O clique do mouse foi acionado");
    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        JButton b = (JButton) o;
        String nome = b.getText();
        System.out.println("o Clique do mouse foi acionado por : " + nome + " da classe " + o.getClass());
    }*/
}