/*Fa�a uma fun��o que recebe por par�metro um valor inteiro e positivo e retorna Verdadeiro caso o valor
seja primo, e Falso, caso contr�rio. Para isso, voc� ter� que usar o tipo de retorno boolean.Fa�a uma fun��o que recebe por par�metro o raio (R) de uma esfera e calcula o seu volume, onde o
volume � dado por*/

import java.util.Scanner;

public class Lista03_Ex8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n;
		boolean cond;

		System.out.print("Digite o valor de N: ");
		n = entrada.nextInt();

		

		if (verifica(n) == true) {
			System.out.printf("\nO n�mero " + n + " � primo");
		}
		else {
			System.out.printf("\nO n�mero " + n + " n�o � primo");
		}
		

	}

	static boolean verifica(int n) {

		int cont = 0;
		
		for (int i = 1; i < n+1;i++) {
			
			if (n%i == 0) {
				cont ++;
			}
			
		}
		
		if (cont == 2) {
			return true;
		}
		else {
			return false;
		}

	}
}
