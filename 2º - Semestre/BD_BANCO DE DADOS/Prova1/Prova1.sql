use hospital;

-- Exercício 2
-- a-)
create database hospital;

-- b-)
create table medico (
    codm int not null primary key auto_increment,
    CPF varchar(11) unique,
    especialidade char(20) not null,
    nome varchar(40) not null
);

create table paciente (
	codp int not null primary key auto_increment,
    CPF varchar(11) unique,
    idade smallint not null,
    nome varchar(40) not null,
    cidade char(30) not null
);

create table medicamento (
    codr int not null primary key auto_increment,
    nome varchar(40) not null,
    quantidade int not null,
    unidade varchar(20) not null
);

create table consulta (
	idc int not null primary key auto_increment,
	hora time,
    dia date,
    sintomas varchar(40) not null,
    fk_medico_codm int,
    fk_paciente_codp int,
    foreign key(fk_medico_codm) references medico(codm),
    foreign key(fk_paciente_codp) references paciente(codp)
);

create table receita (
	idr int not null primary key auto_increment,
	quantidade int,
    descricao varchar(40),
    fk_medicamento_codr int,
    fk_paciente_codp int,
    foreign key(fk_medicamento_codr) references medicamento(codr),
    foreign key(fk_paciente_codp) references paciente(codp)
);

-- c-)
insert into medico (nome, especialidade, CPF) values
		('Pietro Felipe da Conceição','Ortopedia','70953233219'),
        ('Vicente Benedito Teixeira','Traumatologia','39579768048'),
        ('Sophie Márcia Beatriz Silva','Pediatria','92558676954'),
        ('Heloisa Patrícia Regina Castro','Dermatologia','58442302050'),
        ('Henry Tomás Cardoso','Neurologia','28507705073');
        
insert into paciente (nome, idade, cidade, CPF) values
		('Débora Julia Luana da Mota', 33, 'Natal','15350151282'),
        ('Isabela Cristiane Marina Cavalcanti', 46, 'Salvador','40686491890'),
        ('Davi Renan Ian Baptista', 66, 'Contagem','64933355665'),
        ('Enrico Manoel Matheus de Paula', 53, 'Rio Branco','29452615966'),
        ('Giovanni Geraldo Paulo da Luz', 79, 'Salvador','84491088705');
        
insert into medicamento (nome, quantidade, unidade) values
		('Teceinus', 20,'CX'),
        ('Lewaelir', 8,'Frascos'),
        ('Rupen', 3,'CX'),
        ('Dotue', 9,'Ampolas'),
        ('Rudek', 13,'CX');
        
insert into consulta (hora, dia, sintomas, fk_medico_codm, fk_paciente_codp) values
		('9:00', '2021-09-02', 'Enxaqueca durante 2 semanas', 5, 1),
        ('11:00', '2021-09-22', 'Fratura de braço', 2, 2),
        ('18:00', '2021-04-07', 'Coceira na pele', 4, 3),
        ('14:00', '2020-01-02', 'Acompanhamento de exame de rotina', 3, 4),
        ('10:00', '2019-04-05', 'Dores para caminhar', 1, 5);

insert into receita (quantidade, descricao, fk_medicamento_codr, fk_paciente_codp) values
		(1, '2 comprimidos de 12/12h, 3x semanas', 1, 1),
        (4, '3 comprimidos de 08/08h, 2x semanas', 3, 2),
        (2, 'Passar no local de 10/10h, 1x semana', 4, 3),
        (2, '20ml de 08/08h, 2x semanas', 2, 4),
        (3, '1 comprimido de 08/08h, 2x semanas', 5, 5);

-- Exercício 3
-- a-)     
select * from consulta where dia = '2020-01-02';

-- b-)     
select count(*) as Total_Consultas from consulta where fk_medico_codm = 1;

-- c-)     
select fk_medicamento_codr as Codigo_Medicamento from receita where fk_paciente_codp = 3;

-- d-)     
select count(*) as Total_Consultas from consulta where dia between '2020-01-02' and '2021-09-02';

-- e-)     
select fk_medico_codm as Codigo_Medico, count(fk_medico_codm) as Total_ConsultaDia, 
 count(fk_medico_codm) * 120.00 as Faturamento from consulta where dia = '2020-01-02' group by fk_medico_codm; 
 
-- f-)     
select cidade, count(cidade) as Total_PorCidade from paciente group by cidade;

-- g-)     
update consulta set fk_medico_codm = 2 where fk_paciente_codp = 3;
SELECT * FROM hospital.consulta;

-- h-)
select count(*) as Total_Especialidade from medico where especialidade = 'Ortopedia';

-- i-)
alter table paciente add column titulo_eleitor varchar(12);
select * from paciente;

-- j-)
select fk_paciente_codp as Paciente, count(fk_paciente_codp) as Total_Consultas from consulta group by fk_paciente_codp;