import java.util.Random;

public class Aula02_Ex07_QuadradoMagico {

	public static void main(String[] args) {

		int[][] m = new int[3][3];
		// int[][] m = {{8,0,7}, {4,5,6}, {3,10,2}};
		// int[][] m = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		boolean cond;

		cond = popMatrizes(m);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				System.out.printf("%d ", (m[i][j]));

			}
			System.out.println();
		}

		if (cond) {

			System.out.println("\nA matriz acima forma um quadrado m�gico!");

		} else {
			System.out.println("\nA matriz acima n�o forma um quadrado m�gico!");
		}

	}

	static boolean popMatrizes(int[][] m) {

		Random valorRandom = new Random();
		int[][] soma = new int[m.length][2];

		int dp = 0, ds = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

				m[i][j] = valorRandom.nextInt(9);

				soma[i][0] += m[i][j];
				soma[j][1] += m[i][j];

				if (i == j) {
					dp += m[i][j];
				}
				if (i + j == m.length - 1) {
					ds += m[i][j];
				}

			}

		}

		if (ds != dp) {
			return false;
		} else {

			for (int i = 0; i < soma.length; i++) {
				for (int j = 0; j < soma[0].length; j++) {

					if (soma[i][j] != ds) {

						return false;

					}

				}

			}
			return true;
		}
	}

}
