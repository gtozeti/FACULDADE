package ADO_03;

import java.util.Scanner;

public class ADO3_Ex6_DiaSemana2 {
    
    public static void main(String[] args) {

        int dia;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor de 1 à 7: ");
        dia = entrada.nextInt();

        switch (dia) {
            case 1:
            case 7:

                System.out.println("\nO dia " + dia + " é um fim de semana.");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:

                System.out.println("\nO dia " + dia + " é um dia de semana.");
                break;

            default:
                System.out.println("\nDia inválido!");
        }

    }
}
