import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {

		int dia;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um valor de 1 � 7: ");
		dia = entrada.nextInt();

		switch (dia) {
		case 1:

			System.out.print("\nO dia da semana correspondente ao n�mero " + dia + " � Domingo.");
			break;

		case 2:

			System.out.print("\nO dia da semana correspondente ao n�mero " + dia + " � Segunda-Feira.");
			break;

		case 3:

			System.out.print("\nO dia da semana correspondente ao n�mero " + dia + " � Ter�a-Feira.");
			break;

		case 4:

			System.out.print("\nO dia da semana correspondente ao n�mero " + dia + " � Quarta-Feira.");
			break;

		case 5:

			System.out.print("\nO dia da semana correspondente ao n�mero " + dia + " � Quinta-Feira.");
			break;

		case 6:

			System.out.print("\nO dia da semana correspondente ao n�mero " + dia + " � Sexta-Feira.");
			break;

		case 7:

			System.out.print("\nO dia da semana correspondente ao n�mero " + dia + " � S�bado.");
			break;

		default:
			System.out.println("\nValor inv�lido!");
		}

	}

}
