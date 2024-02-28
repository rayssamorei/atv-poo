public class Carro extends Veiculo {
    private boolean conversivel;
    private String motor;

    public Carro(){
    }
    public Carro(String marca, String modelo, String qtdRodas, String cor, boolean conversivel, String motor) {
        super(marca, modelo, qtdRodas, cor);
        this.conversivel = conversivel;
        this.motor = motor;
    }
    public Carro(String marca, String modelo, String qtdRodas, String cor, double velocidade, String anoFabricado,
            boolean conversivel, String motor) {
        super(marca, modelo, qtdRodas, cor, velocidade, anoFabricado);
        this.conversivel = conversivel;
        this.motor = motor;
    }
    public boolean isConversivel() {
        return conversivel;
    }
    public void setConversivel(boolean conversivel) {
        this.conversivel = conversivel;
    }
    public String getMotor() {
        return motor;
    }
    public void setMotor(String motor) {
        this.motor = motor;
    }
    @Override
    public String toString() {
        return "Carro [conversivel=" + conversivel + ", motor=" + motor + "]";
    }

}
