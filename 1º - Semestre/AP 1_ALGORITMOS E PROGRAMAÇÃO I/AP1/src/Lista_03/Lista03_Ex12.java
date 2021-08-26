/*Fa�a uma fun��o que recebe, por par�metro, a altura (alt) e o sexo de uma pessoa, e retorna o seu peso
ideal.
Para homens, voc� calcular o peso ideal usando a f�rmula: P = 72,7 * altura - 58.
Para mulheres, utilize a f�rmula: P = 62,1 * altura � 44,7.*/

import java.util.Scanner;

public class Lista03_Ex12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float altura;
		String sexo;
		

		System.out.print("Informe sua altura: ");
		altura = entrada.nextFloat();
		System.out.print("Informe seu sexo [M] ou [F]: ");
		sexo = entrada.next();
		
		if (verifica(altura,sexo) > 0) {
		
		System.out.printf("\nO seu peso ideal � de: %.2f Kg" , verifica(altura,sexo));
		
		}
		else {
			System.out.println("Sexo informado, inv�lido");
		}

	}

	static double verifica(float altura, String sexo) {

		double peso;
		
		if (sexo.equalsIgnoreCase("M")) {
			
			peso = (72.7 * altura - 58);
			return peso;
			
		}
		else if (sexo.equalsIgnoreCase("F")) {
			
			peso = (62.1 * altura - 44.7);
			return peso;
			
		}
		else {
			return 0;
		}
		
		

	}
}
