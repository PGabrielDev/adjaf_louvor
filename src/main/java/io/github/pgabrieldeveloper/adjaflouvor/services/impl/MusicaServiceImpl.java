package io.github.pgabrieldeveloper.adjaflouvor.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import io.github.pgabrieldeveloper.adjaflouvor.repositories.MusicaRepository;
import io.github.pgabrieldeveloper.adjaflouvor.services.MusicaService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MusicaServiceImpl implements MusicaService {

    private final MusicaRepository musicaRepository;

    @Override
    public Flux<Musica> findAll() {
        return musicaRepository.findAll();
    }

    @Override
    public Mono<Musica> findAllById(String id) {
        
        return musicaRepository.findById(id);
    }

    @Override
    public Mono<Musica> save(Musica musica) {
        return musicaRepository.save(musica);
    }

    @Override
    public Mono<Void> delete(Musica musica) {
        return musicaRepository.delete(musica);
    }
    
}
