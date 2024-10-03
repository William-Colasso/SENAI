create database bdnotafiscal;
USE bdnotafiscal;


CREATE TABLE Cliente (
    idCliente int not null auto_increment primary key,
    nome VARCHAR(45) not null,
    endereco VARCHAR(100) not null
);


CREATE TABLE Vendedor (
    idVendedor int not null auto_increment primary key,
    nome VARCHAR(45) not null
);


CREATE TABLE NotaFiscal (
    idNotaFiscal int not null auto_increment primary key,
    dataEmissao DATE NOT NULL,
    totalNota DECIMAL(10,2) not null,
    idCliente INT not null, 
    idVendedor INT not null,
    
  
    CONSTRAINT id_cliente_fk FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
    CONSTRAINT id_vendedor_fk FOREIGN KEY (idVendedor) REFERENCES Vendedor(idVendedor)
);


CREATE TABLE Produto (
    idProduto int not null auto_increment primary key,
    descricao VARCHAR(45) not null,
    unidade VARCHAR(2) not null,
    preco DECIMAL(10,2) not null
);



CREATE TABLE ItemNotaFiscal (
    idProduto INT NOT NULL,
    idNotaFiscal INT NOT NULL,
    quantidade INT NOT NULL,
    precoProduto int not null, 
    totalProduto int not null, 
    
    primary key(idProduto,IdNotaFiscal),
    
    constraint id_itemNotaFiscal_idProduto_fk
    FOREIGN KEY (idProduto) REFERENCES Produto(idProduto),
    constraint id_itemNotaFiscal_idNotaFiscal_fk
    FOREIGN KEY (idNotaFiscal) REFERENCES NotaFiscal(idNotaFiscal)
    
);


desc ItemNotaFiscal