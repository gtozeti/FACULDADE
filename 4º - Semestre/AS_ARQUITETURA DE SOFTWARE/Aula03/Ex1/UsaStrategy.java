public class UsaStrategy {
    public static void main(String[] args) {
        Distancia distancia = new Distancia(100);
        System.out.println("Valor do frete: " + ListasEmpresas.values()[2].operacao(distancia));
        
    }

}
