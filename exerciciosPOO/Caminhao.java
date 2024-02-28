public class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao() {
    }

    public Caminhao(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao [capacidadeCarga=" + capacidadeCarga + "]";
    }
}
