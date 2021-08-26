/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO4;

import java.util.Scanner;

/**
 *
 * @author Matheus
 */
public class Exercicio2_ADO4 {
    public static void main(String[] args) {
        /* Implemente uma questão de múltipla escolha referente a alguma 
        das outras disciplinas que você está cursando neste semestre. 
        Primeiro deverá ser apresentado o enunciado da questão com as 5 
        opções/alternativas de resposta, quesão (a), (b), (c), (d) e (e). 
        Depois que o usuário escolher uma opção, se for a resposta correta 
        deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”.
        Utilize a instrução switch, invés de if, na implementação. */
        
        //Numeros na parte superior: ⁰¹²³⁴⁵⁶⁷⁸⁹
        //Resposta certa: b
        System.out.println("Multiplique binômios por polinômios:\n");
        System.out.println("(2 + 3w) (w² + 6w + 9) = \n");
        System.out.println("a) 2w³ + 18w² + 39w + 18 \nb) 3w³ + 20w² + 39w + 18\nc) 3w³ + 20w² + 37w + 18\nd) 3w³ + 15w² + 42w + 9\ne) 2w³ + 18w² + 39w + 9\n");
        
        //Processo logico
        Scanner entrada = new Scanner(System.in);
        String RespostaStr;
        char Resposta;
        
        System.out.print("Qual alternativa está correta?: ");
        RespostaStr = entrada.next();
        Resposta = RespostaStr.charAt(0);
        
        switch(Resposta) {
            case 'b':
            case 'B':
                System.out.println("Resposta correta.");
                break;
            case 'a':
            case 'A':
            case 'c':
            case 'C':
            case 'd':
            case 'D':
            case 'e':
            case 'E':
                System.out.println("Resposta incorreta.");
                break;
            default:
                System.err.println("Resposta inválida");
        }
    }
}
