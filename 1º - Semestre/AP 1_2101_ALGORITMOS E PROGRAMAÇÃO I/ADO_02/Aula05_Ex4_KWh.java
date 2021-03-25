package ADO_02;

import java.util.Scanner;

public class Aula05_Ex4_KWh {

    public static void main(String[] args) {

        float kW, valor, v_min;

        v_min = (float) 11.9;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o kW/h consumido: ");
        kW = entrada.nextFloat();

        if (kW >= 500) {

            valor = (float) (0.3 * kW);
            System.out.printf("\nA conta do consumo de energia elétrica do consumidor, foi de: R$ %.2f\n", (valor + v_min));

        } else if (kW >= 150 && kW < 500) {

            valor = (float) (0.25 * kW);
            System.out.printf("\nA conta do consumo de energia elétrica do consumidor, foi de: R$ %.2f\n", (valor + v_min));

        } else if (kW < 150 && kW > 59.5) {

            valor = (float) (0.2 * kW);
            System.out.printf("\nA conta do consumo de energia elétrica do consumidor, foi de: R$ %.2f\n", (valor + v_min));

        } else {

            System.out.printf("\nA conta do consumo de energia elétrica do consumidor, foi de: R$ %.2f\n", v_min);

        }

    }
}
