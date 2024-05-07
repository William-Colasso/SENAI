programa
{
	inclua biblioteca Util-->u
	inteiro vetor[10], tamanho = 10, gap, i, auxiliar
	logico trocado
	real fator
	funcao inicio()
	{
	
		para( i =0; i<10;i++){
			vetor[i]=u.sorteia(1, 50)
			//leia(vetor[i])
		}
		escreva("Vetor original: ")
		para(i=0; i<tamanho; i++){
			escreva(vetor[i], " ")
		}
		fator = 1.3
		trocado = verdadeiro
		gap = tamanho
		enquanto(gap > 1 ou trocado){
			gap = (gap / fator)
			se(gap < 1){
				gap = 1
			}
			trocado = falso
			i = 0
			enquanto(i + gap < tamanho){
				se(vetor[i] > vetor[i + gap]){
					//Troca os Elementos
					auxiliar = vetor[i]
					vetor[i] = vetor[i + gap]
					vetor[i + gap] = auxiliar
					trocado = verdadeiro
				}
				i = i + 1
			}
		}
		escreva("\nVetor com CombSort: ")
		para(i=0; i<tamanho; i++){
			escreva(vetor[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 728; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */