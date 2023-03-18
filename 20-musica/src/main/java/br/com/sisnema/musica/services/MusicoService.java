package br.com.sisnema.musica.services;

import br.com.sisnema.musica.dtos.MusicoDto;
import br.com.sisnema.musica.entities.Musico;
import br.com.sisnema.musica.repositories.MusicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MusicoService {

    // Significa que todos os recursos da interface MusicoRepository
    // estarão disponíveis dentro do MusicoService
    @Autowired
    private MusicoRepository repository;

    @Transactional(readOnly = true)
    public List<MusicoDto> procurarTodos() {
        List<Musico> list = repository.findAll();
        return list.stream().map(x -> new MusicoDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public MusicoDto procurarPorId(Long id) {
        Optional<Musico> objeto = repository.findById(id);
        Musico entidade = objeto.get();
        return new MusicoDto(entidade);
    }
    
    @Transactional
    public MusicoDto inserir(MusicoDto dto) {
        Musico entidade = new Musico();
        entidade.setNome(dto.getNome());
        entidade.setSobrenome(dto.getSobrenome());
        entidade.setDataNasc(dto.getDataNasc());
        entidade = repository.save(entidade);
        return new MusicoDto(entidade);
    }

    @Transactional
    public MusicoDto atualizar(Long id, MusicoDto dto) {
        Musico entidade = repository.getReferenceById(id);
        entidade.setNome(dto.getNome());
        entidade.setSobrenome(dto.getSobrenome());
        entidade.setDataNasc(dto.getDataNasc());
        entidade = repository.save(entidade);
        return new MusicoDto(entidade);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
        // No futuro vamos criar exceções.
    }

}
