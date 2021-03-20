package ADO_01;

import java.util.Scanner;

public class Aula02_Ex6_QuadradoNum {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite um número: ");
        n1 = entrada.nextInt();
        n2 = (int) Math.pow(n1, 2);

        System.out.println("\n O quadrado do número " + n1 + " é: " + n2);

    }
}
