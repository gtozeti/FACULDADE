import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aula04_Ex02_NPassos {

	public static void main(String[] args) {

		//Declaração da variavél random
		Random valorRandom = new Random();
		
		//Definindo um valor para o vetor
		int n = valorRandom.nextInt(10);
		while (n == 0) {
			n = valorRandom.nextInt(10);
		}
		int[] v = new int[n]; 
		
		//Populando o vetor com valores random
		popVet(v); 
		
		System.out.println(Arrays.toString(v));
		passos(v);
		
	}

	//Populando o vetor com valores random 
	static void popVet(int[] v) {

		Random valorRandom = new Random();

		for (int i = 0; i < v.length; i++) {

			v[i] = valorRandom.nextInt(20);

		}

	}

	public static void passos(int[] v) {
		
		int maior = 0, menor = 0, passos = 0;
		
		for (int i = 0; i < v.length; i++) {
			if (i == 0) {
				menor = maior = v[i];
			}
			else {
				if (v[i] > maior) {
					maior = v[i];
				}
				if (v[i] < menor) {
					menor = v[i];
				}
			}
			passos += 1;
		}
		
		System.out.printf("Maior número: %d | Menor número: %d | Passos: %d",maior,menor, passos);
		System.out.printf("\nA diferença absoluta foi: %d", Math.abs(maior - menor));
		
		
	}
}