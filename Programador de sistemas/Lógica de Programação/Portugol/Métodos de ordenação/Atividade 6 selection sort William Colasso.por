programa
{
	inclua biblioteca Util --> u
	inteiro vetor[100],vetor2[100],auxi = 9, auxi2 = 0
	funcao inicio()
	{
		escreva("Vetor original:")
		//calculo vetor original
		para(inteiro i = 0; i<10;i++){
			vetor[i] = u.sorteia(1,10)
			escreva(" ",vetor[i]," ")
			/*leia(vetor[i])*/ 
			vetor2[auxi] = vetor[i]
			auxi-=1
		}
		escreva("\nVetor contrário: ")
		para(inteiro i = 0; i<10;i++){
		 	escreva(" ",vetor2[i]," ")
		}
		ordenar()
		
	}

	//função para ordenar
	funcao ordenar(){
		para(inteiro i=0; i < 10-1; i++){
			auxi= i
			para(inteiro j=i+1; j < 10; j++){
				se (vetor[j] < vetor [auxi]){
					auxi = j
				}
			}
			auxi2 = vetor[i]
			vetor[i] = vetor[auxi]
			vetor[auxi] = auxi2
		}
		//escrever
		escreva("\nVetor original ordenado: ")
		para(inteiro i = 0; i<10;i++){
		 	escreva(" ",vetor[i]," ")
		}
		auxi = 9
		
		para(inteiro i=0; i < 10-1; i++){
			vetor2[auxi] = vetor[i]
			auxi-=1
		}
		//escrever
		escreva("\nVetor contrario ordenado: ")
		para(inteiro i = 0; i<10;i++){
		 	escreva(" ",vetor2[i]," ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */