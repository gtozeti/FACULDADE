public class Mago extends Campeao{

    private int magia ;
    private int sabedoria ;
    private int inteligencia;


    public Mago(String nome, int vida, int dano, int experiencia, int magia, int sabedoria, int inteligencia) {
        super(nome, vida, dano, experiencia);
        this.magia = magia;
        this.sabedoria = sabedoria;
        this.inteligencia = inteligencia;
    }


    public int getMagia() {
        return magia;
    }


    public void setMagia(int magia) {
        this.magia = magia;
    }


    public int getSabedoria() {
        return sabedoria;
    }


    public void setSabedoria(int sabedoria) {
        this.sabedoria = sabedoria;
    }


    public int getInteligencia() {
        return inteligencia;
    }


    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public int calcula_dano(){
        return(super.getDano() + ((magia * 2) + (sabedoria * 3) + (inteligencia * 5)));
    }

    @Override
    public String status(){
        return String.format("Magia: %d - Sabedoria: %d - Inteligência: %d", getMagia(),getSabedoria(),getInteligencia());
    }

    @Override
    public String toString() {
        return String.format("Campeão: %s | Classe: %s | Experiência: %d | Vida: %d | Status: %s | Dano: %d", super.getNome(),this.getClass().getName(), super.getExperiencia(), super.getVida(),status(), calcula_dano());
    }


}
