package Ex2;

public class UsaStrategy {
    public static void main(String[] args) {

        Imposto1 ip1 = new Imposto1();
        Imposto2 ip2 = new Imposto2();
        Imposto3 ip3 = new Imposto3();

        Orcamento lista = new Orcamento();

        int prod = 0;

        System.out.println("\n------------- Exercício 2 -------------\n");
        for (Valor v : lista.getValores()) {
            System.out.println(String.format(
                    "O produto %d com valor de R$: %.2f, possui os seguintes impostos:\nImposto 1: R$ %.2f\nImposto 2: R$ %.2f\nImposto 3: R$ %.2f\n",
                    (prod + 1), v.getValor(), ip1.operacao(v), ip2.operacao(v), ip3.operacao(v)));
            prod++;
        }

    }
}
