/*//Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de
operações de depósito e saque.
O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque.
Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo
realizadas até que o usuário digite o código de operação “3”.
Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
CONTA PREFERENCIAL (se o saldo for positivo).
Utilize o laço DO-WHILE.*/

import java.util.Scanner;

public class Lista02_Ex20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o saldo inicial da conta: ");
		float saldo = entrada.nextFloat();

		boolean cond = true;

		do {

			System.out.print(
					"\nDigite a sua operação.\n(1) - Realizar um depósito\n(2) - Realizar um saque\n(3) - Encerrar operações\n");
			String n = entrada.next();

			switch (n) {

			case "1":
				System.out.print("\nQuanto você deseja depositar? ");
				saldo += entrada.nextFloat();
				break;

			case "2":
				System.out.print("\nQuanto você deseja sacar? ");
				saldo -= entrada.nextFloat();
				break;

			case "3":
				cond = false;
				break;

			default:
				System.out.print("\nOperação inválida!");

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