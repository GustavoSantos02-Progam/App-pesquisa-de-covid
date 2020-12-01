package classes;

public class DadosPessoais {

    int idade;
    char sexo;
    boolean covid;

    public DadosPessoais(int idade, char sexo, boolean covid) {
        this.idade = idade;
        this.sexo = sexo;
        this.covid = covid;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isCovid() {
        return covid;
    }

    public void setCovid(boolean covid) {
        this.covid = covid;
    }

    public String covid() {
        String x = "";
        if (covid == true) {
            x = "Positivo";
            return x;
        } else {
            x = "Negativo";
            return x;
        }

    }
        public String sexo() {
        String x = "";
        if (sexo == 'F') {
            x = "Feminino";
            return x;
        } else {
            x = "Masculino";
            return x;
        }

    }
}
