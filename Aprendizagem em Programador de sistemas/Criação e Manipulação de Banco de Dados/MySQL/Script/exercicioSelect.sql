use programadorbd;

#1) recuperar a localização do departamento de operações;
select localizacao from departamento where nm_departamento like "operações";
#2) recuperar todos os empregados que exercem a função de escriturário;
select * from empregado where funcao like "escriturário";
#3) recuperar o nome, o salário e a comissão dos empregados (que possuem comissão), ordenados pelo maior salário;
select nm_empregado, salario, comissao from empregado where comissao >= 0 order by salario desc;
#4) recuperar o nome, a atividade e a data de contratação dos empregados que trabalham no departamento 20 e recebem mais de R$ 1.000;
select nm_empregado, funcao, data_contratacao from empregado where id_departamento =20 and salario>1000;
#5) recuperar os empregados que são gerentes;
select * from empregado where funcao like "gerente";
#6) recuperar as informações dos empregados que possuem a letra "o" no nome;
select * from empregado where nm_empregado like "%o%";
#7) recuperar o nome e o número do departamento de todos os empregados que trabalham nos departamentos 10 e 30 por ordem alfabética de nome do empregado;
select nm_empregado, id_departamento from empregado where id_departamento  =10 or id_departamento =30 order by nm_empregado;
#8) recuperar as informações dos empregados que foram contratados no ano de 1981.
select * from empregado where data_contratacao like "1981%";
#9) recuperar todos os empregados com comissão maior ou igual a 1000 por ordem alfabética de nome do empregado; 
select * from empregado where comissao>=1000 order by nm_empregado;
#10) recuperar empregados que tem salário inferior a R$ 1.300 ordenados pelo salário;
select * from empregado where salario<1300 order by salario;