package avaliacao_1.roteiro_8.parte_3;

public class Principal {
   public static void main(String[] args) {
      // Criando um cliente de teste
      Cliente cliente = new Cliente("1234567890", "Pedro", "Rua Principal Secundária", "joaosem@email.com", "123456789", null);

      // Testando com diferentes tipos de veículos
      VeiculoCarga veiculoCarga = new VeiculoCarga("ABC123", 2020, 5000.0);
      VeiculoPasseio veiculoPasseio = new VeiculoPasseio("XYZ789", 2022, 5);
      VeiculoPequeno veiculoPequeno = new VeiculoPequeno("DEF456", 2021, "Sedan");

      // Associando os veículos ao cliente
      cliente.setVeiculo(veiculoCarga);

      // Exibindo os dados do cliente
      System.out.println("Dados do Cliente:");
      System.out.println("Nome: " + cliente.getNome());
      System.out.println("CPF/CNPJ: " + cliente.getCpfCnpj());
      System.out.println("Endereço: " + cliente.getEndereco());
      System.out.println("Email: " + cliente.getEmail());
      System.out.println("Telefone: " + cliente.getTelefone());

      // Exibindo os dados do veículo
      System.out.println("\nDados do Veículo:");
      System.out.println("Placa: " + cliente.getVeiculo().getPlaca());
      System.out.println("Ano de Fabricação: " + cliente.getVeiculo().getAnoFabricacao());

      // Calculando o valor do pedágio com base no tipo de veículo
      double pedagio = cliente.getVeiculo().calcPedagio();
      System.out.println("\nValor do Pedágio: R$" + pedagio);
   }
}
