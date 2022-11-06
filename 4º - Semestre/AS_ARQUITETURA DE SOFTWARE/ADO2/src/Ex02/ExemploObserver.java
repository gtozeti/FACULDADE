package Ex02;

import java.util.Random;

public class ExemploObserver {
    public static void main(String[] args) {
        Subject jogador = NaveJogador.getInstance();
        Observer naveInimiga2 = new NaveInimiga("Nave2", jogador);
        Observer naveInimiga1 = new NaveInimiga("Nave1", jogador);

        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            
            jogador.addAcoes(Acoes.values()[r.nextInt(4)]);

        }
        jogador.deleteObserver(naveInimiga1);
        jogador.deleteObserver(naveInimiga2);
    }
}
