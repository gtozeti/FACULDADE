public class Livro {
    
    // Definindo os atributos da classe Livro
    private int id;
    private String autor;
    private String titulo;
    private Double preco;


    // Contrutor da classe    
    public Livro(int id, String autor, String titulo, Double preco){
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;        
    }

    // Construtor da classe vazio
    public Livro(){}


    //Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    //Override no método toString
    @Override
    public String toString(){
        
        return "ID: " + this.id + " | " + "Autor: " + this.autor + " | " + "Título: "+ this.titulo + " | " + "Preço: R$ "+ String.format("%.2f", this.preco) ;
    }
    
}
