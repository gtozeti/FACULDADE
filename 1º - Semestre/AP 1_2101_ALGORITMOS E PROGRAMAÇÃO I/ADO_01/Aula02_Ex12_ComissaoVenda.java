package ADO_01;

import java.util.Scanner;

public class Aula02_Ex12_ComissaoVenda {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int qtd;
        float preco, total, comissao;
        String vendedor,cod;
        
        System.out.print("Informe o vendedor: "); 
        vendedor = entrada.next();
        
        System.out.print("Digite o código da peça: ");
        cod = entrada.next();
        
        System.out.print("Digite o preço unitário da peça: ");
        preco = entrada.nextFloat();
        
        System.out.print("Digite a quantidade de peças vendidas: ");
        qtd = entrada.nextInt();
        

        total = preco * qtd;
        comissao = (float) (total * 0.05);
        
        
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n","Vendedor","Código da peça","Peças vendidas","Total da Venda","Bônus de 5% sobre a venda");
        System.out.printf("%-20s %-20s %-20s R$ %-20.2f R$ %-20.2f\n",vendedor,cod,qtd,total,comissao);

    }
}
