
public class Aula01_Ex01 {

	public static void main(String[] args) {
		int [] vetor = {3, 5, 6, 5, 2, 6, 9, 0};
		imprimir(vetor);
		inverter(vetor);
		imprimir(vetor);

	}
	
	public static void imprimir(int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
		
	}
	
	public static void inverter(int[] v) {
		
		for (int i = 0; i < v.length / 2; i++) {
			int aux = v[i];
			v[i] = v[v.length - 1 - i];
			v[v.length - 1 - i] = aux;
		}
				
	}

}
