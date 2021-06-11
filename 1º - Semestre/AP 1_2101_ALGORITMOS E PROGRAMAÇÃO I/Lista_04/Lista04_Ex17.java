package Lista_04;

import java.util.Random;

public class Lista04_Ex17 {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        Random dado = new Random();
        int num = dado.nextInt(100);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = dado.nextInt(50);
        }


        System.out.println("Vetor:");
        for(int i : vetor) {
            System.out.println(i);
        }
        
        System.out.println("\nNum = " + num);
        
        System.out.println("\nProdutos:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d * %d = %d\n", vetor[i], num, num * vetor[i]);
        }
        
    }

}
