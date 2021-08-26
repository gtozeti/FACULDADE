//Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como
//nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE.

import java.util.Scanner;

public class Lista02_Ex6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int cont = 0, idade, idadeM = 0;
		String nome = "", sexo = "", nomeM = "", sexoM = "";

		do {
			System.out.print("Digite o nome do " + (cont + 1) + "º aluno: ");
			nome = entrada.next();
			System.out.print("Digite o sexo do " + (cont + 1) + "º aluno: ");
			sexo = entrada.next().toUpperCase();
			System.out.print("Digite a idade do " + (cont + 1) + "º aluno: ");
			idade = entrada.nextInt();
			System.out.print("\n");

			if (idade > idadeM) {
				idadeM = idade;
				nomeM = nome;
				sexoM = sexo;

			}
			cont++;

		} while (cont < 5);
		
		System.out.print("O mais velho é: " +nomeM+", com "+idadeM+" anos e do sexo "+sexoM+".");

	}

}