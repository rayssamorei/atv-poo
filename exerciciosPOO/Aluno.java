public class Aluno{
    private String nome;
    private int matricula;
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + "]";
    }
}