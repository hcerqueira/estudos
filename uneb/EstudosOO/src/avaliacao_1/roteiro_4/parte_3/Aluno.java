package avaliacao_1.roteiro_4.parte_3;
public class Aluno {
    //Atributos da classe, com acesso privado
    private int matricula;
    private String nome;
    private String curso;
    private int anoIngresso;

    //Construtor
    Aluno(int pMatricula, String pNome, String pCurso, int pAnoIngresso) {
        this.matricula = pMatricula;
        this.nome = pNome;
        this.curso = pCurso;
        this.anoIngresso = pAnoIngresso;
    }

    //Getteres and Setteres (Gerados automaticamente);
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
}
