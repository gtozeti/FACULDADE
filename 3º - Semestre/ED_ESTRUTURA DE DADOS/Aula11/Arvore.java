

public class Arvore {

    private No raiz = null;

    public No getRaiz() {
        return raiz;
    }

    public void inserir(Object objeto) {
        No novoNo = new No(objeto, null, null);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            inserir(novoNo, raiz);
        }
    }

    private void inserir(No novoNo, No x) {
        int valor = (int) novoNo.getObjeto();
        int r = (int) x.getObjeto();

        if (valor < r) {
            if (x.getEsquerda() == null) {
                x.setEsquerda(novoNo);
            } else {
                inserir(novoNo, x.getEsquerda());
            }
        } else {
            if (x.getDireita() == null) {
                x.setDireita(novoNo);
            } else {
                inserir(novoNo, x.getDireita());
            }
        }
    }

    /**
     * Percorre a árvore binária de pesquisa, visitando os nós uma vez.Regra: E
     * - R - D
     *
     * @param x No
     */
    public void ordem(No x) {
        if (x != null) {
            ordem(x.getEsquerda());
            System.out.print(x.getObjeto() + " ");
            ordem(x.getDireita());
        }
    }

  // Ex 2
    public void ordemFolha(No x) {
        if (x != null) {
            ordemFolha(x.getEsquerda());
               System.out.println(String.format("O nó %d %s", x.getObjeto(), (verificaFolha(x) ? "é folha" : "não é folha")));
               ordemFolha(x.getDireita());
        }

    }

    public void preOrdem(No x) {
        if (x != null) {
            System.out.print(x.getObjeto() + " ");
            preOrdem(x.getEsquerda());
            preOrdem(x.getDireita());
        }
    }

    public void posOrdem(No x) {
        if (x != null) {
            posOrdem(x.getEsquerda());
            posOrdem(x.getDireita());
            System.out.print(x.getObjeto() + " ");
        }
    }

    public void percurso(No x, Tipos tipo) {
        if (x != null) {
            if (tipo.equals(Tipos.PRE)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getEsquerda(), tipo);
            if (tipo.equals(Tipos.ORDEM)) {
                System.out.print(x.getObjeto() + " ");
            }
            percurso(x.getDireita(), tipo);
            if (tipo.equals(Tipos.POS)) {
                System.out.print(x.getObjeto() + " ");
            }
        }
    }

    // Ex 2
    private boolean verificaFolha(No x){
        
        if(x.getDireita() == null && x.getEsquerda() == null){
            return true;
        }
        return false;
    }

}
