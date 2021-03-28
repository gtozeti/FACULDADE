package Lista_01;

import java.util.Scanner;

public class Lista01_Ex16 {

    public static void main(String[] args) {
       
        int horaI, horaF, total;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        horaI = entrada.nextInt();
        System.out.print("Digite a hora final do jogo: ");
        horaF = entrada.nextInt();

        
        if (horaI < horaF) {

            total = (horaF - horaI);
            System.out.printf("\nO JOGO DUROU %d HORA(S)\n", total);

        } else if (horaI > horaF){

            total = (24 - horaI) + horaF;
            System.out.printf("\nO JOGO DUROU %d HORA(S)\n", total);

        }else {
            
            System.out.print("\nO JOGO DUROU 24 HORA(S)\n");
            
        }

    }
}
