drop database natura_db;
create database natura_db;
use natura_db;

/*
desc tb_ong;
select * from tb_ong;
*/
insert into tb_ong(id_ong, nm_nome) values(0, "Paz e Amor");
insert into tb_ong(id_ong, nm_nome) values(0, "Ong Vida");
/*
desc tb_produto;
select * from tb_produto;
*/
insert into tb_produto(id_produto, nm_produto) values(0, "Arroz");
insert into tb_produto(id_produto, nm_produto) values(0, "Feijão");

desc tb_projeto;
select * from tb_projeto;

select * from tb_ong;
select * from tb_produto;

desc tb_produto_projeto;
select * from tb_produto_projeto;