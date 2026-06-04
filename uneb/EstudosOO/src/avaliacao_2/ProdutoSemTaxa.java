package avaliacao_2;
public class ProdutoSemTaxa extends Produto {
    private double ICMS = 0.0;

    public ProdutoSemTaxa(int codigo, String nome, double pesoBruto, double pesoLiquido, double valor) {
        super(codigo, nome, pesoBruto, pesoLiquido, valor);
    }

    public double calcularICMS() {
        return getValor() * ICMS;
    }
}