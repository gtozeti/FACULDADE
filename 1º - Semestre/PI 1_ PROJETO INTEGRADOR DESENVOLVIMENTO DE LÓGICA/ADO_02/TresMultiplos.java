import java.util.Scanner;

public class TresMultiplos {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int N = input.nextInt();
		
		System.out.println("O primeiro m�ltiplo de "+ N +" �: "+ N +"\nO segundo m�ltiplo de " + N +" �: "+ N*2+"\nO terceiro m�ltiplo de " + N +" �: "+ N*3);

	}

}
