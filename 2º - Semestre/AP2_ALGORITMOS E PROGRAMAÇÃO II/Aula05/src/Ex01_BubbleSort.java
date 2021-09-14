import java.util.Arrays;

public class Ex01_BubbleSort {

	public static void main(String[] args) {
		int[] vetor = {17, 32 ,8 ,51 ,23};
		System.out.println(Arrays.toString(vetor));
		bubbleSort(vetor);
		System.out.println(Arrays.toString(vetor));
	}
	
	static void bubbleSort(int[] v) {
		int aux = 0;
		for (int i = 0; i < v.length - 1; i ++) {
			for (int j = 0; j < v.length - i - 1; j ++) {
				if (v[j] > v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}

}
