//Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o lidos em seguida do usu�rio.
//Para cada valor lido, mostre uma mensagem em portugu�s dizendo se este valor lido � par (PAR), �mpar
//(�MPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa
//dever� imprimir apenas NULO. Utilize o la�o DO-WHILE.

import java.util.Scanner;

public class Lista02_Ex16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();
		int cont = 0;

		do {

			System.out.print("\n\nDigite �m n�mero: ");
			int n1 = entrada.nextInt();

			if (n1 > 0 && (n1 % 2 == 0)) {

				System.out.printf("\nO n�mero %d � (PAR) e (POSITIVO)", n1);

			} else if (n1 > 0 && (n1 % 2 != 0)) {

				System.out.printf("\nO n�mero %d � (�MPAR) e (POSITIVO)", n1);

			} else if (n1 < 0 && (n1 % 2 != 0)) {

				System.out.printf("\nO n�mero %d � (�MPAR) e (NEGATIVO)", n1);

			} else if (n1 < 0 && (n1 % 2 == 0)) {

				System.out.printf("\nO n�mero %d � (PAR) e (NEGATIVO)", n1);

			} else {

				System.out.printf("\nO n�mero %d � NULO", n1);

			}
			cont++;

		} while (cont < n);

	}
}