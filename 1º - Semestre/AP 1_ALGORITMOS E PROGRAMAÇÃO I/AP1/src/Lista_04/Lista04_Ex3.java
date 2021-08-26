/*Dado um vetor de n�meros inteiros, fazer um programa que imprima o maior elemento do vetor..*/

import java.util.Random;

public class Lista04_Ex3 {

	public static void main(String[] args) {
		
		int vetor [] = new int [10];
		int maior = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < vetor.length; i ++) {
			
			vetor[i] = random.nextInt(50)+1 ;
			
		}
		
		
		for (int num : vetor) {
			
			if (num > maior) {
				
				maior = num;
			}
			
			
		}
		
		for (int num : vetor) System.out.print(num + " ");
		System.out.printf("\nO maior elemento do vetor � o n�mero %d",maior);
		
		
	}

}
