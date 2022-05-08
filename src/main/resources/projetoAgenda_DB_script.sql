CREATE DATABASE projeto_agenda;

CREATE TABLE cliente(
	id_cliente INT AUTO_INCREMENT PRIMARY KEY

);

CREATE TABLE profissional(
	id_profissional INT AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE pessoa (
	id_pessoa INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    rg VARCHAR(14) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    data_nasc DATE NOT NULL,
    id_cliente INT,
    id_profissional INT,
    FOREIGN KEY (id_cliente)
		REFERENCES cliente (id_cliente),
	FOREIGN KEY (id_profissional)
		REFERENCES profissional (id_profissional)
);

CREATE TABLE espaco(
	id_espaco INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE endereco(
	id_endereco INT AUTO_INCREMENT PRIMARY KEY,
    pais VARCHAR(20) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    rua VARCHAR(50) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    numero VARCHAR(20) NOT NULL,
    complemento VARCHAR(20) NOT NULL,
    id_pessoa INT ,
    id_profissional INT,
    id_espaco INT,
    FOREIGN KEY (id_cliente)
		REFERENCES cliente (id_cliente),
	FOREIGN KEY (id_profissional)
		REFERENCES profissional (id_profissional),
	FOREIGN KEY (id_espaco)
		REFERENCES espaco (id_espaco)
);

CREATE TABLE procedimento(
	id_procedimento INT AUTO_INCREMENT PRIMARY KEY,
    nome_procedimento VARCHAR(20) NOT NULL,
    descricao VARCHAR(60) NOT NULL,
    custo_procedimento NUMERIC(9,2) NOT NULL,
    valor_procediemto NUMERIC(9,2) NOT NULL,
    id_profissional INT,
    FOREIGN KEY (id_profissional)
		REFERENCES profissional (id_profissional)
);

CREATE TABLE sessao(
	id_sessao INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_espaco INT NOT NULL,
    d_profissional INT NOT NULL,
    horario DATETIME,
	FOREIGN KEY (id_cliente)
		REFERENCES cliente (id_cliente),
	FOREIGN KEY (id_profissional)
		REFERENCES profissional (id_profissional),
	FOREIGN KEY (id_espaco)
		REFERENCES espaco (id_espaco)
);

CREATE TABLE pagamento (
	id_pagamento INT AUTO_INCREMENT PRIMARY KEY,
    forma_pagamento varchar(20),
    id_cliente INT NOT NULL,
    id_sessao INT NOT NULL,
    valor_total NUMERIC (9,2),
	FOREIGN KEY (id_cliente)
		REFERENCES cliente (id_cliente),
	FOREIGN KEY (id_sessao)
		REFERENCES sessao (id_sessao)
);