import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		
		int idade = entrada.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade!");
		}else {
			System.out.println("Voc� � menor de idade!");
		}

	}

}
