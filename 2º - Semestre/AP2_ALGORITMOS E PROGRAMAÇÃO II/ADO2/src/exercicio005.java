
public class exercicio005 {
    /*
     * Integrantes: 
     * Matheus Cavalcanti de Arruda 
     * Gustavo Tozeti Herculano
     * 
     * 5. (2,0) Temos tri�ngulos feito de blocos. A linha superior tem 1 bloco, a
     *  pr�xima linha abaixo tem 2 blocos, a pr�xima linha tem 3 blocos e assim por
     *  diante. Criar uma fun��o recursiva que calcule (sem loops ou multiplica��o)
     *  o n�mero total de blocos em um tri�ngulo com o n�mero especificado de linhas.
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
        // Condi��o base para parar a recurs�o
        if (n == 0) {
            return 0;
        }

        // Soma o valor da linha ao resultado.
        return n + triangulo(n - 1);
    }

}
