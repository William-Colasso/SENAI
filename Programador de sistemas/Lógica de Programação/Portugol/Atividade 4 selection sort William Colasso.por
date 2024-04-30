programa
{
	inclua biblioteca Util--> u
	inteiro vetor[15], vetor2[15],auxi = 0, vetor3[15], auxi2 = 0
	funcao inicio()
	{
		
		para(inteiro i = 0; i<15;i++){
			vetor[i] = u.sorteia(1,15)
			/*leia(vetor[i])*/ 
		}
		//sortear numeros
		escreva("Vetor não ordenado: ")
		para(inteiro i = 0; i<15;i++){
			escreva(" ",vetor[i]," ")
		}
		//Vetor não ordenado
		para(inteiro i = 0; i<15; i++){
			se(vetor[i] %2 == 0){
				vetor2[auxi] = vetor[i]
				auxi+=1
				//números pares
			}
			senao{
				vetor3[auxi2] = vetor[i]
				auxi2+=1
				//números impares
			}
		}
		escreva("\nVetor pares não ordenado: ")
		para(inteiro i = 0; i<15;i++){
			se(vetor2[i]!=0) escreva(" ",vetor2[i]," ")
		}
		escreva("\nVetor impares não ordenado: ")
		para(inteiro i = 0; i<15;i++){
			se(vetor3[i]!=0) escreva(" ",vetor3[i]," ")
		}
		ordenar()
		
	}

	funcao ordenar(){
		para(inteiro i=0; i < 15-1; i++){
			auxi= i
			para(inteiro j=i+1; j < 15; j++){
				se (vetor[j] < vetor [auxi]){
					auxi = j
				}
			}
			auxi2 = vetor[i]
			vetor[i] = vetor[auxi]
			vetor[auxi] = auxi2
		}
		escreva("\nVetor ordenado crescente: ")
			para (inteiro i =0; i<15;i++){
				escreva(vetor[i], " ")
		}
		para(inteiro i=0; i < 15-1; i++){
			auxi= i
			para(inteiro j=i+1; j < 15; j++){
				se (vetor2[j] < vetor2 [auxi]){
					auxi = j
				}
			}
			auxi2 = vetor2[i]
			vetor2[i] = vetor2[auxi]
			vetor2[auxi] = auxi2
		}
		escreva("\nVetor par crescente: ")
			para (inteiro i =0; i<15;i++){
				se(vetor2[i]!=0)escreva(vetor2[i], " ")
		}
		para(inteiro i=0; i < 15-1; i++){
			auxi= i
			para(inteiro j=i+1; j < 15; j++){
				se (vetor3[j] < vetor3[auxi]){
					auxi = j
				}
			}
			auxi2 = vetor3[i]
			vetor3[i] = vetor3[auxi]
			vetor3[auxi] = auxi2
		}
		escreva("\nVetor impar crescente: ")
			para (inteiro i =0; i<15;i++){
				se(vetor3[i]!=0)escreva(vetor3[i], " ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 166; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 4, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */