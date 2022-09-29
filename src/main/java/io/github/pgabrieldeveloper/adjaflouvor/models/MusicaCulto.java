package io.github.pgabrieldeveloper.adjaflouvor.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class MusicaCulto {

    @Id
    private String id;
    private String culto;
    private String regente;
    private Musica musica;
    private Date data;

}
