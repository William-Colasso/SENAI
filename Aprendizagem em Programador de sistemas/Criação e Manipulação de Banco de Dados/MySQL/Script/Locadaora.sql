create database bdlocadora;
use bdlocadora;

create table Cliente(
	idCliente int not null primary key auto_increment,
	nome varchar(45) not null,
    rua varchar(45)not null,
    complemento varchar(45)not null,
    bairro varchar(45)not null,
    cep varchar(9)not null,
    cidade varchar(45)not null,
    uf varchar(2)not null,
    telefone varchar(16) not null
);

create table Status(
	idStatus int not null auto_increment primary key,
    nome varchar(45) not null


);

create table Categoria(
	idCategoria int not null auto_increment primary key,
    nome varchar(45) not null
);

create table Classificacao(
	idClassificacao int not null auto_increment primary key,
	nome varchar(45) not null,
    prazoDevolucao int not null,
    valor decimal(10,2) not null
);


create table Ator (
	idAtor int not null auto_increment primary key,
    nome varchar(45) not null
);

create table Tipo_Pagamento(
	idTipo_Pagamento int not null auto_increment primary key,
	nome varchar(45) not null
);

create table Midia(
	idMidia int not null auto_increment primary key,
    nome varchar(45) not null,
    valorMidia decimal(10,2) not null
);


create table Dependente (
	idDependente int not null auto_increment primary key,
    nome varchar(45) not null,
    idCliente int not null,
    
    
    constraint idDependente_idCliente_fk
    foreign key (idCliente) references Cliente(idCliente)
);

create table Locacao(
	idLocacao int not null auto_increment primary key,
    dataLocacao date not null,
    valorTotal decimal(10,2) not null,
    idCliente int not null,
    idTipo_Pagamento int not null,
    idDependente int,
    constraint idLocacao_idCliente_fk
    foreign key (idCliente) references Cliente(idCliente),
    constraint idLocacao_idTipo_Pagamento_fk
    foreign key (idTipo_Pagamento) references Tipo_Pagamento(idTipo_Pagamento),
	constraint idLocacao_idDependente_fk
    foreign key (idDependente) references Dependente(idDependente)
);

create table Filme(
	idFilme int not null auto_increment primary key,
	nome varchar(45) not null,
    sinopse varchar(45) not null,
    duracao int not null,
    idClassificacao int not null,
    idCategoria int not null,
    
    constraint idFilme_idClassificacao_fk
    foreign key (idClassificacao) references Classificacao(idClassificacao),
    
	constraint idFilme_idCategoria_fk
    foreign key (idCategoria) references Categoria(idCategoria)
);

create table Exemplar(
	idExemplar int not null auto_increment primary key,
    idFilme int not null,
    idMidia int not null,
    idStatus int not null,
    
    constraint idExemplar_idFilme_fk
    foreign key (idFilme) references Filme(idFilme),
    constraint idExemplar_idMidia_fk
    foreign key (idMidia) references Midia(idMidia),
    constraint idExemplar_idStatus_fk
    foreign key (idStatus) references Status(idStatus)
);


create table Reserva(
	idReserva int not null auto_increment primary key,
    dataReserva date not null,
    idExemplar int not null,
    idCliente int not null,
    
	constraint idReserva_idExemplar_fk
    foreign key (idExemplar) references Exemplar(idExemplar),
    constraint idReserva_idCliente_fk
    foreign key (idCliente) references Cliente(idCliente)
);


create table Retirada(
	idRetirada int not null auto_increment primary key,
	valorUnitario decimal(10,2) not null,
    dataDevolucaoPrevista date not null,
    idLocacao int not null,
    idExemplar int not null,
    
    constraint idRetirada_idExemplar_fk
    foreign key (idExemplar) references Exemplar(idExemplar),
	
	constraint idRetirada_idLocacao
    foreign key (idLocacao) references Locacao(idLocacao)

);


create table Devolucao(
	idDevolucao int not null auto_increment primary key,
    dataDevolucao date not null,
    idRetirada int not null,
    
    constraint idDevolucao_idRetirada_fk
    foreign key (idRetirada) references Retirada(idRetirada)
);


create table Multa(
	idMulta int not null auto_increment primary key,
    dataMulta date not null,
    valorMulta decimal(10,2) not null,
    qtdDiasAtraso int not null,
    valorTotalMulta decimal(10,2) not null,
    idDevolucao int not null,
    
    constraint idMulta_idDevolucao_fk
    foreign key (idDevolucao) references Devolucao(idDevolucao)

);


create table Filme_has_Ator(
	idFilme int not null,
    idAtor int not null,
    
    primary key (idFilme, idAtor),
    
    constraint fk_Filme_has_Ator_Filme
    foreign key (idFilme) references Filme(idFilme),
    
    constraint fk_Ator_has_Ator_Filme
    foreign key (idAtor) references Ator(idAtor)
    
    


);


