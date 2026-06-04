package avaliacao_2;
public class ProdutoComT10 extends Produto {
    private double ICMS = 0.10;

    public ProdutoComT10(int codigo, String nome, double pesoBruto, double pesoLiquido, double valor) {
        super(codigo, nome, pesoBruto, pesoLiquido, valor);
    }

    public double calcularICMS() {
        return getValor() * ICMS;
    }
}