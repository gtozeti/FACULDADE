//Fa�a um programa que leia um n�mero N do usu�rio, some todos os n�meros inteiros de 1 a N, e mostre o
//resultado obtido. Use o la�o WHILE.

import java.util.Scanner;

public class Lista02_Ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();
		int i = 1, soma = 0;
		
		while (i < (n+1)) {
			soma += i;
			i++;
		}
		System.out.println("A soma de todos os n�meros inteiros de 1 a "+ n + " � igual a: " + soma);
	}

}
