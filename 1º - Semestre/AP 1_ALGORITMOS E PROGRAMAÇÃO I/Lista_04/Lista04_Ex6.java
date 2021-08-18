/*Dado um vetor de números inteiros, fazer um programa que imprima o produto dos elementos do vetor.*/

import java.util.Random;

public class Lista04_Ex6 {

	public static void main(String[] args) {
		
		int vetor [] = new int [10];
		
		
		Random random = new Random();
		
		for (int i = 0; i < vetor.length; i ++) {
			
			vetor[i] = random.nextInt(30) + 1 ;
			
		}
		
		long soma = 1;
		
		for (int num : vetor) {
			
			soma *= num;
			
			
		}
		System.out.print("\n");
		
		for (int num : vetor) System.out.printf("%d ",num);
		System.out.printf("\n\nO produto dos elementos do vetor é %d",(soma));
		
		
	}

}
