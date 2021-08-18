package Lista_01;

import java.util.Scanner;

public class Lista01_Ex4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();

        System.out.println("\nO número consecutivo do número " + n1 + " é " + (n1 + 1) + ", e o número consecutivo do número " + n2 + " é " + (n2 + 1));

    }
}
