public class Quadrado extends Forma{
    
    
    private double lado;

    public Quadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }

    @Override
    public String toString(){
        return String.format("%s, com lado %.2f que é um Quadrado.\n", super.toString(), this.lado);
    }

}
