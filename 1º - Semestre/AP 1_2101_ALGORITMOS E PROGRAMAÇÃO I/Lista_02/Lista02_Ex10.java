//Fa�a um programa que calcule e imprima o resultado da soma abaixo (lembre-se de que tanto as divis�es
//quanto o resultado devem ser decimais). Utilize o la�o que lhe for mais conveniente.

public class Lista02_Ex10 {

	public static void main(String[] args) {

		
		float soma = 0;
		
		for (float i = 1; i < 21;i++) {
			soma += (1/i);
					
		}
	
			
		System.out.printf("O resultado da opera��o �: %.2f",soma);

	}
}