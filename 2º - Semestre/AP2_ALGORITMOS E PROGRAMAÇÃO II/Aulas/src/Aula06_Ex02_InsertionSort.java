import java.util.Arrays;
public class Aula06_Ex02_InsertionSort {

	public static void main(String[] args) {
		int[] vetor = {3, 1, 7, 5, 8, 6, 2, 4};
	    insertionSort(vetor);
	    System.out.println(Arrays.toString(vetor));
	}

	public static void insertionSort(int[] v) {
	    for (int i = 1; i < v.length; i++) {
	      int j = i;
	      int x = v[j];
	      while (j > 0 && x < v[j-1]) {
	        v[j] = v[j-1];
	        j--;
	      }
	      v[j] = x;
	    }
	  }
}
