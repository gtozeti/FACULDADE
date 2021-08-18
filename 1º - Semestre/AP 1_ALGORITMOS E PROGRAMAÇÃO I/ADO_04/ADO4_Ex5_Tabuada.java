package ADO_04;

import java.util.Scanner;

public class ADO4_Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, cond = 0;

        System.out.print("Digite um número pra tabuada: ");
        n = input.nextInt();
        System.out.println();

        do {

            cond++;
            System.out.println(cond + " x " + n + " = " + (n * cond));

        } while (cond < 10);

    }

}
