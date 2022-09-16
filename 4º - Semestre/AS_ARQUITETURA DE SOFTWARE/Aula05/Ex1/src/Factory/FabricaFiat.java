package Factory;

public class FabricaFiat implements Creator {

    @Override
    public Carro factoryMethod(ListaCarros tipoCarro) {
        Carro carro = null;

        if (tipoCarro.equals(ListaCarros.UNO)) {
            carro = new Uno("Com escada", 25000);
        } else if (tipoCarro.equals(ListaCarros.PALIO)) {
            carro = new Palio("Fire", 312000);
        }
       

        return carro;
    }
    
}
