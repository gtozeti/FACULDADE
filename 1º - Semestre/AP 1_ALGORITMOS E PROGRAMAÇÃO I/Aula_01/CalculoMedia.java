package Aula01;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.print("Digite a nota 1: ");
        n1 = entrada.nextDouble();
        System.out.print("Digite a nota 2: ");
        n2 = entrada.nextDouble();
        System.out.print("Digite a nota 3: ");
        n3 = entrada.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("A média é: " + media);
        
        // alt + shift + f para identar o código
        
    }

}
