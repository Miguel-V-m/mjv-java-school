-- INSERT INTO pessoas (nome) VALUES ('Miguel');
-- mudamos o nome da pessoa pelo novo nome usando neste caso o ID= codigo
update pessoas set nome = 'Carlos' where codigo=2;

select * from pessoas;