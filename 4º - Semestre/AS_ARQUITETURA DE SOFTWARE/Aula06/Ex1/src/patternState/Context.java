package patternState;

public class Context {
    private State estado;

    public Context() {
        estado = new Pendente(this);
    }

    public State getEstado() {
        return estado;
    }

    // Deixa o método protegido
    void setEstado(State estado) {
        this.estado = estado;
    }

    public void requisitarAtrasada() {
        estado.atrasada();
    }

    public void requisitarConcluida() {
        estado.concluida();
    }

    public void requisitarPendente() {
        estado.pendente();

    }
}
