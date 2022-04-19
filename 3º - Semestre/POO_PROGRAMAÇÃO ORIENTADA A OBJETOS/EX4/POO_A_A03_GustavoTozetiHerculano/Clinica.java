// Classe Clinica que implementa a interface Registravel, sem subclasses
public class Clinica implements Registravel {
    
    // Atributos da classe
    private String logradouro;
    private String numero;
    private String estado;
    private String cidade;
    private String nome;

    // Variável de controle de registro
    private static long registro = 0;

    public Clinica(String logradouro, String numero, String estado, String cidade, String nome) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.estado = estado;
        this.cidade = cidade;
        this.nome = nome;
    }


    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }



    public String getNumero() {
        return numero;
    }



    public void setNumero(String numero) {
        this.numero = numero;
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



    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return String.format("\n%s - Endereço: %s, %s | %s - %s - Registro: %s", getNome(), getLogradouro(), getNumero(), getCidade(), getEstado(),getNumeroRegistro());
    }

    // Metodo para carregar o contrato com a interface Registravel, retornando um número de registro com padrão de inicio em 9000, para Clínicas
    @Override
    public String getNumeroRegistro(){
        registro = registro + 1;
        return String.format("9000%d", registro);
    }
    

}
