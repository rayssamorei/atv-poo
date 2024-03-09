public class Cachorro extends Animal {
    private String cor;
    private String raca;
    private String corOlhos;
    private String sexo;

    public Cachorro() {
    }

    public Cachorro(String raca, String corOlhos, String sexo) {
        this.raca = raca;
        this.corOlhos = corOlhos;
        this.sexo = sexo;
    }

    public Cachorro(String cor, String raca, String corOlhos, String sexo) {
        this.cor = cor;
        this.raca = raca;
        this.corOlhos = corOlhos;
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCorOlhos() {
        return corOlhos;
    }
    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cachorro [cor=" + cor + ", raca=" + raca + ", corOlhos=" + corOlhos + ", sexo=" + sexo + "]";
    }
}
