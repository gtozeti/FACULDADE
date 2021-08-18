package ADO_03;

import java.util.Scanner;

public class ADO3_Ex1_Divi3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, condi;

        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();

        switch (n1 % 3) {

            case 0:
                System.out.println("\nO número " + n1 + " é divisível por 3");
                break;
            default:
                System.out.println("\nO número " + n1 + " não é divisível por 3");

        }

    }

}
