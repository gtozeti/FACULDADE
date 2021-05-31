/*Dado um vetor de n�meros inteiros e um n�mero inteiro, fazer um programa que verifique se o n�mero
est� presente no vetor.*/

import java.util.Random;

public class Lista04_Ex8 {

	public static void main(String[] args) {

		int vetor[] = new int[10];

		Random random = new Random();

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = random.nextInt(10) + 1;

		}

		int N = random.nextInt(10) + 1;
		boolean cond = false;

		for (int num : vetor) {

			if (num == N) {
				cond = true;
			}

		}
		System.out.print("\n");

		for (int num : vetor)
			System.out.printf("%d ", num);

		if (cond) {

			System.out.printf("\n\nO n�mero %d est� presente no vetor", N);
		} else {

			System.out.printf("\n\nO n�mero %d n�o est� presente no vetor", N);
		}

	}
}
