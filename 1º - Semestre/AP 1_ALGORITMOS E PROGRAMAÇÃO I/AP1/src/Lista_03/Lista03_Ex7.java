/*Faça uma função que recebe por parâmetro o raio (R) de uma esfera e calcula o seu volume, onde o
volume é dado por*/

import java.util.Scanner;

public class Lista03_Ex7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double n;

		System.out.print("Digite o valor do Raio da esfera: ");
		n = entrada.nextDouble();

		System.out.printf("\nO volume da esfera é: %.2f",VolumeEsfera(n));

	}

	static double VolumeEsfera(double n) {

		double v = (4 * Math.PI * Math.pow(n, 3))/3;
		return v;

	}
}
