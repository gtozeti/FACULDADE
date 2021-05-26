//Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os
//seguintes divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente.

import java.util.Scanner;

public class Lista02_Ex17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();

		for (int i = 1; i < n + 1; i++) {

			if (n % i == 0) {

				System.out.print(" | " +i + " | ");

			}

		}

	}
}