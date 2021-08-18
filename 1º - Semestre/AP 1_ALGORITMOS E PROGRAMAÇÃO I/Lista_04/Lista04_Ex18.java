package Lista_04;

import java.util.Random;

public class Lista04_Ex18 {

    public static void main(String[] args) {

        float[] vetor = new float[10];
        Random dado = new Random();
        float num = dado.nextInt(50);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = dado.nextInt(10);
        }

        System.out.println("Num = " + num);

        System.out.println("\nVetor: ");
        for (float i : vetor) {
            System.out.println(i);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (num == vetor[i]) {
                System.out.println("Num esta contido no vetor");
                System.out.printf("%.1f == vetor[%d]\n", num, i);
            }
        }

    }

}
