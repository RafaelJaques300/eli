package com.senai.eli.Model;

import com.senai.eli.Enum.Sexo;
import com.senai.eli.Validator.Telefone.Telefone;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;

@Table(name = "usuario")
@Entity
@Setter
@Getter

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "sexo", nullable = false)
    @ColumnDefault("3")
    private Sexo sexo = Sexo.NAO_INFORMADO;

    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @Column(name = "telefone", length = 14)
    @Telefone(apenasCelular = true, required = false)
    private String telefone;

    @Column(name = "nascimento", nullable = false)
    private LocalDate nascimento;
    
}
