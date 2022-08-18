package Ex1;
public class Funcionario extends PessoaFisica {

    private int matricula;

    public Funcionario(String nome, long cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public Funcionario() {
        super();
    };

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome = " + this.getNome()+ " | CPF = " + this.getCpf()+ " | Matricula = " + matricula;
    }

}
