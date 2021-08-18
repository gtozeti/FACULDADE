/*Dados dois vetores A e B de mesma dimensão, fazer um programa que monte o vetor C, o qual deve ser
composto pelos elementos do vetor A e depois pelos elementos do vetor B. Imprimir o vetor C.*/

import java.util.Random;

public class Lista04_Ex13 {

	public static void main(String[] args) {

		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[20];

		Random random1 = new Random();
		Random random2 = new Random();

		for (int i = 0; i < vetor1.length; i++) {

			vetor1[i] = random1.nextInt(10) + 1;
			vetor2[i] = random2.nextInt(10) + 1;

		}

		for (int j = 0; j < vetor3.length;) {
			for (int i = 0; i < vetor1.length; i++) {

				if (j == 0) {
					vetor3[i] = vetor1[i];
				} else {
					vetor3[i + j] = vetor2[i];
				}

			}
			j += 10;
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
