package io.github.pgabrieldeveloper.adjaflouvor.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Grupo {
    
    @Id
    private String id;
    private String nome;

}
