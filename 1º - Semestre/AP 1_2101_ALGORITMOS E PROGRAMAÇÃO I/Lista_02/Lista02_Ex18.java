//A seguinte sequ�ncia de n�meros 0, 1, 1, 2, 3, 5, 8, 13, 21... � conhecida como s�rie de Fibonacci. Nessa
//sequ�ncia, cada n�mero, depois dos 2 primeiros, � igual � soma dos 2 anteriores. Escreva um algoritmo que
//leia um inteiro N (onde N < 46) e mostre os N primeiros n�meros dessa s�rie. Utilize o la�o que lhe for mais
//conveniente.

import java.util.Scanner;

public class Lista02_Ex18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor para N: ");
		int n = entrada.nextInt();

		int aux1 = 0, aux2 = 1, aux3 = 0;

		for (int i = 0; i < n; i++) {

			System.out.print(aux1 + " "); 	
			aux3 = aux1 + aux2;				
			aux1 = aux2;					
			aux2 = aux3;					

		}

	}
}