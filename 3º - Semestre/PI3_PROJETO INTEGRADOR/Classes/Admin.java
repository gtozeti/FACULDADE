public class Admin extends Employee{

    private boolean isMaster;

    public Admin(String nome, String email, String documento, String telefone, int id, String senha, String cargo,
            boolean isMaster) {
        super(nome, email, documento, telefone, id, senha, cargo);
        this.isMaster = isMaster;
    }


    public boolean isMaster() {
        return isMaster;
    }




    public void setMaster(boolean isMaster) {
        this.isMaster = isMaster;
    }




    @Override
    public String toString() {
        return "Admin []";
    }
    
    

}
