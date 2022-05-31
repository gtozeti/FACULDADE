
public class UsaArvore {
 
    public static void main(String[] args) {
        Arvore arvore=new Arvore();
        arvore.inserir(45);
        arvore.inserir(7);
        arvore.inserir(38);
        arvore.inserir(14);
        arvore.inserir(10);
        arvore.inserir(50);
        arvore.inserir(66);
        arvore.inserir(57);
        arvore.inserir(63);
        arvore.inserir(59);
        
    // Ex 2
    //     arvore.ordemFolha(arvore.getRaiz());

       // arvore.ordem(arvore.getRaiz());
       
        arvore.ordemFolha(arvore.getRaiz());

    }
    
}
