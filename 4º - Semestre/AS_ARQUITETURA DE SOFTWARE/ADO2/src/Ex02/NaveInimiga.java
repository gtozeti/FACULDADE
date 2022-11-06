package Ex02;

public class NaveInimiga implements Observer {

    private String nome;

    public NaveInimiga(String nome, Subject subject) {
        this.nome = nome;
        subject.addObserver(this);
    }

    @Override
    public void update(Acoes acoes) {
        System.out.println(nome + " " + acoes);

    }

    @Override
    public String toString() {
        return nome;
    }

    

}
