package com.senai.eli.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "grupo_trabalho")
@Entity
@Getter
@Setter

public class GrupoTrabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "responsavel")
    private String responsavel;

    @Column(name = "nome", nullable = false)
    private String nome;

    @ManyToMany(mappedBy = "grupos")
    private List<Evento> eventos = new ArrayList<>();


}
