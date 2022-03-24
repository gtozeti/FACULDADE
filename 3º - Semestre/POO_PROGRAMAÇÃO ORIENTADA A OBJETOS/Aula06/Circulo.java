public class Circulo extends Forma {
    
private double raio;

public Circulo(double x, double y, double raio){
    super(x,y);
    this.raio = raio;
}

public double getRaio() {
    return raio;
}

public void setRaio(double raio) {
    this.raio = raio;
}

@Override
public double calcularArea(){
    return (Math.PI * Math.pow(raio, 2));
}

@Override
public String toString(){
    return String.format("%s com raio %.2f que é um Círculo.\n", super.toString(), this.raio);
}

}
