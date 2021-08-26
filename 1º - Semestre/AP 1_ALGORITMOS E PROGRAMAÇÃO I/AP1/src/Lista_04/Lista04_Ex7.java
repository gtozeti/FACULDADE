/*Dado um vetor de números inteiros e um número inteiro, fazer um programa que multiplique todos os
elementos do vetor pelo número real dado e imprima o resultado.*/

import java.util.Random;

public class Lista04_Ex7 {

	public static void main(String[] args) {
		
		int vetor [] = new int [10];
		
		
		Random random = new Random();
		
		for (int i = 0; i < vetor.length; i ++) {
			
			vetor[i] = random.nextInt(10) + 1 ;
			
		}
		
		long soma = 0;
		int N = random.nextInt(10) + 1;
		
		for (int num : vetor) {
			
			soma += (num *N);
			
			
		}
		System.out.print("\n");
		
		for (int num : vetor) System.out.printf("%d ",num);
		System.out.printf("\n\nA soma de todos os elementos do vetor, pelo produto de cada com %d, foi de: %d",N,(soma));
		
		
	}

}
