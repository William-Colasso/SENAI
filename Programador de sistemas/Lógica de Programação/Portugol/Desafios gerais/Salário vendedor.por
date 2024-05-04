programa
{
	
	funcao inicio()
	{
	cadeia nome
	inteiro salario, adicional, vendas, total
	
	nome = ""
	salario = 0.
	adicional = 0.
	vendas = 0.
	total = 0.
	escreva("Qual o nome do vendedor? \n")
	leia(nome)
	
	escreva("Qual o salário do vendedor? \n")
	leia(salario)
	
	escreva("Quanto este vendedor vendeu? \n")
	leia(vendas)
	
	adicional = vendas*0.15	
	total = (adicional + salario)
	escreva("O vendedor ", nome, " tem seu salário fixo de ", salario, " e tem um salário total de: ", total)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */