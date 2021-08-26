/*Dado um vetor de números reais, fazer um programa que imprima o menor elemento do vetor.*/

import java.util.Random;

public class Lista04_Ex4 {

	public static void main(String[] args) {
		
		float vetor [] = new float [10];
		
		
		Random random = new Random();
		
		for (int i = 0; i < vetor.length; i ++) {
			
			vetor[i] = (float) (random.nextInt(10) + 1 )/ (float) (random.nextInt(10) + 1);
			
		}
		
		float menor = vetor[0];
		
		for (float num : vetor) {
			
			if (num < menor) {
				
				menor = num;
			}
			
			
		}
		
		
		for (float num : vetor) System.out.printf("%.2f ",num);
		System.out.printf("\nO menor elemento do vetor é o número %.2f",menor);
		
		
	}

}
