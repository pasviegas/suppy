create schema SA;
create table GridEntity (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    descricao varchar(200) not null,
    valor numeric(10,2) not null,
    CONSTRAINT GridEntity_key PRIMARY KEY (id)
);
create table SingleRowEntity (
    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    texto1 varchar(200),
    combo1 varchar(200),
    autocomplete integer,
    dateDate date,
    dateTime date,
    CONSTRAINT SingleRowEntity_key PRIMARY KEY (id)
);