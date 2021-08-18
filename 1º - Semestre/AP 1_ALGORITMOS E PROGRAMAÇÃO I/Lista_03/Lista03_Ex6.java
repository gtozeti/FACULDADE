/*Modificar a fun��o do Exerc�cio 5 da seguinte forma: al�m dos par�metros de entrada reais a, b, c, um
quarto par�metro d deve ser adicionado. Esse par�metro poder� ter dois valores: 1 ou 2.
Ele ser� respons�vel para decidir se a sa�da da fun��o vai ser a maior ou a menor raiz (no caso de ra�zes
iguais, considere a maior raiz). Considere que 1 serve para obter a maior raiz e 2 para obter a menor raiz.
Novamente, se n�o houver ra�zes reais, a fun��o deve retornar o n�mero 1.*/

import java.util.Scanner;

public class Lista03_Ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float a, b, c;
		int d;
		double raiz;

		System.out.print("Digite o valor de a: ");
		a = entrada.nextFloat();
		System.out.print("Digite o valor de b: ");
		b = entrada.nextFloat();
		System.out.print("Digite o valor de c: ");
		c = entrada.nextFloat();
		System.out.print("Digite o par�metro (1) - Para obter a maior ra�z ou (2) - Para obter a menor ra�z: ");
		d = entrada.nextInt();

		raiz = equacao(a, b, c, d);

		if (raiz == -1) {

			System.out.println("\nA equa��o n�o possui ra�zes reais!");
		} else {
			System.out.printf("\nA raiz escolhida da equa��o �: %.2f", raiz);
		}

	}

	static double equacao(float a, float b, float c, int d) {

		double delta = (Math.pow(b, 2) - 4 * a * c);
		double raizDelta = Math.sqrt(delta);
		double x, x2;

		if (delta == 0) {

			x = ((-b + raizDelta) / (2 * a));
			return x;

		} else if (delta < 0) {

			x = -1;
			return x;
		} else {

			x = ((-b + raizDelta) / (2 * a));
			x2 = ((-b - raizDelta) / (2 * a));

			if (d == 1) {
				return x;
			} else {
				return x2;
			}

		}

	}

}
