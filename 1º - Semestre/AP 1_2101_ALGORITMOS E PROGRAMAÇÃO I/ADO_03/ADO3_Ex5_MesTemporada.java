package ADO_03;

import java.util.Scanner;

public class ADO3_Ex5_MesTemporada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String mes;

        System.out.print("Digite um mês : ");//PROBLEMA COM O CARACTER "Ç"
        mes = entrada.next();

        switch (mes.toUpperCase()) {

            case "JANEIRO":
            case "DEZEMBRO":
            case "FEVEREIRO":
            case "JUNHO":
            case "JULHO":

                System.out.println("\nO mês de " + mes.substring(0, 1).toUpperCase() + mes.substring(1) + " é de alta temporada");
                break;

            case "MARÇO":
            case "MAR�O":
            case "ABRIL":
            case "MAIO":
            case "AGOSTO":
            case "SETEMBRO":
            case "OUTUBRO":
            case "NOVEMBRO":

                System.out.println("\nO mês de " + mes.substring(0, 1).toUpperCase() + mes.substring(1) + " é de baixa temporada");
                break;

            default:
                System.out.println("\nMês inválido");

        }

    }
}
