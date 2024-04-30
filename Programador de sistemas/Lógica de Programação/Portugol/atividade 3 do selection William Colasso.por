programa
{
    inclua biblioteca Util
    
    funcao inicio()
    {
        inteiro vetor[12], tamanho = 12,j,auxiliar,indice

        para(inteiro i=0; i<tamanho;i++){
            vetor[i]=Util.sorteia(10,50)
            //leia(vetor[i])
        }
    
    
        escreva("Vetor original: ")
        para (inteiro i =0;i<tamanho;i++){
            escreva(vetor[i], " ")
            
        }
        //escrever vetor original
        escreva("\n")
            para(inteiro i=0; i < tamanho-1; i++){
                indice = i
                para(j=i+1; j < tamanho; j++){
                    se(vetor[j] < vetor[indice]){
                        indice = j
                    }
                }
                auxiliar = vetor[i]
                vetor[i] = vetor[indice]
                vetor[indice] = auxiliar
            }

    escreva("vetor ordenado: ")
        para(inteiro i=0; i< tamanho; i++){
            escreva(vetor[i], " ")

        }
        //ordenação dos vetores
		escreva("\n o maior e: ", vetor[11],"\n o menor e: " ,vetor[0])
    }        
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 989; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */