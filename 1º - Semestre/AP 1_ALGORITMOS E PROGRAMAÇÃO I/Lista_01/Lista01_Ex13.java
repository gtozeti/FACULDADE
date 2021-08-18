package Lista_01;

import java.util.Scanner;

public class Lista01_Ex13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3;

        System.out.print("Digite o número 1: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o número 2: ");
        n2 = entrada.nextInt();
        System.out.print("Digite o número 3: ");
        n3 = entrada.nextInt();

        if (n1 == n2) {

            if (n1 > n3) {
                System.out.println("\nO maior dos três números é o " + n1 + "\n");

            } else {
                System.out.println("\nO maior dos três números é o " + n3 + "\n");
            }
            
        } else if (n1 == n3) {

            if (n1 > n2) {
                System.out.println("\nO maior dos três números é o " + n1 + "\n");

            } else {
                System.out.println("\nO maior dos três números é o " + n2 + "\n");
            }
        } else if (n2 == n3) {

            if (n1 > n2) {
                System.out.println("\nO maior dos três números é o " + n1 + "\n");

            } else {
                System.out.println("\nO maior dos três números é o " + n2 + "\n");
            }
        } else {

            if (n1 > n2 && n1 > n3) {
                System.out.println("\nO maior dos três números é o " + n1 + "\n");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println("\nO maior dos três números é o " + n2 + "\n");
            } else {
                System.out.println("\nO maior dos três números é o " + n3 + "\n");
            }

        }
    }
}
