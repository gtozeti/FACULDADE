package lista;

public class Lista {

    private Elemento inicio = null, atual, aux;

    public void inserir(Object objeto) {
        if (inicio == null) {
            inicio = new Elemento(objeto, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        Elemento x = inicio;
        while (x != null) {
            System.out.println(x.getObjeto());
            x = x.getProx();
        }
    }

    public Object pesquisar(int id) {
        Elemento x = inicio;
        Carro c;
        while (x != null) {
            c = (Carro) x.getObjeto();
            if (id == c.getId()) {
                return c;
            }
            x = x.getProx();
        }
        return null;
    }

    private Object[] pesquisarRemover(int id) {
        Elemento x = inicio, auxPesq = null;
        Carro c = null;
        Object[] arrayPesq = {x, auxPesq};
        while (x != null) {
            c = (Carro) x.getObjeto();
            if (id == c.getId()) {
                arrayPesq[0] = x;
                arrayPesq[1] = auxPesq;

                return arrayPesq;
            }
            auxPesq = x;
            x = x.getProx();
        }
        return null;
    }

    public boolean remover(int id) {
        Object[] array = pesquisarRemover(id);
        Elemento rem = (Elemento) array[0];
        Elemento auxRem = (Elemento) array[1];

        if (rem == inicio) {
            rem = inicio.getProx();
            inicio.setProx(null);
            inicio = rem;
            return true;
        } else if (rem == atual) {
            atual = auxRem;
            auxRem.setProx(null);
            return true;
        } else {
            auxRem.setProx(rem.getProx());
            rem.setProx(null);
        }
        return false;
    }

    //Inner class
    private class Elemento {

        private Object objeto;
        private Elemento prox;

        public Elemento(Object objeto, Elemento prox) {
            this.objeto = objeto;
            this.prox = prox;
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
    }

}
