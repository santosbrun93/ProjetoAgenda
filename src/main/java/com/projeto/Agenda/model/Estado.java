package com.projeto.Agenda.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ESTADOS")
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_ESTADO")
    private long id;

    @Column (name = "NOME")
    private String nome;

    @Column (name = "UF")
    private String uf;


    @OneToOne
    @JoinColumn (name = "PAIS",
            referencedColumnName = "ID_PAIS",
            foreignKey = @ForeignKey(name = "FK_PAIS_ID_PAIS"))
    private Pais pais;

    public Estado() {
    }

    public Estado(long id, String nome, String uf, Pais pais) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
