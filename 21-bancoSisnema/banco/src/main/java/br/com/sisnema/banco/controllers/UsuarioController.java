package br.com.sisnema.banco.controllers;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.dtos.UsuarioDto;
import br.com.sisnema.banco.services.FuncaoService;
import br.com.sisnema.banco.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> buscarTodos() {
        List<UsuarioDto> list = service.procurarTodos();
        return ResponseEntity.ok().body(list);
    }
}
