/*Dados dois vetores A e B de mesma dimensão, fazer um programa que calcule e imprima o produto de
cada elemento de A pelo correspondente elemento de B. O resultado deve ser armazenado em um vetor
C.*/

import java.util.Random;

public class Lista04_Ex9 {

	public static void main(String[] args) {

		int vetor[] = new int[10];
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];

		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = random.nextInt(10) + 1;
			vetor1[i] = random.nextInt(10) + 1;

		}

		

		for (int i = 0; i < vetor.length; i++) {

			vetor2[i] = vetor[i] * vetor1[i];
		}
		
		System.out.print("\n");

		for (int num : vetor) System.out.printf("%3d ", num);
		System.out.print("\n");
		for (int num : vetor1) System.out.printf("%3d ", num);
		System.out.print("\n");

		System.out.print("\nO resultado entre o produto de cada elemento do vetor ficou: ");
		for (int num : vetor2) System.out.printf("%d ", num);
		System.out.print("\n");
		

		

	}
}
