/*Faça uma função que recebe a idade de uma pessoa em anos, meses e dias e retorna essa idade
expressa em dias.*/

import java.util.Scanner;

public class Lista03_Ex9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int anos,meses,dias;
		

		System.out.print("Informe quantos anos: ");
		anos = entrada.nextInt();
		System.out.print("Informe quantos meses: ");
		meses = entrada.nextInt();
		System.out.print("Informe quantos dias: ");
		dias = entrada.nextInt();

		
		System.out.println("\nA idade total em dias é: " + verifica(anos,meses,dias));
		
		

	}

	static int verifica(int a, int m ,int d ) {

		int total = ((a * 365) + (m * 30) + d);
		return total;
		
		

	}
}
