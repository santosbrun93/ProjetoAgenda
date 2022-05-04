package com.projeto.Agenda.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ENDERECOS")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ID_ENDERECO")
    private long id;

    @Column (name = "RUA")
    private String rua;

    @Column (name = "NUMERO")
    private int numero;

    @Column (name = "COMPLEMENTO")
    private String complemento;

    @Column (name = "CEP")
    private String cep;

    @OneToOne
    @JoinColumn (name = "ID_BAIRRO",
            referencedColumnName = "ID_BAIRRO",
            foreignKey = @ForeignKey(name = "FK_BAIRRO_ID_BAIRRO"))
    private Bairro bairro;

}
