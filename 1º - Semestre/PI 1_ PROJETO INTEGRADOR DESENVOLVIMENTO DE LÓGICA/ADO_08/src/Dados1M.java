import java.util.Random;

public class Dados1M {

	public static void main(String[] args) {

		Random dado = new Random();
		float l1 = 0, l2 = 0, l3 = 0, l4 = 0, l5 = 0, l6 = 0;
		int cond = 1000000;

		for (int i = 0; i < cond; i++) {

			int faceDado = dado.nextInt(6) + 1;

			switch (faceDado) {

			case 1:
				l1++;
				break;
			case 2:
				l2++;
				break;
			case 3:
				l3++;
				break;
			case 4:
				l4++;
				break;
			case 5:
				l5++;
				break;
			case 6:
				l6++;
				break;

			}
		}

		System.out.printf(
				"\nO número 1, apareceu: %.2f %%\nO número 2, apareceu: %.2f %%\nO número 3, apareceu: %.2f %%\n"
						+ "O número 4, apareceu: %.2f %%\nO número 5, apareceu: %.2f %%\nO número 6, apareceu: %.2f %%\n",
				((l1 * 100) / cond), ((l2 * 100) / cond), ((l3 * 100) / cond), ((l4 * 100) / cond), ((l5 * 100) / cond),
				((l6 * 100) / cond));

	}

}
