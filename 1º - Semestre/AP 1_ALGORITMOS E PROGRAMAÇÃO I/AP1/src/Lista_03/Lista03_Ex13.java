/*Faça uma função que recebe, por parâmetro, um valor inteiro e positivo e retorna o número de divisores
desse valor.*/

import java.util.Scanner;

public class Lista03_Ex13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		

		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		
		
		
		System.out.printf("\nO número de divisores do número %d, são %d divisores" , num, verifica(num));
		
		

	}

	static int verifica(int num) {

		int cont = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				cont++;
			}
		}
		
		return cont;
		

	}
}
