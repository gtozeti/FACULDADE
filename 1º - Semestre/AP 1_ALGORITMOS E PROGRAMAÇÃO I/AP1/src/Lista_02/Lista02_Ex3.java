//Escreva um programa que leia um conjunto de 10 n�meros inteiros positivos. Seu programa deve determinar
//e imprimir o maior deles. Use o la�o FOR.

import java.util.Scanner;

public class Lista02_Ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int i = 1, soma = 0;
		
		for(int j =0;j<10;j++) {
			System.out.print("Digite um valor inteiro: ");
			int n = entrada.nextInt();
			
			if(n > soma) {
				soma = n;
			}
		}
		
		System.out.println("O maior n�mero digitado foi: " + soma);
	}

}
