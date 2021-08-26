/*Dados dois vetores A e B de mesma dimensão, fazer um programa que verifica a soma e a média de cada
vetor, e imprime a maior soma e a menor média.*/

import java.util.Random;

public class Lista04_Ex12 {

	public static void main(String[] args) {

		int soma1 = 0, soma2 = 0;
		float media1 = 0, media2 = 0, n = 0;

		int vetor1[] = new int[10];
		int vetor2[] = new int[10];

		Random random1 = new Random();
		Random random2 = new Random();

		for (int i = 0; i < vetor1.length; i++) {

			vetor1[i] = random1.nextInt(10) + 1;
			vetor2[i] = random2.nextInt(10) + 1;

		}

		for (int i = 0; i < vetor1.length; i++) {

		

				soma1 += vetor1[i];
				soma2 += vetor2[i];
				n++;
				
			}

		
		
		media1 = soma1/n;
		media2 = soma2/n;
		
		System.out.print("Vetor 1: ");
		for(int v: vetor1)System.out.print(v+" ");
		System.out.print("\nVetor 2: ");
		for(int v: vetor2)System.out.print(v+" ");
		
		System.out.printf("\n");
		
		if (soma1 > soma2) {
			
			System.out.printf("\nA maior soma é do Vetor 1, que tem como resultado %d em comparação a %d da soma do Vetor 2",soma1,soma2);
		}
		else if (soma1 == soma2) {
			System.out.printf("\nA soma dos dois vetores são iguais. O resultado do soma foi %d",soma1);
			
		}
		else {
			System.out.printf("\nA maior soma é do Vetor 2, que tem como resultado %d em comparação a %d da soma do Vetor 1",soma2,soma1);
			
		}
		
		if (media1 < media2) {
			
			System.out.printf("\nA menor média é do Vetor 1, que tem como resultado %.2f em comparação a %.2f da média do Vetor 2",media1,media2);
		}
		else if (soma1 == soma2) {
			System.out.printf("\nA média dos dois vetores são iguais. O resultado da média foi %.2f",media1);
			
		}
		else {
			System.out.printf("\nA menor média é do Vetor 2, que tem como resultado %.2f em comparação a %.2f da média do Vetor 1",media2,media1);
			
		}
	
	

		

	}

}
