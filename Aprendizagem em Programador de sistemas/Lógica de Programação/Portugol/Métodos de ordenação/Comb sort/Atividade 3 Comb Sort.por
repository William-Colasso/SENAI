programa
{

//William Colasso Pereira
//Copia não comédia!!!
	inteiro tamanho = 10, notas[11],j,i,auxiliar, chose,gap,indice,elementoAtual,auxi2
	logico trocado
	real fator
	cadeia  alunos[11], auxiliar2,elementoAtual2
	
	funcao inicio()
	{

		para( i=0; i<tamanho; i++){
			escreva("Digite o nome da primeira pessoa ", i+1,"\n")
			leia(alunos[i])
			//Nome do aluno
			escreva("Digite a idade da pessoa", i+1,"\n")
			leia(notas[i])
			//Nota do aluno
		}
		limpa()
		escreva("1-=======Buble Sort=================\n")
		escreva("2-=======Insertion Sort=============\n")
		escreva("3-=======Selection Sort=================\n")
		escreva("4-=======Comb Sort=============\n")
		leia(chose)
		
		limpa()
		se(chose ==1) buble()
		senao se(chose==2) insertion()
		senao se (chose == 3) selection()
		senao se (chose ==4) comb()
		senao{
			limpa()
			escreva("Número inválido")
		}
	}
	funcao buble(){
		//Parte de ordenação buble
		escreva("notas original;  ")
		para(i=0; i<tamanho; i++){
			escreva(notas[i], " ")
		}
		escreva("\n")
		//fim de original
		para(j = 1; j <= tamanho; j++){
			para(i = 0; i < tamanho -1; i++){
				se(notas[i] > notas[i+1]){
					auxiliar = notas[i]
					notas[i] = notas[i+1]
					notas[i+1] = auxiliar
				}
			}
		}
		escreva("notas Crescente: ")
		para(i = 0; i < tamanho ; i++){
			escreva(notas[i], " ")
		}
		escreva("\n")
		//Fim notas Crescente
		para(j = 1; j <= tamanho; j++){
			para(i = 0; i < tamanho -1; i++){
				se(notas[i] < notas[i+1]){
					auxiliar = notas[i]
					notas[i] = notas[i+1]
					notas[i+1] = auxiliar
				}
			}
		}
		
		escreva("notas Decrescente: ")
		para(i = 0; i < tamanho; i++){
			escreva(notas[i], " ")
	}
	}
	funcao insertion(){
		//Parte de ordenação insertion
		//Fim do preenchimento do notas
		//escrever o notas original
		escreva("notas Original: ")
		para (i = 0; i <tamanho; i++){
			escreva(notas[i], " ")
		}
		escreva("\n")
		//fim da escrita das notas Originais
		para( i = 1; i < 10; i++){
			elementoAtual = notas[i]
			elementoAtual2= alunos[i]
			indice = i
			enquanto( indice > 0 e notas[indice -1] > elementoAtual){
				alunos[indice]=alunos[indice-1]
				notas[indice] = notas[indice - 1]
				indice--
			}
			notas[indice] = elementoAtual
			alunos[indice] = elementoAtual2
		}
		escreva("notas ordenado: ")
		para ( i = 0; i < tamanho; i++){
			escreva("Aluno",alunos[i],":",notas[i], " \n")
		}
	}
	funcao selection(){
		//Parte de ordenação selection
		para(inteiro i=0; i < 10-1; i++){
			auxiliar= i
			para(inteiro j=i+1; j < 10; j++){
				se (notas[j] < notas [auxiliar]){
					auxiliar = j
				}
			}
			auxi2 = notas[i]
			auxiliar2=alunos[i]
			notas[i] = notas[auxiliar]
			alunos[i] = alunos[auxiliar]
			notas[auxiliar] = auxi2
			alunos[auxiliar] = auxiliar2
		}
		escreva("\nnotas ordenado decrescente: ")
			para ( i =10-1; i>0;i--){
				escreva("alunos:",alunos[i],notas[i], "\n ")
		}
		
//William Colasso Pereira
//Copia não comédia!!!
	}
	funcao comb(){
		//Parte de ordenação Comb
		
		escreva("notas Original: ")
		para(i=0; i<tamanho; i++){
			escreva(notas[i], " ")
			//Escrevendo o notas original
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
					auxiliar2 = alunos[i]
					notas[i] = notas[i + gap]
					alunos[i] = alunos[i + gap]
					notas[i + gap] = auxiliar
					alunos[i+gap] = auxiliar2
					trocado = verdadeiro
				}
				i = i + 1
			}
		}
		escreva("notas ordenado: \n")
		para(i=0; i<tamanho; i++){
			escreva(alunos[i],":",notas[i], "\n ")
		}
	}
	
//William Colasso Pereira
//Copia não comédia!!!
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2839; 
 * @DOBRAMENTO-CODIGO = [76, 127];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 6, 24, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */