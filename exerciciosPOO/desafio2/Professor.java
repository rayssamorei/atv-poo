package desafio2;

public class Professor {
    private String especialidade;
    
    public Professor() {
    }

    public Professor(String especialidade) {
        this.especialidade = especialidade;
    }

    public void requisitarProrrogacao(){
        System.out.println("A prorrogação do livro será requisitada.");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
