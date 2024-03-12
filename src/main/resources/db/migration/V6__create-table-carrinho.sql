create table carrinho(
    id int not null auto_increment,
    valorTotal decimal(50,2) not null,
    clienteId bigint not null,

    primary key(id)
);

ALTER TABLE carrinho ADD CONSTRAINT fk_carrinho_cliente FOREIGN KEY (clienteId) REFERENCES clientes (id);