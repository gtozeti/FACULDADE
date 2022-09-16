package Factory;

public class Palio implements Carro {
    private String modelo;
    private double preco;

    public Palio(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

}
