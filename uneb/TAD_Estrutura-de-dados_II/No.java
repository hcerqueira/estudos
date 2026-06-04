import java.util.ArrayList;
public class No {
  
    public No(int valor) {
        this.valor = valor;
        this.arestas = new ArrayList<Aresta>();
    }
    public int getValor() {
        return valor;
    }
    public ArrayList<Aresta> getArestas() {
        return this.arestas;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public void addAresta(Aresta a) {
        this.arestas.add(a);
    }

  
    private int valor;
    private ArrayList <Aresta> arestas;
}
