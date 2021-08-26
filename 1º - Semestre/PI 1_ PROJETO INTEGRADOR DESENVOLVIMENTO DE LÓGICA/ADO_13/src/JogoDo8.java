import java.util.Random;
import java.util.Scanner;

public class JogoDo8 {

	static int matriz_P[][] = new int[3][3];
	static String matriz_M[][] = new String[3][3];
	static boolean cond = true;
	static int pontos = 0;

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

	static void AtualizaMatriz() {

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

	static void VerificaJogada(String movimento) {

		switch (movimento) {

		case "2":

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					if (matriz_P[i][j] == 0 && i == 0) {

						System.out.println("\nMovimento Inválido!");
						break;

					} else {

						if (matriz_P[i][j] == 0) {

							matriz_P[i][j] = matriz_P[i - 1][j];
							matriz_P[i - 1][j] = 0;
							AtualizaMatriz();
							pontos++;
							break;

						}
					}

				}

			}

			break;
		case "4":

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					if (matriz_P[i][j] == 0 && j == 2) {

						System.out.println("\nMovimento Inválido!");
						break;

					} else {

						if (matriz_P[i][j] == 0) {

							matriz_P[i][j] = matriz_P[i][j + 1];
							matriz_P[i][j + 1] = 0;
							AtualizaMatriz();
							pontos++;

							break;

						}
					}

				}

			}

			break;
		case "6":

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j < 3; j++) {

					if (matriz_P[i][j] == 0 && j == 0) {

						System.out.println("\nMovimento Inválido!");
						break;

					} else {

						if (matriz_P[i][j] == 0) {

							matriz_P[i][j] = matriz_P[i][j - 1];
							matriz_P[i][j - 1] = 0;
							AtualizaMatriz();
							pontos++;
							break;

						}
					}

				}

			}

			break;
		case "8":

			int v = 0;

			for (int i = 0; i < 3; i++) {

				if (v != 0) {

					break;
				}

				for (int j = 0; j < 3; j++) {

					if (matriz_P[i][j] == 0 && i == 2) {

						System.out.println("\nMovimento Inválido!");
						break;

					} else {

						if (matriz_P[i][j] == 0) {

							matriz_P[i][j] = matriz_P[i + 1][j];
							matriz_P[i + 1][j] = 0;
							AtualizaMatriz();
							pontos++;
							v++;

							break;

						}
					}

				}

			}

			break;
		default:
			System.out.println("\nOperação Inválida!");
		}

	}

	static boolean VerificaVitoria() {

		int contador = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (matriz_P[i][j] == contador) {
					contador++;
				}
			}
		}

		if (contador == 9) {
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		CriaMatrizes();

		while (cond) {

			ImprimeMatriz();
			System.out.print(
					"\n(4 <) - Mover para esquerda\n(6 >) - Mover para direita\n(8 ^) - Mover para cima\n(2 v) - Mover para baixo\n\n"
							+ "Digite o movimento desejado: ");
			String movimento = entrada.next();
			VerificaJogada(movimento);
			cond = VerificaVitoria();

		}

		System.out.println("\nPArabéns, você Ganhou!!\nO total de movimentos foi: " + pontos);
		ImprimeMatriz();
	}

}
