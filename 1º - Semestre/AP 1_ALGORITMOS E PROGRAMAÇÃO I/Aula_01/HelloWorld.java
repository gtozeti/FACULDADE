package Aula01;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome = "Gustavo";
        byte idade = 24;
        int n1 = 8;
        int n2 = 5;
        int soma;
        soma = n1 + n2;

        System.out.println("Hello World");
        System.out.println("Seja bem-vindo " + nome);
        System.out.println("Olá " + nome + ", sua idade é: " + idade);
        System.out.println("Soma: " + soma);

        System.out.print("Digite seu nome: ");
        String name = input.next();
        System.out.println("Seu nome é: " + name);
    }

}
