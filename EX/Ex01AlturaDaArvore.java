package EX;
public class Ex01AlturaDaArvore{
    static class Node{
        Node left;
        Node right;
        String nome;

        Node(String nome){
            this.nome = nome;
        }
    }

    public static int altura(Node raiz){
        if(raiz == null){
            return 0;
        }

        int alturaEsquerda = altura(raiz.left);
        int alturaDireita = altura(raiz.right);
        return 1 + Math.max(alturaEsquerda, alturaDireita);
    }
public static Node exemploPastas(){
    Node raiz = new Node("/");
    raiz.left = new Node("home");
    raiz.right = new Node("etc");
    raiz.left.left = new Node("user");
    raiz.left.left.left = new Node("documents");
    return raiz;

}

}