import java.util.*;

public class Ex_2 {
    public static void main(String[] args) {
        float[][] k = new float[3][3];
        inserir(k);
        imprime(k);

    }

    public static void inserir(float[][] Matriz) {
        Random vrandom = new Random();

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = vrandom.nextFloat() * 100;
            }
        }

    }

    /**
     * Imprime os valores da matriz informada
     * 
     * @param Matriz float[][]
     */
    public static void imprime(float[][] Matriz) {

        // for (int i = 0; i < Matriz[0].length; i++) {
        // for (int j = 0; j < Matriz.length; j++) {
        // System.out.print(Matriz[i][j] + " ");
        // ;
        // }
        // System.out.println();
        // }
        
        // System.out.println();
        // for (float[] x : Matriz) {
        //     for (float y : x) {
        //         System.out.printf("| %.2f ", y);
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        System.out.println(Arrays.deepToString(Matriz));

    }
}
