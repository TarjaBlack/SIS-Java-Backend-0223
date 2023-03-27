package br.com.sisnema.banco.controllers;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.services.FuncaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/funcoes")
public class FuncaoController {

    @Autowired
    private FuncaoService service;

    @GetMapping
    public ResponseEntity<List<FuncaoDto>> buscarTodos() {
        List<FuncaoDto> list = service.procurarTodos();
        return ResponseEntity.ok().body(list);
    }
}
