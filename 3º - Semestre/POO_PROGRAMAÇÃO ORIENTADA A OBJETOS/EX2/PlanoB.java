public class PlanoB extends Beneficiario{

    private double reembolsoExame;
    private double reembolsoProcedimento;

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

    @Override
    public String autorizaConsulta(){
        if (reembolsoExame > 700 && reembolsoProcedimento > 350)
        return "REEMBOLSO NÃO AUTORIZADO";
        else{
            return "REEMBOLSO AUTORIZADO";
        }
    }

    @Override
    public String toString(){
        return String.format("\n%s, solicitou os seguintes reembolsos, R$ %.2f para o Exame e R$ %.2f para o Procedimento. Status da solicitação: %s.",super.toString(), reembolsoExame, reembolsoProcedimento, autorizaConsulta());
    }
    
}
