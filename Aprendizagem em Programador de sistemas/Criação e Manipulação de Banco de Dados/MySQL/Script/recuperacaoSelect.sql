use programadorbd;

#1) Selecione todos os empregados e suas funções
select nm_empregado, funcao from empregado;
#2) Liste todos os departamentos e suas localizações
select nm_departamento as Departamento, localizacao as Localização from departamento;
#3) Encontre todos os empregados com salário maior que 3000
select nm_empregado from empregado where salario>3000;
#4) Mostre o nome e a função dos empregados que trabalham no departamento de Vendas
select nm_empregado, funcao from empregado where ID_DEPARTAMENTO = 30;
#5) Liste os empregados contratados antes de 1982
select nm_empregado from empregado where year(DATA_CONTRATACAO)<1982;
#6) Encontre o empregado que tem a maior comissão
select nm_empregado as Empregado from empregado order by comissao desc limit 1;
#7) Liste os empregados que são gerentes
select nm_empregado from empregado where funcao like "gerente";
#8) Mostre os empregados que não têm líder
select nm_empregado from empregado where lider is null;
#9) Exiba os empregados que ganham um salário dentro da faixa salarial de 1201 a 1400
select nm_empregado from empregado where salario between 1201 and 1400;
#10) Mostre o empregado mais recente (último contratado):
select nm_empregado as Empregado from empregado order by data_contratacao desc limit 1;

select * from empregado;

