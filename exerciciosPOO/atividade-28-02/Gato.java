public class Gato extends Animal {
    private String raca;
    private String corOlhos;
    private String corPelo;
    private String sexo;

    public Gato() {
    }

    public Gato(String raca, String corOlhos, String corPelo, String sexo) {
        this.raca = raca;
        this.corOlhos = corOlhos;
        this.corPelo = corPelo;
        this.sexo = sexo;
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

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Gato [raca=" + raca + ", corOlhos=" + corOlhos + ", corPelo=" + corPelo + ", sexo=" + sexo + "]";
    }

}
