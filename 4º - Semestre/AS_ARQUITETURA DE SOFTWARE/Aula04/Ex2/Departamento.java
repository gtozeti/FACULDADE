public class Departamento implements DepartamentoComponent {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Departamento(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public double getCusto() {
        return preco;
    }

    @Override
    public int getFuncionarios() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Departamento [nome=" + nome + "]";
    }

    
}
