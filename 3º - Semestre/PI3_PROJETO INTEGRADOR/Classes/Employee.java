public class Employee extends GenericUser{
    
    private String senha;
    private String cargo;
    
    public Employee(String nome, String email, String documento, String telefone, int id, String senha, String cargo) {
        super(nome, email, documento, telefone, id);
        this.senha = senha;
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Employee []";
    }
   
    
    
}
