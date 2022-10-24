package Ex01;
public class UsaFactory {
    public static void main(String[] args) throws Exception {
        try {
            int n = 2;
            
            FabricaTanque tanque = new FabricaTanque();

            Tanque t1 = tanque.factoryMethod(ListaTanque.values()[n]);
            
            System.out.println("Modelo: "+ t1.getClass().getName());
            System.out.println("Canhão: "+ t1.getCanhao());
            System.out.println("Cor: "+ t1.getCor());
            System.out.println("Posição: "+ t1.getPosicao());

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Tanque inválido!");
        }
    }
}
