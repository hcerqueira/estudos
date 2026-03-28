package avaliacao_1.roteiro_7.parte_1;

public class Aluno {
   private int matricula;
   private String nome;
   private String curso;
   private int anoIngresso;
   private int qtdeDisciplinas;
   private String situacao;

   public Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
      this.matricula = pMatricula;
      this.nome = pNome;
      this.curso = pCurso;
      this.anoIngresso = pAnoIngresso;
      this.qtdeDisciplinas = 0;
      this.situacao = "Não Matriculado";
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

   public void matricular(int qtdeDisciplinas) {
      if ((qtdeDisciplinas == 0 && this.situacao.equals("Matriculado")) ||
              (qtdeDisciplinas == 1 && this.situacao.equals("Não Matriculado"))) {
         System.out.println("Operação inválida.");
      } else {
         this.qtdeDisciplinas = qtdeDisciplinas;
         this.situacao = (qtdeDisciplinas > 0) ? "Matriculado" : "Não Matriculado";
      }
   }
}