public class Salario extends Corrente {
    private int limiteSaldo = 3; //3 será o limite do saldo dessa conta;

    public int getLimiteSaldo() {
        return limiteSaldo;
    }
    public double calcularLimiteSaldo(){
        return limiteSaldo * getSaldo();
    }

}
