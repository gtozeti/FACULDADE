package Lista_01;

import java.util.Scanner;

public class Lista01_Ex10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        float salarioFixo, totalVendas, total;

        System.out.print("Digite o nome do(a) vendedor(a): ");
        nome = entrada.next();
        System.out.print("Digite o salário fixo do(a) vendedor(a): ");
        salarioFixo = entrada.nextFloat();
        System.out.print("Digite o total de vendas do(a) vendedor(a): ");
        totalVendas = entrada.nextFloat();
        
        total = (float) (salarioFixo + (totalVendas * 0.15));

        System.out.printf("\n%s ao final do mês recebe um salário de R$ %.2f\n", nome, total);

    }
}
