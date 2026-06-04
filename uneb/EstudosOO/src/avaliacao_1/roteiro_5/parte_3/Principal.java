package avaliacao_1.roteiro_5.parte_3;

public class Principal {

    public static void main(String[] args) {
        Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");
        Loja loja03 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");

        loja01.setValorFat(10000);
        loja02.setValorFat(20000);
        loja03.setValorFat(10000);

        System.out.println("\n ****** Teste 1 ********");
        if (loja01.getNomeFantasia() == loja03.getNomeFantasia()) {
            System.out.println("Lojas Iguais");
        } else {
            System.out.println("Lojas Diferentes");
        }

        System.out.println("\n ****** Teste 2 ********");
        if (loja01.getNomeFantasia().equals(loja03.getNomeFantasia())) {
            System.out.println("Lojas Iguais");
        } else {
            System.out.println("Lojas Diferentes");
        }

        System.out.println("\n ****** Teste 3 ********");
        if (loja01 == loja03) {
            System.out.println("Lojas Iguais");
        } else {
            System.out.println("Lojas Diferentes");
        }

        System.out.println("\n ****** Teste 4 ********");
        if (loja01.equals(loja03)) {
            System.out.println("Lojas Iguais");
        } else {
            System.out.println("Lojas Diferentes");
        }

        System.out.println("\n ****** Teste 5 ********");
        if (loja01.getValorFat() == loja03.getValorFat()) {
            System.out.println("Faturamentos Iguais");
        } else {
            System.out.println("Faturamentos Diferentes");
        }
        System.out.println(" ****** Comparação com método estático ********");
        Loja.compararFat_static(loja01, loja02);

        System.out.println(" ****** Comparação com método NÃO estático ********");
        loja01.compararFat_naoStatic(loja02);

        System.out.println(" ****** Comparação com método NÃO estático ********");
        loja02.compararFat_naoStatic(loja01);

        /*
        Podemos chamar métodos estáticos diretamente a partir do nome da classe, tornando o código mais simples
        e mais fácil de ler.

        Métodos estáticos não precisam ser associados a uma instância de objeto, o que pode economizar memória e
        recursos em comparação com métodos não estáticos que precisariam ser chamados em instâncias separadas.

        Eles permitem que você substitua métodos em subclasses para fornecer implementações específicas, tornando o código
        mais flexível e orientado a objetos, se nao me engano
        */

    }
}