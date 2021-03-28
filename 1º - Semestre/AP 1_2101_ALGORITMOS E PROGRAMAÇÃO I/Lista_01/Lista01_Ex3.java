package Lista_01;

import java.util.Scanner;

public class Lista01_Ex3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1, n2, calculo;

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        calculo = (int) (Math.pow(n1, 2) + Math.pow(n2, 2));

        System.out.println("\nA somatória dos quadrados dos números " + n1 + " e " + n2 + " é: " + calculo);

    }
}
