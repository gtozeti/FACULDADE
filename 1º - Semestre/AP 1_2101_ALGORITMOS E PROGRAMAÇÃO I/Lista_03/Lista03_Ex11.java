/*Faça uma função que recebe a média final de um aluno por parâmetro e retorna o seu conceito, conforme
a tabela abaixo:*/

import java.util.Scanner;

public class Lista03_Ex11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float nota;
		

		System.out.print("Informe a média final do aluno: ");
		nota = entrada.nextFloat();
		

		
		System.out.println("\nO conceito do aluno foi: " + verifica(nota));
		
		

	}

	static String verifica(float nota) {

		if (nota < 5) {
			return "D";
		}
		else if (nota >= 5 && nota < 7) {
			return "C";
		}
		else if (nota >= 7 && nota < 9) {
			return "B";
		}
		else {
			return "A";
		}
		
		

	}
}
