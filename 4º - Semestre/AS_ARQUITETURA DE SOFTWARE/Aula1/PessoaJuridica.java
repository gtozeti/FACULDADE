public class PessoaJuridica {

    private long cnpj;

    public PessoaJuridica(long cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
    };

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "CNPJ = " + cnpj;
    }

}
