import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String opcao;
		boolean cond;
		cond = true;
			

		do {

			System.out.print("\tMenu\n");
			System.out.println("\n1 - Intruções\t2 - Jogar");
			System.out.println("3 - Créditos\t4 - Sair\n");
			opcao = entrada.next();

			switch (opcao) {

			case "1":
				System.out.println("\nEscolha as respostas certas para cada pergunta, para chegar ao final da missão!!!\n");
				break;

			case "2":

				System.out.print("\n\t\t\t\tJOGO EM DESENVOLVIMENTO!!!\n\n");
				break;

			case "3":
				System.out.print("\tDesenvolvedores!\n");
				System.out.println("\nDev 1\nDev 2\nDev 3\nDev 4\n");
				break;
			
			case "4":
			
				cond = false;
				break;

			}

		} while (cond);

	}

}
