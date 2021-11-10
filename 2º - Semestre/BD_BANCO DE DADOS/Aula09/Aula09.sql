use clinica;
select * from funcionario;
select sum(salario) from funcionario;
/*Procedures retornam uma lista de valores | Funções retornam apenas um valor*/

select salario, salario * 1.15 as novo from funcionario;

/*Criação de uma função*/
delimiter $$                                                   
create function valor_reajuste(codigo_func int, percentual int) 
returns decimal(9,2)						   					
deterministic								   					
begin
declare valor decimal(9,2);
select (salario * percentual)/100 into valor from funcionario where codf = codigo_func;
return valor;
end
$$

select salario, valor_reajuste(codf, 15) from funcionario;
select valor_reajuste(2, 20);

delimiter $$                                                   
create function valor_reajuste2(codigo int) 
returns decimal(9,2)						   					
deterministic								   					
begin
declare valor decimal(9,2);
declare wsalario decimal(9,2);
declare percent int;

select salario into wsalario from funcionario where codf = codigo;
if wsalario >= 2000 then
		set valor = wsalario * 1.15;
else
		set valor = wsalario * 1.20;
end if;
return valor;
end
$$

select * from funcionario;
select valor_reajuste2(1);

select * from medico;
/*Criar uma função que gere a quantidade de médicos em um município*/
delimiter $$                                                   
create function qtd_med(municipio varchar(40)) 
returns int						   					
deterministic								   					
begin
declare valor int;
select count(codm) into valor from medico where cidade like municipio;
return valor;
end
$$

drop function qtd_med;
select qtd_med('São%') as Total_Cidade;


/*Na tabela sakila, faça uma função para gerar a quantidade de filmes locados por uma pessoa*/
delimiter $$                                                   
create function qtd_filmes(nome varchar(40)) 
returns int						   					
deterministic								   					
begin
declare valor int;
select count(f.title) into valor from rental as r join customer c on c.customer_id = r.customer_id
								join inventory i on i.inventory_id = r.inventory_id
                                join film f on f.film_id = i.film_id
                                where c.first_name like nome;
return valor;
end
$$

drop function qtd_filmes;
select qtd_filmes('Mary%') as Total_Filmes;


/*Criação de uma procedure*/
use turmaa;
select * from empregado;
select * from empregado where cidade like 'São%';

delimiter $$                                                   
create procedure empregado_cidade(cidade varchar(40)) 						   					
begin
select * from empregado where cidade like cidade;
end
$$
call empregado_cidade('São%');


select * from cliente;

delimiter $$                                                   
create procedure incluir_cliente(wnome varchar(40), wend varchar(40), wcid varchar(20), wcep char(8), wuf char(2)) 						   					
begin
insert into cliente(nome_cli, endereco, cidade, cep, uf) values (wnome , wend, wcid , wcep , wuf);
end
$$
call incluir_cliente('Pedro','Avenida José','Rio de Janeiro','04532321','RJ');