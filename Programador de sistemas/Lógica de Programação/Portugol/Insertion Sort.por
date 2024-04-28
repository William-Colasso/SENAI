programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro vetor[10], tamanho = 10, j, elementoAtual, indice
		//preenchimento do vetor
		para (inteiro i = 0; i <tamanho; i++){
			vetor[i] = u.sorteia(10, 50)
		}
		//Fim do preenchimento do vetor
		//escrever o vetor original
		escreva("Vetor Original: ")
		para (inteiro i = 0; i <tamanho; i++){
			escreva(vetor[i], " ")
		}
		escreva("\n")
		//fim da escrita do vetor Original
		para(inteiro i = 1; i < 10; i++){
			elementoAtual = vetor[i]
			indice = i
			enquanto( indice > 0 e vetor[indice -1] > elementoAtual){
				vetor[indice] = vetor[indice - 1]
				indice--
			}
			vetor[indice] = elementoAtual
		}
		escreva("Vetor ordenado: ")
		para (inteiro i = 0; i < tamanho; i++){
			escreva(vetor[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 708; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */