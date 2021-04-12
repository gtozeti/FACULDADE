package ADO_03;

import java.util.*;

public class ADO3_Ex4_DiasNosMeses {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String mes;
        int ano, anob;

        System.out.print("Digite um mês : ");//PROBLEMA COM O CARACTER "Ç"
        mes = entrada.next();
        System.out.print("Digite o ano: ");
        ano = entrada.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {

            anob = 1;

        } else {

            anob = 0;
        }
        
        switch (anob) {

            case 1:

                switch (mes.toUpperCase()) {

                    case "JANEIRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "FEVEREIRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 29 dias");
                        break;

                    case "MARÇO":
                    case "MAR�O":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "ABRIL":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "MAIO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "JUNHO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "JULHO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "AGOSTO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "SETEMBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "OUTUBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "NOVEMBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "DEZEMBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    default:
                        System.out.println("\nMês inválido");

                }
                break;

            case 0:

                switch (mes.toUpperCase()) {

                    case "JANEIRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "FEVEREIRO":
                        System.out.println("\nO mês " + mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 28 dias");
                        break;

                    case "MARÇO":
                    case "MAR�O":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "ABRIL":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "MAIO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "JUNHO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "JULHO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "AGOSTO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "SETEMBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "OUTUBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    case "NOVEMBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 30 dias");
                        break;

                    case "DEZEMBRO":
                        System.out.println("\nO mês " +mes.substring(0, 1).toUpperCase() + mes.substring(1) + " possui 31 dias");
                        break;

                    default:
                        System.out.println("\nMês inválido");

                }
                break;
        }
    }
}
