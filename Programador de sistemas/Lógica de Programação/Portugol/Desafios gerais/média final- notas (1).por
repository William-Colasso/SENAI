programa
{
	
	funcao inicio()
	{
		//BANNER
	     escreva("===================\n")
		escreva("CÁLCULO MÉDIA FINAL\n")
		escreva("===================\n")
		

		//Declaração de variáveis
		real nota1, nota2, nota3, mf
		cadeia status, nome

		//Iniciando varáveis
		nota1=0.0
		nota2=0.0
		nota3=0.0
		mf=0.0
		status=""
	
		escreva("Qual a primeira nota do do aluno?\n")
		leia(nota1)

		escreva("Qual a segunda nota do do aluno?\n")
		leia(nota2)

		escreva("Qual a terceira nota do do aluno?\n")
		leia(nota3)

		mf = (nota1+nota2+nota3)/3

		//teste lógico
		//se mf < 6 status = " de RECUPERAÇÃO"
		//se (mf >= 6 e mf < 7) status = " de RECUPERAÇÃO"
		//se (mf >= 7) status = "APROVADO"

		se(mf < 6){
			status = "REPROVADO"
		}
		senao se(mf >= 6 e mf < 7){
			status = " de RECUPERAÇÃO"
		}

		senao{
			status = "APROVADO"
		}
		escreva("A média final do aluno é ", mf, " ele está ", status )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 694; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */