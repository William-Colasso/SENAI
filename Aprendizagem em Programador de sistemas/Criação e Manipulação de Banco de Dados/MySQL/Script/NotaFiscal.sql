
USE bdnotafiscal;


CREATE TABLE Cliente (
    idCliente INT NOT NULL PRIMARY KEY,
    nome VARCHAR(45) NOT NULL,
    endereco VARCHAR(100) NOT NULL
);


CREATE TABLE Vendedor (
    idVendedor INT NOT NULL PRIMARY KEY,
    nome VARCHAR(45) NOT NULL
);


CREATE TABLE NotaFiscal (
    idNotaFiscal INT NOT NULL PRIMARY KEY,
    dataEmissao DATE NOT NULL,
    totalNota DECIMAL(10,2) NOT NULL,
    idCliente INT NOT NULL, -- Adicionando a coluna idCliente
    idVendedor INT NOT NULL, -- Adicionando a coluna idVendedor
    
  
    CONSTRAINT id_cliente_fk FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente),
    CONSTRAINT id_vendedor_fk FOREIGN KEY (idVendedor) REFERENCES Vendedor(idVendedor)
);


CREATE TABLE Produto (
    idProduto INT NOT NULL PRIMARY KEY,
    descricao VARCHAR(45) NOT NULL,
    unidade VARCHAR(2) NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);


CREATE TABLE ItemNotaFiscal (
    idProduto INT NOT NULL,
    idNotaFiscal INT NOT NULL,
    quantidade INT NOT NULL,
    precoProduto DECIMAL(10,2) NOT NULL, -- Mudança para decimal
    totalProduto DECIMAL(10,2) NOT NULL, -- Mudança para decimal
    
   
    constraint id_itemNotaFiscal_idProduto_fk
    FOREIGN KEY (idProduto) REFERENCES Produto(idProduto),
    constraint id_itemNotaFiscal_idNotaFiscal_fk
    FOREIGN KEY (idNotaFiscal) REFERENCES NotaFiscal(idNotaFiscal)
    
);


desc ItemNotaFiscal