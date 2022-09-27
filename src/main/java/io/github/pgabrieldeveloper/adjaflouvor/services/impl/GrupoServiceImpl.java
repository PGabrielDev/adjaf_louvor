package io.github.pgabrieldeveloper.adjaflouvor.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldeveloper.adjaflouvor.models.Grupo;
import io.github.pgabrieldeveloper.adjaflouvor.repositories.GrupoRepository;
import io.github.pgabrieldeveloper.adjaflouvor.services.GrupoService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class GrupoServiceImpl implements GrupoService {
    private final GrupoRepository grupoRepository;
    @Override
    public Flux<Grupo> findAll() {
        return grupoRepository.findAll();
    }

    @Override
    public Mono<Grupo> findAllById(String id) {
        return grupoRepository.findById(id);
    }

    @Override
    public Mono<Grupo> save(Grupo grupo) {
        return grupoRepository.save(grupo);
    }

    @Override
    public Mono<Void> delete(Grupo grupo) {
        return grupoRepository.delete(grupo);
    }
    
}
