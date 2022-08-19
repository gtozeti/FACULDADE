// Revisão Interfaces
public class BatalhaTanques {

    public static void main(String[] args) {
        
        Tanque1 t1 = new Tanque1();
        t1.setCorCanhao(CoresRGB.BLUE);
        t1.setCorTanque(CoresRGB.RED);
        t1.setX(2.3F);
        t1.setY(4.3F);

        System.out.println(t1);
    }
}
