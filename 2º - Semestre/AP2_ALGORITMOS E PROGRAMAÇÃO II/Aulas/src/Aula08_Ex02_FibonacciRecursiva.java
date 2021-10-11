
public class Aula08_Ex02_FibonacciRecursiva {

	public static void main(String[] args) {
		
		System.out.println(fibonacciRecursiva(4));

	}

	public static int fibonacciRecursiva(int n) {

		if (n < 2) {

			return n;

		}

		return fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2);

	}

}
