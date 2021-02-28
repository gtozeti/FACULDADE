import java.util.Scanner;

public class MinhaIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Sua idade é " + idade + " anos");
	}

}
