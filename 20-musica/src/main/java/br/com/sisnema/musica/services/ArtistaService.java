package br.com.sisnema.musica.services;

import br.com.sisnema.musica.dtos.ArtistaDto;
import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.entities.Pais;
import br.com.sisnema.musica.repositories.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArtistaService {

    // Significa que todos os recursos da interface ArtistaRepository
    // estarão disponíveis dentro do ArtistaService
    @Autowired
    private ArtistaRepository repository;

    @Transactional(readOnly = true)
    public List<ArtistaDto> procurarTodos() {
        List<Artista> list = repository.findAll();
        return list.stream().map(x -> new ArtistaDto(x)).collect(Collectors.toList());
    } // Expressão lambda

    @Transactional(readOnly = true)
    public ArtistaDto procurarPorId(Long id) {
        Optional<Artista> objeto = repository.findById(id);
        Artista entidade = objeto.get(); // Retira o Artista do Optional
        return new ArtistaDto(entidade);
    }

    @Transactional
    public ArtistaDto inserir(ArtistaDto dto) { // null "Foo Fighters" true
        Artista entidade = new Artista(); // null "Foo Fighters" true
        entidade.setNome(dto.getNome()); // null "Foo Fighters" true
        entidade.setBanda(dto.isBanda()); // null "Foo Fighters" true
        entidade.setPais(new Pais(dto.getPais_id()));
        // Salva no BD e devolve 5 "Foo Fighters" true
        entidade = repository.save(entidade);
        return new ArtistaDto(entidade);
    }

    @Transactional
    public ArtistaDto atualizar(Long id, ArtistaDto dto) {
        Artista entidade = repository.getReferenceById(id);
        entidade.setNome(dto.getNome());
        entidade.setBanda(dto.isBanda());
        entidade.setPais(new Pais(dto.getPais_id()));
        entidade = repository.save(entidade);
        return new ArtistaDto(entidade);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
        // No futuro vamos criar exceções.
    }

}
