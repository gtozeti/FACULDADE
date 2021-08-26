package ADO_04;

import java.util.Scanner;

class ADO4_Ex4_6valores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num, vezes = 0, soma = 0, qtdPos = 0;
        double media = 0;

        while (vezes < 6) {

            System.out.print("Digite o número " + (vezes + 1) + ": ");
            num = entrada.nextInt();

            if (num > 0) {

                soma = soma + num;
                qtdPos++;

            }
            vezes++;

        }
        media = (double) soma / qtdPos;

        System.out.printf("\n1- Soma de todos os valores positivos: %d\n2- Quantidade de valores digitados que foram positivos: %d"
                + "\n3- Média de todos os valores positivos: %.2f\n", soma, qtdPos, media);
    }

}
