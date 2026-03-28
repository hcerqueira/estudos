package avaliacao_1.roteiro_5.parte_1;

public class Principal {

    public static void main(String[] args) {
        Loja loja01 = new Loja("Lojão da Cidade", "Lojão Comércio LTDA", "11223344");
        Loja loja02 = new Loja("Mercadão do Povo", "", "10101010");

        System.out.println("Nome fantasia: "+loja01.getNomeFantasia());
        System.out.println("Razão social: "+loja01.getRazaoSocial());
        System.out.println("CNPJ: "+loja01.getCnpj());

        System.out.println("\n");

        System.out.println("Nome fantasia: "+loja02.getNomeFantasia());
        System.out.println("Razão social: "+loja02.getRazaoSocial());
        System.out.println("CNPJ: "+loja02.getCnpj());
    }
}