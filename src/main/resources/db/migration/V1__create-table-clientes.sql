create table clientes(
    id int not null auto_increment,
    nome varchar(100) not null,
    email varchar(100) not null unique,
    idade int not null,

    primary key(id)

);