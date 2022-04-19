public class Aluno {

    // Atributos da classe
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private static long ra = 1999;

    // Contrutor com todos os parâmetros
    public Aluno(String nome, long ra, double nota1, double nota2, double media) {
        this.nome = nome;
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    // Construtor padrão
    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calculaMedia(this.nota1, this.nota2);
       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    // Método para cálculo da média
    private void calculaMedia(Double n1, Double n2){
        setMedia((n1 * 0.3) + (n2 * 0.7));
    }

    @Override
    public String toString() {
        return String.format("%-8s - RA: %-5d | Nota 1: %.2f | Nota 2: %.2f | Média: %.2f", getNome(),getRa(),getNota1(),getNota2(),getMedia());
    };
    

}
