import java.util.Scanner;

public class TresMultiplos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int N = input.nextInt();
		
		System.out.println("O primeiro múltiplo de "+ N +" é: "+ N +"\nO segundo múltiplo de " + N +" é: "+ N*2+"\nO terceiro múltiplo de " + N +" é: "+ N*3);

	}

}
