package io.github.pgabrieldeveloper.adjaflouvor.services;

import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EscalaService {
    
    Flux<Musica> findAll();

    Mono<Musica> findById(String id);

    Mono<Musica> save(String id);

    Mono<Void> delete(Musica musica);

}
