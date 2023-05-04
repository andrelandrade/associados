CREATE TABLE associados(
	id SERIAL PRIMARY KEY,
	data_cadastro DATE,
	nome VARCHAR(100),
	observacao TEXT,
	categoria VARCHAR(15),
	data_nascimento DATE,
	naturalidade VARCHAR(100),
	estado_natural VARCHAR(2),
	nacionalidade VARCHAR(100),
	endereco VARCHAR(100),
	bairro VARCHAR(100),
	estado VARCHAR(2),
	telefone VARCHAR(15),
	mes_pago INTEGER,
	ano_pago INTEGER
);