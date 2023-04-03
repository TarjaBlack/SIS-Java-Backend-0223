package br.com.sisnema.banco.controllers;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.dtos.TipoContaDto;
import br.com.sisnema.banco.services.TipoContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/tipocontas")
public class TipoContaController {

    @Autowired
    private TipoContaService service;

    @GetMapping
    public ResponseEntity<List<TipoContaDto>> buscarTodos() {
        List<TipoContaDto> list = service.procurarTodos();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<TipoContaDto> buscarPorId(@PathVariable Long id) {
        TipoContaDto dto = service.procurarPorId(id);
        return ResponseEntity.ok().body(dto);
    }

}
