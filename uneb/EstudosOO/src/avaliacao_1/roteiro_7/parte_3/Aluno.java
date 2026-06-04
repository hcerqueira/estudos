package avaliacao_1.roteiro_7.parte_3;
import java.util.ArrayList;

public class Aluno {
   private int matricula;
   private String nome;
   private String curso;
   private int anoIngresso;
   private int qtdeDisciplinas;
   private String situacao;
   private ArrayList<String> listaDisciplinas;

   public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
      this.matricula = pMatricula;
      this.nome = pNome;
      this.curso = pCurso;
      this.anoIngresso = pAnoIngresso;
      this.qtdeDisciplinas = 0;
      this.situacao = "Não Matriculado";
      this.listaDisciplinas = new ArrayList<String>();
   }

   public int getMatricula() {
      return this.matricula;
   }

   public void setMatricula(int matricula) {
      this.matricula = matricula;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getCurso() {
      return this.curso;
   }

   public int getAnoIngresso() {
      return this.anoIngresso;
   }

   public int getQtdeDisciplinas() {
      return this.qtdeDisciplinas;
   }

   public String getSituacao() {
      return this.situacao;
   }

   public ArrayList<String> getListaDisciplinas() {
      return this.listaDisciplinas;
   }

      //Método adicionar disciplina
   public void adicionarDisciplina(String disciplina) {
      this.listaDisciplinas.add(disciplina);
   }
      //Metodo para listar as disciplinas
   public ArrayList<String> getDisciplinasMatriculadas() {
      ArrayList<String> disciplinasMatriculadas = new ArrayList<String>();
      for (String disciplina : this.listaDisciplinas) {
         disciplinasMatriculadas.add(disciplina);
      }
      return disciplinasMatriculadas;
   }

   public void matricular(int qtdeDisciplinas) {
      if (qtdeDisciplinas < 0) {
         System.out.println("Operação inválida: quantidade de disciplinas não pode ser negativa.");
      } else {
         this.qtdeDisciplinas = qtdeDisciplinas;
         this.situacao = (qtdeDisciplinas > 0) ? "Matriculado" : "Não Matriculado";
      }
   }
}
