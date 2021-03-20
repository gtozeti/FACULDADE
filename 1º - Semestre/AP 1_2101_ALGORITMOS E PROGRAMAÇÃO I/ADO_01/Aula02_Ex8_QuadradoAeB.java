package ADO_01;

import java.util.Scanner;

public class Aula02_Ex8_QuadradoAeB {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float n1, n2;

        System.out.print("Digite o número A: ");
        n1 = entrada.nextFloat();
        System.out.print("Digite o número B: ");
        n2 = entrada.nextFloat();
        
        System.out.println("\nO número " + n1 + " elevado ao número " + n2 + " é: " + Math.pow(n1, n2));

    }
}
