package br.com.sisnema.musica.services;

import br.com.sisnema.musica.dtos.InstrumentoDto;
import br.com.sisnema.musica.entities.Instrumento;
import br.com.sisnema.musica.repositories.InstrumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InstrumentoService {

    // Significa que todos os recursos da interface InstrumentoRepository
    // estarão disponíveis dentro do InstrumentoService
    @Autowired
    private InstrumentoRepository repository;

    @Transactional(readOnly = true)
    public List<InstrumentoDto> procurarTodos() {
        List<Instrumento> list = repository.findAll();
        return list.stream().map(x -> new InstrumentoDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public InstrumentoDto procurarPorId(Long id) {
        Optional<Instrumento> objeto = repository.findById(id);
        Instrumento entidade = objeto.get(); // Retira o Artista do Optional
        return new InstrumentoDto(entidade);
    }

    @Transactional
    public InstrumentoDto inserir(InstrumentoDto dto) {
        Instrumento entidade = new Instrumento();
        entidade.setNome(dto.getNome());
        entidade.setObs(dto.getObs());
        entidade = repository.save(entidade);
        return new InstrumentoDto(entidade);
    }

    @Transactional
    public InstrumentoDto atualizar(Long id, InstrumentoDto dto) {
        Instrumento entidade = repository.getReferenceById(id);
        entidade.setNome(dto.getNome());
        entidade.setObs(dto.getObs());
        entidade = repository.save(entidade);
        return new InstrumentoDto(entidade);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
        // No futuro vamos criar exceções.
    }

}
