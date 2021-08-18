//Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna)
//menor dentre os três números.

import java.util.Scanner;

public class Lista03_Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int n1, n2, n3, menor;
		
		System.out.print("Digite o valor do primeiro número: ");
		n1 = entrada.nextInt();
		System.out.print("\nDigite o valor do segundo número: ");
		n2 = entrada.nextInt();
		System.out.print("\nDigite o valor do terceiro número: ");
		n3 = entrada.nextInt();
		
		menor = Menor(n1,n2,n3);
		System.out.println("\nO menor dos três números é o " + menor + "\n");
		
	}
	
	static int Menor(int n1, int n2, int n3) {
		
		if (n1 == n2) {

            if (n1 < n3) {
               return n1;

            } else {
                return n3;
            }
            
        } else if (n1 == n3) {

            if (n1 < n2) {
            	return n1;

            } else {
            	return n2;
            }
        } else if (n2 == n3) {

            if (n1 < n2) {
            	return n1;

            } else {
            	return n2;
            }
        } else {

            if (n1 < n2 && n1 < n3) {
            	return n1;
            } else if (n2 < n1 && n2  < n3) {
            	return n2;
            } else {
            	return n3;
            }

        }
		
		
	}

}
