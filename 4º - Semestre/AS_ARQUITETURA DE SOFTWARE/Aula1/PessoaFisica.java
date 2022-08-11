public class PessoaFisica {

    private long cpf;

    public PessoaFisica(long cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica() {
    };

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "CPF = " + cpf;
    }

}
