package ADO_03;

import java.util.Scanner;

public class ADO3_Ex9_ValidadorCPF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String cpf;
        int passo1e2, passo3, passo4, passo6e7, passo8, passo9;

        System.out.print("Digite o CPF: ");
        cpf = entrada.next();

        int d1 = Character.getNumericValue(cpf.charAt(0));
        int d2 = Character.getNumericValue(cpf.charAt(1));
        int d3 = Character.getNumericValue(cpf.charAt(2));
        int d4 = Character.getNumericValue(cpf.charAt(3));
        int d5 = Character.getNumericValue(cpf.charAt(4));
        int d6 = Character.getNumericValue(cpf.charAt(5));
        int d7 = Character.getNumericValue(cpf.charAt(6));
        int d8 = Character.getNumericValue(cpf.charAt(7));
        int d9 = Character.getNumericValue(cpf.charAt(8));
        int d10 = Character.getNumericValue(cpf.charAt(9));
        int d11 = Character.getNumericValue(cpf.charAt(10));
        
                

        passo1e2 = ((d1 * 10) + (d2 * 9) + (d3 * 8) + (d4 * 7) + (d5 * 6) + (d6 * 5) + (d7 * 4) + (d8 * 3) + (d9 * 2));
        passo3 = passo1e2 % 11;
        passo4 = 11 - passo3;
        
        
        if (passo4 <= 10) {

            if (passo4 == d10 || passo4 == 0 || passo4 == 10) {

                passo6e7 = ((d1 * 11) + (d2 * 10) + (d3 * 9) + (d4 * 8) + (d5 * 7) + (d6 * 6) + (d7 * 5) + (d8 * 4) + (d9 * 3) + (d10 * 2));
                passo8 = passo6e7 % 11;
                passo9 = 11 - passo8;
                

                if (passo9 <= 10) {

                    if (passo9 == d11 || passo9 == 0 || passo9 == 10) {

                        System.out.println("CPF Válido\n");

                    } else {
                        System.out.println("CPF Inválido\n");
                    }

                } else {
                    System.out.println("CPF Inválido\n");
                }

            } else {
                System.out.println("CPF Inválido\n");
            }

        } else {
            System.out.println("CPF Inválido\n");
        }

    }
}
