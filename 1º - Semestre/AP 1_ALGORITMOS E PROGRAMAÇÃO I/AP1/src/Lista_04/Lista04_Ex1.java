/*Dado um vetor de números inteiros, fazer um programa que imprime todos os elementos do vetor..*/

import java.util.Random;

public class Lista04_Ex1 {

	public static void main(String[] args) {
		
		int vetor [] = new int [10];
		
		Random random = new Random();
		
		for (int i = 0; i < vetor.length; i ++) {
			
			vetor[i] = random.nextInt(10) +1 ;
			
		}
		
		
		for (int num : vetor) System.out.print(num + " ");
		
		
		
	}

}
