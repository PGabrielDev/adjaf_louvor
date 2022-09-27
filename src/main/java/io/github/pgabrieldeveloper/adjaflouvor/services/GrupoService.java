package io.github.pgabrieldeveloper.adjaflouvor.services;

import io.github.pgabrieldeveloper.adjaflouvor.models.Grupo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GrupoService {
    
    Flux<Grupo> findAll();

    Mono<Grupo> findAllById(String id);

    Mono<Grupo> save(Grupo grupo);

    Mono<Void> delete(Grupo grupo);
}
