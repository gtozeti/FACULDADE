
public class exercicio006 {

    /*
     * Integrantes: 
     * Matheus Cavalcanti de Arruda 
     * Gustavo Tozeti Herculado
     * 
     * 6. (2,0) A multiplicação Russa consiste em:
     * 
     * a) Escrever os números A e B, que se deseja multiplicar na parte superior das colunas;
     * 
     * b) Dividir A por 2, sucessivamente, ignorando o resto até chegar à unidade, escrever os
     *  resultados da coluna A;
     * 
     * c) Multiplicar B por 2 tantas vezes quantas se haja dividido A por 2, 
     * escrever os resultados sucessivos na coluna B;
     * 
     * d) Somar todos os números da coluna B que estejam ao lado de um número ímpar da coluna A.
     * 
     * Criar uma função recursiva que permita fazer à multiplicação russa de 2 entradas.
     */

    public static void main(String[] args) {
        System.out.println(russa(27, 82));
    }

    public static int russa(int a, int b) {
        // Condição base para parar a recursão.
        if (a == 1) {
            return b;
        }

        // Se a / 2 for ímpar a gente soma o b * 2 ao resultado.
        if (a % 2 != 0) {
            return b + russa(a / 2, b * 2);
        }
        
        // Se a / 2 for par não é feita a soma.
        return russa(a / 2, b * 2);
    }
	
}
