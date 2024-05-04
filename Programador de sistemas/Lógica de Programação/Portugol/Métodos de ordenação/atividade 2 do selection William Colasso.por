programa
{
    inclua biblioteca Util
    
    funcao inicio()
    {
        real vetor[10]
        inteiro tamanho = 10,j,auxiliar,indice

        para(inteiro i=0; i<tamanho;i++){
            vetor[i]=Util.sorteia(10,50)
        }
    
    
        escreva("Vetor original: ")
        para (inteiro i =0;i<tamanho;i++){
            escreva(vetor[i], " ")
            
        }
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
       
    }        
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 914; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */