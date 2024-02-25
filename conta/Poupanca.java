public class Poupanca extends Conta {
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double calcularRendimento(double saldo){
        return getTaxaJuros() * saldo;
    }


}
