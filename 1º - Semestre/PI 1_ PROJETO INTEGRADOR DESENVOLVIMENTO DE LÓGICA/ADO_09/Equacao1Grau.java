import java.util.Random;
import java.util.Scanner;

public class Equacao1Grau {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random valorRandom = new Random();

		int max, min, a, b, soma = 0;
		float solution = 0, resto = 0;

		System.out.print("Digite o valor máximo para A e B: ");
		max = entrada.nextInt();
		System.out.print("Digite o valor mínimo para A e B: ");
		min = entrada.nextInt();

		do {
			a = valorRandom.nextInt((max - min) + 1) + min;
		} while (a == 0);
		b = valorRandom.nextInt((max - min) + 1) + min;

		System.out.printf("\nA equação formada foi: %dx + (%d) = 0\n", a, b);

		solution = (float) (-1 * b) / a;

		if (solution != (int) solution) {
			System.out.printf("O valor de X é: %.2f\n", solution);
		} else {
			System.out.println("O valor de X é: " + ((int) solution));
		}

	}
}