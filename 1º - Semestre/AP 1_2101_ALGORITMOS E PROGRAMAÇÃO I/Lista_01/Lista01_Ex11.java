package Lista_01;

import java.util.Scanner;

public class Lista01_Ex11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = entrada.nextInt();

        if (num > 0) {
            System.out.println("\nO número é positivo!!\n");
        } else if (num == 0) {
            System.out.println("\nO número é neutro!!\n");
        } else {
            System.out.println("\nO número é negativo!!\n");
        }

    }
}
