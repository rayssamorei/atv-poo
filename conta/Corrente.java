public class Corrente extends Conta{
    private double limiteCredito;
    
    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
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
