package br.com.sisnema.musica.dtos;

import br.com.sisnema.musica.entities.Artista;

import java.io.Serializable;

public class ArtistaDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private boolean banda;
    private Long pais_id;

    public ArtistaDto() {
    }

    public ArtistaDto(Long id, String nome, boolean banda, Long pais_id) {
        this.id = id;
        this.nome = nome;
        this.banda = banda;
        this.pais_id = pais_id;
    }

    public ArtistaDto(Artista entidade) {
        id = entidade.getId();
        nome = entidade.getNome();
        banda = entidade.isBanda();
        pais_id = entidade.getPais().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isBanda() {
        return banda;
    }

    public void setBanda(boolean banda) {
        this.banda = banda;
    }

    public Long getPais_id() {
        return pais_id;
    }

    public void setPais_id(Long pais_id) {
        this.pais_id = pais_id;
    }
}
