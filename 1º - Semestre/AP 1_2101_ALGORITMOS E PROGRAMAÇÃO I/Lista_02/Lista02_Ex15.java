//Faça um programa que leia um número inteiro N maior do que zero e calcule o fatorial desse número.
//Fatorial de N é representado por N! e calculado da seguinte maneira:.

import java.util.Scanner;

public class Lista02_Ex15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();
		int soma = 1;

		for (int i = 0; i < n; i++) {

			soma *= (n - i);

		}

		System.out.printf("O resultado da operação é: %d", soma);

	}
}