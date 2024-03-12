create table produtos(
    id int not null auto_increment,
    nome varchar(100) not null,
    preco double not null,
    descricao varchar(100) not null,

    primary key(id)

);