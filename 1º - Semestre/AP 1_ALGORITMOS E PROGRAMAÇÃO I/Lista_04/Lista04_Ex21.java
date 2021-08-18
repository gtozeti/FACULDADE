package Lista_04;

import java.util.Random;

public class Lista04_Ex21 {

    public static void main(String[] args) {

       String[] nomes = {"Arthur", "Matheus", "Gutavo", "Joao", "Isabella", "Fabiane", "Guilherme", "Ademir", "Paola", "Julia"};
        float[][] notas = new float[10][4];
        Random dado = new Random();
        
        for (int i = 0; i < notas.length; i ++ ) {
            for (int y = 0; y < 4; y++) {
                notas[i][y] = dado.nextInt(10);
            }
        }
        
        float[] mediaAlunos = new float[10];
        float mediaSala = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int y = 0; y < 4; y++) {
                mediaAlunos[i] = mediaAlunos[i] + notas[i][y];
            }
            mediaAlunos[i] = mediaAlunos[i] / 4;
            mediaSala = mediaAlunos[i] + mediaSala;
        }
        
        mediaSala = mediaSala / 10;
        
        System.out.println("Media alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s - %.2f\n", nomes[i], mediaAlunos[i]);
        }
        
        
        
        System.out.printf("\nMedia sala = %.2f\n", mediaSala);
        
        System.out.println("\nAlunos acima da media:");
        for (int i = 0; i < 10; i++) {
            if(mediaAlunos[i] > mediaSala) {
                System.out.printf("%s - %.2f\n", nomes[i], mediaAlunos[i]);
            }
        }
        
    }

}
