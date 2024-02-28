public class Veiculo{
    private String marca;
    private String modelo;
    private String qtdRodas;
    private String cor;
    private double velocidade;
    private String anoFabricado;

    public Veiculo() {
    }
    public Veiculo(String marca, String modelo, String qtdRodas, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
        this.cor = cor;
    }
    public Veiculo(String marca, String modelo, String qtdRodas, String cor, double velocidade, String anoFabricado) {
        this.marca = marca;
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
        this.cor = cor;
        this.velocidade = velocidade;
        this.anoFabricado = anoFabricado;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getQtdRodas() {
        return qtdRodas;
    }
    public void setQtdRodas(String qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public String getAnoFabricado() {
        return anoFabricado;
    }
    public void setAnoFabricado(String anoFabricado) {
        this.anoFabricado = anoFabricado;
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", qtdRodas=" + qtdRodas + ", cor=" + cor
                + ", velocidade=" + velocidade + ", anoFabricado=" + anoFabricado + "]";
    }
}