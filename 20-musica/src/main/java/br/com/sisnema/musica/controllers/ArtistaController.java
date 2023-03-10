package br.com.sisnema.musica.controllers;

import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.services.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
