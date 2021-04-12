package ADO_03;

import java.util.Scanner;

public class ADO3_Ex8_ValorMulta {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float anuidade, multa;
        double juros = 0.05;
        String mes;

        System.out.print("Digite o mês de pagamento: ");
        mes = entrada.next();
        System.out.print("Digite o valor da anuidade em R$: ");
        anuidade = entrada.nextFloat();

        switch (mes.toUpperCase()) {

            case "JANEIRO":
                multa = (float) (anuidade);
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "FEVEREIRO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 1)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "MARÇO":
            case "MAR�O":
                multa = (float) (anuidade * (Math.pow((1 + juros), 2)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "ABRIL":
                multa = (float) (anuidade * (Math.pow((1 + juros), 3)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "MAIO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 4)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "JUNHO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 5)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "JULHO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 6)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "AGOSTO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 7)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "SETEMBRO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 8)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "OUTUBRO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 9)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "NOVEMBRO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 10)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            case "DEZEMBRO":
                multa = (float) (anuidade * (Math.pow((1 + juros), 11)));
                System.out.printf("\nO valor da multa de anuidade a ser paga no mês de %s é de: R$ %.2f\nTotal de: R$ %.2f\n\n",(mes.substring(0, 1).toUpperCase() + mes.substring(1) ) ,(multa-anuidade),(multa));
                break;

            default:
                System.out.println("\nMês inválido");

        }
    }
}
