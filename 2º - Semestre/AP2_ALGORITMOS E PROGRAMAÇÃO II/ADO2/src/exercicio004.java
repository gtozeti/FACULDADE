
public class exercicio004 {

	 /*
     * Integrantes: 
     * Matheus Cavalcanti de Arruda 
     * Gustavo Tozeti Herculano
     * 
     * 4. (2,0) Dada uma string, criar uma fun��o recursiva (sem la�os) que compute
     * o n�mero de caracteres 'x' na string.
     * 
     * Exemplos: 
     * contarX("xxhixx") -> 4 
     * contarX("xhixhix") -> 3 
     * contarX("hi") -> 0
     */
    public static void main(String[] args) {
        System.out.println(contarX("xxhixx"));
        System.out.println(contarX("xhixhix"));
        System.out.println(contarX("hi"));
    }

    public static int contarX(String s) {
        // Se a palavra n�o contem a letra 'x' o algoritmo j� retorna 0, evitando
        // recurs�es a mais.
        if (!s.contains("x")) {
            return 0;
        }

        // Condi��o base para saber quando a String terminou.
        if (s.length() == 0) {
            return 0;
        }

        // Separa a String em substrings de uma legra para verificar se � igual a 'x'
        if (s.substring(0, 1).equals("x")) {
            // Se for igual a 'x' � somado um e � feita a recursa� a partir da pr�xima letra
            // da String.
            return 1 + contarX(s.substring(1));
        }

        // Caso n�o encontra a letra 'x' � feita a recursa� a partir da pr�xima letra da
        // String.
        return contarX(s.substring(1));
    }

}
