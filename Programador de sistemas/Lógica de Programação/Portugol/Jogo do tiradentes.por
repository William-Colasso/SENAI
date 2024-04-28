programa
{
	inclua biblioteca Tipos --> TP
	inclua biblioteca Texto --> T
	
//Inicializando váriaveis
	inteiro tamanho, vidas = 6, auxi = 0
	cadeia palavra, palavra_Auxi, letra,letras[1000][1000], underline[1000]
	logico ganhar = falso
	//finalizando a criação váriaves globais
	funcao inicio()
	{
		escreva("Qual palavra?")
		leia(palavra)

		tamanho = T.numero_caracteres(palavra)
		
		limpa()
			para(inteiro i = 0; i < tamanho; i++){
				letras[0][i] = T.extrair_subtexto(palavra, i,i+1)
				underline[i] = "_"
			}
			
		repet()
		
	}
	funcao repet(){
		logico teste = falso
		faca{	limpa()
				desenho()
				
				para(inteiro j = 0; j < tamanho; j++){
					escreva("(",underline[j],")", " ")
				}	
					escreva("\nQual letra?")
					leia(letra)
					teste = falso
					para(inteiro n = 0; n < tamanho; n++){
						se(letras[0][n] == letra){
							underline[n] = letras[0][n]
							teste = verdadeiro
							auxi++
							
						}
						senao se(letra == palavra){
							para(inteiro l = 0; l<tamanho; l++){
								underline[l] = letras[0][l]
								teste = verdadeiro
								vidas = 0
								
								
							}
							ganhar = verdadeiro
							}

							se(auxi == tamanho){
								ganhar = verdadeiro
							}
						}

					
					
				se(teste == falso){
						vidas = vidas -1	
			}
			ganho()
		}
		
		enquanto(vidas > 0)
		

	}
	funcao desenho(){
			
			se(vidas == 6){
				escreva ( "   _______\n")
				escreva ("     |    |\n")
				escreva ("          |\n")
				escreva ("          |\n")
				escreva ("          |\n")
				escreva ("          |\n")
				escreva ("    =======\n")
				
			}
			se(vidas == 5){
				escreva ( "   _______\n")
				escreva ("     |    |\n")
				escreva ("    ( )   |\n")
				escreva ("          |\n")
				escreva ("          |\n")
				escreva ("          |\n")
				escreva ("     =======\n")
			}
			se(vidas == 4){
				escreva ("    _______\n")
				escreva ("     |    |\n")
				escreva ("    ( )   |\n")
				escreva ("     |    |\n")
				escreva ("     |    |\n")
				escreva ("          |\n")
				escreva ("     =======\n")
			}
			se(vidas == 3){
				escreva ("   _______\n")
				escreva ("    |    |\n")
				escreva ("   ( )   |\n")
				escreva (" --{|    |\n")
				escreva ("    |    |\n")
				escreva ("         |\n")
				escreva ("    =======\n")
			}
			se(vidas == 2){
				escreva ("   _______\n")
				escreva ("    |    |\n")
				escreva ("   ( )   |\n")
				escreva (" --{|}-- |\n")
				escreva ("    |    |\n")
				escreva ("         |\n")
				escreva ("    =======\n")
			}
			se(vidas == 1){
				escreva ("   _______\n")
				escreva ("    |    |\n")
				escreva ("   ( )   |\n")
				escreva (" --{|}-- |\n")
				escreva ("    |    |\n")
				escreva ("     \\   |\n")
				escreva ("    =======\n")
			}
			se(vidas == 0){
				escreva ("   _______\n")
				escreva ("    |    |\n")
				escreva ("   ( )   |\n")
				escreva (" --{|}-- |\n")
				escreva ("    |    |\n")
				escreva ("   / \\  |\n")
				escreva ("    =======\n")
			}
			se(vidas == 0){
			 escreva("__________\n|\t |\n|\t( )\n|\t |\n|\t |\n|\n|\n\n"			
				)
			}
		
	}
	funcao ganho(){
		se(ganhar == verdadeiro){
			escreva("===============\n")
			escreva("=   PARABÈNS  =\n")
			escreva("===============\n")

			escreva("A palavra era: ", palavra)
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vidas, 7, 18, 5}-{ganhar, 9, 8, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */