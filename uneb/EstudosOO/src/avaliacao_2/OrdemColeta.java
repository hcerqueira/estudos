package avaliacao_2;
import java.util.ArrayList;

public class OrdemColeta {
    private int codigo;
    private String data;
    private ArrayList<Produto> produtos; //Lista de produtos

        //Método construtor
    public OrdemColeta(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

        // Métodos de acesso (Getters e Setters)
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
}
