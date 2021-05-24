//Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
//quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente.

import java.util.Scanner;

public class Lista02_Ex12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();
		float n1 = n;
		
		float soma = 0;
		
		for (float i = 1; i < (n+1);i++) {
			soma += (i/n1);
			n1 --;
					
		}
	
			
		System.out.printf("O resultado da operação é: %.2f",soma);

	}
}