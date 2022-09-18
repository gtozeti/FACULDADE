package Ex2;

public class Imposto1 implements Produtos {

    @Override
    public double operacao(Valor valor) {
        return valor.getValor() * 0.1;
    }

}