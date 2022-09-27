package io.github.pgabrieldeveloper.adjaflouvor.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Escala {
    
    @Id
    private String id;
    private String culto;
    private Date dia;
    private Musica musica;

}
