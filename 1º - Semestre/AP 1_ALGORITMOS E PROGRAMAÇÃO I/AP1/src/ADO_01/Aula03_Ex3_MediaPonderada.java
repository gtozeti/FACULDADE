package ADO_01;

import java.util.Scanner;

public class Aula03_Ex3_MediaPonderada {

    public static void main(String[] args) {
        float a, b, mp;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da nota 1: ");
        a = entrada.nextFloat();

        System.out.print("Digite o valor da nota 2: ");
        b = entrada.nextFloat();

        mp = (((a * 6) + (b * 4)) / 10);

        System.out.println("\nA média ponderada das duas notas foi de: " + mp);

    }
}
