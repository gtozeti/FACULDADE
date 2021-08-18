import java.util.Scanner;

public class LoginSenha {

	public static void main(String[] args) {
		String user = "John";
		String password = "123456";
		String login, senha;
		Scanner entrada = new Scanner(System.in);
		
		boolean tacerto = false;
		
		do {
			
			System.out.println("Digite o login: ");
			login = entrada.next();
			System.out.println("Digite a senha: ");
			senha = entrada.next();
			
			if (login.equalsIgnoreCase(user) && senha.equals(password)) {
				
				tacerto = true;				
			}
			
			
		} while (!tacerto);

	}

}
