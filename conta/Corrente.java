public class Corrente extends Conta{
    //Atributos
    private double limiteCredito;

    //Método construtor
    public Corrente() {
    }

    public Corrente(int numConta, int numAgencia, String titular) {
        super(numConta, numAgencia, titular);
    }

    public Corrente(int numConta, int numAgencia, String titular, double limiteCredito) {
        super(numConta, numAgencia, titular);
        this.limiteCredito = limiteCredito;
    }

    //Métodos getters e setters
    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    //Métodos especificos - rever esse código
    public void saque(double valor) {
        if (valor <= getSaldo() + limiteCredito) {
            if (valor <= getSaldo()) {
                super.saque(valor);
            } else {
                double limiteUsado = valor - getSaldo();
                super.saque(limiteUsado);
            }
        } else {
            System.out.println("Saldo insuficiente e cheque especial excedido.");
        }
        
    }
    
}
