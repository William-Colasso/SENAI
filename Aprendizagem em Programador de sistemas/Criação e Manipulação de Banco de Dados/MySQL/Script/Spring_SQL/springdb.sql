create database springdb;

use springdb;

create table produto(
	id bigint auto_increment primary key,
    descricao varchar(255),
    preco double

);

create table pedido (
	id bigint auto_increment primary key,
	data_pedido date,
    produto_id bigint,
    constraint FK_produto_pedido
    foreign key (produto_id) references produto(id)
);


select * from pedido;
select * from produto;