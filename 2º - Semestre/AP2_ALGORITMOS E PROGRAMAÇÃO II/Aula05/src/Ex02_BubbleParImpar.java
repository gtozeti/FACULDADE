import java.util.Arrays;

public class Ex02_BubbleParImpar {

	public static void main(String[] args) {
		int[] vetor = {17, 32 ,8 ,51 ,23, 6, 7, 45};
		System.out.println(Arrays.toString(vetor));
		bubbleSort(vetor);
		System.out.println(Arrays.toString(vetor));

	}
	
	static void bubbleSort(int[] v) {
		int aux = 0;
		for (int i = 0; i < v.length - 1; i ++) {
			for (int j = 0; j < v.length - i - 1; j ++) {
				if (v[j] % 2 != 0) {
					
					aux = v[v.length - i - 1];
					v[v.length - i - 1] = v[j];
					v[j] = aux;
					
				}
			}
		}
	}

}
