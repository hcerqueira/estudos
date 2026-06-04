import java.util.ArrayList;

public class Grafo {

  public Grafo(No no) {
    this.nos = new ArrayList<No>();
    this.arestas = new ArrayList<Aresta>();
    this.nos.add(no);
  }

  public Grafo() {
    this.nos = new ArrayList<No>();
    this.arestas = new ArrayList<Aresta>();
  }

    // Função para adicionar um Nó;
  public void addNo(No n) {
    this.nos.add(n);
    System.out.println(" * Nó Adicionado com sucesso!\r");
  }

    // Função para adicionar uma Aresta;
  public void addAresta(Aresta a) {
    this.arestas.add(a);
    a.getInicio().addAresta(a);
    a.getFinal().addAresta(a);
    System.out.println(" * Aresta Adicionada com sucesso!");
  }

    // Função que apaga um Nó;
  public void apagaNo(int valor) {
    No noDel = this.nos.stream().filter(no -> no.getValor() == valor).findFirst().get();
    this.arestas.removeIf(aresta -> aresta.getInicio() == noDel || aresta.getFinal() == noDel);
    this.nos.remove(noDel);
    System.out.println("Nó removido!");
  }

    // Função que apaga uma Aresta;
  public void apagaAresta(int valorInicio, int valorFinal) {
    this.arestas.removeIf(aresta -> (aresta.getInicio().getValor() == valorInicio
        || aresta.getFinal().getValor() == valorInicio)
        &&
        (aresta.getInicio().getValor() == valorFinal
            || aresta.getFinal().getValor() == valorFinal));
    System.out.println("Aresta removida!");
  }

    // Função que exibe os Nós;
  public void exibeNos() {
    if (this.nos.isEmpty()) {
      System.out.println("Não foram localizados nós (vértices) no Grafo.");
      System.exit(0);
    }
    System.out.println("Nós localizados, são eles: ");
    this.nos.forEach((no) -> {
      System.out.print(" —— " + no.getValor() + " —— ");
    });
    System.out.println("\n");
  }

    // Função que exibe as Arestas;
  public void exibeArestas() {
    if (this.arestas.isEmpty()) {
      System.out.println("Não foram localizadas arestas no Grafo.");
      System.exit(0);
    }
    System.out.println("Arestas localizados, são elas: \n");
    this.arestas.forEach((aresta) -> {
      System.out.println("\t\t\t [ " + aresta.getInicio().getValor() + " ——— " + aresta.getFinal().getValor() + " ]");
    });
    System.out.println("\n");
    System.out.println("Inicio de aresta ——— Fim de aresta");
    System.out.println("\n");
  }

    // Função que verifica ligações
  public void verificaConexao(int no1, int no2) {

    this.arestas.forEach((aresta) -> {
      boolean testeInicio = (aresta.getInicio().getValor() == no1 || aresta.getInicio().getValor() == no2);
      boolean testeFim = (aresta.getFinal().getValor() == no1 || aresta.getFinal().getValor() == no2);
      if (testeInicio && testeFim == true) {
        System.out.println("Aresta encontrada: ");
        System.out.println("[" + aresta.getInicio().getValor() + " -> " + aresta.getFinal().getValor() + "]");
      }
    });
  }

    // Função que obtém o grau
  public void grau() {
    Integer grauMax = this.nos.get(0).getValor();
    Integer grauMin = this.nos.get(0).getValor();
    Double grauMed = 0.0;

    for (No no : this.nos) {
      Integer grauN = this.grauNo(no);
      grauMed += grauN;

      if (grauN > grauMax) {
        grauMax = grauN;
      }
      if (grauN < grauMin) {
        grauMin = grauN;
      }
    }
    grauMed /= this.nos.size();
    System.out.println("* Grau máximo: " + grauMax);
    System.out.println("* Grau médio: " + grauMed);
    System.out.println("* Grau mínimo: " + grauMin);
    System.out.println("\n");
  }

