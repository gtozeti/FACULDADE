public class Customer extends GenericUser {

    private String logradouro;
    private String complemento;
    private String bairro;
    private String logradouro_num;
    private String estado;
    private String cidade;
    private String cep;

    public Customer(String nome, String email, String documento, String telefone, int id, String logradouro,
            String complemento, String bairro, String logradouro_num, String estado, String cidade, String cep) {
        super(nome, email, documento, telefone, id);
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.logradouro_num = logradouro_num;
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro_num() {
        return logradouro_num;
    }

    public void setLogradouro_num(String logradouro_num) {
        this.logradouro_num = logradouro_num;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Customer []";
    }

}
