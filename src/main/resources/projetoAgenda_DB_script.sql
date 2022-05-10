CREATE DATABASE projeto_agenda;

CREATE TABLE pais(
    id_pais
    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL
);
CREATE TABLE estado(
    id_estado
    INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    UF CHAR(2),
    id_pais INT NOT NULL,
    FOREIGN KEY (id_pais)
    	REFERENCES pais (id_pais)
);

CREATE TABLE cidade(
    id_cidade
  	INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    id_estado INT NOT NULL,
    FOREIGN KEY (id_estado)
      	REFERENCES estado (id_estado)
);


CREATE TABLE bairro(
    id_bairro INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    id_cidade INT NOT NULL,
    FOREIGN KEY (id_cidade)
    	REFERENCES cidade (id_cidade)
);

CREATE TABLE endereco(
	id_endereco INT AUTO_INCREMENT PRIMARY KEY,
    rua VARCHAR(50) NOT NULL,
    numero INT NOT NULL,
    complemento VARCHAR(20) NOT NULL,
    id_bairro INT NOT NULL,
    id_estado INT NOT NULL,
    id_pais INT NOT NULL,
    cep VARCHAR(10) NOT NULL,
    FOREIGN KEY (id_bairro)
		REFERENCES bairro (id_bairro),
	FOREIGN KEY (id_estado)
		REFERENCES estado (id_estado),
	FOREIGN KEY (id_pais)
		REFERENCES pais (id_pais)
);

CREATE TABLE espaco(
	id_espaco INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    id_endereco INT NOT NULL,
    FOREIGN KEY (id_endereco)
    		REFERENCES endereco (id_endereco)
);

CREATE TABLE profissional(
	id_profissional INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
	email VARCHAR(80) NOT NULL,
    rg VARCHAR(14) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    data_nasc DATE NOT NULL,
    id_espaco INT NOT NULL,
    FOREIGN KEY (id_espaco)
        		REFERENCES espaco (id_espaco)
);

CREATE TABLE procedimento(
	id_procedimento INT AUTO_INCREMENT PRIMARY KEY,
    nome_procedimento VARCHAR(20) NOT NULL,
    descricao VARCHAR(60) NOT NULL,
    valor_material NUMERIC(9,2) NOT NULL,
    valor_cliente NUMERIC(9,2) NOT NULL,
    valor_lucro NUMERIC(9,2) NOT NULL,
    duracao TIME
);

CREATE TABLE procedimentos_profissional(
    id INT AUTO_INCREMENT,
    id_profissional INT NOT NULL,
    id_procedimento INT NOT NULL,
    FOREIGN KEY (id_profissional)
    		REFERENCES profissional (id_profissional),
    	FOREIGN KEY (id_procedimento)
    		REFERENCES procedimento (id_procedimento),
    PRIMARY KEY(id, id_profissional, id_procedimento)
);

CREATE TABLE cliente(
	id_cliente INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(80) NOT NULL,
	email VARCHAR(80) NOT NULL,
    rg VARCHAR(14) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    data_nasc DATE NOT NULL,
    forma_pagamento VARCHAR(14) NOT NULL,
    cliente_antigo boolean NOT NULL,
    id_endereco INT NOT NULL,
    FOREIGN KEY (id_endereco)
        REFERENCES endereco (id_endereco)
);



CREATE TABLE sessao(
	id_sessao INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_espaco INT NOT NULL,
    id_profissional INT NOT NULL,
    horario DATETIME,
	FOREIGN KEY (id_cliente)
		REFERENCES cliente (id_cliente),
	FOREIGN KEY (id_profissional)
		REFERENCES profissional (id_profissional),
	FOREIGN KEY (id_espaco)
		REFERENCES espaco (id_espaco)
);