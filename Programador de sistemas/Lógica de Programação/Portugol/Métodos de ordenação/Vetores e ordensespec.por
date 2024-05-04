programa
{
	
	
funcao inicio()
	{
		inteiro vetor[] = {58,15,2,0,1,8,30,100}, auxi, tamanho = 8

		escreva("Vetor original ")

		para(inteiro i = 0; i <tamanho; i++){
			escreva(vetor[i], " ")
		}
			para(inteiro j = 1; j <= tamanho; j++){
				para(inteiro i = 0; i < tamanho -1; i++){
					se(vetor[i] > vetor[i+1]){
						auxi = vetor[i]
						vetor[i] = vetor[i+1]
						vetor[i+1] = auxi
					}
				}
			}
		
		escreva("\nVetor ordenado ")

		para(inteiro i = 0; i <tamanho; i++){
			escreva(vetor[i], " ")
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 63; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */