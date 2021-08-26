/*Fazer uma fun��o chamada somatoria que tem como par�metro de entrada um n�mero inteiro positivo
N e fornece como sa�da a soma de todos os n�meros inteiros positivos menores ou iguais a N.
Exemplo: se N for 3, a fun��o deve retornar 6, que � a soma de 1 + 2 + 3.*/

import java.util.Scanner;

public class Lista03_Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digite o valor de N: ");
		n = entrada.nextInt();

		System.out.println("\nA soma de todos os n�meros inteiros positivos menores ou iguais a " + n + " �: "
				+ somatoria(n) + "\n");

	}

	static int somatoria(int n) {

		int soma = 0;

		for (int i = 0; i <= n; i++) {
			soma += i;
		}

		return soma;

	}
}
