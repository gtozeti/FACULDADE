import java.util.Scanner;

public class Menus {

	public static Scanner entrada = new Scanner(System.in);
	public static String opcao = "";
	public static int dificuldade = 0;
	public static String nomeJogador = "";

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-MAIN-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	public static void main(String[] args) {

		boolean cond = true;

		do {

			System.out.print("\t\t\t\t\t\t\t\t---Menu---\n");
			System.out.println("\n\t\t\t1 - Intru��es\t\t\t\t\t\t\t2 - Jogar");
			System.out.println("\t\t\t3 - Cr�ditos\t\t\t\t\t\t\t4 - Sair\n");
			String opcao_Menu = Option();

			switch (opcao_Menu) {

			case "1":
				Instru��es();
				break;

			case "2":

				Jogar();
				/*
				 * Templo_1(); Templo_2(); Templo_3(); Big_Boss();
				 */
				break;

			case "3":
				Cr�ditos();
				break;

			case "4":

				cond = false;
				break;

			default:
				System.out.println("\nOp��o n�o � v�lida!\n");

			}

		} while (cond);

	}

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-JOGO-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// PROCEDIMENTO PARA ARMAZENAR AS INFORMA��ES DAS INTRU��ES
	public static void Instru��es() {

		Texto_Formatado("\nO objetivo do jogo � auxiliar o jogador em alguns conhecimentos da matem�tica."
				+ " Ao longo da jornada, ser�o apresentados conte�dos sobre a mat�ria em quest�o e "
				+ "apresentadas perguntas ao jogador. O mesmo dever� selecionar as op��es v�lidas para que ele possa"
				+ " avan�ar no jogo e a cada quest�o, o jogador sofrer� um dano se errar, diminuindo assim sua vida."
				+ " O objetivo final do jogador, � avan�ar por todos os templos para derrotar o �ltimo chefe, sem perder toda a sua vida");

		Sair();

	}

	// PROCEDIMENTO PARA FAZER A 1� CHAMADA DO JOGO, PARA COLETAR AS INFORMA��ES DO NOME DO JOGADOR, MAIS A DIFICULDADE DO JOGO
	public static void Jogar() {

		Texto_Formatado(
				"\n\t\t\t\t\t\t---Escolha a sua dificuldade de jogo---\n\n\t\t1 - F�cil\t\t\t\t\t2 - Normal\t\t\t\t\t3 - Dif�cil");

		boolean cond = true;

		do {

			String opcao_Menu = Option();
			switch (opcao_Menu) {

			case "1":
				dificuldade = 1;
				cond = false;
				break;

			case "2":
				dificuldade = 2;
				cond = false;
				break;

			case "3":
				dificuldade = 3;
				cond = false;
				break;

			default:
				System.out.println("Op��o n�o � v�lida!\n");

			}
		} while (cond);
		
		Texto_Formatado("\n\t\t\t\t\t\t---Escolha o nome do seu jogador---");
	 	nomeJogador = Option();
		
		 boolean cond2 = true;
		 do { 
			 	
				System.out.print("\n\t\t\t\t\tVoc� deseja que o nome do seu jogador seja " + nomeJogador + " ? (S/N)");
				String opcao_Menu = Option();
 			 
				switch (opcao_Menu.toUpperCase())
			 {
			 	case "S": 
			 		cond2 = false;
			 		break;
		 		case "N":
		 			Texto_Formatado("\n\t\t\t\t\t\t---Escolha o nome do seu jogador---");
		 		 	nomeJogador = Option();
		 			break;
	 			default:
	 				System.out.println("\nOp��o n�o � v�lida!\n");
	 				}
			 }while(cond2);
		
		
	}

	// PROCEDIMENTO PARA ARMAZENAR AS INFORMA��ES DOS CR�DITOS
	public static void Cr�ditos() {

		Texto_Formatado("\n-Caio Gon�alves\n\t-Gustavo Tozeti\n\t\t-Matheus Cavalcanti\n\t\t\t-Renan Kesper");
		Sair();

	}

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FERRAMENTAS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// PROCEDIMENTO CRIADO PARA FORMATAR QUALQUER TEXTO, PARA PADRONIZAR O LAYOUT DA
	// MENSAGEM COM BASE EM UM VALOR PR� DETERMINADO
	public static void Texto_Formatado(String frase) {

		String texto = frase;
		StringBuilder novoTexto = new StringBuilder();

		String[] palavras = texto.split(" ");

		int contadorQntLetras = 0;
		int limiteLinha = 140;

		for (String palavra : palavras) {

			if (contadorQntLetras + palavra.length() >= limiteLinha) {
				contadorQntLetras = 0;
				novoTexto.append('\n');
			}

			novoTexto.append(palavra);
			novoTexto.append(' ');
			contadorQntLetras += palavra.length() + 1;
		}
		System.out.println("\n");
		for (int i = 0; i < limiteLinha; i++) {
			System.out.print("=");
		}

		System.out.print("\n" + novoTexto + "\n\n");

		for (int i = 0; i < limiteLinha; i++) {
			System.out.print("=");
		}
		

	}

	// FUN��O CRIADA PARA RETONAR UMA OP��O DESEJADA DO USU�RIO
	public static String Option() {
		System.out.print("\n***Digite sua op��o: ");
		opcao = entrada.next();
		return opcao;
	}

	// PROCEDIMENTO CRIADO PARA VALIDAR  SIM OU N�O DE UMA PERGUNTA
	 public static void Option_S_N (){
		
		 }
	 

	// PROCEDIMENTO CRIADO PARA SAIR DE UMA OP��O DE UM MENU
	public static void Sair() {
		System.out.print("\nPressione qualquer tecla para voltar!");
		String sair = entrada.next();
	}
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-TEMPLOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

}
