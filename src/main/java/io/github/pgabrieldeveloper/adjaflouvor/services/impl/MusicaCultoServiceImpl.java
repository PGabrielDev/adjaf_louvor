package io.github.pgabrieldeveloper.adjaflouvor.services.impl;

import org.springframework.stereotype.Service;

import io.github.pgabrieldeveloper.adjaflouvor.models.MusicaCulto;
import io.github.pgabrieldeveloper.adjaflouvor.repositories.MusicaCultoRepository;
import io.github.pgabrieldeveloper.adjaflouvor.services.MusicaCultoService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class MusicaCultoServiceImpl implements MusicaCultoService {

    private final MusicaCultoRepository musicaCultoRepository;

    @Override
    public Mono<MusicaCulto> save(MusicaCulto musicaCulto) {
        return musicaCultoRepository.save(musicaCulto);
    }
    
}
