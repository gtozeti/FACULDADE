import java.util.Random;

public class teste2 {

	

		static int []met1(int[][] m) {
			
			int[] valores = new int [2];
			int soma = 0, contador = 0;
			
			for (int i = 0;i < m[0].length; i ++ ) {
				for (int j = 0;j < m.length; j ++) {
					soma += m[i][j];
					contador += 1;
					
				}
					
			}
			valores[0] = soma;
			valores[1] = contador;
			return valores;
		}
		
		
		static void met2(int[][] m) {


			
			for (int i = 0;i < m[0].length; i ++ ) {
				for (int j = 0;j < m.length; j ++) {

					System.out.print(m[i][j]+ " ");
					
				}
				System.out.print("\n");
					
			}
			
		}
		
		static void met3(int[][] m, int soma, int itens) {

			float media = soma/itens;
			
			System.out.printf("\nA média aritmética é %.2f ",media);
			System.out.printf("\nOs valores menores ou iguais à média calculada: ");
			
			for (int i = 0;i < m[0].length; i ++ ) {
				for (int j = 0;j < m.length; j ++) {
					if (m[i][j] <= media) {
						System.out.print(m[i][j] + " ");
					}
					
				}
					
			}
			
		}
		
	}
	
	

