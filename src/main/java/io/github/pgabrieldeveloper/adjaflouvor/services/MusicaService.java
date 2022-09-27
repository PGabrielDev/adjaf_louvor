package io.github.pgabrieldeveloper.adjaflouvor.services;

import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MusicaService {

    Flux<Musica> findAll();

    Mono<Musica> findAllById(String id);

    Mono<Musica> save(Musica musica);

    Mono<Musica> delete(Musica musica);
}
