programa
{
	
	inclua biblioteca Util

	funcao inicio()
	{
		inteiro vetor [10],tamanho=10,j,auxiliar,indice
		//preenchimento do vetor
		para (inteiro i =0; i<tamanho;i++){
			vetor[i]=Util.sorteia(1,100)

		escreva("Insira o valor do vetor: ")
		leia(vetor[i])
		escreva("\n")
			
		}
	
		//fim do preenchimento do vetor
		//escrever o vetor original
		escreva("VETOR ORIGINAL:")
		para (inteiro i=0; i<tamanho;i++){
			escreva(vetor[i], " ")
		}
		escreva("\n")

		para(inteiro i=0; i < tamanho-1; i++){
			indice= i
			para( j=i+1; j < tamanho; j++){
				se (vetor[j] < vetor [indice]){
					indice = j
				}
			}
			auxiliar = vetor[i]
			vetor[i] = vetor[indice]
			vetor[indice] = auxiliar
		}	
		//FIM DA ORDENAÇÃO
		escreva("VETOR ORDENADO CRESCENTE: ")
			para (inteiro i =0; i<tamanho;i++){
				escreva(vetor[i], " ")
		}
	}
	//William Colasso Pereira
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 8, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */