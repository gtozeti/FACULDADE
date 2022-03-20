public class PlanoA  extends Beneficiario{
    
    private String exame1;
    private String exame2;

    public PlanoA(String nome, String cpf, int idade, String exame1, String exame2){
        super(nome, cpf, idade);
        this.exame1 = exame1;
        this.exame2 = exame2;
    }

    public String getExame1() {
        return exame1;
    }

    public void setExame1(String exame1) {
        this.exame1 = exame1;
    }

    public String getExame2() {
        return exame2;
    }

    public void setExame2(String exame2) {
        this.exame2 = exame2;
    }

    @Override
    public String autorizaConsulta(){
        if (exame1 == "Oftalmologista" && getIdade() < 18){
            return "NÃO AUTORIZADO";
        }
        //O get informação vem através do SUPER
        else if(exame2 == "Dermatologista" && getIdade() == 45)
            return "NÃO AUTORIZADO";
        
        else{
            return "AUTORIZADO";
        }
        }

    @Override
    public String toString(){
        return String.format("\n%s, está marcando os exames %s e %s. Status do pedido: %s.",super.toString(), exame1, exame2, autorizaConsulta());
    }
        
    }
    


