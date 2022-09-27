package io.github.pgabrieldeveloper.adjaflouvor.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import io.github.pgabrieldeveloper.adjaflouvor.models.Grupo;

@Repository
public interface GrupoRepository  extends ReactiveMongoRepository<Grupo ,String> {
    
}
