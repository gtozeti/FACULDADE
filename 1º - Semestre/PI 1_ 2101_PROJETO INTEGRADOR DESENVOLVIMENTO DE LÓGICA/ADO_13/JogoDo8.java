import java.util.Random;


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
				}
				else {
				
				matriz_M[i][j] = String.valueOf(matriz_P[i][j]);
				}
			}
		}

	}

	static void ImprimeMatriz() {
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				
				System.out.print("|\t" + matriz_M[i][j] + "\t|");

			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {

		CriaMatrizes();
		ImprimeMatriz();
		

	}

}
