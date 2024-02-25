public class Conta {
    //Atributos
    private double saldo;
    private int numConta;
    private int numAgencia;
    private String titular;

    //Métodos especificos
    public void saque (double valor){
        saldo -= valor;
    }

    public void depositar (double valor){
        saldo += valor;
    }

    //Métodos getters e setters
    
    //ver saldo da conta
    public double getSaldo() {
        return saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}