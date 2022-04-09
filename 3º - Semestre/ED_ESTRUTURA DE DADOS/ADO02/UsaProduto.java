public class UsaProduto {
    
    public static void main(String[] args) {
        
Metodos lista = new Metodos();

        Produto p1 = new Produto("Oskley", "Osculo", 5, 1000.0);
        Produto p2 = new Produto("Ardidas", "Trenis", 33, 870.73);
        Produto p3 = new Produto("Mike", "Brusa", 27, 149.99);
        Produto p4 = new Produto("Fuma", "Bune", 65, 80.0);
        Produto p5 = new Produto("Lagarti", "Puelo", 345, 1200.0);
        
        lista.inserir(p1);
        lista.inserir(p2);
        lista.inserir(p3);
        lista.inserir(p4);
        lista.inserir(p5);

        System.out.println("\n");
        lista.exibir();

        System.out.println("\n"+lista.retornaProduto(345));
        System.out.println("\n"+lista.retornaProduto(35)+"\n");

        if (lista.remover(33335)){
            System.out.printf("\nO Produto foi removido com sucesso\n\n");
        }
        else{
            System.out.printf("\nO Produto não foi encontrado\n\n");
        }

        if (lista.remover(65)){
            System.out.printf("\nO Produto foi removido com sucesso\n\n");
        }
        else{
            System.out.printf("\nO Produto não foi encontrado\n\n");
        }

        lista.exibir();
        
        System.out.printf("\nO valor total da lista é de R$ %.2f\n\n",lista.valorTotal());




        
    }
}
