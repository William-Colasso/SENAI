programa  {
	
	inclua biblioteca Util --> t
	
	funcao inicio()
	{
		//inicialização de variáveis e vetores
		inteiro vetor[15], tamanho = 15, j, auxi
		para(inteiro i = 0; i < tamanho; i++){
			vetor[i] = t.sorteia(10, 50)	
		}
		//Fim vetor original
		//escrever vetor original
		escreva("Vetor original;  ")
		para(inteiro i=0; i<tamanho; i++){
			escreva(vetor[i], " ")
		}
		escreva("\n")
		//fim de original
		para(j = 1; j <= tamanho; j++){
			para(inteiro i = 0; i < tamanho -1; i++){
				se(vetor[i] > vetor[i+1]){
					auxi = vetor[i]
					vetor[i] = vetor[i+1]
					vetor[i+1] = auxi
				}
			}
		}
		escreva("Vetor Crescente: ")
		para(inteiro i = 0; i < tamanho ; i++){
			escreva(vetor[i], " ")
		}
		escreva("\n")
		//Fim vetor Crescente
		para(j = 1; j <= tamanho; j++){
			para(inteiro i = 0; i < tamanho -1; i++){
				se(vetor[i] < vetor[i+1]){
					auxi = vetor[i]
					vetor[i] = vetor[i+1]
					vetor[i+1] = auxi
				}
			}
		}
		
		escreva("Vetor Decrescente: ")
		para(inteiro i = 0; i < tamanho; i++){
			escreva(vetor[i], " ")
	}
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 852; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */