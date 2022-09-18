package Ex2;

import java.util.ArrayList;

public class Orcamento {

    private ArrayList<Valor> valores = new ArrayList<>();

    public ArrayList<Valor> getValores() {
        valores.add(new Valor(337.84));
        valores.add(new Valor(137.61));
        valores.add(new Valor(234.54));
        return valores;
    }

}
