//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.

import java.util.Scanner;

public class Lista02_Ex13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();

		float soma = 0, cima = 1, baixo = 1;

		for (float i = 1; i < n; i++) {

			cima *= (i + 1);
			baixo *= ((i * 2) + 1);
			soma += (cima / baixo);

		}

		System.out.printf("O resultado da operação é: %.2f", (1 + soma));

	}
}