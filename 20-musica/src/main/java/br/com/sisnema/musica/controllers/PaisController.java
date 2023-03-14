package br.com.sisnema.musica.controllers;

import br.com.sisnema.musica.dtos.ArtistaDto;
import br.com.sisnema.musica.dtos.PaisDto;
import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.entities.Pais;
import br.com.sisnema.musica.services.ArtistaService;
import br.com.sisnema.musica.services.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/paises")
public class PaisController {

    @Autowired
    private PaisService service;

    @GetMapping
    public ResponseEntity<List<PaisDto>> buscarTodos() {
        List<PaisDto> list = service.procurarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PaisDto> buscarPorId(@PathVariable Long id) {
        PaisDto dto = service.procurarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

    @PostMapping
    public ResponseEntity<PaisDto> inserir(@RequestBody PaisDto dto) {
        PaisDto dtoRec = service.inserir(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dtoRec.getId()).toUri();
        return ResponseEntity.created(uri).body(dtoRec);
    }

    // Atualizar

    @DeleteMapping(value = "/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }

}
