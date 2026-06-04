package avaliacao_2;
public class Produto {
    protected int codigo;
    protected String nome;
    protected double pesoBruto;
    protected double pesoLiquido;
    protected double valor;

        //Método construtor
    public Produto(int codigo, String nome, double pesoBruto, double pesoLiquido, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.pesoBruto = pesoBruto;
        this.pesoLiquido = pesoLiquido;
        this.valor = valor;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPesoBruto() {
        return pesoBruto;
    }
    public void setPesoBruto(double pesoBruto) {
        this.pesoBruto = pesoBruto;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
