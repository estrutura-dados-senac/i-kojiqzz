package EX;


public class Ex02ProfundidadeDoNo {
    static class Node{
        Node left;
        Node right;
        String nome;

        Node(String nome){
            this.nome = nome;
        }
        public static int profundidade(Node raiz, String alvo){
            if(raiz == null){
                return -1;
            }
            if (raiz.nome.equals(alvo)) {
                return 0;
            }
            int esquerda = profundidade(raiz.left, alvo);
            if(esquerda != -1){
                return esquerda + 1;
            }
            int direita = profundidade(raiz.right, alvo);
            if(direita != -1){
                return direita + 1;
            }
            return -1;
        }
    }
}
