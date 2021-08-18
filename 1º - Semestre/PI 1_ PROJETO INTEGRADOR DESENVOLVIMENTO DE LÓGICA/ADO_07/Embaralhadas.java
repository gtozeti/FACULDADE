import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Embaralhadas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String a,b,c,d,e,letra;
		boolean cond = true;
		
		
		ArrayList<String> respostas = new ArrayList<String>();
		
		respostas.add("E372");
		respostas.add("F572");
		respostas.add("F332");//RESPOSTA CORRETA
		respostas.add("E362");
		respostas.add("E3E2");
		
		
		do {
			
			Collections.shuffle(respostas);
			Collections.shuffle(respostas);
			
			a = respostas.get(0);
			b = respostas.get(1);
			c = respostas.get(2);
			d = respostas.get(3);
			e = respostas.get(4);
			
			System.out.println("\nDado o seguinte valor em binário 1111001100110010. Qual alternativa corresponde a esse número em hexadecimal?");
			System.out.println("\n(a) "+ a +"\n(b) "+ b +"\n(c) "+ c +"\n(d) "+ d +"\n(e) "+ e);
			System.out.print("\nR: ");
			letra = entrada.next();

			switch (letra.toUpperCase()) {

			case "A":
				
				if (a.equals("F332")) {
					System.out.println("\nResposta correta");
					cond = false;
				} else {
					System.out.println("\nResposta incorreta");
				}
				break;
				
			case "B":
				
				if (b.equals("F332")) {
					System.out.println("\nResposta correta");
					cond = false;
				} else {
					System.out.println("\nResposta incorreta");
				}
				break;
				
			case "C":
				
				if (c.equals("F332")) {
					System.out.println("\nResposta correta");
					cond = false;
				} else {
					System.out.println("\nResposta incorreta");
				}
				break;
				
			case "D":
				
				if (d.equals("F332")) {
					System.out.println("\nResposta correta");
					cond = false;
				} else {
					System.out.println("\nResposta incorreta");
				}
				break;
				
			case "E":
				
				if (e.equals("F332")) {
					System.out.println("\nResposta correta");
					cond = false;
				} else {
					System.out.println("\nResposta incorreta");
				}
				break;
			
			default:

				System.out.println("\nOpção não é válida!\n");
				
			}
			
					
		} while (cond);
		
		
	}

}
