package br.com.sisnema.banco.services;

import br.com.sisnema.banco.dtos.FuncaoDto;
import br.com.sisnema.banco.dtos.TipoContaDto;
import br.com.sisnema.banco.entities.Funcao;
import br.com.sisnema.banco.entities.TipoConta;
import br.com.sisnema.banco.repositories.TipoContaRepository;
import br.com.sisnema.banco.services.exceptions.RecursoNaoEncontrado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TipoContaService {

    @Autowired
    private TipoContaRepository repository;

    @Transactional(readOnly = true)
    public List<TipoContaDto> procurarTodos() {
        List<TipoConta> list = repository.findAll();
        return list.stream().map(x -> new TipoContaDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public TipoContaDto procurarPorId(Long id) {
        Optional<TipoConta> objeto = repository.findById(id);
        TipoConta entidade = objeto.orElseThrow(() ->
                new RecursoNaoEncontrado("Este ID não existe em nosso sistema.")
        );
        return new TipoContaDto(entidade);
    }

}
