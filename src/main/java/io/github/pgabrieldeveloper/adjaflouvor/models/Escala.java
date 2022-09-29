package io.github.pgabrieldeveloper.adjaflouvor.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Document
@Builder
public class Escala {
    
    @Id
    private String id;
    List<MusicaCulto> musicaCultos;

}
