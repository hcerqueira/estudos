package avaliacao_1.roteiro_1.parte_2;

    // Criando uma classe pública chamada Exercicio01
public class Exercicio01 {
    public static void main(String[] args) {

            // Declarando variáveis e atribuindo valores (poderia receber do usuário, mas não é a meta).
        double sb = 2500;
        int numHorasExtra = 10;
        int jornadaHoras = 40;

            // Exibe o salário base do funcionário na tela
        System.out.println("Salário base do funcionário é: " + sb);

            // O valor da hora extra é calculado dividindo o salário-base pelo número de horas trabalhadas no mês
        double calc = (double) 2500 / 40 * 10; // Calcula o valor das horas extras (2500 / 40 = valor da hora por hora; multiplicado por 10 horas)

            // Somando o salário base com o valor das horas extras para obter o salário total
        double st = sb + calc; // Calcula o salário total (salário base + valor das horas extras)

            // Exibe o salário total do funcionário na tela
        System.out.println("Salario do funcionário somando as horas extras é: " + st);
    }
}