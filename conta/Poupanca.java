public class Poupanca extends Conta {
    //Atributos
    private double taxaJuros;

    //Construtor - sobrecarga de métodos
    public Poupanca() {
    }
    public Poupanca(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public Poupanca(int numConta, int numAgencia, String titular, double taxaJuros) {
        super(numConta, numAgencia, titular);
        this.taxaJuros = taxaJuros;
    }

    //Getters e Setters
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    //Métodos especificos
    public double calcularRendimento(double saldo){
        return getTaxaJuros() * saldo;
    }


}
