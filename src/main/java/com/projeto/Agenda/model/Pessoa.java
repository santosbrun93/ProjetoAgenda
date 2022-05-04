package com.projeto.Agenda.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public abstract class Pessoa{

    @Id
    @Column(name = "ID_PESSOA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "NOME")
    private String nome;

    @Column (name = "EMAIL")
    private String email;

    @Column (name = "CPF", length = 11)
    private String CPF;

    @Column (name = "RG",length = 10)
    private long RG;

    @Column (name = "DATA_NASCIMENTO")
    private Date dataNascimento;

    public Pessoa(long id, String nome, String email, String CPF, long RG, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
    }

    protected Pessoa() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public long getRG() {
        return RG;
    }

    public void setRG(long RG) {
        this.RG = RG;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
