import java.util.Scanner;

public class Calculadora {

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
		
		
		if (operacao == 'a' || operacao == 'A') {
			System.out.println("Soma: " + (a + b));
			
		}else if (operacao == 's' || operacao == 'S') {
			System.out.println("Diferen�a: " + (a - b));
			
		}else if (operacao == 'm' || operacao == 'M') {
			System.out.println("Produto: " + (a * b));
			
		}else if (operacao == 'd' || operacao == 'D') {
			System.out.println("Quociente: " + (a / b));
			
		}else {
			
			System.out.println("A opera��o " + operacao + " n�o � v�lida!");
			
		}
		
	
	}

}
