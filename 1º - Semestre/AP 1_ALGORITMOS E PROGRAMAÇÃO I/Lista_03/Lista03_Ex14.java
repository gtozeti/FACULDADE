/*Faça uma função que receba dois números inteiros: um valor A e um valor N. Imprimir a soma dos N
números a partir de A (inclusive). Se N for negativo ou ZERO, a função deve retornar -1.
Exemplo: se A for 3 e N for 2, o resultado deverá ser 7, pois é a soma de 3 + 4.*/

import java.util.Scanner;

public class Lista03_Ex14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numA, numN;

		System.out.print("Informe um número A: ");
		numA = entrada.nextInt();
		System.out.print("Informe um número N: ");
		numN = entrada.nextInt();

		if (verifica(numA, numN) == -1) {

			System.out.println("Operação não válida!");

		} else {

			System.out.printf("\nA soma dos %d números a partir de %d (inclusive), é de: %d", numN, numA, verifica(numA, numN));
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
