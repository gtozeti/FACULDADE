package ADO_03;

import java.util.Scanner;

public class ADO3_Ex3_Cedulas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int valor, teste, n100 = 0, n50 = 0, n10 = 0, n5 = 0, n1 = 0;
        boolean n_100 = false,n_50 = false,n_10 = false,n_5 = false,n_1 = false;

        System.out.print("Digite o valor: R$ ");
        valor = entrada.nextInt();

        do {

            teste = valor - 100; //VARIÁVEL TESTE PARA VERIFICAR SE É POSSÍVEL UTILIZAR NOTAS DE R$100,00

            if (teste < 0) {

                teste = valor - 50;//VARIÁVEL TESTE PARA VERIFICAR SE É POSSÍVEL UTILIZAR NOTAS DE R$50,00
                
                if (teste < 0) {
                    
                    teste = valor - 10;//VARIÁVEL TESTE PARA VERIFICAR SE É POSSÍVEL UTILIZAR NOTAS DE R$10,00
                    
                    if (teste < 0) {
                        
                        teste = valor - 5;//VARIÁVEL TESTE PARA VERIFICAR SE É POSSÍVEL UTILIZAR NOTAS DE R$5,00
                        
                        if (teste < 0) {
                            
                            teste = valor - 1;//VARIÁVEL TESTE PARA VERIFICAR SE É POSSÍVEL UTILIZAR NOTAS DE R$1,00
                            
                            if (teste < 0) {
                                
                                valor = 0;
                                
                            } else {//CASO FOR POSSÍVEL UTILIZAR NOTAS DE R$1,00
                                valor = valor - 1;//ATUALIZAÇÃO DO VALOR
                                n1++;
                                n_1 = true;
                            }
                        } else {//CASO FOR POSSÍVEL UTILIZAR NOTAS DE R$5,00
                            valor = valor - 5;//ATUALIZAÇÃO DO VALOR
                            n5++;
                            n_5 = true;
                        }
                    } else {//CASO FOR POSSÍVEL UTILIZAR NOTAS DE R$10,00
                        valor = valor - 10;//ATUALIZAÇÃO DO VALOR
                        n10++;
                        n_10 = true;
                    }
                } else {//CASO FOR POSSÍVEL UTILIZAR NOTAS DE R$50,00
                    valor = valor - 50;//ATUALIZAÇÃO DO VALOR
                    n50++;
                    n_50 = true;
                }

            } else {//CASO FOR POSSÍVEL UTILIZAR NOTAS DE R$100,00
                valor = valor - 100;//ATUALIZAÇÃO DO VALOR
                n100++;
                n_100 = true;
            }

        } while (valor > 0);
        
        System.out.print("\n");
        System.out.print(n_100 ? (n100 + " nota(s) de R$ 100\n"): "");
        System.out.print(n_50 ? (n50 + " nota(s) de R$ 50\n"): "");
        System.out.print(n_10 ? (n10 + " nota(s) de R$ 10\n"): "");
        System.out.print(n_5 ? (n5 + " nota(s) de R$ 5\n"): "");
        System.out.print(n_1 ? (n1 + " nota(s) de R$ 1\n"): "");
        System.out.print("\n");
        
        }
}
