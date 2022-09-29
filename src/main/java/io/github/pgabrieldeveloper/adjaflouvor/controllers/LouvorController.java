package io.github.pgabrieldeveloper.adjaflouvor.controllers;

import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.pgabrieldeveloper.adjaflouvor.dtos.SaveEscalaRequest;
import io.github.pgabrieldeveloper.adjaflouvor.dtos.SaveGrupoRequest;
import io.github.pgabrieldeveloper.adjaflouvor.dtos.SaveMusicaRequest;
import io.github.pgabrieldeveloper.adjaflouvor.models.Escala;
import io.github.pgabrieldeveloper.adjaflouvor.models.Grupo;
import io.github.pgabrieldeveloper.adjaflouvor.models.Musica;
import io.github.pgabrieldeveloper.adjaflouvor.models.MusicaCulto;
import io.github.pgabrieldeveloper.adjaflouvor.services.facade.LouvorFacade;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("adjaf/v1/louvor")
@RequiredArgsConstructor
public class LouvorController {

    private final LouvorFacade louvorFacade;

    
    @PostMapping("escala")
    public Mono<Escala> saveEscala(@RequestBody SaveEscalaRequest request){
        var escala = Escala
                        .builder()
                        .musicaCultos(request.getMusicaCultos()
                                                .stream()
                                                .map(mc -> {
                                                    var musica = MusicaCulto.builder().culto(mc.getCulto()).regente(mc.getRegente()).data(mc.getData()).musica(Musica.builder().id(mc.getMusica().getId()).build()).build();
                                                    return musica;
                                                }).collect(Collectors.toList()))
                        .build();

              
        return louvorFacade.saveEscala(escala);      
    }
    @PostMapping("grupo")
    public Mono<Grupo> saveGrupo(@RequestBody SaveGrupoRequest request){
        return louvorFacade.saveGrupo(
            Grupo.builder()
                .nome(request.getNome())
                .build()
        );
    }

    @PostMapping("musica")
    public Mono<Musica> saveMusica(@RequestBody SaveMusicaRequest request){
        return louvorFacade.saveMusica(
            Musica.builder()
                .nome(request.getNome())
                .musicaPlayback(request.getMusicaPlayback())
                .musicaCantada(request.getMusicaPlayback())
                .letra(request.getLetra())
                .grupo(Grupo.builder().id(request.getGrupo().getId()).nome(request.getGrupo().getNome()).build())
                .build()
        );
    }

    @GetMapping("escala")
    public Flux<Escala> findAllEscala(){
        return louvorFacade.findAllEscala();
    }

    @GetMapping("escala/{id}")
    public Mono<Escala> findEscalaById(@PathVariable("id")  String id){
        return louvorFacade.findEscalaById(id);
    }
    
}
