package patternState;

public class Abaixando implements State {

    private final String nome = "Espera";
    private Context tarefa;

    public Abaixando(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void abaixando() {
        System.out.println("Já está abaixado!");
    }

    @Override
    public void correndo() {
        tarefa.setEstado(new Correndo(tarefa));
    }

    @Override
    public void esperando() {
        tarefa.setEstado(new Esperando(tarefa));

    }

    @Override
    public void pulando() {
        tarefa.setEstado(new Pulando(tarefa));

    }

    @Override
    public String toString() {
        return "Novo estado: " + nome;
    }
}
