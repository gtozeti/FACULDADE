/*Na matem�tica, um n�mero perfeito � um n�mero inteiro para o qual a soma de todos os seus divisores
positivos pr�prios (excluindo ele mesmo) � igual ao pr�prio n�mero. Por exemplo o n�mero 6 � perfeito,
pois 1+2+3 � igual a 6. Sua tarefa � escrever um programa que imprima se um determinado n�mero �
perfeito ou n�o. Utilize o la�o que lhe for mais conveniente.*/

import java.util.Scanner;

public class Lista02_Ex21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();
		int soma = 0;

		for (int i = 1; i < n; i++) {

			if (n % i == 0) {

				soma += i;

			}

		}

		if (soma == n) {

			System.out.print("\nO n�mero " + n + " � um n�mero perfeito!!");
		} else {
			System.out.print("\nO n�mero " + n + " n�o � um n�mero perfeito!!");

		}

	}
}