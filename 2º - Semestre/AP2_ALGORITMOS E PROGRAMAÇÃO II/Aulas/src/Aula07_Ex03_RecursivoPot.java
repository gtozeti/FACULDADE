
public class Aula07_Ex03_RecursivoPot {

	public static void main(String[] args) {
		
		System.out.println("O resultado é " + potencia(4, 5));
	}
	
	public static int potencia(int a, int n) {
		
		if (n == 0 ) {
			return 1;
		}
		return a * potencia(a,n-1);
		/*
		 * int p = potencia(a, n-1);
		 * int r = p * a;
		 * return r;
		 * 
		 */
		
	}

}
