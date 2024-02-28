public class Salario extends Corrente {
    //Atributos
    private int limiteSaldo = 3; //3 será o limite do saldo dessa conta;
    private double limite;

    //Métodos construtores
    public Salario() {
    }

    public Salario(int numConta, int numAgencia, String titular) {
        super(numConta, numAgencia, titular);
    }

    public Salario(int numConta, int numAgencia, String titular, double limiteCredito) {
        super(numConta, numAgencia, titular, limiteCredito);
    }
    
    //Métodos getters e setters
    public int getLimiteSaldo() {
        return limiteSaldo;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }
    
    //Métodos especificos
    public double calcularLimiteSaldo(){
        return limiteSaldo * getSaldo();
    }

    public void saqueComLimite(double valor){
        if(valor >= limite){
            System.out.println("Quantia acima do limite dessa conta.");
        } else {
            saque(valor);
        }
    }

}
