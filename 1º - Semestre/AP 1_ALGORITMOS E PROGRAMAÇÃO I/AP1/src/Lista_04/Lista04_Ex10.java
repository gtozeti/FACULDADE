/*Dado um vetor de números reais e um número real, fazer um programa que multiplique os elementos de
posição ímpar do vetor pelo número real dado e imprima o resultado.*/

import java.util.Random;

public class Lista04_Ex10 {

	public static void main(String[] args) {

		float vetor[] = new float[10];

		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = (random.nextFloat() *random.nextInt(10) + 1);

		}

		float soma = 0;
		float N = (float) random.nextInt(10) + 1 / (float) random.nextInt(10) + 1;

		for (int i = 0; i < vetor.length; i++) {

			if (i % 2 != 0) {
				
				soma += (vetor[i] * N);
			}
		

		}
		System.out.print("\n");

		for (float num : vetor) System.out.printf("%.2f ", num);
		System.out.printf("\n\nA soma de todos os elementos na posição ímpar do vetor, pelo produto de cada com %.2f, foi de: %.2f", N,
				(soma));

	}

}
