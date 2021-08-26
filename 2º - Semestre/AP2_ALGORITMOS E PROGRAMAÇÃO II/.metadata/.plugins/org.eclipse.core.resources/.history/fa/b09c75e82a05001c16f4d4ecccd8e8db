
public class Ex02_SemIntersec {

	public static void main(String[] args) {

		int[] A = { 7, 2, 5, 8, 4 };
		int[] B = { 4, 2, 9, 5 };
		System.out.println(resposta(A, B));

	}

	public static String resposta(int[] a, int[] b) {
		String res = "";
		boolean cont;
		for (int i = 0; i < a.length; i++) {
			cont = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					cont = true;

				}

			}
			if (!cont) {
				res += a[i] + " ";
			}
		}
		if (res == "") {
			return "O vetores possuem todos elementos em intersção";
		} else {
			return "A não tem intersecção em B nos elementos { " + res + "}";
		}

	}

}
