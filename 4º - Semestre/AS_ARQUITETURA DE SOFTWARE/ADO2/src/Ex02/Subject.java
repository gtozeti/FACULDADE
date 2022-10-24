package Ex02;

public interface Subject {

    public void addObserver(Observer observer);
    
    public void addAcoes(Acoes acoes);
    
    public void notificar();
    
    public void deleteObserver(Observer observer);

}
