package Lista_01;

import java.util.Scanner;

public class Lista01_Ex5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float lado;

        System.out.print("Digite o lado do quadrado: ");
        lado = entrada.nextFloat();
        
        System.out.printf("\nA área do quadrado corresponde a: %.2f\n",(lado*lado));

    }
}