        // Informa se grafo é ou não Conexo;
  public boolean exibeConexo(boolean exibe) {
        // preenchendo matriz
    int[][] matrizConexo = new int[nos.size()][nos.size()];
    this.arestas.forEach((aresta) -> {
      matrizConexo[aresta.getInicio().getValor() - 1][aresta.getFinal().getValor() - 1] = 1;
      matrizConexo[aresta.getFinal().getValor() - 1][aresta.getInicio().getValor() - 1] = 1;
    });

    for (int i = 0; i < matrizConexo.length; i++) {
      for (int j = 0; j < matrizConexo[i].length; j++) {
        matrizConexo[i][i] = 2;
      }
    }
        // Pecorre a matriz, se houver índice 0 então não é conexo;
    for (int i = 0; i < matrizConexo.length; i++) {
      if (matrizConexo[i][i] == 0) {
        return false;
      }
      for (int j = 0; j < matrizConexo[i].length; j++) {
        if (matrizConexo[i][j] == 0) {
          return false;
        }
      }
    }
    return true;
  }
      // Informa as arestas que são ligadas aos Nós
  public void adjacencias(int valor) {
    No no = this.nos.stream().filter(v -> v.getValor() == valor).findFirst().get();
    no.getArestas().forEach((aresta) -> {
      System.out.println("[" + aresta.getInicio().getValor() + " -> " + aresta.getFinal().getValor() + "]");
    });
  }

      // Pega os nós adjancetes a um único nó 
  public ArrayList<No> getAdjacentes(int valor) {
    // Array de nos adjacentes
    ArrayList<No> nosAdjacentes = new ArrayList<No>();
    
    // Acha o nó referente ao valor passado na função
    No no = this.nos.stream().filter(v -> v.getValor() == valor).findFirst().get();

    // Pega as arestas ligadas ao nó e acha os nos adjacentes
    no.getArestas().forEach((aresta) -> {
    
      if(aresta.getInicio().getValor() != no.getValor()){
          nosAdjacentes.add(aresta.getInicio());
      }
      
      if(aresta.getFinal().getValor() != no.getValor()){
          nosAdjacentes.add(aresta.getFinal());
      }
    });
    
    return nosAdjacentes;
    
  }

        // Busca em profundidade  
    public ArrayList<No> busca (No no , ArrayList<No> percorridos)  {
            // Marca o nó como percorrido
        percorridos.add(no);
            // Declara array de nós adjacentes
        ArrayList<No> adjacentes = new ArrayList<No>();
            // Pega os nós adjacentes  
        adjacentes = getAdjacentes(no.getValor());
          // Percorre cada nó adjacente e faz uma busca em profundidade em cada um deles.
          // Ou seja , vai percorrer cada nó, percorrer os adjacentes e dps percorre o adjacentes dos adjancentes e assim em diante.
        for(int i = 0 ; i < adjacentes.size() ; i++){
                // Se não percorreu ainda faz a busca
            if(!percorridos.contains(adjacentes.get(i))){
               percorridos = this.busca(adjacentes.get(i) , percorridos);
            }
        }
            // Retorna todos os nos percorridos
        return percorridos;
    }
    // Correção do "Verifica se é conexo" 
  public boolean isConexo(){

    // Declara array de conexos
    ArrayList<No> nosConexos = new ArrayList<No>(); 
        
    if(this.nos.size() == 0){
            System.out.println("O grafo está vazio");
            return false;
        }

    // Considera o primeiro nó como o nó inicial
    No noInicial = this.nos.get(0);
        
    // Realiza a busca a partir do nó inicial
    ArrayList<No> percorridos = this.busca(noInicial , nosConexos);
    
    // Se o número de percorridos for igual ao número de nós no grafo, então é conexo
    // Caso for diferente ele não é conexo
    if(percorridos.size() == this.nos.size()){
            return true;
        } else {
            return false;
        }
  }
  // Matriz Adjacencia
  public void matrizAdjacencia() {
    // Criando matriz
    int[][] matrizAdjacencia = new int[nos.size()][nos.size()];
    System.out.println("Matriz de Adjacência:\n");
    this.arestas.forEach((aresta) -> {
      matrizAdjacencia[aresta.getInicio().getValor() - 1][aresta.getFinal().getValor() - 1] = 1;
      matrizAdjacencia[aresta.getFinal().getValor() - 1][aresta.getInicio().getValor() - 1] = 1;
    });
    // Exibindo a matriz
    for (int i = 0; i < matrizAdjacencia.length; i++) {
      for (int j = 0; j < matrizAdjacencia[i].length; j++) {
        System.out.print("\t\t" + matrizAdjacencia[i][j]);
      }
      System.out.println();
    }
    System.out.println("\n");
  }

