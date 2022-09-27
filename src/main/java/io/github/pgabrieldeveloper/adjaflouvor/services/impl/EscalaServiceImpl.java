package io.github.pgabrieldeveloper.adjaflouvor.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldeveloper.adjaflouvor.models.Escala;
import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import io.github.pgabrieldeveloper.adjaflouvor.repositories.EscalaRepository;
import io.github.pgabrieldeveloper.adjaflouvor.services.EscalaService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EscalaServiceImpl implements EscalaService {
    private final EscalaRepository escalaRepository;

    @Override
    public Flux<Escala> findAll() {
        return escalaRepository.findAll();
    }

    @Override
    public Mono<Escala> findById(String id) {
        return escalaRepository.findById(id);
    }

    @Override
    public Mono<Void> delete(Escala escala) {
        return escalaRepository.delete(escala);
    }

    @Override
    public Mono<Escala> save(Escala escala) {
        return escalaRepository.save(escala);
    }


}
