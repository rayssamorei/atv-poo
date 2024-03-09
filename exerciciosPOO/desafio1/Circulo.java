package desafio1;

public class Circulo extends Geometria {
    private double raio;
    
    public Circulo(){

    }
    
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        this.raio = raio;
    }
}
