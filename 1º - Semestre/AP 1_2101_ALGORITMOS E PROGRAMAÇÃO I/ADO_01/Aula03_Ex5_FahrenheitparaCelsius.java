package ADO_01;

import java.util.Scanner;

public class Aula03_Ex5_FahrenheitparaCelsius {

    public static void main(String[] args) {
        float gF, gC;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida em ºF: ");
        gF = entrada.nextFloat();

        gC = (gF - 32) * 5 / 9;

        System.out.printf("\n%.1fºF corresponde a %.1fºC\n", gF, gC);

    }
}
