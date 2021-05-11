package Aula11;

import java.util.Scanner;

public class Calculadora {

    static Scanner input = new Scanner(System.in);

    static float entradaDados() {
        float n;
        System.out.println("*-- Entrada de Dados --*");
        System.out.println("Numero: ");
        n = input.nextFloat();
        return n;

    }

    static int menu() {

        int op;

        do {
            System.out.println("*-- Menu --*");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("Opção: ");
            op = input.nextInt();
        } while (op < 1 || op > 4);

        return op;
    }

    static float adicao(float n1, float n2) {
        System.out.println("*-- Adição --*");
        float resultado;
        resultado = n1 + n2;
        return resultado;
    }

    static float subtracao(float n1, float n2) {
        System.out.println("*-- Subtração --*");
        float resultado;
        resultado = n1 - n2;
        return resultado;
    }

    static float multiplicacao(float n1, float n2) {
        System.out.println("*-- Multiplicação --*");
        float resultado;
        resultado = n1 * n2;
        return resultado;
    }

    static float divisao(float n1, float n2) {
        System.out.println("*-- Divisão --*");
        float resultado;
        resultado = n1 / n2;
        return resultado;
    }

    static void imprimirResultado(float result, float n1, float n2, int op) {
        System.out.println("*-- Imprimir --*");
        System.out.println("Resultado: " + result);
        System.out.printf("Resultado de \n %.2f %d %.2f é \n igual a %.2f \n", n1, op, n2, result);
    }

    static float controlador(int op, float n1, float n2) {
        System.out.println("*-- Controlador --*");
        float resultado = 0;
        switch (op) {
            case 1:
                resultado = adicao(n1, n2);
                break;
            case 2:
                resultado = subtracao(n1, n2);
                break;
            case 3:
                resultado = divisao(n1, n2);
                break;
            case 4:
                resultado = multiplicacao(n1, n2);
                break;
        }
        return resultado;
    }

    public static void main(String[] args) {
            
        int op = menu();
        float n1 = entradaDados();
        float n2 = entradaDados();
        float resultado = controlador(op, n1, n2);
        imprimirResultado(resultado, n1, n2, op);
    }

}
