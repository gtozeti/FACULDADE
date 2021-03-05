import java.util.Scanner;
public class MaiorDeTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int A = entrada.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int B = entrada.nextInt();
		
		System.out.print("Digite o valor de C: ");
		int C = entrada.nextInt();
		
		
		if (A > B && A > C) {
			System.out.println("O maior dos três é: "+ A);
		}else if (B > A && B > C) {
			System.out.println("O maior dos três é: "+ B);
		}else {
			System.out.println("O maior dos três é: "+ C);
		}

	}

}
