package Ex3;

import java.util.Arrays;

public class UsaStrategy {
    public static void main(String[] args) {  

        Bubble b = new Bubble();
        Selection s = new Selection();
        Insertion i = new Insertion();

        Lista lista = new Lista(20);

        long inicio = 0;
        long finalizado = 0;

      
        System.out.println("\n------------- Exercício 3 -------------\n");
        System.out.println("\nLista de itens: "+ Arrays.toString(lista.getLista())+"\n");

        inicio = System.nanoTime(); 
        System.out.println("Método Selection --> "+ Arrays.toString(s.efetuaOrdem(lista.getLista())));
        finalizado = System.nanoTime(); 
        System.out.print("Tempo de execução: " + (finalizado - inicio) + " ns\n\n");

        inicio = System.nanoTime(); 
        System.out.println("Método Bubble --> "+ Arrays.toString(b.efetuaOrdem(lista.getLista())));
        finalizado = System.nanoTime(); 
        System.out.print("Tempo de execução: " + (finalizado - inicio) + " ns\n\n");

        inicio = System.nanoTime(); 
        System.out.println("Método Insertion --> "+ Arrays.toString(i.efetuaOrdem(lista.getLista())));
        finalizado = System.nanoTime(); 
        System.out.print("Tempo de execução: " + (finalizado - inicio) + " ns\n\n");



    
    }
}
