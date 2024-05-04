programa
{
	
	funcao inicio()
	{
		inteiro candidatos[1000],i = 0,auxi
		logico conti = verdadeiro
	
		faca{
			escreva("Entre com a pontuação do candidato: ")
			leia(candidatos[i])
			se(candidatos[i] == 0) conti = falso
			i++
			
		}
		
			enquanto(conti == verdadeiro)

		para(inteiro t = 1; t < i; t++){
			para(inteiro j = 0; j < i; j++){
				se( candidatos[i] > candidatos[i+1]){
					auxi = candidatos[i]
					candidatos[i] = candidatos[i+1]
					candidatos[i+1] = auxi
				}
			}
		}

		para(inteiro j = 0; j < i; j++){
			escreva("O candidato ", i, "teve pontuação de: ", candidatos[i])
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 617; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */