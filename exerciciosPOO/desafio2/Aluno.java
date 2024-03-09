package desafio2;

public class Aluno extends Usuario{
    private int numMatricula;
    private String turma;
    private String curso;

    public Aluno() {
    }
    public Aluno(int numMatricula, String curso) {
        this.numMatricula = numMatricula;
        this.curso = curso;
    }
    public Aluno(int numMatricula, String turma, String curso) {
        this.numMatricula = numMatricula;
        this.turma = turma;
        this.curso = curso;
    }

    public void verificarPrazoDevolucao(){
        System.out.println("O prazo de devolução para alunos é de 7 dias.");
    }

    public int getNumMatricula() {
        return numMatricula;
    }
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}