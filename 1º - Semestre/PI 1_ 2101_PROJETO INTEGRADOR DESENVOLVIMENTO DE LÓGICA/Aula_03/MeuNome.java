import java.util.Scanner;

public class MeuNome {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String nome = entrada.next();
		
		System.out.println("Seu nome é "+ nome);
	}

}
