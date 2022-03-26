public class GenericUser{

    private String nome;
    private String email;
    private String documento;
    private String telefone;
    
    
    
    public GenericUser(String nome, String email, String documento, String telefone, int id) {
        this.nome = nome;
        this.email = email;
        this.documento = documento;
        this.telefone = telefone;
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private int id;
    
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "GenericUser []";
    }

   


}