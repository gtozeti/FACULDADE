import java.util.Random;
import java.util.Scanner;

public class JogoDo8 {

	static int matriz_P[][] = new int[3][3];
	static String matriz_M[][] = new String[3][3];

	static Random valorRandom = new Random();

	static void CriaMatrizes() {

		for (int i = 0; i < 9; i++) {

			int l = valorRandom.nextInt(3);
			int c = valorRandom.nextInt(3);

			if (matriz_P[l][c] == 0) {
				matriz_P[l][c] = i;
			} else {
				i--;
			}

		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (matriz_P[i][j] == 0) {
					matriz_M[i][j] = " ";
				} else {

					matriz_M[i][j] = String.valueOf(matriz_P[i][j]);
				}
			}
		}

	}

	static void ImprimeMatriz() {

		for (int i = 0; i < 3; i++) {

			System.out.print("\t\t\t\t\t\t _______________________\n\n\t\t\t\t\t");

			for (int j = 0; j < 3; j++) {

				System.out.printf("\t| %3s", matriz_M[i][j]);

			}
			System.out.print("\t|\n");

		}
		System.out.print("\t\t\t\t\t\t _______________________\n\n");
	}

	static void VerificaJogada(String movimento) {

		switch (movimento) {

		case "1":

			break;
		case "2":

			break;
		case "3":

			break;
		case "4":

			break;
		default:
			System.out.println("Movimento Inválido!");
		}

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		CriaMatrizes();
		ImprimeMatriz();

		System.out.print(
				"\n(4 <) - Mover para esquerda\n(6 >) - Mover para direita\n(8 ^) - Mover para cima\n(2 v) - Mover para baixo\n\n"
						+ "Digite o movimento desejado: ");
		String movimento = entrada.next();
		VerificaJogada(movimento);

	}

}
