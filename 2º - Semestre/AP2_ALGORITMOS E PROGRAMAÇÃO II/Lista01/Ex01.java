
public class Ex01 {

	public static void main(String[] args) {

		int[] A = { 7, 2, 5, 8, 4 };
		int[] B = { 4, 2, 9, 5 };
		System.out.println(resposta(A, B));

	}

	public static String resposta(int[] a, int[] b) {
		String res = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					res += a[i] + " ";
				}

			}
		}
		if (res == "") {
			return "O vetores não possuem algum elemento de intersção";
		}
		else {
			return "A tem intersecção em B nos elementos { " + res + "}";
		}
		
	}

}
