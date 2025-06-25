create table usuario(
  id NUMERIC(18,0) not null primary key,
  nome VARCHAR(50) not null,
  email VARCHAR(50) not null,
  senha VARCHAR(100) not null
);

create table categoria(
    id NUMERIC(18,0) not null primary key,
    nome VARCHAR(50) not null,
    descricao VARCHAR(300),
    usuario_id NUMERIC(18,0) NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);

create table estudo(
    id NUMERIC(18,0) not null primary key,
    titulo VARCHAR(50) not null,
    data DATE not null,
    descricao VARCHAR(300),
    duracaoMin NUMERIC(18,0),
    categoria_id NUMERIC(18,0) NOT NULL,
    usuario_id NUMERIC(18,0) NOT NULL,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)
);