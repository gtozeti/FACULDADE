
public class Aula09_Ex07_ProdutoRecursivo {

	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		System.out.printf("Produto entre %d e %d é: %d", a, b, produtoRecursivo(a, b));

	}
	
	public static int produtoRecursivo(int a, int b) { 
	    if (b == 1) {
	    	return a;
	    }
	    return produtoRecursivo(a,  b-1) + a;
	  }

}
