use clinica;
-- 1)
select * from paciente;
update paciente set cidade = 'Ilhota' where codp = 5;

-- 2)
select * from consulta;
update consulta set data_consulta = '2006-07-04', hora_consulta = '12:00:00' where fk_codm = 1 and fk_codp = 4;
update consulta set data_consulta = '2006-07-04', hora_consulta = '12:00:00' where num_consulta = 2;

-- 3)
select * from paciente;
update paciente set idade = idade + 1, doenca = 'cancer' where codp = 5;

-- 4)
select * from consulta;
update consulta set hora_consulta = date_add(hora_consulta, interval 90 minute) where num_consulta = 6;

-- 5)
select * from funcionario;
delete from funcionario where codf = 4;

-- 6)
select * from consulta;
delete from consulta where hora >= '17:00:00';

-- 7)
select * from paciente;
delete from paciente where doenca =  'cancer' and idade < 18;

-- 8)
select * from medico where cidade = 'Blumenau' or cidade = 'Joinville';
delete from medico where cidade = 'Blumenau' or cidade = 'Joinville';