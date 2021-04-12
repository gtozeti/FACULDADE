package ADO_03;

import java.util.Scanner;

public class ADO3_Ex7_PlanoSaude {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        byte idade, cond;
        int valor = 100;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextByte();

        if (idade < 10) {

            cond = 1;

        } else if (idade >= 10 && idade <= 30) {

            cond = 2;

        } else if (idade > 30 && idade <= 60) {

            cond = 3;

        } else {

            cond = 4;

        }

        switch (cond) {

            case 1:
                valor = valor + 80;
                break;

            case 2:
                valor = valor + 50;
                break;

            case 3:
                valor = valor + 95;
                break;

            case 4:
                valor = valor + 130;
                break;

        }
        
        System.out.println("\nO valor a ser pago no plano de saúde é de: R$ " + valor+",00.\n");

    }
}
