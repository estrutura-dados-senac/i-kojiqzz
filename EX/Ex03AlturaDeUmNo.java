package EX;

public class Ex03AlturaDeUmNo {

    static class Node {

        Node left;
        Node right;
        String nome;

        Node(String nome) {
            this.nome = nome;
        }
    }

    public static int buscarNO(Node raiz, String alvo) {

        if (raiz == null) {
            return -1;
        }

        if (raiz.nome.equals(alvo)) {
            return altura(raiz);
        }

        int esquerda = buscarNO(raiz.left, alvo);

        if (esquerda != -1) {
            return esquerda;
        }

        return buscarNO(raiz.right, alvo);
    }

    public static int altura(Node raiz) {

        if (raiz == null) {
            return 0;
        }

        int alturaEsquerda = altura(raiz.left);
        int alturaDireita = altura(raiz.right);

        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }

    public static Node exemploPastas() {

        Node raiz = new Node("/");

        raiz.left = new Node("home");
        raiz.right = new Node("etc");

        raiz.left.left = new Node("user");
        raiz.left.left.left = new Node("documents");

        return raiz;
    }

    public static void main(String[] args) {

        Node raiz = exemploPastas();

        System.out.println(buscarNO(raiz, "documents"));
        System.out.println(buscarNO(raiz, "etc"));
    }
}