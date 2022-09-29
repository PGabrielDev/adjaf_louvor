package io.github.pgabrieldeveloper.adjaflouvor.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveGrupoRequest {
    private String nome;
}
