package ADO_01;

import java.util.Scanner;

public class Aula02_Ex2_EstoqueMedio {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int qtdMax, qtdMin;

        System.out.print("Digite a quantidade mínima de peças: ");
        qtdMin = entrada.nextInt();
        System.out.print("Digite a quantidade máxima de peças: ");
        qtdMax = entrada.nextInt();

        System.out.println("\nO estoque médio da peça é de: " + Math.round(((qtdMax + qtdMin) / 2)) + " unidades");
    }
}
