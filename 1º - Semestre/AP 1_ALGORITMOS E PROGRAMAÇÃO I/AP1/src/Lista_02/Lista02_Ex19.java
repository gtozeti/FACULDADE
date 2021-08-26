//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente
//deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta
//é o valor 2002. Utilize o laço que lhe for mais conveniente.

import java.util.Scanner;

public class Lista02_Ex19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String senha = "2002";
		boolean cond = true;

		while (cond) {

			System.out.print("Digite a senha: ");
			String n = entrada.next();

			if (n.equals(senha)) {
				
				System.out.println("Acesso Permitido\n");
				cond = false;
			
			}
			else {
			
			System.out.println("Senha Inválida\n");
			}
			
		}

	}
}