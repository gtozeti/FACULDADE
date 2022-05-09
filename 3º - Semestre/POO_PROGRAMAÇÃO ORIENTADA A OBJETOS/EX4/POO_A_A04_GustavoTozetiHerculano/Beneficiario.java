// Superclasse abstrata
public abstract class Beneficiario implements Registravel {

// Atributos da superclasse    
private final String nome;
private final String cpf;
private final int idade;

// Contrutor da superclasse   
public Beneficiario( String nome, String cpf, int idade){
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
}


public String getNome() {
    return nome;
}

public String getCpf() {
    return cpf;
}

public int getIdade() {
    return idade;
}

// Métodos abstratos
public abstract String autorizaConsulta();
public abstract String numeroRegistro();

// Método para utilização de todas as subclasses
public String getNumeroRegistro(){
    return numeroRegistro();
}


// Override do método toString
@Override
public String toString() {
    return "O(a) paciente " + getNome() + ", com CPF "+ getCpf() + " e idade " + getIdade() + ", com registro " + getNumeroRegistro();
}



}
