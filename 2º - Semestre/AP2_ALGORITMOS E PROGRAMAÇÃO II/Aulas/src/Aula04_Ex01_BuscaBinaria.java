import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aula04_Ex01_BuscaBinaria {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int pos;

		int[] v = new int[10];
		popVet(v);
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		System.out.print("Digite o número a pesquisar no vetor: ");
		
		int p = buscaBinaria(v, pos = entrada.nextInt());
		if (p >= 0) {
			System.out.println("Valor encontrado na posição: " + p);
		} else {
			System.out.println("Valor não encontrado.");
		}
	}

	static void popVet(int[] m) {

		Random valorRandom = new Random();

		for (int i = 0; i < m.length; i++) {

			m[i] = valorRandom.nextInt(1000);

		}

	}

	public static int buscaBinaria(int[] v, int x) {
		int i = 0;
		int f = v.length - 1;
		int m;
		while (i <= f) {
			m = (i + f) / 2;
			if (x == v[m])
				return m;
			if (x < v[m])
				f = m - 1;
			else
				i = m + 1;
		}
		return -1;
	}
}