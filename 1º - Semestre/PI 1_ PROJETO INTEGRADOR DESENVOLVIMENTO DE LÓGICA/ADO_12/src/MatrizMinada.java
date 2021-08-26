import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MatrizMinada {

	public static Scanner entrada = new Scanner(System.in);

	static Random valorRandom = new Random();

	static int colunas = 0, linhas = 0, bombas = 0, posI = -1, posJ = -1, validador = 0, coringaK = 0, coringaL = 0,
			TemBomba = 0;

	static int matriz_P[][];
	static String matriz_M[][];

	static boolean gameOver = true;

	public static void main(String[] args) {

		int i_ = -1, j_ = -1, pontos = 0;

		// DESCRI��O DO JOGO
		System.out.println("\t**** Matriz Minada ****\n");
		System.out.println(
				"\t\t--Regras-- \n1 - O tamanho da matriz deve ser maior que 2x2;\n2 - A quantidade de bombas deve ser maior que 0 e menor que a quantidade de c�lulas da matriz;\n3 - Devem ser informados apenas n�meros inteiros;\n");

		// DEFININDO A QUANTIDADE DE COLUNAS DA MATRIZ
		System.out.print("Digite o tamanho de colunas: ");
		while (colunas < 2) {
			colunas = Tamanho_Matriz();
		}
		// DEFININDO A QUANTIDADE DE LINHAS DA MATRIZ
		System.out.print("Digite o tamanho de linhas: ");
		while (linhas < 2) {
			linhas = Tamanho_Matriz();
		}

		// CRIA��O DA MATRIZ PRINCIPAL
		int matriz[][] = new int[linhas][colunas];
		matriz_P = matriz;

		// DEFININDO A QUANTIDADE DE BOMBAS
		System.out.print("Digite a quantidade de bombas: ");
		while (bombas == 0) {
			bombas = Quantidade_Bombas();
		}

		// INSER��O DE BOMBAS ALEAT�RIAS NA MATRIZ E CASO O N�MERO RANDOMICO CAIA NA
		// MESMA POSI��O QUE J� POSSUA UMA "BOMBA" � EFETUADA NOVAMENTE A OPERA��O,
		// AT� QUE A QUANTIDADE x DE BOMBAS TENHA SIDO INSERIDAS
		for (int i = 0; i < bombas; i++) {

			int l = valorRandom.nextInt(linhas);
			int c = valorRandom.nextInt(colunas);

			if (matriz_P[l][c] == -1) {
				i--;
			} else {
				matriz_P[l][c] = -1;
			}
		}

		// CRIA��O DA MATRIZ M�SCARA QUE POSSUI O MESMO TAMNHO DA MATRIZ DIMENSIONADA
		// PELO JOGADOR
		String matriz2[][] = new String[linhas][colunas];
		matriz_M = matriz2;

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz_M[i][j] = "_";
			}
		}

		//LOOP DO JOGO
		do {
			if (pontos == ((linhas * colunas) - bombas)) {
				PrintMatriz_P();
				System.out.print("\n\nParab�ns, voc� ganhou o jogo!");
				System.out.print("\nPontua��o: " + pontos + "/" + ((linhas * colunas) - bombas));
				gameOver = false;
			} else {
				PrintMatriz_M();

				while (i_ == -1) {
					System.out.print("\nDigite a posi��o da linha desejada: ");
					i_ = Valida_Pos_Matriz(linhas);
				}

				while (j_ == -1) {
					System.out.print("Digite a posi��o da coluna desejada: ");
					j_ = Valida_Pos_Matriz(colunas);
				}

				if (matriz_M[i_][j_] == "x") {
					System.out.print("\nVoc� n�o pode jogar na posi��o j� marcada!!\n");
				}
				else if (matriz_P[i_][j_] == -1) {
					PrintMatriz_P();
					System.out.print("\n\nGame Over!");
					System.out.print("\nPontua��o: " + pontos + "/" + ((linhas * colunas) - bombas));
					gameOver = false;
				} else {
					pontos++;
					matriz_P[i_][j_] = 1;
					matriz_M[i_][j_] = "x";

					while (validador < 8) {
						Valida_BombaNoLocal(i_, j_);
						coringaK++;
						coringaL++;
						validador++;
					}

					if (TemBomba > 0) {
						System.out.print("\n\t\tCuidado: bomba pr�xima!\n");
						TemBomba = 0;

					}

				}

				coringaK = 0;
				coringaL = 0;
				validador = 0;
				i_ = -1;
				j_ = -1;

			}
		} while (gameOver);

	}

	// PROCEDIMENTO PARA VERIFICAR SE EXISTEM BOMBAS PR�XIMAS NA POSI��O SOLICITADA DO JOGADOR
	public static void Valida_BombaNoLocal(int i, int j) throws ArrayIndexOutOfBoundsException {

		
		int posK = (i - 1);
		int posL = (j - 1);

		for (int k = ((i - 1) + coringaK); k < (posK + 3); k++) {
			for (int l = ((j - 1) + coringaL); l < (posL + 3); l++) {

				try {
					validador++;
					if (matriz_P[k][l] == -1) {

						TemBomba++;
					}

				} catch (ArrayIndexOutOfBoundsException e) {

				}
			}
		}

	}

	// FUN��O PARA VALIDAR QUE O JOGADOR DIGITE SEMPRE UM N�MERO QUE ESTEJA NAS
	// DIMENS�ES DA MATRIZ
	public static int Valida_Pos_Matriz(int info) throws InputMismatchException {

		entrada = new Scanner(System.in);
		int tamanho = 0, cond = -1;

		try {

			tamanho = entrada.nextInt();
			if (tamanho >= 0 && tamanho <= (info - 1)) {
				cond = tamanho;

			} else {
				System.out.print(
						"\nDigite um valor que seja maior ou igual a 0 e menor ou igual a " + (info - 1) + "!!\n");
			}

		} catch (Exception e) {
			System.out.print("\nDigite um valor v�lido!!\n");

		}

		return cond;
	}

	// FUN��O PARA VALIDAR QUE O JOGADOR DIGITE SEMPRE UM N�MERO INTEIRO E QUE O
	// TAMANHO DA MATRIZ SEJA MAIOR OU IGUAL A 2X2
	public static int Tamanho_Matriz() throws InputMismatchException {

		entrada = new Scanner(System.in);
		int tamanho = 0, cond = 0;

		try {

			tamanho = entrada.nextInt();
			if (tamanho >= 2) {
				cond = tamanho;

			} else {
				System.out.print("\nDigite um valor maior ou igual a 2!!\n");
			}

		} catch (Exception e) {
			System.out.print("\nDigite um valor v�lido!!\n");

		}

		return cond;
	}

	// FUN��O PARA VALIDAR QUE O JOGADOR DIGITE SEMPRE UM N�MERO INTEIRO E QUE A
	// QUANTIDADE DE BOMBAS
	// DA MATRIZ SEJA MAIOR QUE 0 E MENOR QUE A QUANTIDADE DE C�LULAS DA MATRIZ
	// CRIADA
	public static int Quantidade_Bombas() throws InputMismatchException {

		entrada = new Scanner(System.in);
		int tamanho = 0, cond = 0;

		try {

			tamanho = entrada.nextInt();
			if (tamanho > 0 && tamanho < (linhas * colunas)) {
				cond = tamanho;

			} else {
				System.out.print("\nDigite um valor maior que 0 e menor que " + (linhas * colunas) + "!!\n");
			}

		} catch (Exception e) {
			System.out.print("\nDigite um valor v�lido!!\n");

		}

		return cond;
	}

	// PROCEDIMENTO PARA IMPRIMIR MATRIZ M�SCARA
	public static void PrintMatriz_M() {
		int posJ = 0;

		System.out.print("\n");
		for (int i = 0; i < linhas; i++) {
			System.out.printf("[%d]", posJ);
			for (int j = 0; j < colunas; j++) {

				System.out.printf("\t");
				System.out.printf("%2s", matriz_M[i][j]);

			}

			posJ++;
			System.out.print("\n");
		}
		for (int j = 0; j < colunas; j++) {
			System.out.printf("\t");
			System.out.printf("[%d]", j);
		}
		System.out.print("\n");

	}

	// PROCEDIMENTO PARA IMPRIMIR MATRIZ M�SCARA MOSTRANDO AS POSI��ES DAS BOMBAS
	public static void PrintMatriz_P() {
		
		int posJ = 0;

		System.out.print("\n");
		for (int i = 0; i < linhas; i++) {
			System.out.printf("[%d]", posJ);
			for (int j = 0; j < colunas; j++) {
				if (matriz_P[i][j] == -1) {
					matriz_M[i][j] = "b";
				}
				System.out.printf("\t");
				System.out.printf("%2s", matriz_M[i][j]);

			}

			posJ++;
			System.out.print("\n");
		}
		for (int j = 0; j < colunas; j++) {
			System.out.printf("\t");
			System.out.printf("[%d]", j);
		}
		System.out.print("\n");

	}
}
