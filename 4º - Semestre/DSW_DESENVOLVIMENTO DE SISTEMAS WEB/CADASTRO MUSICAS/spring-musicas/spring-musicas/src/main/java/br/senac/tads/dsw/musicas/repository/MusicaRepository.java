package br.senac.tads.dsw.musicas.repository;

import br.senac.tads.dsw.musicas.entidades.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long>{
    
}
