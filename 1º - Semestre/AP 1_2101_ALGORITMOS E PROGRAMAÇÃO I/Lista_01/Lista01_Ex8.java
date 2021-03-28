package Lista_01;

import java.util.Scanner;

public class Lista01_Ex8 {

    public static void main(String[] args) {

        int n1, n2, n3, n4;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o valor 2: ");
        n2 = entrada.nextInt();
        System.out.print("Digite o valor 3: ");
        n3 = entrada.nextInt();
        System.out.print("Digite o valor 4: ");
        n4 = entrada.nextInt();

        System.out.printf("\nA média aritmética entre os números %d, %d, %d e %d é: %.2f\n\n", n1, n2, n3, n4, ((float)(n1 + n2 + n3 + n4) / 4));

    }
}
