public class Tanque1 implements Posicao, Cor, Canhao {

    private CoresRGB corTanque, corCanhao;
    private float x, y;

    @Override
    public CoresRGB getCorTanque() {
        return corTanque;
    }

    @Override
    public void setCorTanque(CoresRGB corTanque) {
        this.corTanque = corTanque;
    }

    @Override
    public CoresRGB getCorCanhao() {
        return corCanhao;
    }

    @Override
    public void setCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public void setX(float x) {
        this.x = x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Tanque1 [corCanhao=" + corCanhao + ", corTanque=" + corTanque + ", x=" + x + ", y=" + y + "]";
    }

    

}
