/*Dado um vetor de números inteiros, fazer um programa que imprima o vetor em ordem crescente.*/

import java.util.Random;

public class Lista04_Ex15 {

	public static void main(String[] args) {

		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int menor = 0 ,pos =0;
	

		Random random1 = new Random();

		for (int i = 0; i < vetor1.length; i++) {

			vetor1[i] = random1.nextInt(10) + 1;
		}

		menor = vetor1[0];
		
		for (int j = 0; j < vetor2.length; j++) {
			for (int i = 0; i < vetor1.length; i++) {

				if (vetor1[i] <= menor) {
					menor = vetor1[i];
					vetor2[j] = vetor1[i];
								

					for (int v : vetor2)
						System.out.print(v + " ");
					System.out.printf(" - " + vetor2.length);
					System.out.printf("\n");

				}

			}
		}
			

		System.out.print("Vetor A: ");
		for (int v : vetor1)			System.out.print(v + " ");
		System.out.print("\nVetor B: ");
		for (int v : vetor2)			System.out.print(v + " ");
		//System.out.print("\n\nVetor C: ");
		//for (int v : vetor3)			System.out.print(v + " ");

		System.out.printf("\n");

	}

}
