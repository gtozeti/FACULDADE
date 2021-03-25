package ADO_02;

import java.util.Scanner;

public class Aula05_Ex3_GrauObesidade {

    public static void main(String[] args) {

        float altura, peso, mC;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura em metros: ");
        altura = entrada.nextFloat();
        System.out.print("Digite o peso em quilos: ");
        peso = entrada.nextFloat();
        
        mC = (float) (peso / Math.pow(altura, 2));
        
        if (mC >= 30) {

            System.out.println("\nO graude obesidade é: OBESO MÓRBIDO\n");

        } else if (mC >= 26 && mC < 30) {

            System.out.println("\nO graude obesidade é: OBESO\n");

        }else {

            System.out.println("\nO graude obesidade é: NORMAL\n");

        }

    }
}
