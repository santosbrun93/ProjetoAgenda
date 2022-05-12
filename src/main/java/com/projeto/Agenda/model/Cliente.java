package com.projeto.Agenda.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name="CLIENTES")
public class Cliente extends Pessoa implements Serializable {

    @Column (name = "FORMA_PAGAMENTO")
    private formaPagamento formaCliente;

    @Column (name = "CLIENTE_ANTIGO")
    private boolean clienteAntigo;

    public Cliente() {
    }

    public Cliente(long id, String nome, String email, String CPF, String RG, LocalDate dataNascimento) {
        super(id, nome, email, CPF, RG, dataNascimento);
    }

    public Cliente(long id, String nome, String email, String CPF, String RG, LocalDate dataNascimento, formaPagamento formaCliente, boolean clienteAntigo) {
        super(id, nome, email, CPF, RG, dataNascimento);
        this.formaCliente = formaCliente;
        this.clienteAntigo = clienteAntigo;
    }

    public formaPagamento getFormaCliente() {
        return formaCliente;
    }

    public void setFormaCliente(formaPagamento formaCliente) {
        this.formaCliente = formaCliente;
    }

    public boolean isClienteAntigo() {
        return clienteAntigo;
    }

    public void setClienteAntigo(boolean clienteAntigo) {
        this.clienteAntigo = clienteAntigo;
    }
}
