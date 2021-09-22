create database clinica;
use clinica;


CREATE TABLE ambulatorio (
    nroa int not null PRIMARY KEY auto_increment,
    andar int NOT NULL,
    capacidade smallint
);

insert into ambulatorio (andar, capacidade) values (1,30), (1,50), (2,40), (2,25), (2,55);

select * from ambulatorio;

create table medico (
	codm int PRIMARY KEY auto_increment,
    nome varchar(40) not null,
    idade smallint not null,
    especialidade char(20),
    CPF varchar(11) unique,
    cidade varchar(30),
    fk_nroa int,
    foreign key(fk_nroa) references ambulatorio(nroa)
);

select * from medico;

insert into medico (nome, idade, especialidade, CPF, cidade, fk_nroa) values
		('João',40,'ortopedia','10000100000','Florianopolis',1),
        ('Maria',42,'Traumatologia','10000110000','Blumenau',2),
        ('Pedro',51,'Pediatria','11000100000','São José',2),
        ('Carlos',28,'Ortopedia','11000110000','Joinville',4),
        ('Marcia',33,'Neurologia','11000111000','Biguacu',3);

CREATE TABLE paciente (
    codp int PRIMARY KEY auto_increment,
    nome varchar(40) not null,
    idade smallint not null,
    cidade char(30),
    CPF varchar(11) unique,
    doenca varchar(40) not null
);

select * from paciente;

insert into paciente ( nome, idade, cidade, CPF, doenca) values
		('Ana',20,'Florianopolis','20000200000','gripe'),
        ('Paulo',24,'Palhoca','20000220000','fratura'),
        ('Lucia',30,'Biguacu','22000200000','tendinite'),
        ('Carlos',28,'Joinville','11000110000','sarampo');



CREATE TABLE funcionario (
    codf int PRIMARY KEY auto_increment,
    nome varchar(40) not null,
    idade smallint,
    CPF varchar(11) unique,
    cidade varchar(30),
    salario numeric(10,2),
    cargo varchar(20)
);

select * from funcionario;

CREATE TABLE consulta (
	num_consulta int PRIMARY KEY auto_increment,
    fk_medico_codm int,
    fk_paciente_codp int,    
    data_ date,
    hora time,
    foreign key(fk_medico_codm) references medico(codm),
    foreign key(fk_paciente_codp) references paciente(codp)
);

select * from consulta;

alter table funcionario add column nroa int;
alter table funcionario CHANGE COLUMN nroa fk_nroa int;
alter table funcionario add foreign key(fk_nroa) references ambulatorio(nroa);
alter table funcionario drop column cargo;



select * from funcionario;

insert into funcionario(nome,idade,cidade, salario, CPF, fk_nroa) values 
		('Rita',32,'Sao Jose',1200,'20000100000',1),
        ('Maria',55,'Palhoca',1220,'30000110000',2),
        ('Caio',45,'Florianopolis',1100,'41000100000',3),
        ('Carlos',44,'Florianopolis',1200,'51000110000',2),
        ('Paula',33,'Florianopolis',2500,'61000111000',4);

insert into consulta(fk_medico_codm,fk_paciente_codp,data_,hora) values 
		(1,1,'2006/06/12', '14:00'),
        (1,4,'2006/06/13', '10:00'),
        (2,1,'2006/06/13', '9:00 '),
        (2,2,'2006/06/13', '11:00'),
        (2,3,'2006/06/14', '14:00'),
        (2,4,'2006/06/14', '17:00'),
        (3,1,'2006/06/19', '18:00'),
        (3,3,'2006/06/12', '10:00'),
        (3,4,'2006/06/19', '13:00'),
        (4,4,'2006/06/20', '13:00'),
        (4,4,'2006/06/22', '19:30');

select * from consulta;

