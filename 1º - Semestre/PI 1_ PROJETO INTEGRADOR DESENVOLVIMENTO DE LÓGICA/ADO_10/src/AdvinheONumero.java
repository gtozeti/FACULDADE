import java.util.Random;
import java.util.Scanner;

public class AdvinheONumero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random valorRandom = new Random();
		int resposta, num, tentativa = 0;

		num = valorRandom.nextInt(100) + 1;

		do {

			System.out.print("Qual o n�mero entre 1 e 100, que o computador sorteou? ");
			resposta = entrada.nextInt();

			if (resposta == num) {
				System.out.println("Parab�ns, voc� ganhou o jogo!\n");
				break;
			} else if (Math.abs(num - resposta) == 1) {
				System.out.println("T� QUENTE!\n");
				tentativa++;
			} else if (resposta > num) {
				System.out.println("O valor sorteado � menor!\n");
				tentativa++;
			} else {
				System.out.println("O valor sorteado � maior!\n");
				tentativa++;
			}

		} while (tentativa < 5);

		if (tentativa == 5) {
			System.out.println("Game Over! O n�mero sorteado foi: " + num + " \n");
		}

	}

}
