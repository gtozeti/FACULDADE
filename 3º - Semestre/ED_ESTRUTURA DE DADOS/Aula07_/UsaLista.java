import java.util.Arrays;

public class UsaLista {

    public static void main(String[] args) {
        Lista lista = new Lista();

        Carro c1 = new Carro("VW", 13, "Fox", 2014);
        Carro c2 = new Carro("VW", 25, "Jetta", 2022);
        Carro c3 = new Carro("Fiat", 45, "Argo", 2022);
        Carro c4 = new Carro("Smart", 67, "Fortwo", 2022);

        lista.inserir(c1);
        lista.inserir(c2);
        lista.inserir(c3);
        lista.inserir(c4);

        try {
            Carro c = (Carro) lista.pesquisar(6)[1];

            System.out.println("\n" + c + "\n");

        } catch (Exception e) {
            System.out.println("\nObjeto não existe\n");
        }
        lista.exibir();

        try{
        lista.remover(45);
            System.out.println("\n=== Removeu ===");
            lista.exibir();
        } 
        catch (Exception e){
            System.out.println("\nObjeto não existe\n");
        }
    }

}