/*Faça uma função que recebe a idade de um nadador por parâmetro e retorna , também por parâmetro, a
categoria desse nadador (tipo String) de acordo com a tabela abaixo:*/

import java.util.Scanner;

public class Lista03_Ex10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;
		

		System.out.print("Informe a idade do nadador: ");
		idade = entrada.nextInt();
		

		
		System.out.println("\nA categoria do nadador é: " + verifica(idade));
		
		

	}

	static String verifica(int idade ) {

		if (idade >= 5 && idade <= 7) {
			return "Infantil A";
		}
		else if (idade >= 8 && idade <= 10) {
			return "Infantil B";
		}
		else if (idade >= 11 && idade <= 13) {
			return "Juvenil A";
		}
		else if (idade >= 14 && idade <= 17) {
			return "Juvenil B";
		}
		else if (idade >= 18) {
			return "Adulto";
		}
		else {
			return "Sem categoria";
		}
		
		

	}
}
