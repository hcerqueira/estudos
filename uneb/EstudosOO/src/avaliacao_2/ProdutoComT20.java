package avaliacao_2;
public class ProdutoComT20 extends Produto {
    private  double ICMS = 0.20;

    public ProdutoComT20(int codigo, String nome, double pesoBruto, double pesoLiquido, double valor) {
        super(codigo, nome, pesoBruto, pesoLiquido, valor);
    }

    public double calcularICMS() {
        return getValor() * ICMS;
    }
}