package Lista_01;

import java.util.Scanner;

public class Lista01_Ex12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float L, R, areaL, areaR;

        System.out.print("Digite o número L: ");
        L = entrada.nextFloat();
        System.out.print("Digite o número R: ");
        R = entrada.nextFloat();
        
        areaL = (L * L);
        areaR = (float) (Math.PI * (Math.pow(R, 2)));

        if (areaL > areaR) {
            System.out.println("\nA área maior é do Quadrado\n");
        } else if (areaL == areaR) {
            System.out.println("\nA área são Iguais\n");
        } else {
            System.out.println("\nA área maior é do Círculo\n");
        }

    }
}
