import java.util.Random;

public class Aula02_Ex03_DiagonalPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = new int[4][4];
		
		int soma = popMatrizes(m);

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				
				System.out.printf("%d ",(m[i][j]));

			}
			System.out.println();
		}

		System.out.println("\nA soma da diagonal principal da matriz é: " + soma);
	}

	static int popMatrizes(int[][] m) {

		Random valorRandom = new Random();
		int s = 0;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {

				m[i][j] = valorRandom.nextInt(9);
				if (i == j) {
					s += m[i][j];
				}

			}

		}
		return s;

	}
	
	
}
