public class PlanoA extends Beneficiario{
    
    // Atributos da subclasse
    private String exame1;
    private String exame2;

    // Variável de controle de registro
    private static long registro = 0;

    // Contrutor da subclasse
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

    // Override do método abstrato autorizaConsulta da superclasse, para retorno de String de status de autorização do exame
    @Override
    public String autorizaConsulta(){
        if (exame1 == "Oftalmologista" && getIdade() < 18){
            return "NÃO AUTORIZADO";
        }
        
        else if(exame2 == "Dermatologista" && getIdade() == 45)
            return "NÃO AUTORIZADO";
        
        else{
            return "AUTORIZADO";
        }
        }

    // Override do método toString da superclasse, para retorno do método toString da superclasse mais as informações de exames e autorização
    @Override
    public String toString(){
        return String.format("\n%s, está marcando os exames %s e %s.\nStatus do pedido: %s.",super.toString(), getExame1(), getExame2(), autorizaConsulta());
    }

    // Metodo para carregar o contrato com a interface Registravel, retornando um número de registro com padrão de inicio em 8000, para o Plano A
    @Override
    public String numeroRegistro(){
        registro = registro + 1;
        return String.format("8000%d", registro);
    }
        
    }
    


