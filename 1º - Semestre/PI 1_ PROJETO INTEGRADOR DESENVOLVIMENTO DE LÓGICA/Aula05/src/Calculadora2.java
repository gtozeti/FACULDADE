import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] args) {
	
		double a, b;
		String operacaoStr;
		char operacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("<A>di��o");
		System.out.println("<S>ubtra��o");
		System.out.println("<M>ultiplica��o");
		System.out.println("<D>ivis�o");
		System.out.print("Escolha a opera��o: ");
		
		operacaoStr = entrada.next();
		operacao = operacaoStr.charAt(0);
		
		
		System.out.print("1� Operando: ");
		a = entrada.nextDouble();
		System.out.print("2� Operando: ");
		b = entrada.nextDouble();
		
		
		switch (operacao) {
		case 'a':
		case 'A':
			System.out.println("Soma: " + (a + b));
			break;
		case 's':
		case 'S':
			System.out.println("Subtra��o: " + (a - b));
			break;
		case 'm':
		case 'M':
			System.out.println("Produto: " + (a * b));
			break;
		case 'd':
		case 'D':
			System.out.println("Quociente: " + (a / b));
			break;
		default:
			System.out.println("A opera��o " + operacao + " n�o � v�lida!");
		
		}
		
	
	}

}
