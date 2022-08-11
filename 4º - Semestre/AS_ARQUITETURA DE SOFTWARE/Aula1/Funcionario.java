public class Funcionario {

    private int matricula;

    public Funcionario(int matricula) {
        this.matricula = matricula;
    }

    public Funcionario() {
    };

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Matricula = " + matricula;
    }

}
