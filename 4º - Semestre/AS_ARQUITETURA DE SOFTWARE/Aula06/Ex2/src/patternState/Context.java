package patternState;

public class Context {
    private State estado = new Esperando(this);

    

    public State getEstado() {
        return estado;
    }

    // Deixa o método protegido
    void setEstado(State estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }

    public void requisitarEspera() {
        estado.esperando();

    }

    public void requisitarCorrida() {
        estado.correndo();
    }

    public void requisitarPulo() {
        estado.pulando();
    }

    public void requisitarAbaixa() {
        estado.abaixando();
    }

}
