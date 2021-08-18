/*Dado um vetor de números inteiros, fazer um programa que imprima a média dos elementos do vetor.*/

import java.util.Random;

public class Lista04_Ex5 {

	public static void main(String[] args) {
		
		int vetor [] = new int [10];
		
		
		Random random = new Random();
		
		for (int i = 0; i < vetor.length; i ++) {
			
			vetor[i] = random.nextInt(30) + 1 ;
			
		}
		
		float soma = 0;
		
		for (int num : vetor) {
			
			soma += num;
			
			
		}
		
		
		for (int num : vetor) System.out.printf("%d ",num);
		System.out.printf("\n\nA média dos elementos do vetor é %.2f",(soma/vetor.length));
		
		
	}

}
