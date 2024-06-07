programa{
    
    inclua biblioteca Util --> u
    
    //Variavéis
    const inteiro tam = 7
    inteiro vetor[tam]

    //Inicialização do Algoritmo
    funcao inicio(){
        inteiro tamanho = tam, aux, i
        //Entrada dados
        para(i = 0; i < tamanho; i++){
            vetor[i] = u.sorteia(10, 50)
        }
        //Saída inicial
        escreva("Vetor Original: ")
        para(i = 0; i < tamanho; i++){
            escreva(vetor[i], " ")
        }
        escreva("\n")
        //Ordenação na função
        quickSort(vetor, 0, tam -1)

        //Saída final
        escreva("Vetor Ordenado: ")
        para(i = 0; i < tamanho; i++){
            escreva(vetor[i], " ")
        }
    }

    //Ordenação
    funcao quickSort(inteiro vetor[], inteiro inicio, inteiro fim){
        inteiro i, j, pivo, aux
        i = inicio // posição inicio
        j = fim // posição final
        pivo = vetor[(inicio + fim) / 2] // posição pivo

        enquanto(i <= j){
            enquanto(vetor[i] < pivo){
                i++ // aumenta posição
            }
            enquanto(vetor[j] > pivo){
                j-- // diminui posição
            }
            se(i <= j){
                //Realiza Trocas
                aux = vetor[i]
                vetor[i] = vetor[j]
                vetor[j] = aux
                i++
                j--
            }
        }
        se(j > inicio){
            quickSort(vetor, inicio, j)
        }
        se(i < fim){
            quickSort(vetor, i, fim)
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1107; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */