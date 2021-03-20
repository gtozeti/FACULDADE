package ADO_01;

import java.util.Scanner;

public class Aula02_Ex9_SomaNum {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o número A: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o número B: ");
        n2 = entrada.nextInt();

        System.out.println("\nO número " + n1 + " somado ao número " + n2 + " é: " + (n1 + n2));

    }
}
