package Lista_01;

import java.util.Scanner;

public class Lista01_Ex7 {

    public static void main(String[] args) {

        float lA, lB, hipo, hipo_;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        lA = entrada.nextFloat();

        System.out.print("Digite o valor do lado B: ");
        lB = entrada.nextFloat();

       hipo_ = (float) (Math.pow(lA, 2) + Math.pow(lB, 2));
       hipo = (float) Math.sqrt(hipo_); 

        System.out.printf("\nA hipotenusa do triângulo retângulo é: %.2f\n\n", hipo);
        
    }
}
