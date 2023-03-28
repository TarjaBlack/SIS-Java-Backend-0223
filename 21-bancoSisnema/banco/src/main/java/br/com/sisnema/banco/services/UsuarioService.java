package br.com.sisnema.banco.services;

import br.com.sisnema.banco.dtos.UsuarioDto;
import br.com.sisnema.banco.entities.Usuario;
import br.com.sisnema.banco.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Transactional(readOnly = true)
    public List<UsuarioDto> procurarTodos() {
        List<Usuario> list = repository.findAll();
        return list.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
    }


}
