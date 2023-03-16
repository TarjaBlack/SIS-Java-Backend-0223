package br.com.sisnema.musica.services;

import br.com.sisnema.musica.dtos.PaisDto;
import br.com.sisnema.musica.entities.Pais;
import br.com.sisnema.musica.repositories.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PaisService {

    // Significa que todos os recursos da interface PaisRepository
    // estarão disponíveis dentro do PaisService
    @Autowired
    private PaisRepository repository;

    @Transactional(readOnly = true)
    public List<PaisDto> procurarTodos() {
        List<Pais> list = repository.findAll();
        return list.stream().map(x -> new PaisDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public PaisDto procurarPorId(Long id) {
        Optional<Pais> objeto = repository.findById(id);
        Pais entidade = objeto.get(); // Retira o Artista do Optional
        return new PaisDto(entidade);
    }

    @Transactional(readOnly = true)
    public PaisDto procurarPorIdComArtistas(Long id) {
        Optional<Pais> objeto = repository.findById(id);
        Pais entidade = objeto.get(); // Retira o Artista do Optional
        return new PaisDto(entidade, entidade.getArtistaList());
    }

    @Transactional
    public PaisDto inserir(PaisDto dto) { // null "Uruguai"
        Pais entidade = new Pais(); // null "Uruguai"
        entidade.setNome(dto.getNome()); // null "Uruguai"

        // Salva no BD e devolve 6 "Uruguai"
        entidade = repository.save(entidade);
        return new PaisDto(entidade);
    }

    @Transactional
    public PaisDto atualizar(Long id, PaisDto dto) {
        Pais entidade = repository.getReferenceById(id);
        entidade.setNome(dto.getNome());
        entidade = repository.save(entidade);
        return new PaisDto(entidade);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
        // No futuro vamos criar exceções.
    }

}
