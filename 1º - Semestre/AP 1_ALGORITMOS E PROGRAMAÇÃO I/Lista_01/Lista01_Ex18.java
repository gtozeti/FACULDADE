package Lista_01;

import java.util.Scanner;

public class Lista01_Ex18 {

    public static void main(String[] args) {

        float a, b, c, a1, b1, c1;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        a1 = entrada.nextFloat();
        System.out.print("Digite o valor B: ");
        b1 = entrada.nextFloat();
        System.out.print("Digite o valor C: ");
        c1 = entrada.nextFloat();

        if (a1 > b1 && a1 > c1) {

            a = a1;

            if (b1 > c1) {

                b = b1;
                c = c1;

            } else {

                c = b1;
                b = c1;

            }

        } else if (b1 > a1 && b1 > c1) {

            a = b1;

            if (a1 > c1) {

                b = a1;
                c = c1;

            } else {

                c = a1;
                b = c1;

            }
        } else {

            a = c1;

            if (a1 > b1) {

                b = a1;
                c = b1;

            } else {

                c = a1;
                b = b1;

            }
        }

        if (a >= (b + c)) {

            System.out.println("\nNAO FORMA TRIANGULO");

        } else if ((a * a == (b * b + c * c)) && (a == b && a == c)) {

            System.out.println("\nTRIANGULO RETANGULO");
            System.out.println("TRIANGULO EQUILATERO");

        } else if ((a * a == (b * b + c * c)) && (a == b || a == c || c == b)) {
            
            System.out.println("\nTRIANGULO RETANGULO");
            System.out.println("TRIANGULO ISOSCELES");
            
        } else if ((a * a == (b * b + c * c))) {
            
            System.out.println("\nTRIANGULO RETANGULO");
            
        } else if ((a * a > (b * b + c * c)) && (a == b && a == c)) {
            
            System.out.println("\nTRIANGULO OBTUSANGULO");
            System.out.println("TRIANGULO EQUILATERO");
            
        } else if ((a * a > (b * b + c * c)) && (a == b || a == c || c == b)) {
            
            System.out.println("\nTRIANGULO OBTUSANGULO");
            System.out.println("TRIANGULO ISOSCELES");
            
        } else if ((a * a > (b * b + c * c))) {
            
            System.out.println("\nTRIANGULO OBTUSANGULO");
            
        } else if ((a * a < (b * b + c * c)) && (a == b && a == c)) {
            
            System.out.println("\nTRIANGULO ACUTANGULO");
            System.out.println("TRIANGULO EQUILATERO");
            
        } else if ((a * a < (b * b + c * c)) && (a == b || a == c || c == b)) {
            
            System.out.println("\nTRIANGULO ACUTANGULO");
            System.out.println("TRIANGULO ISOSCELES");
            
        } else if ((a * a < (b * b + c * c))) {
            
            System.out.println("\nTRIANGULO ACUTANGULO");
            
        }
    }
}
