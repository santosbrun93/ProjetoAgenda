package com.projeto.Agenda.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
@Table(name = "SESSOES")
public class Sessao implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID_SESSAO")
    private long id;

    @ManyToOne
    @JoinColumn(name = "CLIENTE_ID")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "PROFISSIONAL_ID")
    private Profissional profissional;

    @Column (name = "HORARIO_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horarioInicial;

    @Column (name = "HORARIO_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horarioFinal;

    @ManyToOne
    @JoinColumn(name = "ESPACO_ID")
    private Espaco espaco;

    @ManyToOne
    @JoinColumn(name = "PROCEDIMENTO_ID")
    private Procedimento procedimento;

    public Sessao() {
    }

    public Sessao(long id, Cliente cliente, Profissional profissional,
                  LocalDateTime horarioInicial, LocalDateTime horarioFinal,
                  Espaco espaco, Procedimento procedimento) {
        this.id = id;
        this.cliente = cliente;
        this.profissional = profissional;
        this.horarioInicial = horarioInicial;
        this.horarioFinal = horarioFinal;
        this.espaco = espaco;
        this.procedimento = procedimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public LocalDateTime getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(LocalDateTime horario) {
        this.horarioInicial = horario;
    }

    public LocalDateTime getHorarioFinal(Procedimento procedimento)
    {
        return horarioFinal;
    }

    public void setHorarioFinal(LocalDateTime horario) {
        this.horarioFinal = horario;
    }

    public Espaco getEspaco() {
        return espaco;
    }

    public void setEspaco(Espaco espaco) {
        this.espaco = espaco;
    }

    public Procedimento getProcedimento () {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
}
