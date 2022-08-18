package Ex1;
public class UsaHeranca {
    
    public static void main(String[] args) {
        
        Pessoa p = new Funcionario("Xaolin",12345678901L,384);
        System.out.println(p);
        p = new PessoaJuridica("Fabinho",2345654323456L);
        System.out.println(p);
        p = new PessoaFisica("Clietin",34567898765L);
        System.out.println(p);
    }
}
