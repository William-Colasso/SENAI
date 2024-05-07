programa
{
	inteiro vetor[10], auxiliar,tamanho, i, j, indice, gap
	real fator
	logico trocado
	cadeia alunos[1000],auxi2
	inteiro notas[1000]
	funcao inicio()
	{
		escreva("Para quantos alunos gostaria de ordenar?\n")
		leia(tamanho)	
		//Definição da quantidade de alunos
		para( i=0; i<tamanho; i++){
			escreva("Digite o nome do aluno ", i+1,"\n")
			leia(alunos[i])
			//Nome do aluno
			escreva("Digite a nota do aluno ", i+1,"\n")
			leia(notas[i])
			//Nota do aluno
		}
		escreva("Vetor Original: ")
		para(i=0; i<tamanho; i++){
			escreva(notas[i], " ")
			//Escrevendo o vetor original
		}
		escreva("\n")

		fator = 1.3
		trocado = verdadeiro
		gap = tamanho
		//Definindo o Gap
		enquanto(gap > 1 ou trocado){
			gap = (gap / fator)
			se(gap < 1){
				gap = 1
			}
			trocado = falso
			i = 0
			enquanto(i + gap < tamanho){
				se(notas[i] > notas[i + gap]){
					//Troca os Elementos
					/*Também trocamos os nomes de lugares, ao mesmo tempo da nota
					 para o nome e a nota ficarem no lugar certo
					 */
					auxiliar = notas[i]
					auxi2 = alunos[i]
					notas[i] = notas[i + gap]
					alunos[i] = alunos[i + gap]
					notas[i + gap] = auxiliar
					alunos[i+gap] = auxi2
					trocado = verdadeiro
				}
				i = i + 1
			}
		}
		escreva("Vetor ordenado: \n")
		para(i=0; i<tamanho; i++){
			escreva(alunos[i],":",notas[i], "\n ")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1021; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */