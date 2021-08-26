package Lista_04;

import java.util.Random;

public class Lista04_Ex20 {

    public static void main(String[] args) {

       float[] vetor = new float[10];
        Random dado = new Random();
        
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = dado.nextInt(10);
        }

        int fon = 0, contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                fon++;
            }
        }

        float[] vetor3 = new float[fon];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 3 == 0) {
                vetor3[contador] = vetor[i];
                contador++;
            }
        }

        System.out.println("Vetor:");
        for (float i : vetor) {
            System.out.println(i);
        }

        System.out.println("\nVetor multiplo de 3:");
        for (float i : vetor3) {
            System.out.println(i);
        }
        
        System.out.println("\nVetores nas posicoes impar e multiplos de 3:");
        for (int i = 0; i < vetor3.length; i++) {
            if (i % 2 != 0) {
                System.out.printf("vetor3[%d] = %.1f\n", i, vetor3[i]);
            }
        }
        
    }

}
