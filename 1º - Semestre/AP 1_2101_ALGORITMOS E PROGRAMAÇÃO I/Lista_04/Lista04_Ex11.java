/*Dado um vetor de números reais, fazer um programa que imprima os números maiores do que a média
dos elementos que estão nas posições pares do vetor.*/

import java.util.Random;

public class Lista04_Ex11 {

	public static void main(String[] args) {

		int soma = 0;
		float media = 0, n = 0;

		int vetor[] = new int[10];

		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = random.nextInt(10) + 1;

		}

		for (int i = 0; i < vetor.length; i++) {

			if (i % 2 == 0) {

				soma += vetor[i];
				n++;
			}

		}
		
		media = soma/n;
		
		System.out.print("Vetor: ");
		
		for (int num : vetor)
			System.out.printf("%d ", num);
		System.out.println("\n\nMedia dos elementos que estão nas posições pares do vetor: "+media+"\n");
		
		System.out.print("Números do vetor maiores que a media dos elementos que estão nas posições pares do vetor: ");
		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > media) {

				System.out.print(vetor[i]+ " ");
			}

		}
	

		

	}

}
