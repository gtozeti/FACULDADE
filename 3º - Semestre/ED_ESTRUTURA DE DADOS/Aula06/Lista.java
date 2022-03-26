// escreva um método para pesquisar por id, na lista ligada. Inclua o atributo id e recursos necessários na classe carro

public class Lista {
    
    private Elemento inicio = null, atual, aux;

    public void inserir(Object objeto){
        if (inicio == null){

            inicio = new Elemento(objeto, null);
            aux = inicio;

        }
        else{

            atual = new Elemento(objeto, null);
            aux.setProx(atual);
            aux = atual;
                        
        }
    }

    public void exibir(){
        Elemento x = inicio;
        while(x != null){
            System.out.println(x.getObjeto() );
            x = x.getProx();
        }
    }

    public void retornaCarro(int id){
        Elemento x = inicio;
        boolean v = true;
       
        while(x != null){
            Carro y = (Carro) x.getObjeto(); 
            if (y.getId() == id){
                System.out.println(String.format("\nMarca: %s | Modelo: %s | Ano: %d | ID: %d", y.getMarca(), y.getModelo(), y.getAno(), y.getId()));
                v = false;
                break;
            }
            x = x.getProx();           
        }
        if (v)
        System.out.println(String.format("\nO carro com o ID %d não existe", id));
    }

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
    
    
        @Override
        public String toString() {
            return "Elemento [objeto=" + objeto + ", prox=" + prox + "]";
        }
    
    
        
    
    }
    
    
}
