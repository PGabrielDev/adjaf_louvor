package io.github.pgabrieldeveloper.adjaflouvor.services.facade;


import io.github.pgabrieldeveloper.adjaflouvor.models.Escala;
import io.github.pgabrieldeveloper.adjaflouvor.models.Grupo;
import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface LouvorFacade {

    Flux<Musica> findAllMusicas();

    Mono<Musica> findMusicabyId(String id);

    Mono<Musica> saveMusica(Musica Musica);

    Mono<Void> deleteMusica(Musica musica);

    Flux<Escala> findAllEscala();

    Mono<Escala> findEscalaById(String id);

    Mono<Escala> saveEscala(Escala escala);

    Mono<Void> deleteEscala(Escala escala);

    Flux<Grupo> findAllGrupo();

    Mono<Grupo> findGrupoById(String id);
    
    Mono<Grupo> saveGrupo(Grupo grupo);

    Mono<Void> deleteGrupo(Grupo grupo);


    

    



}
