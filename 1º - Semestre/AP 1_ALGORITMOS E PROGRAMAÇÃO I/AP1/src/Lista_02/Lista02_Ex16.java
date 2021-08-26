//Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida do usuário.
//Para cada valor lido, mostre uma mensagem em português dizendo se este valor lido é par (PAR), ímpar
//(ÍMPAR), positivo (POSITIVO) ou negativo (NEGATIVO). No caso do valor ser igual a zero (0), seu programa
//deverá imprimir apenas NULO. Utilize o laço DO-WHILE.

import java.util.Scanner;

public class Lista02_Ex16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();
		int cont = 0;

		do {

			System.out.print("\n\nDigite úm número: ");
			int n1 = entrada.nextInt();

			if (n1 > 0 && (n1 % 2 == 0)) {

				System.out.printf("\nO número %d é (PAR) e (POSITIVO)", n1);

			} else if (n1 > 0 && (n1 % 2 != 0)) {

				System.out.printf("\nO número %d é (ÍMPAR) e (POSITIVO)", n1);

			} else if (n1 < 0 && (n1 % 2 != 0)) {

				System.out.printf("\nO número %d é (ÍMPAR) e (NEGATIVO)", n1);

			} else if (n1 < 0 && (n1 % 2 == 0)) {

				System.out.printf("\nO número %d é (PAR) e (NEGATIVO)", n1);

			} else {

				System.out.printf("\nO número %d é NULO", n1);

			}
			cont++;

		} while (cont < n);

	}
}