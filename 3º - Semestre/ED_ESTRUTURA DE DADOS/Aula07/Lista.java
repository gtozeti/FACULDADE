public class Lista {

    private Elemento inicio = null, atual, aux;

    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        Elemento x = inicio;
        // Elemento y = atual;

        while (x != null) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }

        // while (y != null){
        // System.out.println(y.getObjeto());
        // y = y.getAnt();
        // }
    }

    /**
     * 
     * @param id int
     * @return Object[] 0 - Elemento a ser removido
     *         Object[] 1 - Informação do objeto
     * 
     */
    public Object[] pesquisar(int id) {
        Elemento x = inicio;
        Carro c = null;
        Object[] arrayPesq = { x, c };
        while (x != null) {
            c = (Carro) x.getObjeto();
            if (id == c.getId()) {
                arrayPesq[0] = x;
                arrayPesq[1] = c;
                return arrayPesq;
            }

            x = x.getProx();
        }
        throw new IllegalArgumentException();
       // return null;
    }

    public boolean remover(int id) {
        Elemento rem = (Elemento) pesquisar(id)[0];
        if (rem != null) {

            if (rem == inicio) {
                inicio = rem.getProx();
                rem.setProx(null);
                inicio.setAnt(null);

            } else if (rem == atual) {
                aux = rem.getAnt();
                atual = rem.getAnt();
                rem.setAnt(null);
                atual.setProx(null);

            } else {
                rem.getAnt().setProx(rem.getProx());
                rem.getProx().setAnt(rem.getAnt());
                rem.setAnt(null);
                rem.setProx(null);
            }
            return true;
        }
        return false;
    }

    // Inner class
    private class Elemento {

        private Object objeto;
        private Elemento prox;
        private Elemento ant;

        public Elemento(Object objeto, Elemento prox, Elemento ant) {
            this.objeto = objeto;
            this.prox = prox;
            this.ant = ant;
        }

        public Object getObjeto() {
            return objeto;
        }

        public void setObjeto(Object objeto) {
            this.objeto = objeto;
        }

        public Elemento getProx() {
            return prox;
        }

        public void setProx(Elemento prox) {
            this.prox = prox;
        }

        public Elemento getAnt() {
            return ant;
        }

        public void setAnt(Elemento ant) {
            this.ant = ant;
        }
    }

}