-- GROUP BY
use clinica;
select * from paciente;
select * from paciente group by cidade;
select * from funcionario;
select * from funcionario group by cidade;
select cidade, count(*) from funcionario group by cidade;
select salario, count(*) from funcionario group by salario; -- CONTA OS VALORES NULOS
select salario, count(salario) from funcionario group by salario; -- NÃO CONTA OS VALORES NULOS
describe funcionario;
insert into funcionario(nome) values ('Gustavo');
select salario, sum(salario) from funcionario group by salario;
select avg(salario) from funcionario; -- NÃO CONTA OS VALORES NULOS
select cidade, count(*) from funcionario where salario > 1100 group by cidade;

-- JUNÇÃO DE TABELAS
select * from consulta, paciente  where consulta.fk_paciente_codp = paciente.codp;
select consulta.num_consulta, paciente.nome from consulta, paciente  where consulta.fk_paciente_codp = paciente.codp;
select A.num_consulta, B.nome from consulta as A, paciente as B  where A.fk_paciente_codp = B.codp;

-- JOINs
create table arquivo1 (
	codigo int auto_increment primary key,
    nome varchar(50)
);
create table arquivo2 (
	codigo int auto_increment primary key,
    nome varchar(50)
);
insert into arquivo1 (nome) values ('Fernanda'), ('Josefa'), ('Luiz'), ('Fernando'), ('Romulo');
select * from arquivo1;
insert into arquivo2 (nome) values ('Carlos'), ('Manoel'), ('Luiz'), ('Fernando'), ('Romulo');
select * from arquivo2;
select * from arquivo1, arquivo2 where arquivo1.nome = arquivo2.nome;

	-- INNER JOIN -> Intersecção entre as tabelas
	select * from arquivo1 inner join arquivo2 on arquivo1.nome = arquivo2.nome;
    
	-- LEFT JOIN -> Todos registros da A e os das condições de B
	select * from arquivo1 left join arquivo2 on arquivo1.nome = arquivo2.nome;
    select * from arquivo1 left join arquivo2 on arquivo1.nome = arquivo2.nome where arquivo2.nome is null;
    
    -- RIGHT JOIN -> Todos registros da B e os das condições de A
	select * from arquivo1 right join arquivo2 on arquivo1.nome = arquivo2.nome;
    select * from arquivo1 right join arquivo2 on arquivo1.nome = arquivo2.nome where arquivo1.nome is null;
    
    
-- SAKILA
use sakila;
select * from customer;
select * from address;

select * from customer as A inner join address as B on A.address_id = B.address_id;

/* Listagem dos filmes que a cliente Mary alugou nesta empresa */

select * from rental;
select * from inventory;
select * from film;
select * from customer;
select f.title from rental as r join customer c on c.customer_id = r.customer_id
								join inventory i on i.inventory_id = r.inventory_id
                                join film f on f.film_id = i.film_id
                                where c.first_name = 'mary';

select f.title from rental as r inner join customer c on r.customer_id = c.customer_id
						  inner join inventory as i on r.inventory_id = i.inventory_id
                          inner join film as f on i.film_id = f.film_id
						  where c.customer_id = 1
                          order by f.title;
                          
/*Quanto a Mary gastou por locação*/
select sum(amount) from payment where customer_id = 1;

/*Quais o gênero dos filmes que a Mary assistiu*/
select f.title, CA.name from rental as R
						inner join customer as C on R.customer_id = C.customer_id
                        inner join inventory as I on R.inventory_id = I.inventory_id
                        inner join film as F on I.film_id = F.film_id
                        inner join film_category as FC on F.film_id = FC.film_id
                        inner join category as CA on FC.category_id = CA.category_id
                        where C.first_name = 'MARY';
                          
-- VIEWs
use clinica;
create view consulta_nome as 
select consulta.num_consulta, paciente.nome from consulta, paciente where paciente.codp = consulta.fk_paciente_codp;
select * from consulta_nome;

