programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		real a, b, c, x1, x2
		escreva("Qual valor de 'a' ? ")
		leia(a)
		escreva("Qual valor de 'b' ? ")
		leia(b)
		escreva("Qual valor de 'c' ? ")
		leia(c)

		x1 = (-b + m.raiz(m.potencia(b,2) - (4 * a *c),2))/2*a
		x2 = (-b - m.raiz(m.potencia(b,2) - (4 * a *c),2))/2*a
		escreva("X1: ",m.arredondar(x1, 2))
		escreva("\nX2: ",m.arredondar(x2, 2))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 182; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */