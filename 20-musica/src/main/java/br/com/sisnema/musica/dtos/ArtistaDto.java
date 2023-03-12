package br.com.sisnema.musica.dtos;

import br.com.sisnema.musica.entities.Artista;

import java.io.Serializable;

public class ArtistaDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private boolean banda;

    public ArtistaDto() {
    }

    public ArtistaDto(Long id, String nome, boolean banda) {
        this.id = id;
        this.nome = nome;
        this.banda = banda;
    }

    public ArtistaDto(Artista entidade) {
        id = entidade.getId();
        nome = entidade.getNome();
        banda = entidade.isBanda();
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
}
