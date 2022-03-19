public class PlanoA  extends Paciente{
    
    private String cob1;
    private String cob2;

    public PlanoA(String nome, String cpf, int id, String cob1, String cob2){
        super(nome, cpf, id);
        this.cob1 = cob1;
        this.cob2 = cob2;
    }

    public String getCob1() {
        return cob1;
    }

    public void setCob1(String cob1) {
        this.cob1 = cob1;
    }

    public String getCob2() {
        return cob2;
    }

    public void setCob2(String cob2) {
        this.cob2 = cob2;
    }

    @Override
    public boolean autorizaConsulta(){
        if (cob1 == "Oftalmologista" && getIdade() < 18){
            return false;
        }
        //O get informação vem através do SUPER
        else if(cob2 == "Dermatologista" && getIdade() == 45)
            return false;
        
        else{
            return true;
        }
        }
        
    }
    

}
