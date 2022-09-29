package io.github.pgabrieldeveloper.adjaflouvor.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrupoRequest {
    private String id;
    private String nome;
}
