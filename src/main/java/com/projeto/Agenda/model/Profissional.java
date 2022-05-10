package com.projeto.Agenda.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name = "PROFISSIONAIS")
public class Profissional extends Pessoa implements Serializable {

    @ManyToMany
    @JoinColumn(name = "PROCEDIMENTOS_PROFISSINAL") //NECESSÁRIO ENTENDER COMO FAZER N PRA N
    private List<Procedimento> procedimentosRealizados;


    public Profissional() {
    }

    public Profissional(long id, String nome, String email, String CPF, long RG, Date dataNascimento, long id1, List<Procedimento> procedimentosRealizados) {
        super(id, nome, email, CPF, RG, dataNascimento);
        this.procedimentosRealizados = procedimentosRealizados;
    }

    public List<Procedimento> getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    public void setProcedimentosRealizados(List<Procedimento> procedimentosRealizados) {
        this.procedimentosRealizados = procedimentosRealizados;
    }
}
