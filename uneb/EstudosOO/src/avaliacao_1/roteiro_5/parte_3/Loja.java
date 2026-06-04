package avaliacao_1.roteiro_5.parte_3;

public class Loja {
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    private double valorFat;
    private double area;
    private String nomeProprietario;

        //Método construtor
    public Loja(String nomeFantasia, String razaoSocial, String cnpj) {
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

        //Aplicando a sobrecarga no método construtor
    public Loja(String nomeFantasia, String cnpj) {
        this(nomeFantasia, nomeFantasia, cnpj);
    }

    public static void compararFat_static(Loja lojaA, Loja lojaB) {
        if (lojaA.getValorFat() > lojaB.getValorFat()) {
            System.out.println("Loja de Maior Fat : " + lojaA.nomeFantasia);
        } else {
            System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
        }
    }

    public void compararFat_naoStatic(Loja lojaB) {
        if (this.getValorFat() > lojaB.getValorFat()) {
            System.out.println("Loja de Maior Fat : " + this.nomeFantasia);
        } else {
            System.out.println("Loja de Maior Fat : " + lojaB.nomeFantasia);
        }
    }

        // Gets e Sets
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorFat() {
        return valorFat;
    }

    public void setValorFat(double valorFat) {
        this.valorFat = valorFat;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
}
