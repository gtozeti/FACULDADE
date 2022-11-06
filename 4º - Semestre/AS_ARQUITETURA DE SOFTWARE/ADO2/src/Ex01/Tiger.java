package Ex01;
public class Tiger implements Tanque {

    private String canhao;
    private String cor;
    private String posicao;

    public Tiger(String canhao, String cor, String posicao) {
        this.canhao = canhao;
        this.cor = cor;
        this.posicao = posicao;
    }

    @Override
    public String getCanhao() {

        return canhao;
    }

    @Override
    public String getCor() {

        return cor;
    }

    @Override
    public String getPosicao() {
        return posicao;

    }
}