import java.io.BufferedReader;
import java.io.FileReader;


public class Ex03_MatrizTxt {

	public static void main(String[] args) throws Exception {
		int[][] m = lerMatriz("ex03.txt");
		imprime(m);
		boolean cond = quadMagico(m);
		
		if (cond) {

			System.out.println("\nA matriz acima forma um quadrado mágico!");

		} else {
			System.out.println("\nA matriz acima não forma um quadrado mágico!");
		}

	}

	public static int[][] lerMatriz(String nomeArquivo) throws Exception {
		
		FileReader arquivo = new FileReader(nomeArquivo);
		BufferedReader leitor = new BufferedReader(arquivo);

		String linha1 = leitor.readLine();
		String[] dados = linha1.split(" ");

		int qtdeLinhas = Integer.parseInt(dados[0]);
		int qtdeColunas = Integer.parseInt(dados[1]);

		int[][] matriz = new int[qtdeLinhas][qtdeColunas];

		for (int i = 0; i < matriz.length; i++) {

			String linha = leitor.readLine();
			dados = linha.split(" ");
			for (int j = 0; j < dados.length; j++) {
				matriz[i][j] = Integer.parseInt(dados[j]);
			}

		}
		leitor.close();
		return matriz;

	}

	public static void imprime(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {

				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	static boolean quadMagico(int[][] m) {

		int[][] soma = new int[m.length][2];

		int dp = 0, ds = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {

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

