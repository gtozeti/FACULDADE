package br.senac.tads.dsw.musicas.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Musica implements Serializable {

    private static final long serialVersionUID = 1L;
   

    // IDs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Títulos
    @NotBlank(message = "Campo Título não pode ser vazio")
    @Size(max = 100, message = "Campo Título deve possuir no máximo 100 caracteres")
    private String titulo;

    // Artista
    @NotBlank(message = "Campo Artista não pode ser vazio")
    @Size(max = 100, message = "Campo Artista deve possuir no máximo 100 caracteres")
    private String artista;

    // Ano lançamento
    @NotNull(message = "Campo Ano de lançamento não pode ser vazio")
    @Min(value = 1,message = "Ano deve ser um valor positivo")
    @Max(value = 2022 ,message = "Valor do ano não deve ser futuro")
    private int ano;

    public Musica() {
    }

    public Musica(Long id, String titulo, String artista, short ano) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Musica{" + "id=" + id + ", titulo=" + titulo + ", artista=" + artista + ", ano=" + ano + '}';
    }

    
    
}
