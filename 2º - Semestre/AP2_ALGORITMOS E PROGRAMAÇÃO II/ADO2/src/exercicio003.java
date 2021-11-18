
public class exercicio003 {
	  /*
     * Integrantes: 
     * Matheus Cavalcanti de Arruda 
     * Gustavo Tozeti Herculano
     * 
     * 3. (2,0) Temos v�rios coelhos e cada coelho tem duas orelhas grandes e
     * flex�veis. Queremos calcular o n�mero total de orelhas em todos os coelhos de
     * forma recursiva (sem loops ou multiplica��o). Criar uma fun��o recursiva que
     * receba um n�mero N representando o n�mero de coelhos e retorne a n�mero total
     * de orelhas.
     * 
     * Exemplos: 
     * orelhasCoelho(0) -> 0 
     * orelhasCoelho(1) -> 2 
     * orelhasCoelho(2) -> 4
     */
    public static void main(String[] args) {
        System.out.println(orelhasCoelho(0));
        System.out.println(orelhasCoelho(1));
        System.out.println(orelhasCoelho(2));
    }

    public static int orelhasCoelho(int n) {
        // Condi��oo base para parar a recurs�o
        if (n == 0) {
            return 0;
        }

        // Retorna o par de orelha e faz a recurs�o substraindo um coelho
        return 2 + orelhasCoelho(n - 1);
    }

}
