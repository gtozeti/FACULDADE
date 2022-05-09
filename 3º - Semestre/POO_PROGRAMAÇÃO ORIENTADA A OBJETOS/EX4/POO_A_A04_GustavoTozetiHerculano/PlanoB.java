public class PlanoB extends Beneficiario{

    // Atributos da subclasse
    private double reembolsoExame;
    private double reembolsoProcedimento;

    // Variável de controle de registro
    private static long registro = 0;

    // Contrutor da subclasse
    public PlanoB(String nome, String cpf, int idade, double reembolsoExame, double reembolsoProcedimento){
        super(nome, cpf, idade);
        this.reembolsoExame = reembolsoExame;
        this.reembolsoProcedimento = reembolsoProcedimento;
    }

    public double getReembolsoExame() {
        return reembolsoExame;
    }

    public void setReembolsoExame(double reembolsoExame) {
        this.reembolsoExame = reembolsoExame;
    }

    public double getReembolsoProcedimento() {
        return reembolsoProcedimento;
    }

    public void setReembolsoProcedimento(double reembolsoProcedimento) {
        this.reembolsoProcedimento = reembolsoProcedimento;
    }

    // Override do método abstrato autorizaConsulta da superclasse, para retorno de String de status de autorização do reembolso
    @Override
    public String autorizaConsulta(){
        if (reembolsoExame > 700 && reembolsoProcedimento > 350)
        return "REEMBOLSO NÃO AUTORIZADO";
        else{
            return "REEMBOLSO AUTORIZADO";
        }
    }

     // Override do método toString da superclasse, para retorno do método toString da superclasse mais as informações de reembolso e autorização
    @Override
    public String toString(){
        return String.format("\n%s, solicitou os seguintes reembolsos, R$ %.2f para o Exame e R$ %.2f para o Procedimento.\nStatus da solicitação: %s.",super.toString(), getReembolsoExame(), getReembolsoProcedimento(), autorizaConsulta());
    }
    
    // Metodo para carregar o contrato com a interface Registravel, retornando um número de registro com padrão de inicio em 7000, para o Plano B
    @Override
    public String numeroRegistro(){
        registro = registro + 1;
        return String.format("7000%d", registro);
    }
    
}
