/*Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
e fornece como saída o fatorial desse número.*/

import java.util.Scanner;

public class Lista03_Ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digite o valor de N: ");
		n = entrada.nextInt();

		System.out.println("\nO fatorial do número " + n + " é: "
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
