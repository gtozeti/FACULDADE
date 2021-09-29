import java.util.Arrays;

public class Aula05_Ex02_BubbleParImpar {

	public static void main(String[] args) {
		int[] vetor = {3, 1 ,7, 2, 5, 8, 9, 6, 4};
		System.out.println(Arrays.toString(vetor));
		bubbleSort(vetor);
		System.out.println(Arrays.toString(vetor));

	}
	
	static void bubbleSort(int[] v) {
		int aux = 0;
		for (int i = 0; i < v.length - 1; i ++) {
			for (int j = 0; j < v.length - i - 1; j ++) {
				//if (!ehPar(v[j]) && ehPar(v[j+1]))
				if (v[j] % 2 != 0) {
					
					aux = v[v.length - i - 1];
					v[v.length - i - 1] = v[j];
					v[j] = aux;
					
				}
			}
		}
	}
	
	
	//static static bollean ehPar(int n){
		//return n % 2 == 0 ;
	//}

}
