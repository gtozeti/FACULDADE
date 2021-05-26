/*Fazer uma função que tem como parâmetros de entrada três números reais a, b, c e fornece como saída a
maior raiz da equação do 2o grau*/

import java.util.Scanner;

public class Lista03_Ex5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float a,b,c;
		double raiz;

		System.out.print("Digite o valor de a: ");
		a = entrada.nextFloat();
		System.out.print("Digite o valor de b: ");
		b = entrada.nextFloat();
		System.out.print("Digite o valor de c: ");
		c = entrada.nextFloat();
		
		raiz = equacao(a,b,c);
		
		if (raiz == -1) {
			
			System.out.println("\nA equação não possui raízes reais!");
		}
		else {
			System.out.printf("\nA maior raiz da equação é: %.2f", raiz);
		}


	}

	static double equacao(float a, float b, float c) {

		double delta = (Math.pow(b, 2) - 4 * a * c);
		double raizDelta = Math.sqrt(delta);
		double x,x2;
		
		if (delta == 0) {
						
			x = ((-b + raizDelta) / (2 * a));
			return x;
			
		}
		else if (delta < 0) {
			
			x = -1;
			return x;
		}
		else {
			
					
			x = ((-b + raizDelta) / (2 * a));
			x2 = ((-b - raizDelta) / (2 * a));
			
			if (x > x2) {
				return x;
			}
			else {
				return x2;
			}
			
			
		}

	}

	
}
