package br.com.sisnema.musica.services;

import br.com.sisnema.musica.dtos.ArtistaDto;
import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.repositories.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {

    // Significa que todos os recursos da interface ArtistaRepository
    // estarão disponíveis dentro do ArtistaService
    @Autowired
    private ArtistaRepository repository;

    @Transactional(readOnly = true)
    public List<Artista> procurarTodos() {
        List<Artista> artistaList = repository.findAll();
        return artistaList;
    }

    @Transactional(readOnly = true)
    public ArtistaDto procurarPorId(Long id) {
        Optional<Artista> objeto = repository.findById(id);
        Artista entidade = objeto.get(); // Retira o Artista do Optional
        return new ArtistaDto(entidade);
    }

    // Cadastrar

    // Atualizar

    public void excluir(Long id) {
        repository.deleteById(id);
        // No futuro vamos criar exceções.
    }

}
