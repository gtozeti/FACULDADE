import java.util.Random;
import java.util.Scanner;

public class AdvinheONumero {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Random valorRandom = new Random();
		int resposta, num, tentativa = 0;

		num = valorRandom.nextInt(100) + 1;

		do {

			System.out.print("Qual o número entre 1 e 100, que o computador sorteou? ");
			resposta = entrada.nextInt();

			if (resposta == num) {
				System.out.println("Parabéns, você ganhou o jogo!\n");
				break;
			} else if (Math.abs(num - resposta) == 1) {
				System.out.println("TÁ QUENTE!\n");
				tentativa++;
			} else if (resposta > num) {
				System.out.println("O valor sorteado é menor!\n");
				tentativa++;
			} else {
				System.out.println("O valor sorteado é maior!\n");
				tentativa++;
			}

		} while (tentativa < 5);

		if (tentativa == 5) {
			System.out.println("Game Over! O número sorteado foi: " + num + " \n");
		}

	}

}
