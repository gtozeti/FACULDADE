/*Escreva uma fun��o que recebe, por par�metro, dois valores X e Z e calcula e retorna X^Z
(sem utilizar fun��es ou operadores de pot�ncia prontos).
Assim sendo, voc� n�o pode utilizar a fun��o Math.pow, nem outras existentes no Java.*/

import java.util.Scanner;

public class Lista03_Ex15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numA, numN;

		System.out.print("Informe um n�mero X: ");
		numA = entrada.nextInt();
		System.out.print("Informe um n�mero Y: ");
		numN = entrada.nextInt();

		System.out.printf("\n%d elevado a %d � : %d", numA, numN, verifica(numA, numN));

	}

	static int verifica(int numA, int numN) {

		int soma = 1;

		for (int i = 1; i <= numN; i++) {

			soma *= numA;

		}

		return soma;

	}
}
