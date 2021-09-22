import java.util.Arrays;

public class Ex01_OrdenarUltimo {

	public static void main(String[] args) {
		int vetor[] = {3,5,9,11,15,17,19,2};
		System.out.println(Arrays.toString(vetor));
		orderUltimo(vetor);
		System.out.println(Arrays.toString(vetor));
	}
	
	public static void orderUltimo(int v[]) {
		/*int aux = v[v.length - 1];
		for (int i = (v.length - 1);i > 0;i--) {
			if (aux < v[i - 1]) {
				v[i] = v[i - 1];
				v[i - 1] = aux;
			}*/
			
			int k = v.length - 1;
		    int x = v[k];
		    while (k > 0 && x < v[k-1]) {
		      v[k] = v[k-1];
		      k--;
		    }
		    v[k] = x;
			
		}
		
	}


