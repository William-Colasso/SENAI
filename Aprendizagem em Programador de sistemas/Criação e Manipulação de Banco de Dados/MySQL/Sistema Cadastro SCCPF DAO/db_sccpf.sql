create database db_sccpf;

use db_sccpf;

create table Cliente(
	codigo int not null primary key auto_increment,
    nome varchar(45) not null,
    fone varchar(14) not null,
    email varchar(45) not null,
	endereco varchar(150) not null

);

create table Fornecedor(
	codigo int not null primary key auto_increment,
    contato varchar(45) not null,
    email varchar(45) not null,
    fone varchar(14) not null,
    empresa varchar(45) not null
);

create table Produto(
	codigo int not null primary key auto_increment,
    preco decimal(10,2) not null,
    unidade varchar (4) not null,
    quantidade decimal(10,2) not null,
    descricao varchar(150) not null
);

select * from Cliente;
select * from Fornecedor;
select * from Produto;
insert into Fornecedor values(0,"a","a","a","a");

insert into Produto values(0,"a","a",0,0);

INSERT INTO Cliente (nome, fone, email, endereco)
VALUES 
('João Silva', '(11) 99999-1234', 'joao.silva@email.com', 'Rua das Flores, 123, São Paulo'),
('Maria Oliveira', '(21) 98765-4321', 'maria.oliveira@email.com', 'Av. Atlântica, 456, Rio de Janeiro'),
('Carlos Santos', '(31) 91234-5678', 'carlos.santos@email.com', 'Rua da Paz, 789, Belo Horizonte'),
('Ana Souza', '(41) 99876-5432', 'ana.souza@email.com', 'Rua das Acácias, 321, Curitiba'),
('Paulo Lima', '(51) 91234-8765', 'paulo.lima@email.com', 'Av. Brasil, 111, Porto Alegre');


INSERT INTO Fornecedor (contato, email, fone, empresa)
VALUES 
('Jorge Mendes', 'jorge.mendes@empresa1.com', '(11) 91234-5678', 'Empresa 1'),
('Carla Pereira', 'carla.pereira@empresa2.com', '(21) 98765-4321', 'Empresa 2'),
('Roberto Costa', 'roberto.costa@empresa3.com', '(31) 99876-5432', 'Empresa 3'),
('Fernanda Souza', 'fernanda.souza@empresa4.com', '(41) 91234-8765', 'Empresa 4'),
('Marcos Alves', 'marcos.alves@empresa5.com', '(51) 99876-5432', 'Empresa 5');


INSERT INTO Produto (preco, unidade, quantidade, descricao)
VALUES 
(25.50, 'kg', 100.00, 'Arroz branco tipo 1'),
(18.90, 'lt', 50.00, 'Óleo de soja 900ml'),
(7.99, 'un', 200.00, 'Café torrado e moído 500g'),
(12.75, 'lt', 120.00, 'Leite integral 1 litro'),
(3.50, 'un', 300.00, 'Sabonete líquido 200ml');
