package Ex3;

public class Insertion implements Ordem {

    @Override
    public int[] efetuaOrdem(int[] vetor) {
        int j, temp;
        for (int i = 1; i < vetor.length; i++) {
            j = i;
            temp = vetor[j];
            while (j > 0 && temp < vetor[j-1]) {
                vetor[j] = vetor[j-1];
              j--;
            }
            vetor[j] = temp;
          }
        return vetor;
    }
    
}
