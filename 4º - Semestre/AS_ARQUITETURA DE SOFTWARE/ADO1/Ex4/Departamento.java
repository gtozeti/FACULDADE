package Ex4;

public class Departamento implements DepartamentoComponent {

    private double custo;
    private int quantidade;

    public Departamento(double custo, int quantidade) {
        this.custo = custo;
        this.quantidade = quantidade;
    }

    @Override
    public double getCusto() {
        return custo;
    }

    @Override
    public int getFuncionarios() {
        return quantidade;
    }

}
