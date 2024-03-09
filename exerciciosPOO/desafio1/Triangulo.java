package desafio1;

public class Triangulo extends Geometria{
    private double alt;
    private double base;
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo() {
    }

    public Triangulo(double alt, double base) {
        this.alt = alt;
        this.base = base;
    }

    public Triangulo(double alt, double base, double lado1, double lado2, double lado3) {
        this.alt = alt;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * alt) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    public void descobrirTipo (double lado1, double lado2, double lado3){
        String tipo;
        if(lado1 == lado2 && lado2 == lado3){
            tipo = "Equilátero";
        } else if(lado1 != lado2 && lado2 != lado3){
            tipo = "Escaleno";
        } else {
            tipo = "Isósceles";
        }
        System.out.println("O tipo do triangulo de acordo com seus lados é: " + tipo);
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }


}
