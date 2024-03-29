public class Teste {
    public static void main(String[] args) {
        //Super classe Conta
        Conta c = new Conta();
        c.depositar(300);
        System.out.println("O saldo da sua conta é: " + c.getSaldo());

        //Sub classe Poupança
        Poupanca p = new Poupanca();
        p.setTaxaJuros(0.08);
        p.depositar(230);
        System.out.println("O rendimento da sua conta poupança foi de: " + p.calcularRendimento(p.getSaldo()));

        //Sub classe Corrente - Super classe Corrente
        Corrente co = new Corrente();
        co.depositar(800);
        co.setLimiteCredito(800);
        co.saque(1500);
        System.out.println("O saldo atual da conta é: " + co.getSaldo());

        /*
         * o saldo da conta é ilimitado, logo pode-se tirar quantias sem um limite pré
         * estabelecido pelo o banco como um crédito, que será dado a conta salário.
        */
        
        //Sub classe Salario
        Salario salario = new Salario();
        salario.depositar(800);
        double limite = salario.calcularLimiteSaldo();
        salario.setLimite(limite);
        System.out.println("Com base no saldo da sua conta, você terá " + limite + " de limite na sua conta salário.");
    }
}
