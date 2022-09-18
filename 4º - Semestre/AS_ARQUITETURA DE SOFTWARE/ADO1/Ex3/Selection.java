package Ex3;

public class Selection implements Ordem {

    @Override
    public int[] efetuaOrdem(int[] vetor) {
        int i, j, min, aux;
        for (i = 0; i < vetor.length - 1; i++) {
            min = i;
            for (j = i + 1; j < vetor.length; j++)
                if (vetor[j] < vetor[min])
                    min = j;
            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }
        return vetor;
    }
}
