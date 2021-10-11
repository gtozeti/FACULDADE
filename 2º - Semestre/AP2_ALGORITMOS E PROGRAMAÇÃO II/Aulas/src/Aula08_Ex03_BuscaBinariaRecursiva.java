
public class Aula08_Ex03_BuscaBinariaRecursiva {

	public static void main(String[] args) {
		int[] v = {3, 7, 8, 11, 14, 18, 21, 25};
	    int p = buscaBinaria(15, v, 0, v.length - 1);
	    System.out.println("Posicao: " + p);
	  }

	  public static int buscaBinaria(int x, int v[], int i, int f) {
	    if (i > f) {
	      return -1;
	    }
	    int m = (i + f) / 2;
	    if (v[m] == x) {
	      return m;
	    }
	    if (x < v[m]) {
	      return buscaBinaria(x, v, i, m - 1);
	    }
	    else {
	      return buscaBinaria(x, v, m + 1, f);
	    }
	  }
	}

