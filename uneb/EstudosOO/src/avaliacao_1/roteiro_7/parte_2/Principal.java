package avaliacao_1.roteiro_7.parte_2;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Criando uma ArrayList de objetos 'Aluno'
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

            // Laço de repetição para input do usuário
        for (int i = 0; i < 3; i++) {
            System.out.println("Inserindo dados do aluno " + (i + 1));

            System.out.print("\t Matrícula: ");
                int matricula = sc.nextInt();
                sc.nextLine(); //quebra de linha
            System.out.print("\t Nome: ");
                String nome = sc.nextLine();
            System.out.print("\t Curso: ");
                String curso = sc.nextLine();
            System.out.print("\t Ano de ingresso: ");
                int anoIngresso = sc.nextInt();
                sc.nextLine(); //quebra de linha

                // Criando e adicionando o objeto Aluno na ArrayList
            Aluno aluno = new Aluno(matricula, nome, curso, anoIngresso);
            listaAlunos.add(aluno);
        }

        System.out.println("Listando os alunos: ");
        System.out.println("_______________________________________________________");
        for (int i = 0; i < listaAlunos.size(); i++) {
            Aluno aluno = listaAlunos.get(i);
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Ano ingresso: " + aluno.getAnoIngresso());
            System.out.println("_______________________________________________________");
        }
    }
}
