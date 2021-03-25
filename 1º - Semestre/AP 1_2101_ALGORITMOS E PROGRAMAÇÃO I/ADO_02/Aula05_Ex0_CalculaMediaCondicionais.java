package ADO_02;

import java.util.Scanner;

public class Aula05_Ex0_CalculaMediaCondicionais {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3, media;
        String nomeAluno;
        int faltas;

        System.out.print("Nome do aluno: ");
        nomeAluno = entrada.next();
        System.out.print("N1: ");
        n1 = entrada.nextFloat();
        System.out.print("N2: ");
        n2 = entrada.nextFloat();
        System.out.print("N3: ");
        n3 = entrada.nextFloat();

        System.out.print("Quantidade de faltas: ");
        faltas = entrada.nextInt();

        media = (n1 + n2 + n3) / 3;

        if (media >= 6 && faltas <= 18) {

            System.out.printf("\n%s está APROVADO com média: %.2f e com um total de: %d faltas\n", nomeAluno, media, faltas);

        } else if (media >= 6 && faltas > 18) {

            System.out.printf("\nREPROVADO POR FALTAS\n%s está REPROVADO com média: %.2f e com um total de: %d faltas\n", nomeAluno, media, faltas);

        } else if (media < 6 && faltas <= 18) {

            System.out.printf("\nREPROVADO POR NOTA\n%s está REPROVADO com média: %.2f e com um total de: %d faltas\n", nomeAluno, media, faltas);

        } else {

            System.out.printf("\nREPROVADO POR FALTAS E POR NOTA\n%s está REPROVADO com média: %.2f e com um total de: %d faltas\n", nomeAluno, media, faltas);
        }

    }
}
