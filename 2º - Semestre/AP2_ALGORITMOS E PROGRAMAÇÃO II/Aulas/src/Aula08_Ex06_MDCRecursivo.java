
public class Aula08_Ex06_MDCRecursivo {

	public static void main(String[] args) {
		
		int m = 21, n = 12;
		
		System.out.println("O MDC de " + m +" e "+ n + " é: " + mdc(m,n));

	}
	
	 public static int mdc(int m, int n) {
		 
		int r = m % n;
		 
		 if (r == 0 ) {
			 return n;
		 }
		 
		 return mdc(n, r);
		 
	 }

}
