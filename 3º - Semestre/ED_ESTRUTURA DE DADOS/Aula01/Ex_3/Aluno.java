public class Aluno {

    // Atributos / Propriedades
    private int id;
    private String nome;
    private String curso;

    // Construtor vazio
    public Aluno(){}

    // Construtor da Classe e sempre leva o nome da Classe
    public Aluno(int id, String nome, String curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    public void setId(int id) {
        this.id = id; // Definir o valor do atributo
    }

    public int getId() {
        return this.id; // Retona o valor do atributo
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrever algo
    @Override
    public String toString(){
        
        return "ID: " + this.id + " | " + "Nome: " + this.nome + " | " + "Curso: " + this.curso;
    }

}
