use turmaa;

create table cliente (
	cod_cli smallint NOT null auto_increment primary key,
    nome_cli varchar(40) not null,
    endereco varchar(40) null,
    cidade varchar(20) null,
    cep char(8) null,
    uf char(2) null

);

insert into cliente (nome_cli, endereco, cidade, cep, uf) values ('Pedro','Avenida Peixoto','São Paulo','04653-21','SP');
insert into cliente (nome_cli, endereco, cidade, cep, uf) values ('Ricardo','Avenida Pasqual','São Paulo','04533-11','SP');

select * from cliente;

create table vendedor (
	cod_vend smallint NOT null auto_increment primary key,
    nome_vend varchar(40) not null,
    sal_fixo numeric(9,2),
    faixa_comiss char(1)

);

select * from vendedor;

insert into vendedor (nome_vend, sal_fixo, faixa_comiss) values ('José', 4100.23, '1');

update vendedor set nome_vend = 'Alfredo' where cod_vend = 1;

create table produto (
	cod_prod smallint not null auto_increment primary key,
    unid_prod char(3) not null,
    desc_prod varchar(20) not null,
    valor_unit decimal(9,2) not null
       
);

select * from produto;

insert into produto (unid_prod, desc_prod, valor_unit) values ('CX', 'Aparelho XPTO',2.45);
insert into produto (unid_prod, desc_prod, valor_unit) values ('UN', 'Aparelho ZQJ',4.20);

alter table produto add column qtd float null;

update produto set qtd = 2 where cod_prod >= 1;

alter table produto change qtd qtd_prod float;

create table pedido (
	num_ped int not null auto_increment primary key,
    prazo_entr smallint not null,
    fk_cod_cli smallint not null,
    fk_cod_vend smallint not null,
    foreign key(fk_cod_cli) references cliente(cod_cli),
    foreign key(fk_cod_vend) references vendedor(cod_vend)
    
);

insert into pedido (prazo_entr,fk_cod_cli,fk_cod_vend) values (10,2,1);
select * from pedido;


create table item_pedido(
	fk_num_ped int not null,
    fk_cod_prod smallint not null,
    qtd_ped float not null,
	foreign key(fk_num_ped) references pedido(num_ped),
    foreign key(fk_cod_prod) references produto(cod_prod)
);

insert into item_pedido (fk_num_ped, fk_cod_prod,qtd_ped) values (2,1,3);
select * from item_pedido;