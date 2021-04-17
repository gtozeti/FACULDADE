package ADO_04;

public class ADO4_Ex1_Pares1e100 {

    public static void main(String[] args) {

        int i = 1;

        while (i < 100) {

            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            } else {
                i++;
            }

        }

    }
}
