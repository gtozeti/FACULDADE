
public class Aula09_Ex05_BuscaLinearRecursiva {

	public static void main(String[] args) {
		int[] v = {3, 7, 8, 11, 14, 18, 21, 25};
	    int p = buscaLinear(14, v, 0);
	    System.out.println("Posicao: " + p);
	    int soma = somaRecursiva(v, 0);
	    System.out.println("Soma: " + soma);
	    int menor = menorRecursiva(v, v.length);
	    System.out.println("Menor: " + menor);
	    float media = mediaRecursiva(v,0);
	    System.out.printf("Media: %.2f",  media);
	}
	
	// EX 5a
	public static int buscaLinear(int x, int v[], int i) { 
	    if (i == v.length) {
	      return -1;
	    }
	    if (v[i] == x) {
	      return i;
	    }
	    return buscaLinear(x, v, i + 1);
	    
	  }
	
	// EX 5b
	public static int menorRecursiva(int v[], int i) { 
	    if (i == 1) {
	      return v[0];
	    }
	    int x = menorRecursiva(v, i-1);
	    if (v[i-1] > x) {
	      return x;
	    }
	    else {
	    	return v[i-1];
	    }
	    
	  }
		
	
	// EX 5c
	public static int somaRecursiva(int v[], int i) {
		if (i == v.length) {
			return 0;
		}
		else {
			return v[i] + somaRecursiva(v, i + 1);
		}
	}
	
	// EX 5d
	public static float mediaRecursiva(int v[], int i) {
		if (i == v.length) 
			return 0;
		
		float soma = v[i] + mediaRecursiva(v, i+ 1);
		if (i == 0) {
			return soma / v.length;
		}
		else {
			return soma;
		}
		
	}

}
