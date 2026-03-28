package avaliacao_1.roteiro_7.parte_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando uma ArrayList de objetos 'Aluno'
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        // Laço de repetição para input do usuário
        for (int i = 0; i < 3; i++) {
            System.out.println("Inserindo dados do aluno " + (i + 1));

            System.out.print("\tMatrícula: ");
                int matricula = sc.nextInt();
                sc.nextLine(); // quebra de linha
            System.out.print("\tNome: ");
                String nome = sc.nextLine();
            System.out.print("\tCurso: ");
                String curso = sc.nextLine();
            System.out.print("\tAno de ingresso: ");
                int anoIngresso = sc.nextInt();
                sc.nextLine(); // quebra de linha

            // Criando e adicionando o objeto Aluno na ArrayList
            Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso);

            System.out.print("\tQuantidade de disciplinas: ");
            int qtdeDisciplinas = sc.nextInt();
            sc.nextLine(); // quebra de linha

            // Registrando a quantidade de disciplinas de cada aluno para verificar a situação conforme o método
            aluno.matricular(qtdeDisciplinas);
            System.out.println("\n"); // Somente para pular uma linha para os próximos alunos

            for (int j = 0; j < qtdeDisciplinas; j++) {
                System.out.print("Digite o nome da disciplina " + (j + 1) + ": ");
                String disciplina = sc.nextLine();
                aluno.adicionarDisciplina(disciplina);
            }

            // Adicionando o aluno à lista de alunos
            listaAlunos.add(aluno);
        }

        // Exibindo os alunos e suas informações
        System.out.println("Listando os alunos: ");
        System.out.println("_______________________________________________________");
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Ano ingresso: " + aluno.getAnoIngresso());
            System.out.println("Número de disciplinas: " + aluno.getQtdeDisciplinas());
            System.out.println("Situação: " + aluno.getSituacao());
            System.out.println("Lista de disciplinas: ");

            ArrayList<String> disciplinasMatriculadas = aluno.getDisciplinasMatriculadas();
            for (String disciplina : disciplinasMatriculadas) {
                System.out.println("- " + disciplina);
            }
            System.out.println("_______________________________________________________");
        }
    }
}
