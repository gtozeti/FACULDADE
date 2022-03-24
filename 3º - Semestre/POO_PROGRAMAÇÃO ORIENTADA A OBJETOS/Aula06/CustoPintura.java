import java.util.ArrayList;

public class CustoPintura{

private ArrayList<Forma> formas;


public static void main(String[] args) {

    CustoPintura cp = new CustoPintura();
    cp.carreagr();
    //cp.calcular();
    
}

public CustoPintura(){
    formas = new ArrayList();
}

public void carreagr(){

    formas.add(new Quadrado(10, 10, 1));
    formas.add(new Quadrado(10, 10, 2));
    formas.add(new Circulo(0, 0, 2));
    formas.add(new Circulo(100, 100, 1));

    System.out.println("Carregamos " + formas.size()+ " formas");

}

public void calcular(){
    double areaTotal = 0.d;
    int counter = 0;
    for(Forma f:formas){
        counter ++;
        double atmp = f.calcularArea(); //POLIMORFISMO AQUI
        areaTotal+= atmp;
        // System.out.printf("A area da forma %d que é um %s é: %.2f\n",counter,f.getClass().getSimpleName(), atmp);
        System.out.println(f); //POLIMORFISMO AQUI
    }
System.out.printf("A area total é: %.2f\n" , areaTotal);
}


}