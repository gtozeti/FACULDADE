public class Assassino extends Campeao{

    private int furtividade ;
    private int destreza ;
    private int habilidade;

    public Assassino(String nome, int vida, int dano, int experiencia, int furtividade, int destreza, int habilidade) {
        super(nome, vida, dano, experiencia);
        this.furtividade = furtividade;
        this.destreza = destreza;
        this.habilidade = habilidade;
    }

    public int getFurtividade() {
        return furtividade;
    }



    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }



    public int getDestreza() {
        return destreza;
    }



    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }



    public int getHabilidade() {
        return habilidade;
    }



    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }



    @Override
    public int calcula_dano(){
        return(super.getDano() + ((furtividade * 4) + (destreza * 2) + (habilidade * 3)));
    }

    @Override
    public String status(){
        return String.format("Furtividade: %d - Destreza: %d - Habilidade: %d", getFurtividade(),getDestreza(),getHabilidade());
    }

    @Override
    public String toString() {
        return String.format("Campeão: %s | Classe: %s | Experiência: %d | Vida: %d | Status: %s | Dano: %d", super.getNome(),this.getClass().getName(), super.getExperiencia(), super.getVida(),status(), calcula_dano());
    }


}
