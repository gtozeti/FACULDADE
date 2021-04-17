package ADO_04;

import java.util.Scanner;

public class ADO4_Ex2_ImparesAteX {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x, i;

        System.out.print("Digite um número: ");
        x = entrada.nextInt();

        for (i = 1; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println(i);

            }

        }
    }
}
