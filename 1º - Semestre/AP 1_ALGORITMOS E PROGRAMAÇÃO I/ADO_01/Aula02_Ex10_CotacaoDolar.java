package ADO_01;

import java.util.Scanner;

public class Aula02_Ex10_CotacaoDolar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float dolar, qtdDolar;

        System.out.print("Digite a cotação do dólar: ");
        dolar = entrada.nextFloat();
        System.out.print("Digite a quantia em dólar: ");
        qtdDolar = entrada.nextFloat();

        System.out.printf("\nUS$ %.2f é igual a R$ %.2f\n", qtdDolar, qtdDolar * dolar);

    }
}
