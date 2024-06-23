package com.tabmed_back30.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FormularioMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dados;
    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Usuario medico;

}

