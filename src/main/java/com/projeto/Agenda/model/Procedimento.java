package com.projeto.Agenda.model;

import java.time.LocalDateTime;
import java.util.*;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PROCEDIMENTOS")
public class Procedimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_PROCEDIMENTOS")
    private long id;

    @Column (name = "NOME")
    private String nomeProcedimento;

    @Column (name = "DESCRICAO")
    private String descricaoProcedimento;

    @Column (name = "VALOR_COBRANCA")
    private double valorCobranca;

    @Column (name = "VALOR_MATERIAL")
    private double valorMaterial;

    @Column (name = "VALOR_LUCRO")
    private double valorLucro;

    @Column (name = "DURACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime duracao;


    public Procedimento() {
    }


    public Procedimento(long id, String nomeProcedimento, String descricaoProcedimento,
                        double valorCobranca, double valorMaterial, double valorLucro,
                        LocalDateTime duracao) {
        this.id = id;
        this.nomeProcedimento = nomeProcedimento;
        this.descricaoProcedimento = descricaoProcedimento;
        this.valorCobranca = valorCobranca;
        this.valorMaterial = valorMaterial;
        this.valorLucro = valorLucro;
        this.duracao = duracao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeProcedimento() {
        return nomeProcedimento;
    }

    public void setNomeProcedimento(String nomeProcedimento) {
        this.nomeProcedimento = nomeProcedimento;
    }

    public String getDescricaoProcedimento() {
        return descricaoProcedimento;
    }

    public void setDescricaoProcedimento(String descricaoProcedimento) {
        this.descricaoProcedimento = descricaoProcedimento;
    }

    public double getValorCobranca() {
        return valorCobranca;
    }

    public void setValorCobranca(double valorCobranca) {
        this.valorCobranca = valorCobranca;
    }

    public double getValorMaterial() {
        return valorMaterial;
    }

    public void setValorMaterial(double valorMaterial) {
        this.valorMaterial = valorMaterial;
    }

    public void setValorLucro(double valorLucro) {
        this.valorLucro = valorCobranca - valorMaterial;
    }

    public double getValorLucro() {
        return valorCobranca - valorMaterial;
    }

    public LocalDateTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalDateTime duracao) {
        this.duracao = duracao;
    }
}
