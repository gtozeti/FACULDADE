/*Fa�a uma fun��o que receba dois n�meros inteiros: um valor A e um valor N. Imprimir a soma dos N
n�meros a partir de A (inclusive). Se N for negativo ou ZERO, a fun��o deve retornar -1.
Exemplo: se A for 3 e N for 2, o resultado dever� ser 7, pois � a soma de 3 + 4.*/

import java.util.Scanner;

public class Lista03_Ex14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numA, numN;

		System.out.print("Informe um n�mero A: ");
		numA = entrada.nextInt();
		System.out.print("Informe um n�mero N: ");
		numN = entrada.nextInt();

		if (verifica(numA, numN) == -1) {

			System.out.println("Opera��o n�o v�lida!");

		} else {

			System.out.printf("\nA soma dos %d n�meros a partir de %d (inclusive), � de: %d", numN, numA, verifica(numA, numN));
		}

	}

	static int verifica(int numA, int numN) {

		if (numN <= 0) {

			return -1;

		} else {
			int soma = numA;

			for (int i = 1; i < numN; i++) {

				soma += (numA + i);
			}

			return soma;
		}

	}
}
