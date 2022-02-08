
import java.util.Random;

public class Exemplo1 {

    private static final int MAX = 20; //Valor final da constante, não podendo ser alterado durante a execução do código

    public static void main(String[] args) {

        int[] p = new int[10];
        int[] mm = new int[2];

        mm = inserir(p);
        mostrar(p);

        System.out.println("\nMenor: " + mm[0]);
        System.out.println("Maior: " + mm[1]);

    }

    public static int[] inserir(int[] p) {
        Random r = new Random();
        int valores[] = new int[2];
        int maior = 0, menor = 0;

        for (int i = 0; i < p.length; i++) {
            p[i] = 1 + r.nextInt(100);
            if (i == 0) {
                maior = p[i];
                menor = maior;
            } else {
                if (p[i] > maior) {
                    maior = p[i];
                }
                if (p[i] < menor) {
                    menor = p[i];
                }
            }

        }
        valores[0] = menor;
        valores[1] = maior;

        return valores;
    }

    public static void mostrar(int[] p) {
        for (int i : p) {
            System.out.println(i);
        }

    }
}
