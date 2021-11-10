use turmaa;
select * from item_pedido;
select * from produto;
select * from cliente;

create table cop_cliente(
	cod_cli smallint,
    nome_cli varchar(40),
    endereco varchar(40),
    cidade varchar(20),
    cep char(8),
    uf char(2),
    data_alteracao datetime,
    usuario varchar(20)
    );
    
drop table cop_cliente;
    
delimiter $$
create trigger aud_cliente after update on cliente for each row
begin
declare wnome varchar(40) default null;
declare wender varchar(40) default null;

    if (new.nome_cli <> old.nome_cli) then 
			set wnome = old.nome_cli;
	end if;

	if (new.endereco <> old.endereco) then 
			set wender = old.endereco;
	end if;   

  insert into cop_cliente (cod_cli,nome_cli,endereco,data_alteracao,usuario) 
values (old.cod_cli,wnome,wender,now(),'Gustavo');

end $$

drop trigger aud_cliente;

select * from cliente;
select * from cop_cliente;

update cliente set nome_cli = 'Kleber' where cod_cli = 2;


select * from item_pedido;
select * from produto;


delimiter $$
create trigger estorno_estoque before delete on item_pedido for each row
begin

update produto set qtd_prod = qtd_prod + old.qtd_ped where cod_prod = old.fk_cod_prod;

end $$

delete from item_pedido where fk_num_ped;