
public class exercicio004 {

	 /*
     * Integrantes: 
     * Matheus Cavalcanti de Arruda 
     * Gustavo Tozeti Herculano
     * 
     * 4. (2,0) Dada uma string, criar uma função recursiva (sem laços) que compute
     * o número de caracteres 'x' na string.
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
        // Se a palavra não contem a letra 'x' o algoritmo já retorna 0, evitando
        // recursões a mais.
        if (!s.contains("x")) {
            return 0;
        }

        // Condição base para saber quando a String terminou.
        if (s.length() == 0) {
            return 0;
        }

        // Separa a String em substrings de uma legra para verificar se é igual a 'x'
        if (s.substring(0, 1).equals("x")) {
            // Se for igual a 'x' é somado um e é feita a recursaõ a partir da próxima letra
            // da String.
            return 1 + contarX(s.substring(1));
        }

        // Caso não encontra a letra 'x' é feita a recursaõ a partir da próxima letra da
        // String.
        return contarX(s.substring(1));
    }

}
