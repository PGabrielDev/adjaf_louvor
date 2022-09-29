package io.github.pgabrieldeveloper.adjaflouvor.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveMusicaRequest {
    
    private String nome;
    private String musicaCantada;
    private String musicaPlayback;
    private String letra;
    private GrupoRequest grupo;

}
