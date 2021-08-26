package ADO_05;

import java.util.Scanner;

public class ADO5_Ex1_Despertador {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int horas, min, seg, semana;
        String nomeSemana = "";

        do {
            System.out.print("Digite a(s) hora(s) para o despertador: ");
            horas = input.nextInt();
        } while (horas < 0 || horas > 23);

        do {
            System.out.print("Digite o(s) minuto(s) para o despertador: ");
            min = input.nextInt();
        } while (min < 0 || min > 59);

        do {
            System.out.print("Digite o(s) segundo(s) para o despertador: ");
            seg = input.nextInt();
        } while (seg < 0 || seg > 59);

        do {
            System.out.print("Digite o dia da semana para o despertador:\n\n1 - Domingo\n2 - Segunda-Feira\n3 - Terça-Feira\n4 - Quarta-Feira\n5 - Quinta-Feira\n6 - Sexta-Feira\n7 - Sábado\n\n");
            semana = input.nextInt();
        } while (semana < 1 || semana > 7);

        for (int se = 1; se <= 7; se++) {

            switch (se) {

                case 1:
                    nomeSemana = "Domingo";
                    break;
                case 2:
                    nomeSemana = "Segunda-Feira";
                    break;
                case 3:
                    nomeSemana = "Terça-Feira";
                    break;
                case 4:
                    nomeSemana = "Quarta-Feira";
                    break;
                case 5:
                    nomeSemana = "Quinta-Feira";
                    break;
                case 6:
                    nomeSemana = "Sexta-Feira";
                    break;
                case 7:
                    nomeSemana = "Sábado";
                    break;

            }

            for (int h = 0; h <= 23; h++) {
                for (int m = 0; m <= 59; m++) {
                    for (int s = 0; s <= 59; s++) {
                        System.out.printf("%s - %02d:%02d:%02d\n", nomeSemana, h, m, s);

                        if (se == semana && h == horas && m == min && s == seg) {
                            System.out.println("ALARME !!!");
                            break;
                        }
                    }
                    if (se == semana && h == horas && m == min) {
                        break;
                    }

                }
                if (se == semana && h == horas) {
                    break;
                }

            }
            if (se == semana) {
                break;
            }

        }
    }
}
