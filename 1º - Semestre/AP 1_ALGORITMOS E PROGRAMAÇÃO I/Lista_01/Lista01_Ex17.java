package Lista_01;

import java.util.Scanner;

public class Lista01_Ex17 {

    public static void main(String[] args) {

        int a, b, c, d;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        a = entrada.nextInt();
        System.out.print("Digite o valor B: ");
        b = entrada.nextInt();
        System.out.print("Digite o valor C: ");
        c = entrada.nextInt();
        System.out.print("Digite o valor D: ");
        d = entrada.nextInt();

        if (b > c && d > a && ((c + d) > (a + b)) && c > 0 && d > 0 && (a % 2 == 0)) {

            System.out.print("\nValores aceitos\n");

        } else {

            System.out.print("\nValores não aceitos\n");

        }

    }
}
