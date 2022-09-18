package cliente;

import Factory.Carro;
import Factory.FabricaFiat;
import Factory.FabricaVW;
import Factory.ListaCarros;

public class UsaFactory {
    public static void main(String[] args) throws Exception {
        try {
            int n = 2;
            
            // FabricaVW vw = new FabricaVW();
            FabricaFiat fiat = new FabricaFiat();

            // Carro vw1 = vw.factoryMethod(ListaCarros.values()[n]);
            Carro fiat1 = fiat.factoryMethod(ListaCarros.values()[n]);

            // System.out.println("Modelo: "+vw1.getModelo());
            // System.out.println("Preço: "+ vw1.getPreco());
            
            System.out.println("Modelo: "+ fiat1.getModelo());
            System.out.println("Preço: "+ fiat1.getPreco());

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Carro inválido!");
        }
    }
}
