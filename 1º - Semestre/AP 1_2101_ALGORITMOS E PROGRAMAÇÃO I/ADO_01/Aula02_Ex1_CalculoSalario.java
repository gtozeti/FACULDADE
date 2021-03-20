package ADO_01;

import java.util.Scanner;

public class Aula02_Ex1_CalculoSalario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        byte horas;
        float vHora;

        System.out.print("Digite o total de horas trabalhadas: ");
        horas = entrada.nextByte();
        System.out.print("Digite o valor de cada hora trabalhada: ");
        vHora = entrada.nextFloat();

        System.out.printf("\nO salário do trabalhador é de R$ %.2f\n", (horas * vHora));

    }
}
