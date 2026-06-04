public class Aresta {
  
    public Aresta(No noIni, No noFim) {
        this.inicio = noIni;
        this.fim = noFim;
    }
    public No getInicio() {
        return this.inicio;
    }
    public No getFinal() {
        return this.fim;
    }
    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
    public void setFinal(No fim) {
        this.fim = fim;
    }

    private No inicio;
    private No fim;

}