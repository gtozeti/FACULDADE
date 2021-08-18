/*Fazer um programa que l� um n�mero inteiro positivo N e imprime a divis�o do produto dos n primeiros
n�meros positivos pela soma dos n primeiros n�meros positivos.
Em outras palavras, voc� deve dividir o fatorial pela somatoria do n�mero. Obrigat�rio utilizar as
fun��es elaboradas nos exerc�cios 2 e 3.*/

import java.util.Scanner;

public class Lista03_Ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.print("Digite o valor de N: ");
		n = entrada.nextInt();

		System.out.println("\nA divis�o entre o fatorial e somat�ria do n�mero " + n + " �: "
				+ (fatorial(n)/somatoria(n)) + "\n");

	}

	static int fatorial(int n) {

		int soma = 1;

		for (int i = 1; i < n + 1; i++) {
			soma *= i;
		}

		return soma;

	}

	static int somatoria(int n) {

		int soma = 0;

		for (int i = 0; i <= n; i++) {
			soma += i;
		}

		return soma;

	}
}
