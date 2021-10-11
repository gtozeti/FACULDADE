public class Aula07_Ex04_RecursivoBin {

	public static void main(String[] args) {
		
		bin(13);
	}
	
	public static void bin(int n) {
		
		if (n < 2 ) {
			System.out.print(n);
		}
		else {
			bin(n/2);
			System.out.print(n % 2);
		}
		
		
	}

}
