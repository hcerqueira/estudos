package avaliacao_2;
import java.util.ArrayList;

public class OrdemCarga {
    private int codigo;
    private String data;
    private String placaVeiculo;
    private ArrayList<OrdemColeta> ordensColeta; //Lista de Ordens de coleta
        //Atributos restantes
    private double pesoBrutoTotal;
    private double pesoLiquidoTotal;
    private double valorTotal;

        //Método construtor
    public OrdemCarga(int codigo, String data, String placaVeiculo) {
        this.codigo = codigo;
        this.data = data;
        this.placaVeiculo = placaVeiculo;
        this.ordensColeta = new ArrayList<>();
        this.pesoBrutoTotal = 0;
        this.pesoLiquidoTotal = 0;
        this.valorTotal = 0;
    }

    // Método para montar a Ordem de Carga
    public void adicionarOrdemColeta(OrdemColeta ordemColeta) {
        this.ordensColeta.add(ordemColeta);
    }

        // Método que retorna a Ordem de Coleta mais cara
    public OrdemColeta getOrdemColetaMaisCara() {
        OrdemColeta maisCara = null;
        double valorMaximo = 0;

        for (OrdemColeta ordemColeta : ordensColeta) {
            double valorOrdem = calcularValorOrdem(ordemColeta);
            if (valorOrdem > valorMaximo) {
                valorMaximo = valorOrdem;
                maisCara = ordemColeta;
            }
        }
        return maisCara;
    }

        //Método que calcula o PesoBruto
    private double calcularPesoBruto(OrdemColeta ordemColeta) {
        double pesoBruto = 0;
        for (Produto produto : ordemColeta.getProdutos()) {
            pesoBruto += produto.getPesoBruto();
        }
        return pesoBruto;
    }

        //Método que calcula o Peso Liquido
    private double calcularPesoLiquido(OrdemColeta ordemColeta) {
        double pesoLiquido = 0;
        for (Produto produto : ordemColeta.getProdutos()) {
            pesoLiquido += produto.getPesoLiquido();
        }
        return pesoLiquido;
    }
        //Método que calcula o Valor total da Carga
    private double calcularValorOrdem(OrdemColeta ordemColeta) {
        double valor = 0;
        for (Produto produto : ordemColeta.getProdutos()) {
            valor += produto.getValor();
        }
        return valor;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }
    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
    public ArrayList<OrdemColeta> getOrdensColeta() {
        return ordensColeta;
    }
    public void setOrdensColeta(ArrayList<OrdemColeta> ordensColeta) {
        this.ordensColeta = ordensColeta;
    }
    public double getPesoBrutoTotal() {
        return pesoBrutoTotal;
    }
    public double getPesoLiquidoTotal() {
        return pesoLiquidoTotal;
    }
    public double getValorTotal() {
        return valorTotal;
    }
}