package io.github.pgabrieldeveloper.adjaflouvor.services;

import io.github.pgabrieldeveloper.adjaflouvor.models.MusicaCulto;
import reactor.core.publisher.Mono;

public interface MusicaCultoService {
    Mono<MusicaCulto> save(MusicaCulto musicaCulto);
}
