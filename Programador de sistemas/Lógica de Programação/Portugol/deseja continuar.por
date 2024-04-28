programa
{
	
	funcao inicio()
	{

		logico continuar = verdadeiro
		inteiro soma
		soma = 0
		
		
		escreva("Deseja inciar? Sim (verdadeiro) Não (falso)\n")
		leia(continuar)
		
		enquanto(continuar == verdadeiro){
			soma += 100
			escreva ("soma = ", soma, "\n")
			
			escreva("Continuar ? Sim (verdadeiro) Não (falso)\n")
			leia(continuar)
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */