package io.github.pgabrieldeveloper.adjaflouvor.services.facade;

import org.springframework.stereotype.Component;

import io.github.pgabrieldeveloper.adjaflouvor.models.Escala;
import io.github.pgabrieldeveloper.adjaflouvor.models.Grupo;
import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import io.github.pgabrieldeveloper.adjaflouvor.services.EscalaService;
import io.github.pgabrieldeveloper.adjaflouvor.services.GrupoService;
import io.github.pgabrieldeveloper.adjaflouvor.services.MusicaService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class LouvorFacadeImpl implements LouvorFacade {

    private final EscalaService escalaService;
    private final GrupoService grupoService;
    private final MusicaService musicaService;


    @Override
    public Flux<Musica> findAllMusicas() {
        return musicaService.findAll();
    }

    @Override
    public Mono<Musica> findMusicabyId(String id) {
        return musicaService.findAllById(id);
    }

    @Override
    public Mono<Musica> saveMusica(Musica musica) {
        return musicaService.save(musica);
    }

    @Override
    public Mono<Void> deleteMusica(Musica musica) {
        return musicaService.delete(musica);
    }

    @Override
    public Flux<Escala> findAllEscala() {
        return escalaService.findAll();
    }

    @Override
    public Mono<Escala> findEscalaById(String id) {
        return escalaService.findById(id);
    }

    @Override
    public Mono<Escala> saveEscala(Escala escala) {
        return escalaService.save(escala);
    }

    @Override
    public Mono<Void> deleteEscala(Escala escala) {
        return escalaService.delete(escala);
    }

    @Override
    public Flux<Grupo> findAllGrupo() {
        return grupoService.findAll();
    }

    @Override
    public Mono<Grupo> findGrupoById(String id) {
        return grupoService.findAllById(id);
    }

    @Override
    public Mono<Grupo> saveGrupo(Grupo grupo) {
        return grupoService.save(grupo);
    }

    @Override
    public Mono<Void> deleteGrupo(Grupo grupo) {
        return grupoService.delete(grupo);
    }
    
}
