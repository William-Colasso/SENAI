create database dbproduto;

use dbproduto;

create table produto(
	id bigint not null auto_increment primary key,
    descricao varchar(150) not null,
    preco float not null

);

create table pedido(
	id bigint not null primary key auto_increment,
    data_pedido date not null,
    
    id_produto bigint not null,
    
    constraint fk_id_produto
    foreign key (id_produto) references produto(id)
);



select * from produto;
select * from pedido;

SHOW CREATE TABLE pedido;