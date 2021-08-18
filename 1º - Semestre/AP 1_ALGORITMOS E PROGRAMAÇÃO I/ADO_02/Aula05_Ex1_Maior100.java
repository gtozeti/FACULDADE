package ADO_02;

import java.util.Scanner;

public class Aula05_Ex1_Maior100 {

    public static void main(String[] args) {
       
        float num;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = entrada.nextFloat();


        if (num > 100) {

            System.out.printf("\nO número é maior que 100. A soma com mais 150 é: %.2f\n",(num+150));

        } else {
            System.out.println("\nO número é menor que 100. Não soma com mais 150!!\n");
            
        }

    }
    
}
