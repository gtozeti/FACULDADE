/*Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
composto, alternadamente, por um elemento do vetor A e outro do vetor B. Imprimir o vetor C.*/

import java.util.Random;

public class Lista04_Ex14 {

	public static void main(String[] args) {

		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[20];
		int pos1 = 0, pos2 = 0;

		Random random1 = new Random();
		Random random2 = new Random();

		for (int i = 0; i < vetor1.length; i++) {

			vetor1[i] = random1.nextInt(10) + 1;
			vetor2[i] = random2.nextInt(10) + 1;

		}

		
			for (int i = 0; i < vetor3.length; i++) {

				if (i % 2 == 0) {
					vetor3[i] = vetor1[pos1];
					pos1++;
				} else {
					vetor3[i] = vetor2[pos2];
					pos2++;
				}

			}
			
			

		System.out.print("Vetor A: ");
		for (int v : vetor1)			System.out.print(v + " ");
		System.out.print("\nVetor B: ");
		for (int v : vetor2)			System.out.print(v + " ");
		System.out.print("\n\nVetor C: ");
		for (int v : vetor3)			System.out.print(v + " ");

		System.out.printf("\n");

	}

}
