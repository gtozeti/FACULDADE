
public class Aula08_Ex01_ProfundidadeFib {

	public static void main(String[] args) {

		System.out.println("Profundidade: " + fibonacciRecursiva(30));

	}

	public static int fibonacciRecursiva(int n) {

		if (n < 2) {

			return 0;

		}

		return fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2) + 2;

	}

}
