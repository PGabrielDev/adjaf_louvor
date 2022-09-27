package io.github.pgabrieldeveloper.adjaflouvor.services;

import io.github.pgabrieldeveloper.adjaflouvor.models.Escala;
import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EscalaService {
    
    Flux<Escala> findAll();

    Mono<Escala> findById(String id);

    Mono<Escala> save(Escala escala);

    Mono<Void> delete(Escala escala);

}
