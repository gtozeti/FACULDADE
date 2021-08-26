import java.util.Scanner;

public class Calculadora2 {

	public static void main(String[] args) {
	
		double a, b;
		String operacaoStr;
		char operacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("<A>dição");
		System.out.println("<S>ubtração");
		System.out.println("<M>ultiplicação");
		System.out.println("<D>ivisão");
		System.out.print("Escolha a operação: ");
		
		operacaoStr = entrada.next();
		operacao = operacaoStr.charAt(0);
		
		
		System.out.print("1º Operando: ");
		a = entrada.nextDouble();
		System.out.print("2º Operando: ");
		b = entrada.nextDouble();
		
		
		switch (operacao) {
		case 'a':
		case 'A':
			System.out.println("Soma: " + (a + b));
			break;
		case 's':
		case 'S':
			System.out.println("Subtração: " + (a - b));
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
			System.out.println("A operação " + operacao + " não é válida!");
		
		}
		
	
	}

}
