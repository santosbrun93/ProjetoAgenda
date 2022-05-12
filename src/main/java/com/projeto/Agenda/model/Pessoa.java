package com.projeto.Agenda.model;

import java.io.Serializable;
import java.time.LocalDate;
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
    private String RG;

    @Column (name = "DATA_NASCIMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate dataNascimento;

    public Pessoa(long id, String nome, String email, String CPF, String RG, LocalDate dataNascimento) {
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
