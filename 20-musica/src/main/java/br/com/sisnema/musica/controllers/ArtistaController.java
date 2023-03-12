package br.com.sisnema.musica.controllers;

import br.com.sisnema.musica.dtos.ArtistaDto;
import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.services.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @GetMapping
    public List<Artista> buscarTodos() {
        List<Artista> artistaList = artistaService.procurarTodos();
        return artistaList;
    }

    @GetMapping(value = "/{id}")
    public ArtistaDto buscarPorId(@PathVariable Long id) {
        ArtistaDto dto = artistaService.procurarPorId(id);
        return dto;
    }

    // Cadastrar

    // Atualizar

    @DeleteMapping(value = "/{id}")
    public void excluir(@PathVariable Long id) {
        artistaService.excluir(id);
    }

}
