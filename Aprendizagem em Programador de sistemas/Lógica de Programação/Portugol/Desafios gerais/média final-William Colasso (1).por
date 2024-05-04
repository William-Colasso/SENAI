programa
{
	
	funcao inicio()
	{
		//Definição de variáveis
		real nota1, nota2, nota3, mf
		cadeia status

		// inicialização de varáveis
		nota1 = 5.5
		nota2 = 8.5
		nota3 = 4.7

		//calcular a média final

		mf = (nota1+nota2+nota3)/3

		se(mf >= 7.0){
		   		status = "APROVADO"
		}
		senao{
			se(mf < 5.0){
				status = "REPROVADO"
			}
			senao{
				status = "RECUPERAÇÂO"
			}


			
		}
		

		escreva("A o aluno foi ", status, " com média final de " + mf)
		



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */