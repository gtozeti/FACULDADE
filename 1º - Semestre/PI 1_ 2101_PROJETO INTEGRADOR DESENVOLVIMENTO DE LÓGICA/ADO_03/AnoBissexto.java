import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		int ano; 
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano com 4 d�gitos: ");
		ano = entrada.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			
			System.out.println("\nO ano � bissexto");
			
		}else {
			
			System.out.println("\nO ano n�o � bissexto");
			
		}
				
	}

}
