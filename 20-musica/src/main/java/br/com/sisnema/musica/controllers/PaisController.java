package br.com.sisnema.musica.controllers;

import br.com.sisnema.musica.dtos.ArtistaDto;
import br.com.sisnema.musica.dtos.PaisDto;
import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.entities.Pais;
import br.com.sisnema.musica.services.ArtistaService;
import br.com.sisnema.musica.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/paises")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    public List<Pais> buscarTodos() {
        List<Pais> paisList = paisService.procurarTodos();
        return paisList;
    }

    @GetMapping(value = "/{id}")
    public PaisDto buscarPorId(@PathVariable Long id) {
        PaisDto dto = paisService.procurarPorId(id);
        return dto;
    }

    // Cadastrar

    // Atualizar

    @DeleteMapping(value = "/{id}")
    public void excluir(@PathVariable Long id) {
        paisService.excluir(id);
    }
    
}
