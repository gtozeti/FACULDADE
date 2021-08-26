import java.util.Scanner;

public class ComparaNome {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.next();
		
		if (nome.equals("John")) { //Pode ser usado "equalsIgnoreCase", para ignorar caixa alta ou baixa
			System.out.println("Seu nome é John");
		}else {
			System.out.println("Seu nome é "+ nome + ", não John");
		}
	}

}
