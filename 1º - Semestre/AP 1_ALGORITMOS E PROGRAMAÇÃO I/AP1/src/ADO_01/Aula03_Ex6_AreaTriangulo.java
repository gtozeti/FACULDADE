package ADO_01;

import java.util.Scanner;

public class Aula03_Ex6_AreaTriangulo {

    public static void main(String[] args) {
        float base, altura;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a medida da base do triângulo: ");
        base = entrada.nextFloat();

        System.out.print("Digite a medida da altura do triângulo: ");
        altura = entrada.nextFloat();
        
        System.out.printf("\nA área do triângulo, corresponde a %.2f\n", (base * altura / 2));

    }
} 
