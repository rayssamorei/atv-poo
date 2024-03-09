package desafio2;

public class Usuario{
    private String nome;
    private int dataNasc;
    private char sexo;

    public Usuario() {
    }

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario(String nome, int dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }

    public Usuario(String nome, int dataNasc, char sexo) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}