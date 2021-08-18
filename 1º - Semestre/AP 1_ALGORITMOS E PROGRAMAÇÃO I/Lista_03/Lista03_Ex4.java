/*Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3.*/

import java.util.Scanner;

public class Lista03_Ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digite o valor de N: ");
		n = entrada.nextInt();

		System.out.println("\nA divisão entre o fatorial e somatória do número " + n + " é: "
				+ (fatorial(n)/somatoria(n)) + "\n");

	}

	static int fatorial(int n) {

		int soma = 1;

		for (int i = 1; i < n + 1; i++) {
			soma *= i;
		}

		return soma;

	}

	static int somatoria(int n) {

		int soma = 0;

		for (int i = 0; i <= n; i++) {
			soma += i;
		}

		return soma;

	}
}
