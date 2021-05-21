import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MatrizMinada2 {

	public static Scanner entrada = new Scanner(System.in);

	static Random valorRandom = new Random();

	static int colunas = 0, linhas = 0, bombas = 0;

	static int matriz_P[][];
	static String matriz_M[][];

	public static void main(String[] args) {

		// DESCRIÇÃO DO JOGO
		System.out.println("\t**** Matriz Minada ****\n");
		System.out.println("\t\t--Regras-- \n1 - O tamanho da matriz deve ser maior que 2x2;\n2 - A quantidade de bombas deve ser maior que 0 e menor que a quantidade de células da matriz;\n3 - Devem ser informados apenas números inteiros;\n");

		//DEFININDO A QUANTIDADE DE COLUNAS DA MATRIZ
		System.out.print("Digite o tamanho de colunas: ");
		while (colunas < 2) {
			colunas = Tamanho_Matriz();
		}
		//DEFININDO A QUANTIDADE DE LINHAS DA MATRIZ
		System.out.print("Digite o tamanho de linhas: ");
		while (linhas < 2) {
			linhas = Tamanho_Matriz();
		}

		//CRIAÇÃO DA MATRIZ
		int matriz[][] = new int[linhas][colunas];
		matriz_P = matriz;

		//DEFININDO A QUANTIDADE DE BOMBAS
		System.out.print("Digite a quantidade de bombas: ");
		while (bombas == 0) {
			bombas = Quantidade_Bombas();
		}

		// INSERÇÃO DE BOMBAS ALEATÓRIAS NA MATRIZ E CASO O NÚMERO RANDOMICO CAIA NA
		// MESMA POSIÇÃO QUE JÁ POSSUA UMA "BOMBA" É EFETUADA NOVAMENTE A OPERAÇÃO,
		// ATÉ QUE A QUANTIDADE x DE BOMBAS TENHA SIDO INSERIDAS
		for (int i = 0; i < bombas; i++) {

			int l = valorRandom.nextInt(linhas);
			int c = valorRandom.nextInt(colunas);

			if (matriz_P[l][c] == -1) {
				i--;
			} else {
				matriz_P[l][c] = -1;
			}
		}
		
		String matriz2[][] = new String[linhas][colunas];
		matriz_M = matriz2;
		
		for (int i = 0; i < linhas;i++) {
			for (int j = 0; j < colunas;j++) {
				matriz_M[i][j] = "_";
			}
		}
		
		PrintMatriz_M();
		
		
	}

	// FUNÇÃO PARA VALIDAR QUE O JOGADOR DIGITE SEMPRE UM NÚMERO INTEIRO E QUE O
	// TAMANHO
	// DA MATRIZ SEJA MAIOR OU IGUAL A 2X2
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
			System.out.print("\nDigite um valor inteiro!!\n");

		}

		return cond;
	}

	// FUNÇÃO PARA VALIDAR QUE O JOGADOR DIGITE SEMPRE UM NÚMERO INTEIRO E QUE A
	// QUANTIDADE DE BOMBAS
	// DA MATRIZ SEJA MAIOR QUE 0 E MENOR QUE A QUANTIDADE DE CÉLULAS DA MATRIZ
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
			System.out.print("\nDigite um valor inteiro!!\n");

		}

		return cond;
	}

	//PROCEDIMENTO PARA IMPRIMIR MATRIZ MÁSCARA
	public static void PrintMatriz_M() {
		int posI = 0;
		int posJ = 0;
		
		System.out.print("\n");
		for (int i = 0; i < linhas;i++) {
			System.out.printf("[%d]",posJ);
			for (int j = 0; j < colunas;j++) {
				
				System.out.printf("\t");
				System.out.printf("%2s", matriz_M[i][j]);
				
			}
			
			posJ ++;
			System.out.print("\n");
		}
		for (int j = 0; j < colunas;j++) {
			System.out.printf("\t");
			System.out.printf("[%d]",j);
			}
		System.out.print("\n");
	
	}
}
