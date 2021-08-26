/*Dado um vetor de números reais, fazer um programa que some todos os elementos do vetor e imprima o
resultado.*/

import java.util.Random;

public class Lista04_Ex2 {

	public static void main(String[] args) {
		
		float vetor [] = new float [10];
		float soma = 0;
		
		Random random = new Random();
		
		for (int i = 0; i < vetor.length; i ++) {
			
			vetor[i] = random.nextFloat() * random.nextInt(10)+1 ;
			
		}
		
		
		for (float num : vetor) soma += num;
		
		System.out.printf("A soma de todos elemntos do vetor é: %f",soma);
		
		
	}

}
