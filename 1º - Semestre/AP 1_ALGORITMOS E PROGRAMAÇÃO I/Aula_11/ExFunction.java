package Aula11;

public class ExFunction {

    public static void main(String[] args) {

        int x = 11;
        int y = 6;
        int c = minimo(x, y);
        System.out.println("Minimo: " + c);

    }

    static int minimo(int a, int b) {

        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
