import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CaminhoMinado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random valorRandom = new Random();

		int num, posicao, pontos = 0;
		float caminho = 0, bomba = 0;
		boolean cond1 = true, cond2 = true,cond3 = true, GameOver = true, pontuacao = true;

		//DESCRIÇÃO DO JOGO
		System.out.println("\t**** Caminho Minado ****\n");
		System.out.println(
				"\t\t--Regras-- \n1 - O tamanho do caminho deve ser maior que 1\n2 - A quantidade de bombas deve ser maior que 0\n3 - Devem ser informados apenas números inteiros\n");

		//VALIDAÇÃO PARA QUE O JOGADOR DIGITE SEMPRE UM NÚMERO INTEIRO E QUE O TAMANHO DO CAMINHO SEJA MAIOR QUE 1
		do {
			System.out.print("Digite o tamanho do caminho: ");
			caminho = entrada.nextFloat();
			if (caminho % 1 == 0 && caminho > 1) {
				cond1 = false;
			}
		} while (cond1);														

		//VALIDAÇÃO PARA QUE O JOGADOR DIGITE SEMPRE UM NÚMERO INTEIRO E QUE A QUANTIDADE DE BOMBAS SEJA MAIOR QUE 0 E MENOR QUE O TAMANHO DO CAMINHO
		do {
			System.out.print("Digite a quantidade de bombas: ");
			bomba = entrada.nextFloat();
			if (bomba % 1 == 0 && bomba < (int) caminho) {
				cond2 = false;
			}
		} while (cond2);
		System.out.print("\n");

		//CRIAÇÃO DO VETOR CAMINHO DEFINIDO PELO JOGADOR
		int vetor_Caminho[] = new int[(int) (caminho)];

		//INSERÇÃO DE BOMBAS ALEATÓRIAS NO CAMINHO E CASO O NÚMERO RANDOMICO CAIA NA MESMA POSIÇÃO QUE JÁ POSSUI UMA "BOMBA" É EFETUADA NOVAMENTE A OPERAÇÃO,
		//ATÉ QUE A QUANTIDADE x DE BOMBAS TENHA SIDO INSERIDAS
		for (int i = 0; i < (int) (bomba); i++) {

			num = valorRandom.nextInt((int) caminho);
			if (vetor_Caminho[num] == -1) {
				i--;
			} else {
				vetor_Caminho[num] = -1;
			}
		}

		//CRIAÇÃO DO VETOR MÁSCARA QUE POSSUI O MESMO TAMNHO DO VETOR DIMENSIONADO PELO JOGADOR
		String vetor_Mascara[] = new String[(int) (caminho)];

		for (int i = 0; i < vetor_Mascara.length; i++) {

			vetor_Mascara[i] = "_";

		}

		//CRIAÇÃO E PREENCHIMENTO DO VETOR POSIÇÃO, PARA INDICAR AS POSIÇÕES AO JOGADOR
		int vetor_Pos[] = new int[(int) (caminho)];

		for (int i = 0; i < vetor_Pos.length; i++) {

			vetor_Pos[i] = i;

		}

		
		//LOOP DO JOGO
		do {

			//VALIDAÇÃO INICIAL PARA VERIFICAR SE O JOGADOR ATINGIU A PONTUAÇÃO MÁXIMA E IMPRIMIR NA TELA TODOS OS LOCAIS AONDE TINHA UMA "BOMBA"
			if (pontos == (vetor_Caminho.length - (int) bomba)) {
				System.out.print("\n");
				for (int i = 0; i < vetor_Caminho.length; i++) {
					if (vetor_Caminho[i] == -1) {
						vetor_Mascara[i] = "b";
					}
				}
				
				for (String item : vetor_Mascara)
					System.out.printf("%7s", item);
				System.out.print("\n");
				for (int item : vetor_Pos)
					System.out.printf("%7d", item);
				System.out.print("\n");
				System.out.print("\n\nParabéns, você ganhou o jogo!");
				System.out.print("\nPontuação: " + pontos + "/" + (vetor_Caminho.length - (int) bomba));
				pontuacao = false;
			}

			//CASO O JOGADOR NÃO TENHA ATINGIDO A PONTUAÇÃO TOTAL, É SEGUIDO COM OUTRAS IMPRESSÕES E TESTES 
			else {
				
				//IMPRESSÃO EM TABULAÇÃO DOS VETORES MÁSCARA E POSIÇÃO
				System.out.print("\n");
				for (String item : vetor_Mascara) System.out.printf("%7s", item);
				System.out.print("\n");
				for (int item : vetor_Pos) System.out.printf("%7d", item);
				System.out.print("\n");
				
				//VALIDAÇÃO PARA QUE O JOGADOR NÃO POSSA JOGAR NA MESMA CASA
				do {
				System.out.print("\nDigite a posição: ");
				posicao = entrada.nextInt();
				if (vetor_Mascara[posicao] == "x") {
					System.out.print("Você não pode jogar na posição já marcada!!\n");
				}
				else {
				
					cond3 = false;
				
				}
				}while(cond3);
				
				//VALIDAÇÃO_1 PARA QUE AS CASAS AO LADO DA POSIÇÃO DIGITADA E SEMPRE UMA A FRENTE CASO A POSIÇÃO SEJA 0 E SEMPRE UMA ATRAS CASO A POSIÇÃO SEJA A ULTIMA
				//ESTEJAM VAZIAS E NÃO APAREÇA A MENSAGEM DE "CUIDADO"
				if ((vetor_Caminho[posicao] == 0 && posicao == 0
						&& (vetor_Caminho[posicao + 1] == 0 || vetor_Mascara[posicao + 1] == "x"))
						|| (vetor_Caminho[posicao] == 0 && posicao == (vetor_Caminho.length - 1)
								&& (vetor_Caminho[posicao - 1] == 0 || vetor_Mascara[posicao - 1] == "x"))
						|| (vetor_Caminho[posicao] == 0) && posicao != 0 && posicao != (vetor_Caminho.length - 1)
								&& ((vetor_Caminho[posicao + 1] == 0 || vetor_Mascara[posicao + 1] == "x")
										&& (vetor_Caminho[posicao - 1] == 0 || vetor_Mascara[posicao - 1] == "x"))) {
					
					//CASO A VALIDAÇÃO_1 SEJA VERDADEIRA, É MODIFCADO O VETOR MÁSCARA, INDICANDO QUE A POSIÇÃO FOI JÁ EFETUADA E AUMENTADO A PONTUAÇÃO
					vetor_Mascara[posicao] = "x";
					vetor_Caminho[posicao] = 1;
					pontos++;
				} 
				
				//VALIDAÇÃO_2 PARA QUE AS CASAS AO LADO DA POSIÇÃO DIGITADA E SEMPRE UMA A FRENTE CASO A POSIÇÃO SEJA 0 E SEMPRE UMA ATRAS CASO A POSIÇÃO SEJA A ULTIMA
				//ESTEJAM COM UMA BOMBA E APAREÇA A MENSAGEM DE "CUIDADO"
				else if ((vetor_Caminho[posicao] == 0 && posicao == 0 && vetor_Caminho[posicao + 1] == -1)
						|| (vetor_Caminho[posicao] == 0 && posicao == (vetor_Caminho.length - 1)
								&& vetor_Caminho[posicao - 1] == -1)
						|| (vetor_Caminho[posicao] == 0 && posicao != (vetor_Caminho.length - 1) && posicao != 0
								&& (vetor_Caminho[posicao + 1] == -1 || vetor_Caminho[posicao - 1] == -1))) {

					//CASO A VALIDAÇÃO_2 SEJA VERDADEIRA, É MODIFCADO O VETOR MÁSCARA, INDICANDO QUE A POSIÇÃO FOI JÁ EFETUADA E AUMENTADO A PONTUAÇÃO
					vetor_Mascara[posicao] = "x";
					vetor_Caminho[posicao] = 1;
					
					if (pontos == (vetor_Caminho.length - (int) bomba) - 1) {
						pontos++;
					} else {
						System.out.print("**CUIDADO: Bomba Próxima!**\n");
						pontos++;
					}
					
				//VALIDAÇÃO_3 PARA VERIFICAR SE O JOGADOR ESCOLHEU A POSIÇÃO COM A BOMBA
				} else if (vetor_Caminho[posicao] == -1) {

					for (int i = 0; i < vetor_Caminho.length; i++) {
						if (vetor_Caminho[i] == -1) {
							vetor_Mascara[i] = "b";
						}
					}
					System.out.print("\n");
					for (String item : vetor_Mascara) System.out.printf("%7s", item);
					System.out.print("\n");
					for (int item : vetor_Pos) System.out.printf("%7d", item);
					System.out.print("\n\nGame Over!");
					System.out.print("\nPontuação: " + pontos + "/" + (vetor_Caminho.length - (int) bomba));
					GameOver = false;
				}
			}

		} while (pontuacao && GameOver);
	}

}
