package ADO_03;

import java.util.Scanner;

public class ADO3_Ex10_Calculadora {

    public static void main(String[] args) {

        double a, b;
        String operacaoStr;
        char operacao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("+ _ Adição");
        System.out.println("- _ Subtração");
        System.out.println("* _ Multiplicação");
        System.out.println("/ _ Divisão");
        System.out.print("\nEscolha a operação: ");

        operacaoStr = entrada.next();
        operacao = operacaoStr.charAt(0);

        System.out.print("Digite o 1º Operando: ");
        a = entrada.nextDouble();
        System.out.print("Digite o 2º Operando: ");
        b = entrada.nextDouble();

        switch (operacao) {
            case '+':
                System.out.printf("\nSoma: %.2f\n" , (a + b));
                break;
            case '-':
                System.out.printf("\nSubtração: %.2f\n" , (a - b));
                break;
            case '*':
                System.out.printf("\nProduto: %.2f\n" , (a * b));
                break;
            case '/':
                System.out.printf("\nQuociente: %.2f\n" , (a / b));
                break;
            default:
                System.out.println("\nA operação " + operacao + " não é válida!");

        }

    }
}
