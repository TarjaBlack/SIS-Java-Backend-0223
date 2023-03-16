package br.com.sisnema.musica.services;

import br.com.sisnema.musica.dtos.AlbumDto;
import br.com.sisnema.musica.entities.Album;
import br.com.sisnema.musica.entities.Artista;
import br.com.sisnema.musica.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository repository;

    @Transactional(readOnly = true)
    public List<AlbumDto> procurarTodos() {
        List<Album> list = repository.findAll();
        return list.stream().map(x -> new AlbumDto(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public AlbumDto procurarPorId(Long id) {
        Optional<Album> objeto = repository.findById(id);
        Album entidade = objeto.get();
        return new AlbumDto(entidade);
    }

    @Transactional
    public AlbumDto inserir(AlbumDto dto) {
        Album entidade = new Album();
        entidade.setTitulo(dto.getTitulo());
        entidade.setAno(dto.getAno());
        entidade.setArtista(new Artista(dto.getArtista_id()));
        entidade = repository.save(entidade);
        return new AlbumDto(entidade);
    }

    @Transactional
    public AlbumDto atualizar(Long id, AlbumDto dto) {
        Album entidade = repository.getReferenceById(id);
        entidade.setTitulo(dto.getTitulo());
        entidade.setAno(dto.getAno());
        entidade.setArtista(new Artista(dto.getArtista_id()));
        entidade = repository.save(entidade);
        return new AlbumDto(entidade);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
        // No futuro vamos criar exceções.
    }

}
