package com.projeto.Agenda.model;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "BAIRROS")
public class Bairro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_BAIRRO")
    private long id;

    @OneToOne
    @JoinColumn (name = "CIDADE",
            referencedColumnName = "ID_CIDADE",
            foreignKey = @ForeignKey(name = "FK_CIDADE_ID_CIDADE"))
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(long id, Cidade cidade) {
        this.id = id;
        this.cidade = cidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
