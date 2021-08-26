import java.util.Scanner;

public class MultiploDeTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		
		int idade = entrada.nextInt();
		
		if (idade >= 18 && (idade%3 == 0)) {
			System.out.println("Você é maior de idade e sua idade é múltiplo de 3");
		}else {
			System.out.println("Você é menor de idade ou sua idade não é múltiplo de 3");
		}

	}

}
