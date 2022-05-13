public abstract class Campeao {

    private final String nome;
    private int vida;
    private int dano;
    private int experiencia;

    public Campeao(String nome, int vida, int dano, int experiencia){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public abstract int calcula_dano();
    public abstract String status();

  
    @Override
    public String toString() {
        return String.format("Campeão: %s | Vida: %d | Dano: %d | Experiência: %d ", getNome(), getVida(), getDano(), getExperiencia() );
    }

    

}