import java.util.ArrayList;

public class Jogo {
    
    private ArrayList<Campeao> campeao;

    public static void main(String[] args) {
        Jogo j = new Jogo();
        j.criaCampeao();
        j.exibeCampeao();
    }

    // Inicialização do ArrayList
    public Jogo(){
        campeao = new ArrayList<Campeao>();
    }

    // População do ArrayList com as subclasses
    public void criaCampeao(){

        campeao.add(new Mago("Kleitin", 100, 50, 20, 40, 30, 60));
        campeao.add(new Assassino("Inhanhau", 100, 50, 20, 60, 40, 25));
    }

    public void exibeCampeao(){
        for (Campeao c: campeao){
            System.out.println(c);
            System.out.println("\n");
        }
    }
}