package br.com.sisnema.musica.services;

import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.repositories.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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



}
