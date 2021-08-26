public class Teste {

	public static void main(String[] args) {
		
		  double vetorA[] = new double[] { 11.23, 37.92, 9.34, 10.18, 45.1, 3.47, 5.32, 1.76, 14.24, 2.85 };
		  
		  double produto = 1, soma = 0, divi = 0;
		  
		  produto = IndicePar(vetorA);
		  soma = IndiceImpar(vetorA);
		  divi = DivisaoIndices(produto, soma);
		  
		  print(divi);

		  //6378.85986077209

		

	}

	static double IndicePar(double vetor[]) {
		
		double valor = 1;
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (i % 2 == 0) {
				valor = valor * vetor[i];
			}
			
		}
		
		return valor;
	}
	
	static double IndiceImpar(double vetor[]) {
		
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			if (i % 2 != 0) {
				soma = soma + vetor[i];
			}
			
		}
		
		return soma;
	}
	
	static double DivisaoIndices(double produto, double soma) {
		
		double divi = produto / soma;
				
		return divi;
	}

	static void print(double divi) {
		
		System.out.printf("\nO valor encontrado da divisão entre o produto dos elementos dos indices pares pela soma dos indices impares do vetor, corresponde a %.2f", divi);
		
	}
		
	
}
