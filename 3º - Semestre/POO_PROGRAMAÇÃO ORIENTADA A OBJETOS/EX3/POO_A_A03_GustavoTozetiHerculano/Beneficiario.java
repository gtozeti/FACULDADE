// Superclasse abstrata
public abstract class Beneficiario {

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

// Método abstrato
public abstract String autorizaConsulta();


// Override do método toString
@Override
public String toString() {
    return "O(a) paciente " + getNome() + ", com CPF "+ getCpf() + " e idade " + getIdade();
}



}
