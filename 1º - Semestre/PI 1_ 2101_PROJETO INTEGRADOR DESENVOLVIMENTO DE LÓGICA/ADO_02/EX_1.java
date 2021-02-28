import java.util.Scanner;

public class EX_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite N1: ");
		float n1 = input.nextFloat();
		
		System.out.print("Digite N2: ");
		float n2 = input.nextFloat();
		
		System.out.print("Digite N3: ");
		float n3 = input.nextFloat();
		
		
		float produto = (n1*n2*n3);
		
		System.out.println("O produto entre N1, N2 e N3 é: "+ produto);

	}

}
