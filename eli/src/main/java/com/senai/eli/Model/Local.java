package com.senai.eli.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Table(name = "local")
@Entity
@Getter
@Setter
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    private String referencia;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "numero")
    private int numero;

    @Column(name = "cep", nullable = false, length = 9)
    private String cep;

    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL)
    private List<Evento> eventos = new ArrayList<>();
}
