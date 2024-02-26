public class Salario extends Corrente {
    private int limiteSaldo = 3; //3 será o limite do saldo dessa conta;
    private double limite;

    public int getLimiteSaldo() {
        return limiteSaldo;
    }
    public double calcularLimiteSaldo(){
        return limiteSaldo * getSaldo();
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public void saqueComLimite(double valor){
        if(valor >= limite){
            System.out.println("Quantia acima do limite dessa conta.");
        } else {
            saque(valor);
        }
    }

}
