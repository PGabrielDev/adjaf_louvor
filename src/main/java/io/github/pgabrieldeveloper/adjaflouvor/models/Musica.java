package io.github.pgabrieldeveloper.adjaflouvor.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class Musica {
    
    @Id
    private String id;
    private String nome;
    private String musicaCantada;
    private String musicaPlayback;
    private String letra;
    private Grupo grupo;


}
