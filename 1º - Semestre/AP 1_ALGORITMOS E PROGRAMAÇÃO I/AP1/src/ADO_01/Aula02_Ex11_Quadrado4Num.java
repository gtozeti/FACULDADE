package ADO_01;

import java.util.Scanner;

public class Aula02_Ex11_Quadrado4Num {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1,n2,n3,n4, calculo;

        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = entrada.nextInt();
        System.out.print("Digite o quarto número: ");
        n4 = entrada.nextInt();
        
        calculo = (int) (Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2) + Math.pow(n4, 2)); 
        
        System.out.println("\nA somatória dos quadrados dos números "+n1+" ,"+n2+" ,"+n3+" e "+n4+" é: " + calculo);

    }
}
