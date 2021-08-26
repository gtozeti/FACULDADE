import java.util.Scanner;

public class MultiploDeTres2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		
		int idade = entrada.nextInt();
		
		if (idade >= 18 || (idade%3 == 0)) {
			System.out.println("Você é maior de idade ou sua idade é múltiplo de 3");
		}else {
			System.out.println("Você é menor de idade e sua idade não é múltiplo de 3");
		}

	}

}
