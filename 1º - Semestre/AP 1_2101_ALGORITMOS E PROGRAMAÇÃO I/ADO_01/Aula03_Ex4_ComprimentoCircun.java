package ADO_01;

import java.util.Scanner;

public class Aula03_Ex4_ComprimentoCircun {

    public static void main(String[] args) {
        float raio, c;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do raio da circunferência: ");
        raio = entrada.nextFloat();

        c = (float) (2 * Math.PI * raio);
        
        System.out.printf("\nO comprimento da circunferência é de: %.2f\n" , c);

    }
}
