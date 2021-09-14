import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02_NPassos {

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
		
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		System.out.println(v[0]);
		System.out.println(v[v.length-1]);
		
		passos(v);
		
	}

	//Populando o vetor com valores random 
	static void popVet(int[] v) {

		Random valorRandom = new Random();

		for (int i = 0; i < v.length; i++) {

			v[i] = valorRandom.nextInt(20);

		}

	}

	public static int passos(int[] v) {
		
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
		
		System.out.printf("%d | %d | %d",maior,menor, passos);
		
		return -1;
		
	}
}