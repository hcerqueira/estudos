/*
          UNEB - Universidade do Estado da Bahia
          Aluno: Carlos Henrique Cerqueira Santos
          Disciplina: Estrutura de Dados II           
          Prof.: Carlos Helano                

                        Trabalho de Avaliação para Prova Final
    
*/
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Grafo g = new Grafo();

/* 
   1 -– Verificação de um grafo CONEXO                                                         - [ Está OK! ]
   2 -– Verificação do CAMINHO DE EULER                                                        - [ Está OK! ]
   3 –- Caso o grafo não seja conexo, IDENTIFICAR QUANTOS COMPONENTES CONEXOS EXISTEM NO GRAFO - [ Está OK! ]
   4 –- INDICAR A QUANTIDADE DE NÓS EXISTENTES NO MAIOR COMPONENTE CONEXO do grafo             - [ Está OK! ]
*/     
/*    Cenário 01 para teste: 
        - Grafo conexo
        - 1 componente conexo com 4 vértices
        - POSSUI o caminho de Euler
                  o ------ o  
                  |        |
                  |        |
                  o ------ o
      
           // Valores pros nós
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
      
            // Adicionando os Nós
        g.addNo(no1);
        g.addNo(no2);
        g.addNo(no3);
        g.addNo(no4);

           // Valores para as Arestas
        Aresta a1 = new Aresta(no1, no2);
        Aresta a2 = new Aresta(no1, no3);
        Aresta a3 = new Aresta(no2, no4);
        Aresta a4 = new Aresta(no3, no4);
        //Aresta a5 = new Aresta(no1, no4);
      
          // Adicionando as arestas entre os nós.
        g.addAresta(a1);
        g.addAresta(a2);
        g.addAresta(a3);
        g.addAresta(a4);
         
*/
/*    Cenário 02: 
        - Grafo conexo
        - 1 componente conexo com 4 vértices
        - NÃO possui o caminho de Euler
                  o ------ o  
                  | \___   |
                  |     \  |
                  o ------ o

           // Valores pros nós
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
      
            // Adicionando os Nós
        g.addNo(no1);
        g.addNo(no2);
        g.addNo(no3);
        g.addNo(no4);

           // Valores para as Arestas
        Aresta a1 = new Aresta(no1, no2);
        Aresta a2 = new Aresta(no1, no3);
        Aresta a3 = new Aresta(no2, no4);
        Aresta a4 = new Aresta(no3, no4);
        Aresta a5 = new Aresta(no1, no4);
      
          // Adicionando as arestas entre os nós.
        g.addAresta(a1);
        g.addAresta(a2);
        g.addAresta(a3);
        g.addAresta(a4);
        g.addAresta(a5);
*/
/*    Cenário 03: 
        - Grafo NÃO conexo
        - 2 componentes conexos
        - Maior componente com 4 vértices
        - NÃO possui o caminho de Euler
                  o ------ o      o  
                  | \___   |      
                  |     \  |
                  o ------ o

           // Valores pros nós
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
            // Adicionando os Nós
        g.addNo(no1);
        g.addNo(no2);
        g.addNo(no3);
        g.addNo(no4);
        g.addNo(no5);

           // Valores para as Arestas
        Aresta a1 = new Aresta(no1, no2);
        Aresta a2 = new Aresta(no1, no3);
        Aresta a3 = new Aresta(no2, no4);
        Aresta a4 = new Aresta(no3, no4);
        Aresta a5 = new Aresta(no1, no4);
      
          // Adicionando as arestas entre os nós.
        g.addAresta(a1);
        g.addAresta(a2);
        g.addAresta(a3);
        g.addAresta(a4);
        g.addAresta(a5);
*/      
/*    Cenário 04: 
        - Grafo NÃO conexo
        - 2 componentes conexos
        - Maior componente com 4 vértices
        - NÃO possui o caminho de Euler
                  o ------ o       o 
                  | \___   |        \
                  |     \  |         \
                  o ------ o          o

           // Valores pros nós
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);

            // Adicionando os Nós
        g.addNo(no1);
        g.addNo(no2);
        g.addNo(no3);
        g.addNo(no4);
        g.addNo(no5);
        g.addNo(no6);

           // Valores para as Arestas
        Aresta a1 = new Aresta(no1, no2);
        Aresta a2 = new Aresta(no1, no3);
        Aresta a3 = new Aresta(no2, no4);
        Aresta a4 = new Aresta(no3, no4);
        Aresta a5 = new Aresta(no1, no4);
        Aresta a6 = new Aresta(no5, no6);
      
          // Adicionando as arestas entre os nós.
        g.addAresta(a1);
        g.addAresta(a2);
        g.addAresta(a3);
        g.addAresta(a4);
        g.addAresta(a5);
        g.addAresta(a6);
*/
        Scanner input = new Scanner(System.in);
        boolean Menu = true;
        int valor = 0, vInicio = 0, vFinal = 0;
      
        while (Menu) {
          System.out.println("\n");
          System.out.println("\t 0 - Sair do programa");
          System.out.println("\t 1 - Nós");
          System.out.println("\t 2 - Arestas");
          System.out.println("\t 3 - Matriz Adjacencia");
          //System.out.println("\t 4 - Grau ");
          System.out.println("\t 5 - É Conexo? ");
          System.out.println("\t 6 - Caminho Euler ");
          //System.out.println("\t 7 - Grau do Nó específico ");
          //System.out.println("\t 8 - Adjacencias do Nó ");
          //System.out.println("\t 9 - Apagar um Nó ");
          //System.out.println("\t10 - Apagar uma Aresta ");
          //System.out.println("\t11 - Procurar uma Aresta ");
          System.out.println("\t12 - Quantidade de Componentes no grafo ");
          System.out.println("\t13 - Quantidade de Nós existentes no Maior Componente* do grafo ");
          System.out.print("Escolha uma opção : ");
          int option = input.nextInt();
          System.out.println(); 
          
          switch (option) {
            
            case 1:
              g.exibeNos();          
            break;
            case 2:
              g.exibeArestas();;            
            break;
            case 3:
              g.matrizAdjacencia();          
            break;
            case 4:
              g.grau();        
            break;
            case 5:
              // boolean conexo = g.exibeConexo(false); 
              boolean conexo = g.isConexo();
                if(conexo == true ){
                System.out.print("O grafo é conexo! ");  
              } else {
                System.out.print("Este grafo não é conexo. ");  
              }
            break;
            case 6:
              g.TeoriaEuleriana(); 
            break;
            case 7: 
              System.out.print("Digite o nó para ver o Grau: ");
                valor = input.nextInt();
              System.out.println("Grau do nó: "+g.grauNo(valor)); 
              System.out.println("\n");
            break;
            case 8:
              System.out.print("Insira o nó para ver as adjacências: ");
                valor = input.nextInt();
              g.adjacencias(valor);
            break;
            case 9:
              System.out.println("Apagando Nó: ");
                valor = input.nextInt();
              g.apagaNo(valor); 
            break;
            case 10:
              System.out.println("Apagando Aresta: ");
              System.out.print("Digite o Nó inicial: ");
                vInicio = input.nextInt();
              System.out.print("Digite o Nó final: ");
                vFinal = input.nextInt();
              g.apagaAresta(vInicio, vFinal); 
            break;
            case 11:
              System.out.print("Digite o Nó inicial: ");
                vInicio = input.nextInt();
              System.out.print("Digite o Nó final: ");
                vFinal = input.nextInt();
              g.verificaConexao(vInicio, vFinal);
            break;
            case 12:
              int qtde = g.qtdeComponentes();
              System.out.println("A quantidade de componentes é = " +  qtde);
            break;
            case 13:
              int qtdemaior = g.qtdeNomaior();
              System.out.println("A quantidade de nos no maior componente conexo é = " + qtdemaior);
            break;
            default:
              Menu = false;
      }
    }
  }
}
