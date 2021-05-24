//Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, o programa
//deve ler as notas de cada um destes alunos, calcular e mostrar na tela a média aritmética destas notas.
//Utilize o laço WHILE.

import java.util.Scanner;

public class Lista02_Ex9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos existentes: ");
		int alunos = entrada.nextInt();
		System.out.println("\n");
		
		int i = 0, cont = 0;
		float notas = 0;
		
		while(i < alunos ) {
			
			System.out.print("Digite a nota do " +(i + 1)+"º aluno: ");
			notas += entrada.nextFloat();
			i++;
		}
			
		System.out.printf("\nA média aritmética dos %d alunos foi de: %.2f",alunos,(notas/alunos));

	}
}