  // Teoria Euleriana:
  // - Todos os vértices precisam ser de grau Par;
  // - É necessário que o grafo seja Conexo;
  public void TeoriaEuleriana() {
    int impar = 0;
    boolean conexo = this.exibeConexo(false);
    for (No no : this.nos) {
      int grauN = this.grauNo(no);
      if (grauN % 2 != 0) {
        impar += 1;
      }
    }
    if (impar == 2 && conexo || impar == 0 && conexo) {
      System.out.print("\n Existe um caminho de Euler");
    } else
      System.out.print("\n Não existe um caminho de Euler");
    System.out.println("\n");
  }
  /*
   * Há, ainda, grafos com caminhos Eulerianos se houver 2 vértices de grau ímpar.
   * Nesse caso, ao se acrescentar uma aresta ligando estes dois vértices,
   * o novo grafo passa a ser um circuito Euleriano
   */

  // Função utilizada para pegar os componentes - C
  public ArrayList<ArrayList<No>> getComponentes() {
    
    ArrayList<ArrayList<No>> ArrayComponentes = new ArrayList<ArrayList<No>>();
    
        // Array de nós conexos
    ArrayList<No> conexos = new ArrayList<No>();
        // Array de nós percorridos
    ArrayList<No> percorridos = new ArrayList<No>(); 
        // Considera o primeiro nó como o nó inicial
    No noInicial = this.nos.get(0);
        // Declara o array do componente
    ArrayList<No> componente = new ArrayList<No>();
        // Busca o primeiro componente
    componente = this.busca(noInicial , conexos);
        // Adiciona o componente ao array de componentes
    ArrayComponentes.add(componente);
        // Adiciona os itens do componente ao array de percorridos
    percorridos.addAll(componente);
        // Array de nós restantes(nós que ficaram de fora do componente)
    ArrayList<No> restantes = new ArrayList<No>(); 
        // Pega os nós restantes
    restantes = this.filtrar(percorridos);
      
    while(restantes.size() != 0){
          // Adiciona o componente ao array de componentes
      ArrayComponentes.add(new ArrayList<No>(this.busca(restantes.get(0) , new ArrayList<No>())));
          // Adiciona os itens do componente ao array de percorridos
      percorridos.addAll(new ArrayList<No>(this.busca(restantes.get(0) ,new ArrayList<No>())));
          // Pega novamente os restantes
      restantes = this.filtrar(percorridos);    
    }    

    return ArrayComponentes;
  }
     
  // Responsável por filtrar 
  public ArrayList<No> filtrar(ArrayList<No> percorridos){
    // Função responsável por pegar os nós que ainda não foram percorridos na função de componentes conexos
    ArrayList<No> restantes = new ArrayList<No>();  
    for(int i = 0 ; i < this.nos.size() ; i++){
         if(!percorridos.contains(this.nos.get(i))){
               restantes.add(this.nos.get(i));
        }
      }
    return restantes;
  }
  
// Função que verifica a Quantidade de Componentes* no grafo 
 public int qtdeComponentes() {
    return this.getComponentes().size();
 }
  // Função que verifica a Quantidade de Nós existentes no Maior Componente* do grafo
  public int qtdeNomaior() {
    ArrayList<ArrayList<No>> ArrayComponentes = new ArrayList<ArrayList<No>>();
    // Pega o arraylist de componentes(arraylist de componentes)
    ArrayComponentes = this.getComponentes();
    
    int maior = 0;
    for(int i = 0 ; i < ArrayComponentes.size() ; i++){
        //pega o tamanho da array list
        int tamanho = ArrayComponentes.get(i).size();
      // Compara pra ver se é maior , caso seja faz a troca  
      if(tamanho > maior){
            maior = tamanho;  
        }   
      }
    return maior;
  }

  private ArrayList<No> nos;
  private ArrayList<Aresta> arestas;

  // Declaração e Método do Grau Nó, diz Grau do nó escolhido.
  public Integer grauNo(No no) {
    return no.getArestas().size();
  }

  public Integer grauNo(int valor) {
    No no = this.nos.stream().filter(v -> v.getValor() == valor).findFirst().get();
    return no.getArestas().size();
  }
}