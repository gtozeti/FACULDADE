//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.

import java.util.Scanner;

public class Lista02_Ex14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();

		float soma = 0;

		for (float i = 2; i < (n * 2) + 1; i++) {

			soma += (i / (i + 1));
			i++;

		}

		System.out.printf("O resultado da operação é: %.2f", (1 + soma));

	}
}