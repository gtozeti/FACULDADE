/*Escreva uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna X^Z
(sem utilizar funções ou operadores de potência prontos).
Assim sendo, você não pode utilizar a função Math.pow, nem outras existentes no Java.*/

import java.util.Scanner;

public class Lista03_Ex15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numA, numN;

		System.out.print("Informe um número X: ");
		numA = entrada.nextInt();
		System.out.print("Informe um número Y: ");
		numN = entrada.nextInt();

		System.out.printf("\n%d elevado a %d é : %d", numA, numN, verifica(numA, numN));

	}

	static int verifica(int numA, int numN) {

		int soma = 1;

		for (int i = 1; i <= numN; i++) {

			soma *= numA;

		}

		return soma;

	}
}
