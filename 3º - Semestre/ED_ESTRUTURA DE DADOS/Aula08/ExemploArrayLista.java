import java.util.*;

public class ExemploArrayLista {
    public static void main(String[] args) {

       // Lista duplamente encadeada LinkedList<Integer> lista = new LinkedList<>();
       LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(8);
        lista.add(56);
        lista.add(2);
        lista.add(65);
        lista.add(34);
        lista.add(568);

        
        for (int i =0; i < lista.size(); i ++){
            System.out.println(lista.get(i));
        }
        
    }
}
