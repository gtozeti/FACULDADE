import java.util.Scanner;

public class TresTentativas {

	public static void main(String[] args) {

		String letra;
		Scanner entrada = new Scanner(System.in);
		boolean cond = true;
		int tentativas = 0;

		do {

			System.out.println("Dado o seguinte valor em binário 1111001100110010. Qual alternativa corresponde a esse número em hexadecimal?");
			System.out.println("\n(a) E372\n(b) F372\n(c) F332\n(d) E362\n(e) E3E2");
			System.out.print("\nR: ");
			letra = entrada.next();

			switch (letra) {

			case "a":
			case "A":
			case "b":
			case "B":
			case "d":
			case "D":
			case "e":
			case "E":

		
				if (tentativas == 2) {
					System.out.println("\nResposta incorreta nas 3 tentativas.\n");
				} else {
					System.out.println("\nResposta incorreta. Você tem mais " + (2 - tentativas) + " tentativa(s).\n");
				}
				tentativas += 1;
				break;

			
			case "c": //RESPOSTA CORRETA
			case "C": //RESPOSTA CORRETA

				System.out.println("\nResposta correta na " + (tentativas + 1) + "ª tentativa.");
				cond = false;
				break;

			default:

				System.out.println("\nOpção não é válida!\n");
			}

		} while (cond && (tentativas < 3));
	}
}
