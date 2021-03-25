package ADO_02;

import java.util.Scanner;

public class Aula05_Ex2_DivExata {

    public static void main(String[] args) {

        int n1, n2;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite N1: ");
        n1 = entrada.nextInt();
        System.out.print("Digite N2: ");
        n2 = entrada.nextInt();

        if (n1 % n2 == 0) {

            System.out.printf("\nA divisão de %d por %d é exata\n", n1, n2);

        } else {

            System.out.printf("\nA divisão de %d por %d não é exata\n",n1,n2);

        }

    }
}
