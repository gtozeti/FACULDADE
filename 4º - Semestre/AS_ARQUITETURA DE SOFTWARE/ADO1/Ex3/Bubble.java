package Ex3;

public class Bubble implements Ordem {

    @Override
    public int[] efetuaOrdem(int[] vetor) {
        int i, j, temp;
        for (j = 0; j < vetor.length - 1; j++)
            for (i = 0; i < vetor.length - 1 - j; i++)
                if (vetor[i] > vetor[i + 1]) {
                    temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                }
        return vetor;
    }

}
