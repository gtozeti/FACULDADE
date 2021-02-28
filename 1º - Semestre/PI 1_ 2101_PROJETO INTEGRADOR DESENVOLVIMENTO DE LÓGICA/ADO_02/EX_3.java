import java.util.Scanner;

public class EX_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = input.nextInt();
		
		System.out.println("\nA tabuada do número "+n+" é\n");
		System.out.println("1  x "+n+" = "+n*1);
		System.out.println("2  x "+n+" = "+n*2);
		System.out.println("3  x "+n+" = "+n*3);
		System.out.println("4  x "+n+" = "+n*4);
		System.out.println("5  x "+n+" = "+n*5);
		System.out.println("6  x "+n+" = "+n*6);
		System.out.println("7  x "+n+" = "+n*7);
		System.out.println("8  x "+n+" = "+n*8);
		System.out.println("9  x "+n+" = "+n*9);
		System.out.println("10 x "+n+" = "+n*10);
		
	}

}
