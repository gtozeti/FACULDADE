package Lista_04;

import java.util.Random;

public class Lista04_Ex19 {

    public static void main(String[] args) {

       float[] vetor = new float[10];
        Random dado = new Random();
        
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = dado.nextInt(10);
        }

        System.out.println("Antes:");
        for(float i : vetor) {
            System.out.println(i);
        }
        
        System.out.println("\nDepois (So impares)");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                System.out.printf("vetor[%d] = %.1f\n", i, vetor[i]);
            }
        }
        
    }

}
