package ADO_06;

import java.util.Scanner;

public class ADO6_Ex2_Login {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senhaUsuario, senhaConfirmacao, loginUsuario, loginConfirmacao;
        byte contador = 3;
        
        System.out.print("Defina um usuario: ");
        loginUsuario = entrada.next();
        System.out.println("Usuario definido com sucesso!\n");
        System.out.print("Defina uma senha: ");
        senhaUsuario = entrada.next();
        System.out.println("Senha definida com sucesso!\n");
        
        do {
            System.out.println("Confirme o usuario: ");
            loginConfirmacao = entrada.next();
            System.out.print("Confirme a senha: ");
            senhaConfirmacao = entrada.next();
            
            if (senhaConfirmacao.equals(senhaUsuario) && loginConfirmacao.equals(loginUsuario)) {
                System.out.println("Dados corretos");
                break;
            } else {
                contador--;
                switch (contador){
                    case 2:
                    case 1:
                        System.out.println("Usuario ou senha incorreta.\nPor favor, tente novamente");
                        System.out.printf("Você tem %d tentativas restantes.\n\n", contador);
                        break;
                    case 0:
                        System.out.println("Usuario ou senha incorreta.\nSua conta foi bloqueada.\n");
                        break;
                }
            }
        } while (contador > 0);
        
    }
}
