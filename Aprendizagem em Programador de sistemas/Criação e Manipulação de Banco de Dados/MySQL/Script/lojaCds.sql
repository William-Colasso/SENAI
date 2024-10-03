create database bdlojacds;
use bdlojacds;



create table Categoria(
	idCategoria int not null auto_increment primary key,
    nome varchar(45) not null
);

create table Gravadora(
	idGravadora int not null auto_increment primary key,
    nome varchar(45) not null,
    endereco varchar(150) not null
);

create table Autor(
	idAutor int not null auto_increment primary key,
    nome varchar(45) not null,
    cpf varchar(14) not null
);

create table Genero(
	idGenero int not null auto_increment primary key,
    nome varchar(45) not null
);


create table Artista(
	idArtista int not null auto_increment primary key,
    nome varchar(45) not null,
    dataNascimento date not null,
    idGenero int not null,
    idArtistaInspiracao int,
    idGravadora int not null,
    
    constraint idGenero_fk
    foreign key (idGenero) references Genero(idGenero),
    constraint idArtistaInspiracao_fk
    foreign key (idArtistaInspiracao) references Artista(idArtista),
    constraint idGravadora_fk
    foreign key (idGravadora) references Gravadora(idGravadora)
);

create table CD(
	idCD int not null auto_increment primary key,
    titulo varchar(45) not null,
    
    idCategoria int not null,
    idArtista int not null,
    
    constraint idCategoria_fk
    foreign key (idCategoria) references Categoria(idCategoria),
	constraint idArtista_fk
    foreign key (idArtista) references Artista(idArtista)
);

alter table CD
	add column quantidade int not null;





create table Musica(
	idMusica int not null auto_increment primary key,
    titulo varchar(45) not null,
    faixa int not null,
    idCD int not null,
    idGenero int not null,
    
    constraint idCD_idMusica_fk
    foreign key (idCD) references CD(idCD),
    constraint idGenero_idMusica_fk
    foreign key (idGenero) references Genero(idGenero)
);





create table Vendedor(
	idVendedor int not null auto_increment primary key,
    nome varchar(45) not null,
    idGravadora int not null,
    
    constraint idGravadora_idVendedor_fk
    foreign key (idGravadora) references Gravadora(idGravadora)
);

create table Telefone(
	idTelefone int not null auto_increment primary key,
    telefone varchar(16) not null,
    idGravadora int not null,

	constraint idGravadora_idTelefone_fk
    foreign key (idGravadora) references Gravadora(idGravadora)

);




create table Musica_has_Autor(
	idMusica int not null,
    idAutor int not null,
    
    primary key(idMusica, idAutor),
    
    constraint idMusica_fk
    foreign key (idMusica) references Musica(idMusica),
    
    constraint idAutor_fk
    foreign key (idAutor) references Autor(idAutor)
);