import java.util.Scanner;

public class SomaInteiros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite N1: ");
		int n1 = entrada.nextInt();
		
		System.out.print("Digite N2: ");
		int n2 = entrada.nextInt();

		int soma = n1 + n2;
		
		System.out.println("O valor da soma é: " + soma);

	}

}
