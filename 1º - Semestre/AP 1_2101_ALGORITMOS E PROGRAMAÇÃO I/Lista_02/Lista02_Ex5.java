//Fa�a um programa para imprimir os n�meros pares entre 100 e 1, em ordem decrescente, ou seja, o la�o
//deve iniciar em 100 e encerrar em 1. Use o la�o FOR.

public class Lista02_Ex5 {

	public static void main(String[] args) {

		for (int i = 100; i > 0; i--) {
			if (i % 2 == 0) {

				System.out.println(i);
			}
		}
	}

}