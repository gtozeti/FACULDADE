package Lista_01;

import java.util.Scanner;

public class Lista01_Ex14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o número 1: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o número 2: ");
        n2 = entrada.nextInt();

        if (n1 > n2) {

            System.out.printf("\nA divisão entre %d e %d é: %.2f\n", n1, n2, ((float) n1 / n2));
        }else if (n1 == n2) {

            System.out.printf("\nA divisão entre %d e %d é: %.2f\n", n1, n2, ((float) n1 / n2));
        } else {

            System.out.printf("\nA divisão entre %d e %d é: %.2f\n", n2, n1, ((float) n2 / n1));
        }

    }
}
