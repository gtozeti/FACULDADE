/*Fa�a uma fun��o que recebe, por par�metro, um valor inteiro e positivo e retorna o n�mero de divisores
desse valor.*/

import java.util.Scanner;

public class Lista03_Ex13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		

		System.out.print("Informe um n�mero: ");
		num = entrada.nextInt();
		
		
		
		
		System.out.printf("\nO n�mero de divisores do n�mero %d, s�o %d divisores" , num, verifica(num));
		
		

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
