public class Moto extends Veiculo {
    private boolean temCapacete;
    
    public Moto(){
        
    }

    public Moto(boolean temCapacete) {
        this.temCapacete = temCapacete;
    }

    public Moto(String marca, String modelo, String qtdRodas, String cor, boolean temCapacete) {
        super(marca, modelo, qtdRodas, cor);
        this.temCapacete = temCapacete;
    }

    public Moto(String marca, String modelo, String qtdRodas, String cor, double velocidade, String anoFabricado,
            boolean temCapacete) {
        super(marca, modelo, qtdRodas, cor, velocidade, anoFabricado);
        this.temCapacete = temCapacete;
    }

    public boolean isTemCapacete() {
        return temCapacete;
    }

    public void setTemCapacete(boolean temCapacete) {
        this.temCapacete = temCapacete;
    }

    @Override
    public String toString() {
        return "Moto [temCapacete=" + temCapacete + "]";
    }
    
}
