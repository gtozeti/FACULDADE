package ADO_01;

import java.util.Scanner;

public class Aula03_Ex2_Produto {

    public static void main(String[] args) {
        int a;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        a = entrada.nextInt();

       System.out.println("\nO dobro do número " + a + " é: " + (a*2));

    }
}
