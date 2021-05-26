/*Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores
positivos próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito,
pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é
perfeito ou não. Utilize o laço que lhe for mais conveniente.*/

import java.util.Scanner;

public class Lista02_Ex21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();
		int soma = 0;

		for (int i = 1; i < n; i++) {

			if (n % i == 0) {

				soma += i;

			}

		}

		if (soma == n) {

			System.out.print("\nO número " + n + " é um número perfeito!!");
		} else {
			System.out.print("\nO número " + n + " não é um número perfeito!!");

		}

	}
}