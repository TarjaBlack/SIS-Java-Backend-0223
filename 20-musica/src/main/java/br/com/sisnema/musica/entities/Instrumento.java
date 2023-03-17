package br.com.sisnema.musica.entities;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_instrumento")
public class Instrumento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String obs;

}
