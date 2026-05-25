import java.util.ArrayList;
import java.util.List;

public class Ex05_PreOrdem {

    static class No {
        String etapa;
        No esquerda;
        No direita;

        public No(String etapa) {
            this.etapa = etapa;
        }
    }

    public List<String> preOrdem(No raiz) {
        List<String> resultado = new ArrayList<>();

        preOrdemRec(raiz, resultado);

        return resultado;
    }

    private void preOrdemRec(No atual, List<String> resultado) {

        if (atual == null) {
            return;
        }

        // raiz
        resultado.add(atual.etapa);

        // esquerda
        preOrdemRec(atual.esquerda, resultado);

        // direita
        preOrdemRec(atual.direita, resultado);
    }
}