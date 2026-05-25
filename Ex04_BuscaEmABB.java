public class Ex04_BuscaEmABB {
    public class Ex04BuscaEmABB {

    static class No {
        int codigo;
        No left;
        No right;

        public No(int codigo) {
            this.codigo = codigo;
        }
    }

    public boolean buscar(No raiz, int codigo) {

        No atual = raiz;

        while (atual != null) {

            if (codigo == atual.codigo) {
                return true;
            }

            if (codigo < atual.codigo) {
                atual = atual.left;
            } else {
                atual = atual.right;
            }
        }

        return false;
    }

    // auxiliar para criar a ABB
    public No inserir(No raiz, int codigo) {

        if (raiz == null) {
            return new No(codigo);
        }

        if (codigo < raiz.codigo) {
            raiz.left = inserir(raiz.left, codigo);
        } else {
            raiz.right = inserir(raiz.right, codigo);
        }

        return raiz;
    }
}
}
