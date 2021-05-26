/*//Escreva um programa capaz de ler o saldo inicial de uma conta banc�ria e um n�mero indeterminado de
opera��es de dep�sito e saque.
O usu�rio deve digitar �1� para realizar um dep�sito, �2� para realizar um saque.
Ap�s digitar o c�digo da opera��o, o usu�rio deve digitar o valor. As opera��es devem continuar sendo
realizadas at� que o usu�rio digite o c�digo de opera��o �3�.
Ao digitar �3�, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
CONTA PREFERENCIAL (se o saldo for positivo).
Utilize o la�o DO-WHILE.*/

import java.util.Scanner;

public class Lista02_Ex20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o saldo inicial da conta: ");
		float saldo = entrada.nextFloat();

		boolean cond = true;

		do {

			System.out.print(
					"\nDigite a sua opera��o.\n(1) - Realizar um dep�sito\n(2) - Realizar um saque\n(3) - Encerrar opera��es\n");
			String n = entrada.next();

			switch (n) {

			case "1":
				System.out.print("\nQuanto voc� deseja depositar? ");
				saldo += entrada.nextFloat();
				break;

			case "2":
				System.out.print("\nQuanto voc� deseja sacar? ");
				saldo -= entrada.nextFloat();
				break;

			case "3":
				cond = false;
				break;

			default:
				System.out.print("\nOpera��o inv�lida!");

			}

		} while (cond);

		if (saldo == 0) {

			System.out.println("\nCONTA ZERADA");

		} else if (saldo < 0) {

			System.out.println("\nCONTA ESTOURADA");

		} else {
		
			System.out.println("\nCONTA PREFERENCIAL");
		}
	}
}