public class MontarCesta {
    public static void main(String[] args) {

        Composite cesta = new Composite("Cesta de presentes");
        Composite caixa = new Composite("Cesta de café");

        Component prod1 = new Leaf("Café", 23.90);
        Component prod2 = new Leaf("Chocolate", 12.00);
        Component prod3 = new Leaf("Leite", 21.30);
        Component prod4 = new Leaf("Vinhos", 43.10);

        cesta.adicionar(prod1);
        cesta.adicionar(prod3);
        caixa.adicionar(prod2);
        caixa.adicionar(prod4);
        caixa.adicionar(cesta);
        
        System.out.println(cesta);
        System.out.println(cesta.getPreco());
        
        System.out.println(caixa);
        System.out.println(caixa.getPreco());


    }
}
