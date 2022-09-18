package Ex3;

import java.util.Random;

public class Lista {
    private int tamanho;
    private int[] lista;

    public Lista(int tamanho) {
        this.tamanho = tamanho;

        lista = new int[this.tamanho];
        Random r = new Random();

        for (int k = 0; k < tamanho; k++) {
            lista[k] = (r.nextInt(100) + 1);
        }
    }

    public int[] getLista() {
        return lista;
    }
}
