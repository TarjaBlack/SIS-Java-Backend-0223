package br.com.sisnema.musica.controllers;

import br.com.sisnema.musica.dtos.ArtistaDto;
import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.services.ArtistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/artistas")
public class ArtistaController {

    @Autowired
    private ArtistaService artistaService;

    @GetMapping
    public ResponseEntity<List<ArtistaDto>> buscarTodos() {
        List<ArtistaDto> list = artistaService.procurarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ArtistaDto> buscarPorId(@PathVariable Long id) {
        ArtistaDto dto = artistaService.procurarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    // Cadastrar

    // Atualizar

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        artistaService.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
