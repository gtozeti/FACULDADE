//Escreva um programa que imprima todos os m�ltiplos de 7 menores que 200. Use o la�o WHILE.

public class Lista02_Ex7 {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 200) {

			if (i % 7 == 0) {
				System.out.println(i);
			}
			i++;

		}

	}
}