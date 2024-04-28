programa
{
	
	funcao inicio()
	{

		real valor1, valor2, valor3, maior

		valor1 = 0.0
		valor2 = 0.0
		valor3 = 0.0
		maior = 0.0
		
		escreva("Escreva um núemro número\n")
		leia(valor1)

		escreva("Escreva outro número número\n")
		leia(valor2)

		escreva("Escreva o último número número\n")
		leia(valor3)

		se(valor1 > valor2 e valor1 > valor3){
			maior = valor1
		}

		se(valor2 > valor1 e valor2 > valor3){
			maior = valor2
		}

		se(valor3 > valor2 e valor3 > valor1){
			maior = valor3
		}
		escreva("O maior número é ", maior)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 459; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */