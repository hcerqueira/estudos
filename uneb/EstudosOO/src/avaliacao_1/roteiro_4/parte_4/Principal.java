package avaliacao_1.roteiro_4.parte_4;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a matrícula do aluno: ");
        int matricula = sc.nextInt();

        sc.nextLine(); // Consumir a quebra de linha pendente

        System.out.println("Informe o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Informe o curso do aluno: ");
        String curso = sc.nextLine();

        System.out.println("Informe o ano de ingresso do aluno: ");
        int anoIngresso = sc.nextInt();


        Aluno aluno01 = new Aluno(matricula, nome, curso, anoIngresso);

            // Solicitar ao usuário que digite a quantidade de disciplinas para matricular o aluno
        System.out.println("Informe a quantidade de disciplinas para matricular o aluno: ");
        int qtdeDisciplinas = sc.nextInt();


        aluno01.matricular(qtdeDisciplinas);

        System.out.println("\nDados do Aluno:");
        System.out.println("Matrícula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de Ingresso: " + aluno01.getAnoIngresso());
        System.out.println("Qtde Disciplinas: " + aluno01.getQtdeDisciplinas());
        System.out.println("Situação: " + aluno01.getSituacao());


    }
}
