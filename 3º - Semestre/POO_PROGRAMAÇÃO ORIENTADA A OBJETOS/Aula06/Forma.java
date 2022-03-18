public class Forma {

    // Metodos
    private double x;
    private double y;


    // Construtor
    public Forma(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }



    public void setX(double x) {
        this.x = x;
    }



    public double getY() {
        return y;
    }



    public void setY(double y) {
        this.y = y;
    }

    public double calcularArea(){
        return 0.d;
    }
    
    @Override
    public String toString(){
        return String.format("Forma na posição (%.2f, %.2f)\n", x,y);
    }

    
}
