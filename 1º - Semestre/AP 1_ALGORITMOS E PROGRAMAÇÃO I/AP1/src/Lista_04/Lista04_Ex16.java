package Lista_04;

import java.util.Random;

public class Lista04_Ex16 {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random dado = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = dado.nextInt(50);
        }
        

         System.out.println("Antes:");
        for (int i : vetor) {
            System.out.println(i);
        }
        
        System.out.println("\nDepois:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }
    }

}
