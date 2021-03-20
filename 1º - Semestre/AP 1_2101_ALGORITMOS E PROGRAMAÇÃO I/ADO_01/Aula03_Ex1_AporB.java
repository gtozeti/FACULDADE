package ADO_01;

import java.util.Scanner;

public class Aula03_Ex1_AporB {

    public static void main(String[] args) {
        int a, b, c;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número A: ");
        a = entrada.nextInt();

        System.out.print("Digite um número B: ");
        b = entrada.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("\nO novo valor de A é: " + a + " e o novo valor de B é : " + b);

    }
}
