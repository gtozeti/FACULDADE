import java.util.Scanner;

public class QtdChars {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um nome n�o composto: ");
		String nome = input.next();
		
		int qtd = nome.length();
		
		System.out.println("O nome cont�m "+qtd+" caracteres");
		

	}

}