//Calcular e mostrar a m�dia aritm�tica dos n�meros pares compreendidos entre 13 e 73. Utilize o la�o que
//lhe for mais conveniente.

public class Lista02_Ex8 {

	public static void main(String[] args) {

		int soma = 0, cont = 0;
		
		for (int i = 13; i < 73; i++) {
			
			if (i % 2 == 0) {
				soma += i;
				cont++;
			}
			
		}
		System.out.println(soma/cont);

	}
}