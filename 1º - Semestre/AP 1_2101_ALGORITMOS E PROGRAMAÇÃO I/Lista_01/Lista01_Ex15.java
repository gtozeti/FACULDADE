package Lista_01;

import java.util.Scanner;

public class Lista01_Ex15 {

    public static void main(String[] args) {
        float a, b, c;
        float raizDelta, delta;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite A: ");
        a = entrada.nextFloat();
        System.out.print("Digite B: ");
        b = entrada.nextFloat();
        System.out.print("Digite C: ");
        c = entrada.nextFloat();

        delta = ((int) Math.pow(b, 2) - 4 * a * c);
        
        if (delta < 0 || a == 0) {

            System.out.println("\nImpossível calcular");

        } else {

            raizDelta = (float) Math.sqrt(delta);
            System.out.println("\nRaiz X1 = " + ((-b + raizDelta) / (2 * a)));
            System.out.println("Raiz X2 = " + ((-b - raizDelta) / (2 * a))+"\n");

        }

    }
}
