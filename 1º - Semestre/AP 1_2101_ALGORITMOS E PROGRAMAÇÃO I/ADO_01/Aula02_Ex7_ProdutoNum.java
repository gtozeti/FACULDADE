package ADO_01;

import java.util.Scanner;

public class Aula02_Ex7_ProdutoNum {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();

        System.out.println("\nO produto entre o número " + n1 + " e o número " + n2 + " é: " + (n1 * n2));

    }
}
