import java.util.Scanner;

public class QuestaoMultiplaescolha {

	public static void main(String[] args) {

		String letra;
		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Dado o seguinte valor em binário 1111001100110010. Qual alternativa corresponde a esse número em hexadecimal?");
		System.out.println("\n(a) E372\n(b) F372\n(c) F332\n(d) E362\n(e) E3E2");
		System.out.print("\nR: ");
		letra = entrada.next();

		switch (letra) {

		case "a":
		case "A":

			System.out.println("\nResposta incorreta");
			break;

		case "b":
		case "B":

			System.out.println("\nResposta incorreta");
			break;

		case "c":
		case "C":

			System.out.println("\nResposta correta");
			break;

		case "d":
		case "D":

			System.out.println("\nResposta incorreta");
			break;

		case "e":
		case "E":

			System.out.println("\nResposta incorreta");
			break;

		default:

			System.out.println("\nOpção não é válida!");
		}

	}

}
