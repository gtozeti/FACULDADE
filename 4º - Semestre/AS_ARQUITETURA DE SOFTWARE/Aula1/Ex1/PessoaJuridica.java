package Ex1;
public class PessoaJuridica extends Pessoa {

    private long cnpj;

    public PessoaJuridica(String nome, long cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
        super();
    };

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Nome = " + this.getNome()+ " | CNPJ = " + cnpj;
    }

}
