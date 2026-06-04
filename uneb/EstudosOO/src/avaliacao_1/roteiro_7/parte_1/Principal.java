package avaliacao_1.roteiro_7.parte_1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando um vetor estático de objetos 'Aluno'
        Aluno[] listaAlunos = new Aluno[3];

        // Laço de repetição para input do usuário
        for (int i = 0; i < 3; i++) {
            System.out.println("Inserindo dados do aluno " + (i + 1));

            System.out.print("\tMatrícula: ");
                int matricula = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha
            System.out.print("\tNome: ");
                String nome = sc.nextLine();
            System.out.print("\tCurso: ");
                String curso = sc.nextLine();
            System.out.print("\tAno de ingresso: ");
                int anoIngresso = sc.nextInt();
                sc.nextLine(); // Consumir a quebra de linha

                //Criando e armazenando o objeto Aluno no vetor
            listaAlunos[i] = new Aluno(matricula, nome, curso, anoIngresso);
        }

        System.out.println("Listando os alunos: ");
        System.out.println("_______________________________________________________");
        for (int i = 0; i < 3; i++) {
            System.out.println("Matrícula: " + listaAlunos[i].getMatricula());
            System.out.println("Nome: " + listaAlunos[i].getNome());
            System.out.println("Curso: " + listaAlunos[i].getCurso());
            System.out.println("Ano ingresso: " + listaAlunos[i].getAnoIngresso());
            System.out.println("_______________________________________________________");
        }
    }
}
