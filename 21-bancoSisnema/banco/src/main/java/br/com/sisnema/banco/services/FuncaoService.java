package br.com.sisnema.banco.services;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.entities.Funcao;
import br.com.sisnema.banco.repositories.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FuncaoService {

    @Autowired
    private FuncaoRepository repository;

    @Transactional(readOnly = true)
    public List<FuncaoDto> procurarTodos() {
        List<Funcao> list = repository.findAll();
        return list.stream().map(x -> new FuncaoDto(x)).collect(Collectors.toList());
    }


}
