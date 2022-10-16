package br.senac.tads.dsw.ado03;

import java.time.LocalDate;
import java.util.List;


public class Info {
    
    //Informações principais
    private String nome;
    private String telefone;
    private String email;
    private LocalDate nascimento;
    private String linkedin;
    private String github;

    //Informações opcionais
    private List<Conhecimentos> conhecimentos;
    private List<ExpProfi> exp_profissionais;
    private List<ExpAcad> exp_academicas;
    private List<Idiomas> idiomas;

    

    public List<Conhecimentos> getConhecimentos() {
        return conhecimentos;
    }


    public void setConhecimentos(List<Conhecimentos> conhecimentos) {
        this.conhecimentos = conhecimentos;
    }


    public List<ExpProfi> getExp_profissionais() {
        return exp_profissionais;
    }


    public void setExp_profissionais(List<ExpProfi> exp_profissionais) {
        this.exp_profissionais = exp_profissionais;
    }


    public List<ExpAcad> getExp_academicas() {
        return exp_academicas;
    }


    public void setExp_academicas(List<ExpAcad> exp_academicas) {
        this.exp_academicas = exp_academicas;
    }


    public List<Idiomas> getIdiomas() {
        return idiomas;
    }


    public void setIdiomas(List<Idiomas> idiomas) {
        this.idiomas = idiomas;
    }


    public Info(String nome,String telefone, String email, LocalDate nascimento, String linkedin, String github){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.nascimento = nascimento;
        this.linkedin = linkedin;
        this.github = github;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getNascimento() {
        return nascimento;
    }


    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }


    public String getLinkedin() {
        return linkedin;
    }


    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }


    public String getGithub() {
        return github;
    }


    public void setGithub(String github) {
        this.github = github;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 

}
