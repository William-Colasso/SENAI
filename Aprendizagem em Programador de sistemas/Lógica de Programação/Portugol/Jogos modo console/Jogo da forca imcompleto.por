programa
{
	inclua biblioteca Tipos --> TP
	inclua biblioteca Texto --> T
	
//Inicializando váriaveis
	inteiro tamanho, vidas = 7
	caracter letras[1000][1000], underline[1000]
	cadeia palavra, palavra_Auxi, letra, desenhos[6]
	logico ganhar = falso
	//finalizando a criação váriaves globais
	funcao inicio()
	{
		escreva("Qual palavra?")
		leia(palavra)

		tamanho = T.numero_caracteres(palavra)
		
		limpa()
			para(inteiro i = 0; i < tamanho; i++){
				letras[0][i] = T.obter_caracter(palavra, i)
				underline[i] = '_'
			}
		desenho()	
		repet()
		
	}
	funcao repet(){
		faca{
			para(inteiro i = 0; i<tamanho; i++){
				para(inteiro j = 0; j < tamanho; j++){
					escreva(underline[j], " ")
				}
					escreva("\nQual letra?")
					leia(letra)
					para(inteiro j = 0; j < tamanho; j++){
						se(T.obter_caracter(letra, 0) == letras[0][j]){
							underline[j] = T.obter_caracter(letra, 0)
						}
						senao se(letra == palavra){
							para(inteiro l = 0; l<tamanho; l++){
								underline[l] = T.obter_caracter(letra, l)
								
							}
							ganhar = verdadeiro
						}
						senao{
							vidas = vidas - 1
						}
					}
					
			}
		}
		enquanto(vidas > 0)

	}
	funcao desenho(){
			
			se(vidas == 7){
				desenhos[1] = "\t__________\n\t\t|\n\t\t|\n\t\t|\n\t\t|\n\t\t|"
				escreva(desenhos[1])
			}
		
	}
	funcao ganho(){
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1252; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */