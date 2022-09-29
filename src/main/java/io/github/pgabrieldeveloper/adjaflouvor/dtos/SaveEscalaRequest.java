package io.github.pgabrieldeveloper.adjaflouvor.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveEscalaRequest {
    List<SaveMusicaCultoRequest> musicaCultos;

}
