package io.github.pgabrieldeveloper.adjaflouvor.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import io.github.pgabrieldeveloper.adjaflouvor.models.MusicaCulto;

@Repository
public interface MusicaCultoRepository extends ReactiveMongoRepository<MusicaCulto, String> {
    
}
