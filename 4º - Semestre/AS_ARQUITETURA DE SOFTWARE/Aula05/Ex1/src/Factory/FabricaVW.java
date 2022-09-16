package Factory;

public class FabricaVW implements Creator{
    
    @Override
    public Carro factoryMethod(ListaCarros tipoCarro) {
        Carro carro = null;

        if (tipoCarro.equals(ListaCarros.FOX)) {
            carro = new Fox("Cross", 32000);
        } else if (tipoCarro.equals(ListaCarros.JETTA)) {
            carro = new Fox("GTI", 312000);
        }
        else if (tipoCarro.equals(ListaCarros.GOL)) {
            carro = new Gol("Bolinha", 19000);
        }

        return carro;
    }
}
