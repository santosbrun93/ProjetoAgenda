package com.projeto.Agenda.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CIDADES")
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_CIDADE")
    private long id;

    @Column (name = "NOME")
    private String nome;

    @OneToOne
    @JoinColumn (name = "ESTADO",
            referencedColumnName = "ID_ESTADO",
            foreignKey = @ForeignKey(name = "FK_ESTADO_ID_ESTADO"))
    private Estado estado;

}
