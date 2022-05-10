package com.projeto.Agenda.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ESPACOS")
public class Espaco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_ESPACOS")
    private long id;

    @Column (name = "NOME")
    private String nome;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;


    public Espaco() {
    }

    public Espaco(long id, Endereco endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
