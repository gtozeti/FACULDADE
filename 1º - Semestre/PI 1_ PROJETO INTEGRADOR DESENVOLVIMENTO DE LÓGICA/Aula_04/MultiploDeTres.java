import java.util.Scanner;

public class MultiploDeTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		
		int idade = entrada.nextInt();
		
		if (idade >= 18 && (idade%3 == 0)) {
			System.out.println("Voc� � maior de idade e sua idade � m�ltiplo de 3");
		}else {
			System.out.println("Voc� � menor de idade ou sua idade n�o � m�ltiplo de 3");
		}

	}

}
