package ADO_06;

public class ADO6_Ex1_Salario {

    public static void main(String[] args) {
        double salarioInicial = 1000;
        byte contador = 0;

        while (salarioInicial <= 5000) {
            salarioInicial = salarioInicial + (salarioInicial * 0.1);
            contador++;

            System.out.printf("Salario: %.2f\nAno de trabalho: %d\n\n", salarioInicial, contador);
        }

    }
}
