/*
criar classe pessoa
atributos: nome, idade, sexo, peso, corOlhos, corCabelo, altura, corPele

getters e setters

construtores
 */

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String sexo;
    private double altura;
    private double peso;
    private String corOlhos;
    private String corCabelo;
    private String corPele;

    //Construtores
    public Pessoa(String nome, int idade, String sexo, double altura, double peso, String corOlhos, String corCabelo,
            String corPele) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
        this.corPele = corPele;
    }

    public Pessoa() {

    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public String getCorOlhos() {
        return corOlhos;
    }
    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }
    public String getCorCabelo() {
        return corCabelo;
    }
    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }
    public String getCorPele() {
        return corPele;
    }
    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
    
}
