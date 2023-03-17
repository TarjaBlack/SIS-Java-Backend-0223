package br.com.sisnema.musica.entities;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_musico")
public class Musico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;



}
