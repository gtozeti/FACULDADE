package Lista_01;

import java.util.Scanner;

public class Lista01_Ex9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cadastro, horas;
        float vHora;
        
        System.out.print("Digite o cadastro do funcionário: ");
        cadastro = entrada.nextInt();
        System.out.print("Digite o total de horas trabalhadas: ");
        horas = entrada.nextInt();
        System.out.print("Digite o valor de cada hora trabalhada: ");
        vHora = entrada.nextFloat();

        System.out.printf("\nO salário do trabalhador com cadastro %d é de R$ %.2f\n", cadastro, (horas * vHora));

    }
}
