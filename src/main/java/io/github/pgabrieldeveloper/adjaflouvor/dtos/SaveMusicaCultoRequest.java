package io.github.pgabrieldeveloper.adjaflouvor.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveMusicaCultoRequest {
    private String culto;
    private String regente;
    private MusicaRequestSaveCulto musica;
    private Date data;

}
