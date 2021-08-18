/*Fazer uma fun��o chamada fatorial que tem como par�metro de entrada um n�mero inteiro positivo n
e fornece como sa�da o fatorial desse n�mero.*/

import java.util.Scanner;

public class Lista03_Ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digite o valor de N: ");
		n = entrada.nextInt();

		System.out.println("\nO fatorial do n�mero " + n + " �: "
				+ fatorial(n) + "\n");

	}

	static int fatorial(int n) {

		int soma = 1;

		for (int i = 1; i < n+1; i++) {
			soma *= i;
		}

		return soma;

	}
}
