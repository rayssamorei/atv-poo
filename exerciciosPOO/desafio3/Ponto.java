package desafio3;

public class Ponto {
    private double pontoXA;
    private double pontoXB;
    private double pontoYA;
    private double pontoYB;

    public Ponto() {
    }

    public Ponto(double pontoXA, double pontoXB, double pontoYA, double pontoYB) {
        //(XA, YA) e (XB, YB);
        this.pontoXA = pontoXA;
        this.pontoXB = pontoXB;
        this.pontoYA = pontoYA;
        this.pontoYB = pontoYB;
    }
    
    /*
     *De acordo com a fórmula de geometria analitica, que diz que a distancia entre dois pontos é a raiz quadrada de (XB + XA)^2 + (YB-YA)^2
     */

    public double distanciaEntreDoisPontos(double pontoXA, double pontoXB, double pontoYA, double pontoYB){
        double potencia1 = java.lang.Math.pow(pontoYB, pontoYA);
        double potencia2 = java.lang.Math.pow(pontoYB, pontoYA);
        double distancia = Math.sqrt(potencia1 + potencia2);
        return distancia;
    }

    public double getPontoXA() {
        return pontoXA;
    }
    public void setPontoXA(double pontoXA) {
        this.pontoXA = pontoXA;
    }
    public double getPontoXB() {
        return pontoXB;
    }
    public void setPontoXB(double pontoXB) {
        this.pontoXB = pontoXB;
    }
    public double getPontoYA() {
        return pontoYA;
    }
    public void setPontoYA(double pontoYA) {
        this.pontoYA = pontoYA;
    }
    public double getPontoYB() {
        return pontoYB;
    }
    public void setPontoYB(double pontoYB) {
        this.pontoYB = pontoYB;
    }

    @Override
    public String toString() {
        return "Ponto 1: (" + pontoXA + ", " + pontoYA + ") e ponto 2: (" + pontoXB + ", " + pontoYB
                + ")";
    }

}