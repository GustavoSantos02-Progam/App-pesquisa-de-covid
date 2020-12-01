package classes;

public class Pesquisa {

    private DadosPessoais[] pesquisados;
    private int contadorPesquisados;

    public Pesquisa(int maxPesquisados) {
        pesquisados = new DadosPessoais[maxPesquisados];
        System.out.println(pesquisados.length);
    }
    
    
    

    public boolean adicionaResposta(DadosPessoais novoAcademico) {
        if (contadorPesquisados < pesquisados.length) {
            pesquisados[contadorPesquisados] = novoAcademico;
            contadorPesquisados++;
            return true;
        }
        return false;
    }

    
    
    public int[] sexoPesquisado() {
        int[] contador = new int[3];
        for (int i = 0; i < contadorPesquisados; i++) {
            if (pesquisados[i].isCovid() == true) {
                switch (pesquisados[i].getSexo()) {
                    case 'M':
                        contador[0]++;
                        break;
                    case 'F':
                        contador[1]++;
                        break;
                }
            } else if (pesquisados[i].isCovid() == false) {
                contador[2]++;
            }
        }
        return contador;
    }

    
    
    public int[] PortadorDeCovid() {
        int contador[] = new int[2];

        for (int i = 0; i < pesquisados.length; i++) {
            if (pesquisados[i].covid == false) {
                contador[0]++;
            } else {
                contador[1]++;
            }
        }
        return contador;
    }

    
    
    
    public DadosPessoais[] getPesquisados() {
        return pesquisados;
    }
    public int getContadorPesquisados() {
        return contadorPesquisados;
    }

    
    
    
    public String objToString(DadosPessoais[] vetor, String msg) {
        StringBuilder saida = new StringBuilder(msg + "Pesquisas realizadas até o momento:\n");
        for (int i = 0; i < contadorPesquisados; i++) {
            saida.append(i + 1).append("º Academico     sexo: ").append(vetor[i].sexo()).append("    idade: ").append(vetor[i].getIdade()).append("     teste covid: ").append(vetor[i].covid()).append("\t\n");
        }
        return saida.toString();
    }

    
}
