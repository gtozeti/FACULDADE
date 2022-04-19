import java.util.ArrayList;

/**
 * Programar o exemplo dos slides sobre o programa de folha de pagamento:
 * 
 *      Inicie programando a classe abstrata deste conjunto de slides (aula classes abstratas), a seguir implemente as sub-classes também mostradas neste.
 *      Por fim execute o exemplo sobre polimorfismo (aula polimorfismo slide 26) envolvendo as 5 classes que você desenvolveu até agora e juntando todas elas na lista Employes [].
 *      Poste no black board a saída do programa da aula sobre polimorfismo e o conjunto de arquivos programados na pasta do projeto do Netbeans (slide 26).
 *      
 * *** Caso tenha desenvolvido um exemplo exclusivamente seu na ultima atividade poderá continua-lo adicionando uma classe abstrata a ele. ***
 * 
 * *** Nesta segunda etapa será obrigatório a implementação de ao menos 1 Interface. ***
 *
 * @author: Gustavo Tozeti Herculano
 * @version: 1.0
 *           Main Class File: topAXX.java
 *           File: Structure.java
 *           Date: 16/04/2022
 */

public class Seguradora {
    
    private ArrayList<Registravel> registravel;

    public static void main(String[] args) {
        Seguradora seg = new Seguradora();
        seg.informaDados();
        seg.validaOperacao();
    }

    // Inicialização do ArrayList
    public Seguradora(){
        registravel = new ArrayList<Registravel>();
    }


    
    public void informaDados(){

        registravel.add(new PlanoA("Enzo Lorenzo Assunção", "248.491.088-65", 27, "Oftalmologista", "Dermatologista"));
        registravel.add(new PlanoA("Luna Sarah Farias", "599.803.639-59", 17, "Oftalmologista", "Nutricionista"));
        registravel.add(new PlanoA("Isabelly Rosa da Cruz", "874.206.328-04", 45, "Oftalmologista", "Dermatologista"));
        registravel.add(new PlanoA("Alexandre Bryan da Mota", "105.809.743-16", 34, "Dentista", "Clínico Geral"));
        registravel.add(new PlanoB("Patrícia Rosângela Fernanda Rezende", "434.462.265-08", 35, 343.65, 123.75));
        registravel.add(new PlanoB("Patrícia Rosângela Fernanda Rezende", "434.462.265-08", 35, 343.65, 123.75));
        registravel.add(new PlanoB("Fábio Manoel Pires", "737.913.350-06", 65, 700.01, 83.75));
        registravel.add(new PlanoB("Rebeca Sarah Martins", "397.351.819-08", 55, 800.41, 456.75));

        registravel.add(new Clinica("Rua Iliseo Antônio Balsanelli", "749", "SC", "Joinville", "Clínica Badolato"));
        registravel.add(new Clinica("Rua Itapessununga", "141 A", "PI", "Teresina", "Laborline"));
        registravel.add(new Clinica("Rua Feijó", "324", "AC", "Rio Branco", "Belmonte Saúde"));
        registravel.add(new Clinica("Rua São Francisco", "661", "AC", "Rio Branco", "Endoclinica Suani"));
        
    }

    // Impressão dos exemplos de Polimorfismo
    public void validaOperacao(){

        for (Registravel registro: registravel){
            System.out.println(registro);
        }

    }
}
