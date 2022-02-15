public class Aluno {

    // Atributos / Propriedades
    private int id;
    private String nome;
    private String curso;

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

}
