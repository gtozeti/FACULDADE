import java.util.Scanner;

public class Calculadora {

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
		
		
		if (operacao == 'a' || operacao == 'A') {
			System.out.println("Soma: " + (a + b));
			
		}else if (operacao == 's' || operacao == 'S') {
			System.out.println("Diferença: " + (a - b));
			
		}else if (operacao == 'm' || operacao == 'M') {
			System.out.println("Produto: " + (a * b));
			
		}else if (operacao == 'd' || operacao == 'D') {
			System.out.println("Quociente: " + (a / b));
			
		}else {
			
			System.out.println("A operação " + operacao + " não é válida!");
			
		}
		
	
	}

}
