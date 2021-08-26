package Teste_Codigos;

import java.util.Scanner;

public class T1{

    public static void main(String[] args) {
            int a,b,c;
            float raizDelta,delta; 
            
            Scanner entrada = new Scanner(System.in);
        
            System.out.print("Digite A: ");
            a = entrada.nextInt();
            System.out.print("Digite B: ");
            b = entrada.nextInt();
            System.out.print("Digite C: ");
            c = entrada.nextInt();
            
            
            delta = ((int)Math.pow(b, 2) - 4 * a * c);
            if (delta < 0 ){
                
                System.out.println("Impossivel calcular");
                
            }else {
                
                raizDelta = (float) Math.sqrt(delta);
                System.out.println("Raiz X1 = " + ((-b + raizDelta)/(2*a)));
                System.out.println("Raiz X1 = " + ((-b - raizDelta)/(2*a)));
                
            }
                
                
                
                
           
        
        
        
    }
}
