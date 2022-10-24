package Ex02;

import java.util.LinkedList;
import java.util.List;

public class NaveJogador implements Subject {

    private List<Observer> observadores = new LinkedList<>();
    private List<Acoes> listaAcoes = new LinkedList<>();
    private int index = -1;

    private final static NaveJogador nave = new NaveJogador();

    private NaveJogador() {
    };

    public static NaveJogador getInstance() {
      
        return nave;
        }
        

    @Override
    public void addObserver(Observer observer) {
        observadores.add(observer);

    }

    @Override
    public void addAcoes(Acoes acoes) {
        listaAcoes.add(acoes);
        index++;
        notificar();

    }

    @Override
    public void notificar() {
        for (Observer observer : observadores) {
            observer.update(listaAcoes.get(index));
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observadores.remove(observer);
        System.out.println(observer.toString() + " Destruída!!");
    }

}
