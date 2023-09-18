public class TaxasAluguel {
    private double taxaAnual = 287.20;
    private double taxaMensal = 36.90;
    private double taxaDiaria = 14.90;
    private double taxaAvulsa = 5.90;
    private double taxaMinutoExcedido = 0.50;

    public double getTaxaMinutoExcedido() {
        return taxaMinutoExcedido;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public double getTaxaMensal() {
        return taxaMensal;
    }

    public double getTaxaDiaria() {
        return taxaDiaria;
    }

    public double getTaxaAvulsa() {
        return taxaAvulsa;
    }
}