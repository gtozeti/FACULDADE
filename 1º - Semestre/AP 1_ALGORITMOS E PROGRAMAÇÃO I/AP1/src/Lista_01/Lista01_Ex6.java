package Lista_01;

import java.util.Scanner;

public class Lista01_Ex6 {

    public static void main(String[] args) {

        float lA, lB, lC, a, b, c, d, e, f;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        lA = entrada.nextFloat();

        System.out.print("Digite o valor do lado B: ");
        lB = entrada.nextFloat();

        System.out.print("Digite o valor do lado C: ");
        lC = entrada.nextFloat();

        a = (lA * lC / 2);
        b = (float) (3.14159 * (Math.pow(lC, 2)));
        c = ((lA + lB) * lC / 2);
        d = (lB * lB);
        e = (lA * lB);
        f = (lA + lB);

        System.out.printf("\nA área do triângulo retângulo é: %.3f", a);
        System.out.printf("\nA área do círculo é: %.3f", b);
        System.out.printf("\nA área do trapézio é: %.3f", c);
        System.out.printf("\nA área do quadrado é: %.3f", d);
        System.out.printf("\nA área do retângulo é: %.3f", e);
        System.out.printf("\nA área do perímetro do retângulo é: %.3f\n\n", f);

    }
}
