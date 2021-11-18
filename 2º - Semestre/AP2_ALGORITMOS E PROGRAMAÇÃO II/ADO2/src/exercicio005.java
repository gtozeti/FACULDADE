
public class exercicio005 {
    /*
     * Integrantes: 
     * Matheus Cavalcanti de Arruda 
     * Gustavo Tozeti Herculano
     * 
     * 5. (2,0) Temos triângulos feito de blocos. A linha superior tem 1 bloco, a
     *  próxima linha abaixo tem 2 blocos, a próxima linha tem 3 blocos e assim por
     *  diante. Criar uma função recursiva que calcule (sem loops ou multiplicação)
     *  o número total de blocos em um triângulo com o número especificado de linhas.
     * 
     * Exemplos: 
     * triangulo(0) -> 0 
     * triangulo(1) -> 1 
     * triangulo(2) -> 3
     */
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println(triangulo(i));
        }
    }

    public static int triangulo(int n) {
        // Condição base para parar a recursão
        if (n == 0) {
            return 0;
        }

        // Soma o valor da linha ao resultado.
        return n + triangulo(n - 1);
    }

}
