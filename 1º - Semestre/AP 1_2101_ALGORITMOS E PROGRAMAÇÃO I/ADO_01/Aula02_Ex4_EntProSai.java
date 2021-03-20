package ADO_01;

import java.util.Scanner;

public class Aula02_Ex4_EntProSai {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtd;
        float preco, total;
        String cod;
        System.out.print("Digite o código da peça: "); //Entrada de dados 
        cod = entrada.next();
        System.out.print("Digite o valor da peça: ");//Entrada de dados
        preco = entrada.nextFloat();
        System.out.print("Digite a quantidade da(s) peça(s): ");//Entrada de dados
        qtd = entrada.nextInt();

        total = preco * qtd;//Processamento de dados

        System.out.printf("\nCódigo da peça: " + cod + "\nO valor total é de: R$ %.2f\n", total);//Saída de dados

    }
}
