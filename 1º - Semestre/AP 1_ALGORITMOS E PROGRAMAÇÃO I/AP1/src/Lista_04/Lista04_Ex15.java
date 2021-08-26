/*Dado um vetor de n�meros inteiros, fazer um programa que imprima o vetor em ordem crescente.*/
package Lista_04;

import java.util.Random;

public class Lista04_Ex15 {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random dado = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = dado.nextInt(50);
        }
        int aux;

        System.out.println("Vetor antes: ");
        for (int i : vetor) {
            System.out.println(i);
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int y = 0; y < vetor.length - 1; y++) {
                if (vetor[y] > vetor[y + 1]) {
                    aux = vetor[y];
                    vetor[y] = vetor[y + 1];
                    vetor[y + 1] = aux;
                }
            }
        }

        System.out.println("\nVetor depois: ");
        for (int i : vetor) {
            System.out.println(i);
        }
    }

}
