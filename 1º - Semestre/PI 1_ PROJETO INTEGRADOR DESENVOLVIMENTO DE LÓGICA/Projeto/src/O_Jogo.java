import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class O_Jogo {

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-VARIAV�IS GLOBAIS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	public static Scanner entrada = new Scanner(System.in);
	public static String opcao = "";
	public static int dificuldade = 0;
	public static String nomeJogador = "";
	public static int thread1 = 0;
	public static int thread2 = 0;
	public static int thread3 = 0;
	public static int[] status = { 100, 2 };
	public static int frases = 0;

	// CORES DO TEXTO
	public static final String RESET = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String MAGENTA = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	
	// NEGRITO DO TEXTO 
	public static final String RESET_BOLD = "\u001B[0m";
	public static final String BOLD = "\u001B[1m";
	
	

	// CORES DO FUNDO DO TEXTO
	public static final String RESET_BACKGROUND = "\u001B[0m";
	public static final String BLACK_BACKGROUND = "\u001B[40m";
	public static final String RED_BACKGROUND = "\u001B[41m";
	public static final String GREEN_BACKGROUND = "\u001B[42m";
	public static final String YELLOW_BACKGROUND = "\u001B[43m";
	public static final String BLUE_BACKGROUND = "\u001B[44m";
	public static final String PURPLE_BACKGROUND = "\u001B[45m";
	public static final String CYAN_BACKGROUND = "\u001B[46m";
	public static final String WHITE_BACKGROUND = "\u001B[47m";

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-MAIN-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	public static void main(String[] args) {

		boolean cond = true;
		

		do {

			System.out.print(Tabula1(6, "---Menu---\n\n"));
			System.out.print(Tabula2(2, "[1] Intru��es", 6, "[2] Jogar\n"));
			System.out.print(Tabula2(2, "[3] Cr�ditos", 6, "[4] Sair\n"));

			String opcao_Menu = Option();

			switch (opcao_Menu) {

			case "1":
				Instru��es();
				break;

			case "2":

				Jogar();
				Hist_1();
				ExecutaTemplo1(status);
				Hist_2();
				ExecutaTemplo2();
				//Hist_3();
				ExecutaTemplo3(status);
				//Hist_3();
				
				
				break;

			case "3":
				Cr�ditos();
				break;

			case "4":

				cond = false;
				break;

			default:

				System.out.print(RED + Tabula1(6, "Op��o n�o � v�lida!\n\n") + RESET);

			}

		} while (cond);

	}

	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-JOGO-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// PROCEDIMENTO PARA ARMAZENAR AS INFORMA��ES DAS INTRU��ES
	public static void Instru��es() {

		System.out.print("\n");
		Texto_Formatado("\nO objetivo do jogo � auxiliar o jogador em alguns conhecimentos da matem�tica."
				+ " Ao longo da jornada, ser�o apresentados conte�dos sobre a mat�ria em quest�o e "
				+ "apresentadas perguntas ao jogador. O mesmo dever� selecionar as op��es v�lidas para que ele possa"
				+ " avan�ar no jogo e a cada quest�o, o jogador sofrer� um dano se errar, diminuindo assim sua vida."
				+ " O objetivo final do jogador, � avan�ar por todos os templos para derrotar o �ltimo chefe, sem perder toda a sua vida.");
		System.out.print("\n");
		Sair();

	}

	// PROCEDIMENTO PARA FAZER A 1� CHAMADA DO JOGO, PARA COLETAR AS INFORMA��ES DO
	// NOME DO JOGADOR, A DIFICULDADE DO JOGO E A HIST�RIA INICIAL
	public static void Jogar() {

		Texto_Formatado(Tabula1(4, "---Escolha a sua dificuldade de jogo---\n\n")
				+ Tabula3(1, "[1] F�cil", 3, "[2] Normal", 3, "[3] Dif�cil"));

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
				System.out.print(RED + Tabula1(6, "Op��o n�o � v�lida!\n\n") + RESET);

			}
		} while (cond);

		Texto_Formatado(Tabula1(4, "   ---Escolha o nome do seu jogador---"));
		nomeJogador = Option();

		boolean cond2 = true;
		do {

			Texto_Formatado(Tabula1(4,
					"---Voc� deseja que o nome do seu jogador seja " + RED + nomeJogador + RESET + " ?---\n\n")
					+ Tabula2(4, GREEN + "[S]" + RESET, 6, RED + "[N]" + RESET));
			String opcao_Menu = Option();

			switch (opcao_Menu.toUpperCase()) {
			case "S":
				cond2 = false;
				break;
			case "N":
				Texto_Formatado(Tabula1(4, "---Escolha o nome do seu jogador---"));
				nomeJogador = Option();
				break;
			default:
				System.out.print(RED + Tabula1(6, "Op��o n�o � v�lida!\n\n") + RESET);
			}
		} while (cond2);

	}

	// PROCEDIMENTO PARA ARMAZENAR AS INFORMA��ES DOS CR�DITOS
	public static void Cr�ditos() {

		System.out.print("\n");
		Texto_Formatado(Tabula3(2,"\nGustavo Tozeti",2,"Matheus Cavalcanti",2,"Renan Kesper"));
		System.out.print("\n");
		Sair();

	}

	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-HIST�RIA-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
	
	// PRIMEIRA NARRATIVA DO JOGO
	public static void Hist_1() {

		System.out.print("\n");
		
		Texto_Formatado(
				
				
				Dialogo("Narrador",WHITE) + "\n - Aos escombros, uma leve p�gina, parecida de um di�rio, pousa sobre o rosto de "+ nomeJogador +". Aos sustos, " + nomeJogador +" acorda e come�a a ler a p�gina." +
				
				Dialogo(nomeJogador,WHITE)+ GREEN
				+ "\n - \"Reza a lenda que Ariandre era um lugar pr�spero, cheio de magia e encanto, onde todos os seres viviam em harmonia e em paz. Um lugar t�o belo,"					
				+ " que a matem�tica era a base de for�a para grandes magos. Mas isso � claro, antes do grande acontecimento. . .Ningu�m sabe ao certo, nem ao menos como,"				
				+ " mas naquela tarde esse lugar t�o calmo e pleno, foi reduzido a cinzas e escombros, uma enorme escurid�o pairou pelos c�us e tomou Ariandre por inteiro "			
				+ "e com um simples clar�o. . .tudo foi destru�do. Ap�s momentos agoniantes, enfim o motivo disso tudo. . . sim, ele que era apenas uma f�bula de centenas de "			
				+ "anos, de contos muito antigos, enfim ressurgiu. . . Ancelot tinha despertado. O grande rei dem�nio estava presente novamente, "			
				+ "para aprisionar toda a matem�tica de Ariandre e ser o detentor de toda a magia. J� se passaram alguns meses depois disso tudo, mas agora espero "					
				+ "ter for�as para enfrent�-lo, mas a cada dia que se passa nessas catedrais do abismo perco mais e mais da minha sanidade. Talvez eu seja a �ltima esperan�a "			
				+ "de Ariandre, mas caso algu�m esteja lendo isso, significa que Ancelot venceu e Ariandre para sempre estar� sob o seu dom�nio.\"" 									
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Mas. . . mas como? Meses? Estava tudo certo, ele estava em minhas m�os, como foi tudo isso desmoronar. Minha "					
				+ "cabe�a d�i, s�o mem�rias que me vem, mas o que ser� que aconteceu? Por que eu estou nas catedrais e porque Ariandre est� destru�da? Ser� isso um sonho?"
				+ " Eu preciso descobrir o que aconteceu, mas me sinto estranho. Parece que n�o tenho mais meus poderes. Ser� que eu consigo canalizar algo??"
				
				+ Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+ " tenta utilizar, uma de suas magias vinda atrav�s dos poderes da matem�tica, mas sem sucesso! "
				+ "E como em um turbilh�o de mem�rias, "+nomeJogador+" come�a a se lembrar daquele fat�dico dia.\n\n"
						
				+Tabula1(4,"Alguns meses antes...") 
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Finalmente, depois de anos de estudos e c�lculos, finalmente irei despertar Ancelot e enfim obter o seu"
				+ " poder supremo."
				
				+ Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+ " por mais que fosse extremamente forte, jamais saberia que o terr�vel Ancelot portava de uma maldi��o, que "
				+ "quem o invoca-se traria destrui��o ao seu mundo. Ao passo em que o ritual de invoca��o se iniciava, um grande portal cheio de trevas se abriu no ch�o e dele "
				+ "sa�a o fim dos tempos."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Finalmente livre!!"	
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Jamais Ancelot, eu "+ nomeJogador +" sou o ser mais supremo de toda Ariandre, voc� n�o � pareo para os meus poderes. Apenas te "
				+ "invoquei para obter toda sua fonte de poder e assim te derrot�-lo para sempre. "
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Tolo, voc� n�o � a primeira pessoa a tentar isso. Voc�s todos tentam, mas todos esquecem da maldi��o!!"	
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Maldi��o? Que maldi��o?!"
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Pelo visto, voc� n�o est� preparado HAHAHAHAH. Mas talvez o que eu fa�a aqui, sirva de li��o para voc�."
				
				+ Dialogo("Narrador",WHITE) + "\n - E com uma enorme for�a e magia, que surpreendia at� "+nomeJogador+", Ancelot conseguiu drenar todos os seus poderes. Com v�rios feixes de luz, "
				+ nomeJogador+" via seus poderes se esvaindo ao longo de si."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - "+nomeJogador+", voc� me parece interessante. Irei espalhar esses seus poderes nas mais profundas terras de Ariandre e caso voc� sobreviva, ter� seus "
				+ "poderes de volta para me enfrentar."
				
				+ Dialogo("Narrador",WHITE) + "\n - Com um imenso clar�o, tudo ficou em sil�ncio. At� agora...\n\n"
				
				+Tabula1(4,"Atualmente...")
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Droga! Preciso recuperar meus poderes e derrotar Ancelot. Mas onde estou?"
				
				+ Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" olha em volta e se depara com escombros e ru�nas. Mas come�a a perceber que existem s�mbolos escritos nas paredes que s�o familiares. "
				+ "Estes s�mbolos remetem a algumas descri��es dos templos da perdi��o das catedrais. � de grande espanto, pois "+nomeJogador+" ao reconhecer �s escritas, lembrou que os templos eram mitos da terra "
				+ "antiga e que eram locais respons�veis por um grande armazenamento de magia."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Se ele disse que meus poderes est�o nas mais profundas terras de Ariandre, ent�o s� podem estar espalhados entre os tr�s templos daqui. "
				+ "Preciso ir em frente!"
				
				+Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+ " adentra no templo das "+BOLD+"Equa��es de 1� Grau"+RESET_BOLD+", um lugar que lhe faz relembrar dos seus in�cios de treinamento de mago. "
				+ "Tanto �, que esse conhecimento era a base dos seus grandiosos poderes."
						
				+ Dialogo("Narrador",WHITE) + "\n - Os templos possuem feiti�os incr�veis e fazem com quem adentrar ao local tenha a sabedoria para conquistar o poder armazenado nele. E n�o foi diferente com esse templo."
				+ nomeJogador+" ap�s passar por um portal m�gico do templo, teve uma viagem m�stica at� onde estavam os desafios para recuperar seu poder. Dentro dessa viagem, uma voz desconhecida lhe passou os seguintes "
				+ "ensinamentos�"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Ol� "+ nomeJogador+", que bom te ver aqui!!"
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Mas quem � voc�?"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - N�o se preocupe, sou apenas um ajudante de Ariandre e estou aqui para ajudar em sua jornada. N�o temos muito tempo a frente ent�o serei o mais r�pido poss�vel, "
				+ "isso lhe guiar� nos seus pr�ximos desafios daqui para frente."
				
				+ Dialogo("Narrador",WHITE) + "\n - E parecendo uma voz familiar, "+ nomeJogador+" escutou os ensinamentos que a voz desconhecida tinha a oferecer."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O poder deste templo s�o �s"+BOLD(" Equa��es de 1� Grau",CYAN)+", elas ser�o a base para sua fonte de poder. Para derrotar os desafios � frente, voc� ir� precisar dos "
				+ "conhecimentos b�sicos a fim de quebrar os feiti�os que ser�o lan�ados a ti. Ent�o preste muita aten��o..."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - As equa��es de primeiro grau s�o senten�as matem�ticas que estabelecem rela��es de igualdade entre termos conhecidos e desconhecidos, "
				+ "representadas sob a forma: "+BOLD("ax+b = 0",CYAN)+". Donde "+BOLD("a",CYAN)+" e "+BOLD("b",CYAN)+" s�o n�meros reais, sendo "+BOLD("a",CYAN)+" um valor diferente de zero "+BOLD("(a != 0)",CYAN)+" e "+BOLD("x ",CYAN)+ "representa o "
				+ "valor desconhecido. O valor desconhecido � chamado de "+BOLD("inc�gnita",CYAN)+" que significa \"termo a determinar\". As equa��es do 1� grau podem apresentar "+BOLD("uma",CYAN)+" ou "+BOLD("mais",CYAN)+" inc�gnitas."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O objetivo de resolver uma equa��o de primeiro grau � "+BOLD("descobrir o valor desconhecido",CYAN)+", ou seja, encontrar o valor da inc�gnita que "+BOLD("torna a igualdade verdadeira",CYAN)+". Para isso, "
				+ "deve-se "+BOLD("isolar os elementos desconhecidos em um dos lados do sinal de igual e os valores constantes do outro lado",CYAN)+". Contudo, � importante observar que a mudan�a de posi��o desses elementos "+BOLD("deve ser feita de forma que a igualdade "
				+ "continue sendo verdadeira",CYAN)+". Quando um termo da equa��o mudar de lado do sinal de igual, devemos inverter a opera��o. Assim, se tiver multiplicando, passar� dividindo, se tiver somando, passar� subtraindo e vice-versa."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Agora voc� est� pronto para o caminho em frente. Espero te ver logo, adeus�"
				
				+ Dialogo("Narrador",WHITE) + "\n - E com essa despedida, "+ nomeJogador+" saiu de sua viagem m�stica e j� estava em apuros."
				
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Parece que voc� sobreviveu depois de tudo aquilo e ainda conseguiu chegar at� aqui. Voc� n�o ter� seu poder de volta t�o f�cil HAHAHHA. Veremos se voc� � realmente capaz de enfrentar meus 3 feiti�os.");
				
								
				
				
		
		System.out.print("\n");

	}

	public static void Hist_2(){
		
		System.out.print("\n");
		
		Texto_Formatado(
				
				Dialogo("Ancelot",WHITE) +  RED + "\n - Imposs�vel, como voc� conseguiu ? Isso ainda n�o acabou, n�s iremos nos encontrar novamente."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Onde voc� estiver, eu estarei l� para te derrotar!"
				
				+ Dialogo("Narrador",WHITE) + "\n - E diante de um clar�o Ancelot, desapareceu� Mas no local da batalha grandiosa, uma enorme chama, surgia no meio da arena. Era o poder perdido de "+nomeJogador+",  que ao se aproximar, pode absorver novamente seu poder."
				
				+ Dialogo(nomeJogador,WHITE) +  GREEN + "\n - Como � bom ter meus poderes de volta!"
				
				+ Dialogo("Narrador",WHITE) + "\n - Com a grande primeira batalha travada, "+nomeJogador+" continuou em sua jornada para o pr�ximo templo adentrando no pr�ximo portal."
						
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Ol� "+ nomeJogador+", que bom que voc� sobreviveu!!"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Precisamos continuar sua batalha."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - O poder deste templo s�o �s"+BOLD(" Equa��es de 2� Grau",CYAN)+", elas ser�o o fortalecimento do seu poder. Para derrotar os desafios � frente, voc� ir� precisar dos "
				+ "conhecimentos b�sicos a fim de quebrar os feiti�os que ser�o lan�ados a ti. Ent�o preste muita aten��o..."									
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - As equa��es de segundo grau s�o caracterizadas por um "+BOLD("polin�mio de grau 2",CYAN)+", ou seja, um polin�mio do tipo "+BOLD("ax� + bx + c",CYAN)+", em que a, b e c "+BOLD("s�o n�meros reais",CYAN)+". Ao resolvermos uma equa��o de grau 2, estamos "
				+ "interessados em "+BOLD("encontrar valores para a inc�gnita x",CYAN)+" que torne o "+BOLD("valor da express�o igual a 0",CYAN)+", que s�o chamadas de ra�zes, isto �, "+BOLD("ax� + bx + c = 0",CYAN)+"."
						
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - A equa��o do 2� grau � classificada como "+BOLD("completa",CYAN)+" quando todos os coeficientes s�o diferentes de 0, ou seja, a != 0, b != 0 e c != 0. A equa��o do 2� grau � classificada como "+BOLD("incompleta",CYAN)+" quando o valor dos coeficientes b ou c s�o iguais a 0, isto �, b = 0 ou c = 0."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - "+BOLD("Para solucionar equa��es do tipo ax� + c = 0",CYAN)+", o m�todo para determinar a solu��o de equa��es incompletas que possuem b=0 consiste em isolar a inc�gnita x."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - "+BOLD("Para solucionar equa��es do tipo ax� + bx = 0",CYAN)+", o m�todo para determinar as poss�veis solu��es de uma equa��o com c =0, consiste em utilizar a fatora��o por evid�ncia."
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - "+BOLD("Para solucionar equa��es completas",CYAN)+", o m�todo conhecido como m�todo de Bhaskara ou f�rmula de Bhaskara aponta que as ra�zes de uma equa��o do 2� grau do tipo ax� + bx + c = 0 � dada pela seguinte rela��o:"
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Ra�z 1 = "+BOLD(" (-b + (Raiz Quadrada(Delta)) / 2.a | Delta = b� - 4.a.c",CYAN) 
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Ra�z 2 = "+BOLD(" (-b - (Raiz Quadrada(Delta)) / 2.a | Delta = b� - 4.a.c",CYAN) 
				
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Quando o "+BOLD("Delta for positivo",CYAN)+": existem duas solu��es para a equa��o. Quando o "+BOLD("Delta for igual a zero",CYAN)+": as solu��es da equa��o s�o repetidas."
				+ " Quando o "+BOLD("Delta for negativo",CYAN)+": n�o admite solu��o real."
										
				+ Dialogo("Voz Desconhecida",WHITE) + CYAN + "\n - Agora voc� est� pronto para o caminho em frente. Espero que consiga vencer novamente!"
				
				+ Dialogo("Narrador",WHITE) + "\n - E com essa despedida, "+ nomeJogador+" saiu de sua viagem m�stica e j� estava em apuros de novo."
							
				+ Dialogo("Ancelot",WHITE) +  RED + "\n - Eu me descuidei da primeira vez, mas dessa vez ser� diferente. Voc� ser� derrotado atrav�s desses meus novos 3 feiti�os."
				
				
				
				
				);
	
	}	
	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FERRAMENTAS DE TEXTO-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// PROCEDIMENTO CRIADO PARA FORMATAR QUALQUER TEXTO, PARA PADRONIZAR O LAYOUT DA
	// MENSAGEM COM BASE EM UM VALOR PR� DETERMINADO
	public static void Texto_Formatado(String frase) {

		String texto = frase;
		String[] palavras = texto.split(" ");

		int contadorQntLetras = 0;
		int limiteLinha = 170;
		

		for (int i = 0; i < limiteLinha; i++) {
			System.out.print(RED + "=" + RESET);
		}
		System.out.print("\n");

		for (String palavra : palavras) {

			if (contadorQntLetras + palavra.length() >= limiteLinha) {
				contadorQntLetras = 0;
				System.out.print("\n");
			}

			System.out.print(palavra + " ");
			Timer2();
			if (palavra.length()>18){
				contadorQntLetras = 0;
			}
			else {
			contadorQntLetras += palavra.length() + 1;
			
			
			}
			
			}
		System.out.println("\n");

		for (int i = 0; i < limiteLinha; i++) {
			System.out.print(RED + "=" + RESET);
		}
		System.out.println("\n");

	}

	// PROCEDIMENTOS CRIADOS PARA TABULAR QUALQUER TEXTO, PARA PADRONIZAR O LAYOUT DA
	// MENSAGEM
	public static String Tabula1(int t, String s) {

		String tab = "\t";
		String frase = "";
		for (int i = 0; i <= t; i++) {
			frase += tab;
		}
		frase += s;

		return frase;
	}

	public static String Tabula2(int t, String s, int tt, String ss) {

		String tab = "\t";
		String frase = "";

		for (int i = 0; i <= t; i++) {
			frase += tab;
		}
		frase += s;
		for (int i = 0; i <= tt; i++) {
			frase += tab;
		}
		frase += ss;
		return frase;
	}

	public static String Tabula3(int t, String s, int tt, String ss, int ttt, String sss) {

		String tab = "\t";
		String frase = "";

		for (int i = 0; i <= t; i++) {
			frase += tab;
		}
		frase += s;
		for (int i = 0; i <= tt; i++) {
			frase += tab;
		}
		frase += ss;
		for (int i = 0; i <= ttt; i++) {
			frase += tab;
		}
		frase += sss;
		return frase;
	}

	// PROCEDIMENTOS CRIADO PARA PADRONIZAR OS DI�LOGOS
	public static String Dialogo(String Nome, String Cor) {
		String texto = "\n\n" + BLACK_BACKGROUND + Cor +Nome+ RESET + RESET_BACKGROUND;
		return texto;
		}
	
	public static String BOLD(String frase, String Cor) {
		String texto = RESET + BOLD + frase + RESET_BOLD + Cor;
		return texto;
	}
	
	// PROCEDIMENTOS CRIADO PARA PRINTAR A MENSAGEM ANTES DO BOSS
	static void FormataTexto1(String frase) {

		String[] palavra = frase.split(" ");

		for (String each : palavra) {
			System.out.print(each + " ");
			Timer2();
		}
	}

	// PROCEDIMENTOS CRIADO PARA PRINTAR A MENSAGEM DE GAME OVER
	static void FormataTexto2(String frase) {

		String[] palavra = frase.split(" ");

		for (String each : palavra) {
			System.out.print(each);
			Timer2();
		}

		System.out.print(" ");
	}
	
	// PROCEDIMENTOS CRIADO PARA ARMAZENAR A COLE��O DE FRASES PARA ACERTOS
	static void Vitoria_Frase () {
		
		ArrayList<String> vitoria = new ArrayList();
		vitoria.add("Acertou novamente, droga droga droga...\n");
		vitoria.add("Vejo que acertou mais uma...\n");
		vitoria.add("TUDO QUE EU JOGO PARA VOC�, EST� CONSEGUINDO RESOLVER... Bom...voc� � bom, faz tempo que n�o uso todo o meu poder," 
		+ "agora voc� conhecer� a minha f�ria, d�vido que ir� conseguir responder as pr�ximas quest�es...\n");
		vitoria.add("Aaaah, sim, vejo que voc� foi capaz de passar pelo meu desafio! Maravilhoso, vamos apimentar um pouco mais as coisas\n");
		
		Collections.shuffle(vitoria);
		Collections.shuffle(vitoria);
		Collections.shuffle(vitoria);
		
		
		System.out.print(Dialogo("Ancelot",WHITE) +  RED + " - " + vitoria.get(0) + RESET + Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" concluiu mais um desafio! E por uma ben��o divina recebeu mais uma potion!!\n");
		
	}
	
	// PROCEDIMENTOS CRIADO PARA ARMAZENAR A COLE��O DE FRASES PARA ERROS
	static void Derrota_Frase () {
		
		ArrayList<String> derrota = new ArrayList();
		derrota.add("Voc� n�o conseguir� prosseguir nem que tente mil vezes.\n");
		derrota.add("Voc� n�o � capaz de seguir em frente\n");
		
		Collections.shuffle(derrota);
		Collections.shuffle(derrota);
		
		System.out.println(Dialogo("Ancelot",WHITE) +  RED + " - " + derrota.get(0) + RESET);
	}

	// FUN��O CRIADA PARA ARMAZENAR A COLE��O DE FRASES PARA DESAFIOS
	static String Desafio_Frase () {
			
			ArrayList<String> desafio = new ArrayList();
			desafio.add("rationem esse accelerationis");
			desafio.add("processus arithmetica");
			desafio.add("mindsets parallel");
			desafio.add("periculi sensus");
			desafio.add("sensus motus");
			desafio.add("ignis magicae");
			desafio.add("ventum magicae");
			desafio.add("impulsum resistentiam");
			desafio.add("viribus");
			desafio.add("title heros");
			
			String frase =  RED + desafio.get(frases) + RESET;
			
			Texto_Formatado(Tabula1(6,frase)+"\n" + Dialogo("Narrador",WHITE) + "\n - Voc� recebe essa magia. Com o seu conhecimento, � capaz"
			+ " de absorv�-la e consegue revidar caso acerte o encanto!");
			
			return frase;
		}
	
	// PROCEDIMENTOS CRIADO PARA MOSTRAR MENSAGEM DE ACORDO COM A VIDA 
	// DO PERSONAGEM
	static void AcertouResposta(int healthPoints) {
		
		String frase_A = "";
		
		if (healthPoints >= 30 && healthPoints < 65) {
			frase_A = "\nParecia que tinha sido um grande desafio para "+nomeJogador+".";
		}
		if (healthPoints < 30) {
			frase_A = "\nTinha sido por pouco, mas "+nomeJogador+" conseguiu passar!";
		}
		
		String frase =  Dialogo("Narrador",WHITE) + "\n - A resposta estava...\n...\n...\n\n"+GREEN + "Certa :D\n" + RESET + frase_A ;
		Texto_Formatado(frase);
	
		Vitoria_Frase();

		

		
	}
	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FERRAMENTAS DE INPUT-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// FUN��O CRIADA PARA RETONAR UMA OP��O DESEJADA DO USU�RIO
	public static String Option() {
		System.out.print(BLACK_BACKGROUND + WHITE + "\n***Digite sua op��o:" + RESET + RESET_BACKGROUND + " ");
		opcao = entrada.next();
		System.out.print("\n");
		return opcao;
	}

	// PROCEDIMENTO CRIADO PARA SAIR DE UMA OP��O DE UM MENU
	public static void Sair() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPressione a tecla ENTER para voltar!\n");
		sc.nextLine();
		System.out.println(" ");
	}

	
	// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-FERRAMENTAS DO JOGO-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// FUN��O CRIADA PARA CALCULAR O DANO
	static int DanoRespostaErrada(int healthPoints) {
		Random dado = new Random();
		int jogada;
		
		int vida  = healthPoints;
		String frase_A = "";
		
		jogada = dado.nextInt(20) + 1;
		String jogada_ = String.valueOf(jogada);
		
		if (jogada <= 5) {
			
			String frase =  Dialogo("Narrador",WHITE) + "\n - Parece que o feiti�o era fraco e "+nomeJogador+" conseguiu se esquivar do dano.\n";
			Texto_Formatado(frase);
			
		}
		else 
		{
			
			if (jogada > 5 && jogada <= 10) {
			frase_A = "\nSorte que o feiti�o n�o acertou em cheio, mas acertou de rasp�o.\n";
			healthPoints = healthPoints - (10 + (5 * dificuldade));
		} else if (jogada > 10 && jogada <= 17) {
			frase_A = "\nEsse feiti�o era forte, mas n�o muito poderoso.\n";
			healthPoints = healthPoints - (20 + (5 * dificuldade));
		}
		else {
			frase_A = "\nEsse feiti�o tinha acertado em cheio!!.\n";
			healthPoints = healthPoints - (30 + (5 * dificuldade));
		}
			
			if (healthPoints > 0) {
			vida = vida - healthPoints;
			String vida_ = String.valueOf(vida);
			
			String frase =  Dialogo("Narrador",WHITE) + "\n - A resposta estava...\n...\n...\n\n"+RED + "Errada :(\n" + RESET + "\n**\t"+nomeJogador+
			" tinha recebido "+vida_+" de dano\t **\n\n"+frase_A+"";
			
				
			Texto_Formatado(frase);

				
			Derrota_Frase();
			}
			
		}
		
		
		frases--;
		return healthPoints;
	}

	// PROCEDIMENTO CRIADO PARA DAR GAME-OVER AO JOGO
	static void GameOver() {
		System.out.println("Seu HP chegou a 0");
		frases = 0;

		String game = "G A M E";
		String over = "O V E R";

		FormataTexto2(game);
		FormataTexto2(over);

		System.out.println("\n");
	}

	// FUN��O CRIADA PARA USAR POTIONS
	static int[] UsePotion(int healthPoints, int qntPotions) {

		boolean condicao = true;
		char opcao = 0;
		int[] status = new int[2];

		do {

			Texto_Formatado(Tabula1(5,"Voc� tem certeza que quer usar uma potion?\n")+"\n" +Tabula3(4,GREEN + "[S]" + RESET,3 ," ou ",2, RED + "[N]\n" + RESET));

			opcao = Option().toUpperCase().charAt(0);

			switch (opcao) {
			case 'S':
				healthPoints = healthPoints + 10;
				qntPotions--;

				if (healthPoints > 100) {
					do {
						healthPoints--;
					} while (healthPoints != 100);
				}

				condicao = false;
				break;
			case 'N':

				condicao = false;
				break;

			default:
				System.out.print(RED + Tabula1(6, "Op��o n�o � v�lida!\n\n") + RESET);
			}

		} while (condicao);

		status[0] = healthPoints;
		status[1] = qntPotions;
		
		O_Jogo.status[0] = status[0] ;
		O_Jogo.status[1] =status[1] ;

		return status;
	}

	// PROCEDIMENTOS DE TEMPO PARA IMPRIMIR MENSAGENS
	static void Timer() {
		try {
			Thread.sleep(thread1);
		} catch (Exception e) {

		}
	}

	static void Timer2() {
		try {
			Thread.sleep(thread2);
		} catch (Exception e) {

		}
	}

	static void Timer3() {
		try {
			Thread.sleep(thread3);
		} catch (Exception e) {

		}
	}

	// FUN��O CRIADA PARA GERAR AS PERGUNTAS AO JOGADOR
	static int[] ProcessoAlternativas_Geral(String[] opcoes, int[] status, String respostaCerta, String enunciado) {
		// Area para declarar variaveis
		Scanner sc = new Scanner(System.in);
		String resposta;
		boolean condicao = true;

		

		////////////////////////////////////////////////////////////////////////
		// Area para processo de alternativas
		do {

			
			if (status[0] <= 0) {
				GameOver();
				condicao = false;
			}
			
			else {
				
				Desafio_Frase();
				frases++;
				
				System.out.printf(enunciado+"\n");
				Timer2();
				System.out.printf("[ A ] %S\n", opcoes[0]);
				Timer2();
				System.out.printf("[ B ] %S\n", opcoes[1]);
				Timer2();
				System.out.printf("[ C ] %S\n", opcoes[2]);
				Timer2();
				System.out.printf("[ D ] %S\n", opcoes[3]);
				Timer2();
				System.out.printf("[ E ] %S\n\n", opcoes[4]);
				Timer2();
				System.out.printf("[ P ] Caso queira utilizar uma potion.\n\nHP atual: "+GREEN+"%d"+RESET+"\t| Potions: "+RED+"%d\n"+RESET, status[0],status[1]);
				Timer2();
				System.out.println("Resposta certa: " + respostaCerta.toUpperCase());
				Timer2();
				resposta = Option().toUpperCase();

			switch (resposta.charAt(0)) {
			case 'A':
				if (opcoes[0].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;
			case 'B':
				if (opcoes[1].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;

			case 'C':
				if (opcoes[2].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;
			case 'D':
				if (opcoes[3].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				break;
			case 'E':
				if (opcoes[4].equals(respostaCerta)) {
					AcertouResposta(status[0]);
					condicao = false;
				} else {
					status[0] = DanoRespostaErrada(status[0]);
					if (status[0] <= 0) {
						GameOver();
						condicao = false;
					}
				}
				
				break;
			case 'P':
				
				if ( status[1] == 0 ) {
					
					System.out.print(RED + Tabula1(7, "Voc� n�o tem potions!\n\n") + RESET);
									
				}
				
				else{
					status = UsePotion(status[0], status[1]);
				}
				frases--;
					break;
				
			default:
				System.out.print(RED + Tabula1(6, "Op��o n�o � v�lida!\n\n") + RESET);
			}
			}
		} while (condicao);

		return status;
	}

		
// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-TEMPLOS-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

	// TEMPLO 3
	static int[] ExecutaTemplo3(int[] status) {
		Scanner sc = new Scanner(System.in);
		boolean condicao = true,condicao2 = true;
do {
		do {
			status = Desafio1_Templo3(status);
			
			if (status[0] > 0) {
										
						
				status[1]++;			

			} else {
				Texto_Formatado(Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" infelizmente foi derrotado!!");
				status[0] = 100;
				break;
			}	
		
		System.out.print("\nAperte ENTER para come�ar o pr�ximo Desafio");
		sc.nextLine();
		System.out.println(" ");

		
			status = Desafio2_Templo3(status);
			
			
			if (status[0] > 0) {
				
				
				status[1]++;			

			} else {
				Texto_Formatado(Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" infelizmente foi derrotado!!");
				status[0] = 100;
				break;
			}
		

		System.out.print("\nAperte ENTER para come�ar o �ltimo Desafio");
		sc.nextLine();
		System.out.println(" ");

	
			status = Desafio3_Templo3(status);
			
			if (status[0] > 0) {
				
				
				status[1]++;

				condicao = false;
				condicao2 = false;
				
			} else {
				
				Texto_Formatado(Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" infelizmente foi derrotado!!");
				status[0] = 100;
				break;
			
			}
		} while (condicao);
	}while (condicao2);

		Timer();
		Texto_Formatado(Dialogo("Narrador",WHITE) + "\n - "+nomeJogador+" concluiu o Templo das Convers�es. Agora estava o momento para o final");
		Timer2();
		FormataTexto1("Voc� est� preparado para o ");
		FormataTexto2("F I N A L ");
		FormataTexto2("B O S S ");
		FormataTexto2("? ? ?");
		System.out.println("\n");
		return status;
	}

	// DESAFIO � CONVERTER UM N�MERO QUE EST� EM UMA BASE PARA OUTRA
	static int[] Desafio1_Templo3(int[] status) {
		int baseInicial, baseConversao;
		String respostaCerta;

		String[] numeroInicial = new String[1];
		String[] opcoes = new String[5];
		ArrayList<String> respostaErrada = new ArrayList();

		////////////////////////////////////////////////////////////////////////
		// Area para preparar os numeros
		baseInicial = DeterminaBase_Templo3(); // Determinando a base standard

		do {
			baseConversao = DeterminaBase_Templo3(); // Determinando a base de conversao
		} while (baseConversao == baseInicial);

		numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); // Determinando o numero standard

		respostaCerta = DeterminaNumeroConv_Templo3(numeroInicial, baseInicial, baseConversao); // Determinando o numero
																								// de conversao (certo)

		respostaErrada.add(respostaCerta); // Adicionando a resposta certa nas opcoes

		for (int i = 0; i < 4; i++) {
			respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); // Adicionando opcoes erradas
		}

		Collections.shuffle(respostaErrada); // Embaralhando as opcoes para que haja uma aleatoriedade
		Collections.shuffle(respostaErrada);

		for (int i = 0; i < opcoes.length; i++) {
			opcoes[i] = respostaErrada.get(i); // Transferindo as opcoes do ArrayList para uma String[]
		}

		////////////////////////////////////////////////////////////////////////
		// Area de logica do game
		

		String enunciado = String.valueOf("\nConverta o numero "+numeroInicial[0]+" que esta na base "+baseInicial+" para a base "+baseConversao+"\n\n");
		
		//  System.out.printf("\nConverta o numero %S que esta na base %d para a base %d\n\n", numeroInicial[0],
		//	baseInicial, baseConversao);
		//  Timer2();

		status = ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

		return status;
	}

	// DESAFIO � SOMAR DOIS N�MEROS QUE EST�O EM UMA BASE E CONVERTER PARA OUTRO
	static int[] Desafio2_Templo3(int[] status) {
		// Area para inicializar variaveis
		int baseInicial, baseConversao;
		String respostaCerta;

		String[] numeroInicial = new String[2];
		String[] opcoes = new String[5];
		ArrayList<String> respostaErrada = new ArrayList();
		////////////////////////////////////////////////////////////////////////
		// Area para declarar os numeros

		baseInicial = DeterminaBase_Templo3(); // Gerar a base standard

		do {
			baseConversao = DeterminaBase_Templo3(); // Gerar a base para conversao
		} while (baseConversao == baseInicial);

		numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); // Gerar o numero standard A
		numeroInicial[1] = DeterminaNumero_Templo3(baseInicial); // Gerar o numero standard B

		respostaCerta = DeterminaNumeroConv_Templo3(numeroInicial, baseInicial, baseConversao); // Gerar a resposta
																								// certa

		respostaErrada.add(respostaCerta); // Adicionando a resposta certa no ArrayList

		for (int i = 0; i <= 3; i++) {
			respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); // Criando respostas erradas para o
																				// ArrayList
		}

		Collections.shuffle(respostaErrada); // Embaralhando as opcoes
		Collections.shuffle(respostaErrada);

		for (int i = 0; i < opcoes.length; i++) {
			opcoes[i] = respostaErrada.get(i); // Adicionando as opcoes embaralhadas numa String para fazer o desafio
		}

		
		String enunciado = String.valueOf("\nFa�a a seguinte convers�o:\n"+numeroInicial[0]+" + "+numeroInicial[1]+" (na base "+baseInicial +") = X (na base "+baseConversao+")\n\n" );
		
		//		System.out.printf("\nFa�a a seguinte convers�o:\n%S + %S (na base %d) = X (na base %d)\n\n", numeroInicial[0],
		//		numeroInicial[1], baseInicial, baseConversao);
		//		Timer2();

		ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

		return status;
	}

	// DESAFIO � MULTIPLICAR DOIS N�MEROS QUE EST�O EM UMA BASE E CONVERTER PARA OUTRO
	static int[] Desafio3_Templo3(int[] status) {
		// Area para declarar variaveis
		int baseInicial, baseConversao, aux;
		String respostaCerta;

		String[] numeroInicial = new String[2];
		String[] opcoes = new String[5];
		ArrayList<String> respostaErrada = new ArrayList();
		////////////////////////////////////////////////////////////////////////
		// Area para iniciar variaveis
		baseInicial = DeterminaBase_Templo3(); // Gerar a base inicial

		do {
			baseConversao = DeterminaBase_Templo3(); // Gerar a base para conversao
		} while (baseConversao == baseInicial);

		numeroInicial[0] = DeterminaNumero_Templo3(baseInicial); // Gerar numero standard A
		numeroInicial[1] = DeterminaNumero_Templo3(baseInicial); // Gerar numero standard B

		aux = (Integer.parseInt(numeroInicial[0], baseInicial)) * (Integer.parseInt(numeroInicial[1], baseInicial)); // Convertendo
																														// o
																														// produto
																														// dos
																														// numeros
																														// standard
																														// para
																														// int

		respostaCerta = Integer.toString(aux, baseConversao); // Convertendo o produto dos numeros standard para a base
																// de conversao

		respostaErrada.add(respostaCerta); // Adicionando a resposta certa nas opcoes

		for (int i = 0; i <= 3; i++) {
			respostaErrada.add(DeterminaOpcoes(baseConversao, respostaCerta)); // Adicionando as opcoes erradas
		}

		Collections.shuffle(respostaErrada); // Embaralhando as opcoes
		Collections.shuffle(respostaErrada);

		for (int i = 0; i < opcoes.length; i++) {
			opcoes[i] = respostaErrada.get(i);// Adicionando as opcoes em String para fazer o desafio
		}

		
		String enunciado = String.valueOf("\nFa�a a seguinte convers�o:\n"+numeroInicial[0]+" * "+numeroInicial[1]+" (na base "+baseInicial +") = X (na base "+baseConversao+")\n\n" );
		

		//			System.out.printf("\nFa�a a seguinte convers�o:\n%S * %S (na base %d) = X (na base %d)\n\n", numeroInicial[0],
		//			numeroInicial[1], baseInicial, baseConversao);
		//			Timer2();

		ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

		return status;
	}

	// FUN��ES DO TEMPLO 3
	static int DeterminaBase_Templo3() {

		ArrayList<Integer> bases = new ArrayList();

		bases.add(2);
		bases.add(8);
		bases.add(10);
		bases.add(16);

		Collections.shuffle(bases);
		Collections.shuffle(bases);

		return bases.get(0);
	}

	static String DeterminaNumero_Templo3(int baseInicial) {

		Random dado = new Random();
		int numRandom;
		String baseAconv = null;

		do {
			numRandom = dado.nextInt(2000);
		} while (numRandom <= 50);

		switch (baseInicial) {
		case 2:
			baseAconv = Integer.toBinaryString(numRandom);
			break;
		case 8:
			baseAconv = Integer.toOctalString(numRandom);
			break;
		case 10:
			baseAconv = Integer.toString(numRandom);
			break;
		case 16:
			baseAconv = Integer.toHexString(numRandom);
			break;
		}

		return baseAconv;
	}

	static String DeterminaOpcoes(int baseConversao, String respostaCerta) {
		Random dado = new Random();
		int aux = Integer.parseInt(respostaCerta, baseConversao);
		String opcoesFalsas;

		do {
			aux = aux + dado.nextInt(30);
			aux = aux - 15;
			opcoesFalsas = Integer.toString(aux, baseConversao);
		} while (opcoesFalsas.equals(respostaCerta));

		return opcoesFalsas;
	}

	static String DeterminaNumeroConv_Templo3(String[] numeroInicial, int baseInicial, int baseConversao) {
		int aux = 0;
		String respostaConversao;

		for (int i = 0; i < numeroInicial.length; i++) {
			aux = aux + Integer.parseInt(numeroInicial[i], baseInicial);
		}

		respostaConversao = Integer.toString(aux, baseConversao);

		return respostaConversao;
	}

	// TEMPLO 2
	static void ExecutaTemplo2(){
	
	
		Scanner sc = new Scanner(System.in);
		boolean condicao = true, condicao2 = true;

		do {

			do {

				Desafio1_Templo2();

				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!!");
					status[0] = 100;
					break;
				}

				System.out.print("\nAperte ENTER para come�ar o pr�ximo Desafio");
				sc.nextLine();
				System.out.println(" ");

				Desafio2_Templo2();

				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!!");
					status[0] = 100;
					break;
				}

				System.out.print("\nAperte ENTER para come�ar o pr�ximo Desafio");
				sc.nextLine();
				System.out.println(" ");

				Desafio3_Templo2();

				if (status[0] > 0) {

					status[1]++;
					condicao = false;
					condicao2 = false;

				} else {
					Texto_Formatado(Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!!");
					status[0] = 100;
					break;
				}
			} while (condicao);
		} while (condicao2);
	
}
	
	// FUN��ES DO TEMPLO 2
	static void Desafio1_Templo2() {
		//vari�veis
		int r;
		Random rng = new Random();
		String enunciado;
		String[] opcoes = new String[5];
				
		//Quest�o
				
		//RANDOMIZANDO A QUEST�O E REPETINDO AT� O ACERTO OU VIDA = 0
		
		
			r = rng.nextInt(3);
		switch(r) {
		//RECEBENDO A QUEST�O RANDOMIZADA E RESOLVENDO A QUEST�O.
			case 0:
				
				enunciado = "\nQuais s�o os coefici�ntes dessa equa��o de segundo grau. 2x� + x � 3 = 0\n";
				
						
				
				opcoes[0] = "a = -2  |  b = 0  |  c = -3";
				opcoes[1] = "a =  2  |  b = 1  |  c =  3";
				opcoes[2] = "a =  2  |  b = 1  |  c = -3";
				opcoes[3] = "a =  2  |  b = 0  |  c = -3";
				opcoes[4] = "a =  1  |  b = 0  |  c = -3";
				
				ProcessoAlternativas_Geral(opcoes,status,"a =  2  |  b = 1  |  c = -3",enunciado);
				
				break;
				
			case 1:
				
				enunciado = "\nQuais s�o os coefici�ntes dessa equa��o de segundo grau. �3x� + 18x � 15 = 0\n";
				
				
				
				
				opcoes[0] = "a = -3  |  b = -18  |  c = -15";
				opcoes[1] = "a =  3  |  b =  18  |  c = -15";
				opcoes[2] = "a = -3  |  b =  18  |  c =  15";
				opcoes[3] = "a = -3  |  b =  18  |  c = -15";
				opcoes[4] = "a =  3  |  b =  18  |  c =   0";
				
				
				
				ProcessoAlternativas_Geral(opcoes,status,"a = -3  |  b =  18  |  c = -15",enunciado);
				
				
				break;
				
			case 2:
				
				enunciado = "\nQuais s�o os coefici�ntes dessa equa��o de segundo grau. 3x� � x � 1 = 0\n";
			
				
				
				opcoes[0] = "a = -3  |  b =  -1  |  c = -1";
				opcoes[1] = "a =  3  |  b =  -1  |  c = -1";
				opcoes[2] = "a = -3  |  b =   0  |  c =  1";
				opcoes[3] = "a =  3  |  b =  -1  |  c =  1";
				opcoes[4] = "a =  1  |  b =   0  |  c = -3";
				
				ProcessoAlternativas_Geral(opcoes,status,"a =  3  |  b =  -1  |  c = -1",enunciado);
				
				break;
		}
		
	
		}
	
	static void Desafio2_Templo2() {
		//vari�veis
		int r;
		Random rng = new Random();
		String enunciado;
		String[] opcoes = new String[5];
		
		//Enunciado
		
		//Randomizando a quest�o
		
		
		//RECEBENDO A QUEST�O RANDOMIZADA E RESOLVENDO A QUEST�O.
	
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			
			enunciado = "\nQual � a maior raiz da equa��o -2x� + 3x + 5 = 0?\n";
			
			
			opcoes[0] = "-1";
			opcoes[1] = "-2,5";
			opcoes[2] = "2";
			opcoes[3] = "2,5";
			opcoes[4] = "1";
			
			ProcessoAlternativas_Geral(opcoes,status,"2,5",enunciado);
			
			
		
			break;
		case 1:
			
			enunciado = "\nQual � a menor raiz da equa��o 2x� + 7x + 5 = 0\n";
			
			
			opcoes[0] = "-1";
			opcoes[1] = "1";
			opcoes[2] = "-5/2";
			opcoes[3] = "-2";
			opcoes[4] = "-2/5";
			
			ProcessoAlternativas_Geral(opcoes,status,"-5/2",enunciado);
			
			break;
			
		case 2:
			
			enunciado = "\nQuais s�o as duas ra�zes da equa��o 3x� � x � 2 = 0\n";
			
			
			opcoes[0] = "x1 =  2/3 | x2 =  1";
			opcoes[1] = "x1 = -2/3 | x2 = -1";
			opcoes[2] = "x1 = -2/3 | x2 =  1";
			opcoes[3] = "x1 =  -1  | x2 = 2/3";
			opcoes[4] = "x1 =  -1  | x2 = -2/3";
			
			ProcessoAlternativas_Geral(opcoes,status,"x1 = -2/3 | x2 =  1",enunciado);
			
			break;
			
		}
			
	
	}
	
	static void Desafio3_Templo2() {
		//Variaveis
		int r;
		Random rng = new Random();
		String enunciado;
		String[] opcoes = new String[5];
		
		//Enunciado
		
			r = rng.nextInt(3);
		switch(r) {
		case 0:
			
			enunciado = "\nQual � a resolu��o da seguinte equa��o do segundo grau x� � 4x � 5 = 0?\n";
			
			
			opcoes[0] = "x1 =  1  | x2 =  5";
			opcoes[1] = "x1 = -1  | x2 =  5";
			opcoes[2] = "x1 = -1  | x2 = -5";
			opcoes[3] = "x1 = -5  | x2 =  1";
			opcoes[4] = "x1 = -3  | x2 =  5";
			
			ProcessoAlternativas_Geral(opcoes,status,"x1 = -1  | x2 =  5",enunciado);
			
			
			break;
		case 1:
			
			enunciado = "\nTemos na equa��o 10x� � 1000 = 0, duas ra�zes reais e distintas, a e b, que podem ser encontradas. Determine a� + b�\n";
			
			
			opcoes[0] = "100";
			opcoes[1] = "50";
			opcoes[2] = "250";
			opcoes[3] = "200";
			opcoes[4] = "1000";
			
			ProcessoAlternativas_Geral(opcoes,status,"200",enunciado);
				
			break;
		case 2:
			
			enunciado = "\nQual ser� o resultado do produto das duas ra�zes da equa��o 5x� - 125 = 0\n";
			
			
			opcoes[0] = "-25";
			opcoes[1] = "20";
			opcoes[2] = "25";
			opcoes[3] = "30";
			opcoes[4] = "125";
			
			ProcessoAlternativas_Geral(opcoes,status,"-25",enunciado);
			
			
			break;
			
		}
	
		
		
	}
	
	// TEMPLO 1
	static int[] ExecutaTemplo1(int[] status) {
		Scanner sc = new Scanner(System.in);
		boolean condicao = true, condicao2 = true;

		do {
			do {
				status = Desafio1_Templo1(status);
				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(
							Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!!");
					status[0] = 100;
					break;
				}
				System.out.print("\nAperte ENTER para come�ar o pr�ximo Desafio");
				sc.nextLine();
				System.out.println(" ");

				status = Desafio2_Templo1(status);

				if (status[0] > 0) {

					status[1]++;

				} else {
					Texto_Formatado(
							Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!!");
					status[0] = 100;
					break;
				}

				System.out.print("\nAperte ENTER para come�ar o �ltimo Desafio");
				sc.nextLine();
				System.out.println(" ");

				status = Desafio3_Templo1(status);
				if (status[0] > 0) {

					status[1]++;

					condicao = false;
					condicao2 = false;

				} else {

					Texto_Formatado(
							Dialogo("Narrador", WHITE) + "\n - " + nomeJogador + " infelizmente foi derrotado!!");
					status[0] = 100;
					break;

				}
			} while (condicao);
		} while (condicao2);
		return status;
	}

    static int[] Desafio1_Templo1(int[] status) {
        //Area para declarar variaveis
        int[] numeroInicial = new int[2];
        String[] opcoes = new String[5];
        String[] testeRespostaErrada = new String[4];
        ArrayList<String> respostaErrada = new ArrayList();

        String respostaCerta;

        //Area para processos
        numeroInicial = DeterminaNumeroInicial_Templo1(); //Determinando o numero A[0] e numero B[1]

        respostaCerta = Integer.toString(-numeroInicial[1] / numeroInicial[0]); //Determinando a resposta certa

        respostaErrada.add(respostaCerta); //Adicinando a resposta certa nas opcoes

        testeRespostaErrada = DeterminaOpcoesErradas_Templo1Teste(respostaCerta);

        for (int i = 0; i < 4; i++) {
            respostaErrada.add(testeRespostaErrada[i]);
            //respostaErrada.add(DeterminaOpcoesErradas_Templo1(numeroInicial, respostaCerta)); //Gerando respostas erradas para o desafio
        }

        Collections.shuffle(respostaErrada); //Deixando de forma aleatoria as opcoes
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i); // Adicionando as opcoes em String para fazer o desafio
        }

        String enunciado = "";
       
        if (numeroInicial[1] > 0) {
           // System.out.printf("Fa�a a seguinte conta:\n\n%dx + %d = 0\n\n", numeroInicial[0], numeroInicial[1]);
            enunciado = String.valueOf("\nFa�a a seguinte conta:\n\n"+numeroInicial[0]+"x + "+numeroInicial[1]+" = 0\n\n");
        } else 
        {
            System.out.printf("Fa�a a seguinte conta:\n\n%dx + (%d) = 0\n\n", numeroInicial[0], numeroInicial[1]);
            enunciado = String.valueOf("\nFa�a a seguinte conta:\n\n"+numeroInicial[0]+"x + ("+numeroInicial[1]+") = 0\n\n");
        }
        
        
        
        status = ProcessoAlternativas_Geral(opcoes, status, respostaCerta,enunciado);

        return status;
    }

    static int[] Desafio2_Templo1(int[] status) {
        //Area para declarar variaveis
        int[] numeroCima = new int[4];
        int[] numeroBaixo = new int[2];
        String[] testeRespostaErrada = new String[4];
        String[] opcoes = new String[5];
        ArrayList<String> respostaErrada = new ArrayList();
        int help1, help2, help3, help4;
        int mmc = 0, aux1 = 0, aux2 = 0, respostaCerta = 0;
        String respostaCertaStr;
        boolean condicao = true;

        //Area para processos
        //Determinar os numeros (ax + b) / y = (cx + d) / z
        do {
            try {
                do {
                    do {
                        numeroCima = DeterminaNumeroCima_Templo1(); // Determinar os numeros de cima
                        numeroBaixo = DeterminaNumBaixo_Templo1(); // Determinar os divisores

                        mmc = DeterminaMMC_Templo1(numeroBaixo[0], numeroBaixo[1]); // Determinar o MMC dos divisores

                        help1 = (numeroCima[0] * mmc) / numeroBaixo[0]; // Fazer o processo de MMC com cada numero
                        help2 = (numeroCima[1] * mmc) / numeroBaixo[0];
                        help3 = (numeroCima[2] * mmc) / numeroBaixo[1];
                        help4 = (numeroCima[3] * mmc) / numeroBaixo[1];

                        aux1 = help1 - help3; // Isolando os numeros
                        aux2 = help4 - help2;

                        respostaCerta = aux2 / aux1; // Obtendo a resposta
                    } while (aux1 == 0);
                } while (aux2 % aux1 != 0);
                if (respostaCerta != 0) {
                    condicao = false;
                }
            } catch (Exception e) {
            }
        } while (condicao);

        //////////////////////////////////
        //Fazer a parte das opcoes
        respostaCertaStr = Integer.toString(respostaCerta);

        testeRespostaErrada = DeterminaOpcoesErradas_Templo1Teste(respostaCertaStr);

        respostaErrada.add(respostaCertaStr);
        for (int i = 0; i < 4; i++) {
            respostaErrada.add(testeRespostaErrada[i]);
        }

        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);

        for (int i = 0; i < opcoes.length; i++) {
            opcoes[i] = respostaErrada.get(i);
        }

        //////////////////////////////////
        // Enunciado
        
        String enunciado = String.valueOf("\nFaca a seguinte conta: \n"+numeroCima[0]+"x + "+numeroCima[1]+"  =  "+numeroCima[2]+"x + "+numeroCima[3]+"\n----------    ----------\n    "+numeroBaixo[0]+"            "+numeroBaixo[1]+"\n\n");  		
       
        // System.out.println("***\tWELCOME TO THE 2ND GAME\t***\n");
       // Timer2();
       // System.out.println("Faca a seguinte conta: \n");
       // Timer2();
       // System.out.printf("%dx + %d  =  %dx + %d\n----------    ----------\n    %d            %d\n\n", numeroCima[0], numeroCima[1], numeroCima[2], numeroCima[3], numeroBaixo[0], numeroBaixo[1]);
       // Timer2();

        status = ProcessoAlternativas_Geral(opcoes, status, respostaCertaStr,enunciado);

        return status;
    }

    static int[] Desafio3_Templo1(int[] status) {
        int[] numMultiplicador = new int[4];
        int[] numDivisor = new int[4];
        int[] numAcompanha = new int[4];
        int[] numSoma = new int[4];

        int[] aux = new int[16];

        int mmc;
        boolean condicao = true;

        ArrayList<String> respostaErrada = new ArrayList();

        String[] respostaErradaTeste = new String[4];
        String[] opcoes = new String[5];
        String respostaCertaStr;
        ////////////////////////////////////////////////////////////////////////
        //Fazendo a resolucao do problema
        //Parte feita para evitar que os numeros sejam divididos por zero e tambem para que o resultado seja != 0 e maior que 1
        do {
            try {
                do {
                    do {
                        numMultiplicador = DeterminaNumeroDesafio3_Templo1(1);
                        numAcompanha = DeterminaNumeroDesafio3_Templo1(2);
                        numSoma = DeterminaNumeroDesafio3_Templo1(3);
                        numDivisor = DeterminaNumeroDesafio3_Templo1(4);

                        mmc = DeterminaMMC_Desafio3_Templo1(numDivisor);

                        aux[0] = ((numMultiplicador[0] * numAcompanha[0]) * mmc) / numDivisor[0]; // numero com X
                        aux[1] = ((numMultiplicador[0] * numSoma[0]) * mmc) / numDivisor[0]; // numero sem X - passa para o outro lado

                        aux[2] = ((numMultiplicador[1] * numAcompanha[1]) * mmc) / numDivisor[1]; // numero com X
                        aux[3] = ((numMultiplicador[1] * numSoma[1]) * mmc) / numDivisor[1]; // numero sem X - passa para o outro lado

                        aux[4] = ((numMultiplicador[2] * numAcompanha[2]) * mmc) / numDivisor[2]; // numero com X - passa para o outro lado 
                        aux[5] = ((numMultiplicador[2] * numSoma[2]) * mmc) / numDivisor[2]; // numero sem X

                        aux[6] = aux[0] + aux[2] - aux[4]; // numero com X
                        aux[7] = aux[5] - (aux[1] + aux[3]); // numero sem X

                    } while (aux[7] % aux[6] != 0);

                    aux[8] = aux[7] / aux[6]; // respostaCerta

                } while (aux[8] <= 1);

                condicao = false;
            } catch (Exception e) {
            }
        } while (condicao);

        ////////////////////////////////////////////////////////////////////////
        //Definir a resposta certa e as opcoes para o desafio
        respostaCertaStr = Integer.toString(aux[8]);

        respostaErradaTeste = DeterminaOpcoesErradas_Templo1Teste(respostaCertaStr);

        for (int i = 0; i < 4; i++) {
            respostaErrada.add(respostaErradaTeste[i]);
        }
        
        respostaErrada.add(respostaCertaStr);
        
        Collections.shuffle(respostaErrada);
        Collections.shuffle(respostaErrada);
        
        for (int i = 0; i < 5; i++) {
            opcoes[i] = respostaErrada.get(i);
        }
       
        String enunciado = String.valueOf("\nResolva a seguinte fun��o: \n"+numMultiplicador[0]+" ("+numAcompanha[0]+"x + "+numSoma[0]+")\t + \t"+numMultiplicador[1]
        		+" ("+numAcompanha[1]+"x + "+ numSoma[1]+")\t = \t"+numMultiplicador[2]+" ("+numAcompanha[2]+"x + "+ numSoma[2]+")\n-------------\t\t-------------\t\t-------------\n"
        	+"\t"+numDivisor[0]+"\t\t      "+numDivisor[1]+"\t\t      "+numDivisor[2]+"     \n\n");
        		
       // System.out.printf("Resolva a seguinte fun��o: \n"
       //        + "%d (%dx + %d)\t + \t%d (%dx + %d)\t = \t%d (%dx + %d)\n"
       //         + "-------------\t\t-------------\t\t-------------\n"
       //        + "\t%d\t\t      %d\t\t      %d     \n ", numMultiplicador[0], numAcompanha[0], numSoma[0], numMultiplicador[1], numAcompanha[1], numSoma[1], numMultiplicador[2], numAcompanha[2], numSoma[2], numDivisor[0], numDivisor[1], numDivisor[2]);
        
       //  System.out.println("\n");
        
        status = ProcessoAlternativas_Geral(opcoes, status, respostaCertaStr,enunciado);
        
        return status;
    }

    // FUN��ES DO TEMPLO 1
    static int[] DeterminaNumeroCima_Templo1() {
        int[] num = new int[4];
        int determinaSinal;

        Random dado = new Random();

        ////////////////////////////////////////////////////////////////////////
        for (int i = 0; i < 4; i++) {
            determinaSinal = dado.nextInt(2);

            switch (determinaSinal) {
                case 0:
                    do {
                        num[i] = dado.nextInt(150);
                    } while (Math.abs(num[i]) < 20);
                    break;
                case 1:
                    do {
                        num[i] = dado.nextInt(150) * -1;
                    } while (Math.abs(num[i]) < 20);
                    break;
            }
        }

        return num;
    }

    static int[] DeterminaNumBaixo_Templo1() {
        int[] num = new int[2];

        Random dado = new Random();

        for (int i = 0; i < 2; i++) {
            do {
                num[i] = dado.nextInt(15);
            } while (num[i] <= 1);
        }

        return num;
    }

    static int DeterminaMMC_Templo1(int a, int b) {
        int mmc;

        mmc = Math.max(a, b);

        while (mmc % Math.min(a, b) != 0) {
            mmc = mmc + Math.max(a, b);
        }

        return mmc;
    }

    static int[] DeterminaNumeroInicial_Templo1() {
        //Area para declarar variaveis
        Random dado = new Random();

        double[] numeroInicial = new double[2];
        int[] numeroConv = new int[2];

        int determinaSinal;

        //Area para fazer processos
        do {
            do {
                numeroInicial[0] = dado.nextInt(1000);
                numeroInicial[1] = dado.nextInt(10000);
            } while (numeroInicial[1] % numeroInicial[0] != 0);
        } while (numeroInicial[0] < 10);

        for (int i = 0; i < numeroInicial.length; i++) {
            determinaSinal = dado.nextInt(2);

            switch (determinaSinal) {
                case 0:
                    numeroConv[i] = (int) numeroInicial[i];
                    break;
                case 1:
                    numeroConv[i] = (int) numeroInicial[i] * -1;
                    break;
            }

        }

        return numeroConv;
    }

    static int[] DeterminaNumeroInicial_Desafio2_Templo1() {
        //Area para declarar valores
        double[] numeroInicial = new double[3];
        int[] numeroFinal = new int[3];

        Random dado = new Random();

        int aux;

        //Area para processos
        numeroInicial[0] = dado.nextInt(500);
        numeroInicial[1] = dado.nextInt(600);
        numeroInicial[2] = dado.nextInt(300);

        return numeroFinal;
    }

    static String[] DeterminaOpcoesErradas_Templo1Teste(String respostaCerta) {
        String[] respostaErrada = new String[4];
        int[] respostaErradaNum = new int[4];
        int aux1;

        Random dado = new Random();
        ////////////////////////////////////////////////////////////////////////

        aux1 = Integer.parseInt(respostaCerta);

        //Gerando opcoes erradas
        for (int i = 0; i < 4; i++) {
            do {
                respostaErradaNum[i] = aux1 + dado.nextInt(15) - 4;
            } while (respostaErradaNum[i] == aux1);
        }

        try {
            //Checando para ver se nao tem opcao repetida
            for (int i = 0; i < respostaErradaNum.length; i++) {
                for (int j = 0; j < respostaErradaNum.length - 1; j++) {
                    if (respostaErradaNum[j] == respostaErradaNum[j + 1]) {
                        do {
                            //System.out.println("PASSEI AQUI\n");
                            respostaErradaNum[j] = respostaErradaNum[j] + dado.nextInt(3);
                        } while (respostaErradaNum[j] == aux1);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Deu ruim");
        }

        for (int i = 0; i < respostaErradaNum.length; i++) {
            respostaErrada[i] = Integer.toString(respostaErradaNum[i]);
        }

        return respostaErrada;
    }

    static int DeterminaMMC_Desafio3_Templo1(int[] numDivisor) {
        int mmc, aux;
        boolean condicao = true;

        for (int i = 0; i < numDivisor.length; i++) {
            for (int y = 0; y < numDivisor.length - 1; y++) {
                if (numDivisor[y] < numDivisor[y + 1]) {
                    aux = numDivisor[y];
                    numDivisor[y] = numDivisor[y + 1];
                    numDivisor[y + 1] = aux;
                }
            }
        }

        mmc = numDivisor[0];

        while (condicao) {
            mmc = mmc + numDivisor[0];

            if (mmc % numDivisor[0] == 0) {
                if (mmc % numDivisor[1] == 0) {
                    if (mmc % numDivisor[2] == 0) {
                        condicao = false;
                    }
                }
            }
        }

        return mmc;
    }

    static int[] DeterminaNumeroDesafio3_Templo1(int indice) {
        int[] num = new int[4];
        int determinaSinal;
        Random dado = new Random();

        switch (indice) {
            case 1: // Decidir o multiplicador
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(20);
                    } while (num[i] <= 2);
                }
                break;
            case 2: // indicar o numero que acompanha X
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(50);
                    } while (num[i] <= 1);
                }
                break;
            case 3: // Indicar o numero que faz a soma dentro do parenteses
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(75);
                    } while (num[i] <= 1);
                }
                break;
            case 4: // Indicar o numero que divide a conta
                for (int i = 0; i < num.length; i++) {
                    do {
                        num[i] = dado.nextInt(15);
                    } while (num[i] <= 2);
                }
                break;
        }

        ////////////////////////////////////////
        for (int i = 0; i < num.length; i++) {
            determinaSinal = dado.nextInt(2);

            if (determinaSinal == 1) {
                num[i] = num[i] * -1;
            }
        }

        return num;
    }


}