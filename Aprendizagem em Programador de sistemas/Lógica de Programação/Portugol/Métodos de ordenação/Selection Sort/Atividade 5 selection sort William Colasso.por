programa
{
	inclua biblioteca Matematica --> m
	inclua biblioteca Util--> u
	
	real vetor[9], auxi = 0
	funcao inicio()
	{
		escreva("Vetor não ordenado: ")
		para(inteiro i = 0; i<9;i++){
			vetor[i] = u.sorteia(1,100)
			escreva(" ",vetor[i]," ")
			/*leia(vetor[i])*/ 
			auxi+=vetor[i]
		}
		escreva("\nA media é aproximadamente: ", m.arredondar(auxi/15, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */