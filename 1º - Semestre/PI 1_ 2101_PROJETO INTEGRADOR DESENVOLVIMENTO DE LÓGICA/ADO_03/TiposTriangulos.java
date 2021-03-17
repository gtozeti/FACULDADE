import java.util.Scanner;

public class TiposTriangulos {

	public static void main(String[] args) {

		int lA, lB, lC;
		boolean c1, c2, c3;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do lado A: ");
		lA = entrada.nextInt();
		System.out.print("Digite o valor do lado B: ");
		lB = entrada.nextInt();
		System.out.print("Digite o valor do lado C: ");
		lC = entrada.nextInt();

		c1 = ((Math.abs(lB - lC)) < lA && lA < (lB + lC));
		c2 = ((Math.abs(lA - lC)) < lB && lB < (lA + lC));
		c3 = ((Math.abs(lA - lB)) < lC && lC < (lA + lB));

		if (c1 == true && c2 == true && c3 == true) {

			if (lA == lB && lB == lA) {

				System.out.println("\nO triângulo é do tipo EQUILÁTERO");

			} else if ((lA == lB && lA != lC) || (lB == lC && lB != lA) || (lC == lA && lC != lB)) {

				System.out.println("\nO triângulo é do tipo ISÓCELES");

			} else {

				System.out.println("\nO triângulo é do tipo ESCALENO");

			}
		} else {

			System.out.println("\nAs medidas informadas, não formam um triângulo.");

		}

	}

}
