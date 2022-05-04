package com.projeto.Agenda.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PAIS")
public class Pais implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_PAIS")
    private long id;

    @Column (name = "NOME")
    private String nome;

    public Pais() {
    }

    public Pais(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
