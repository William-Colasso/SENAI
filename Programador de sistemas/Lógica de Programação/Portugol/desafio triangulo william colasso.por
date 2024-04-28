programa
{
	
	funcao inicio()
	{
		inteiro valor1, valor2, valor3
		valor1 = 0
		valor2 = 0
		valor3 = 0
	
		escreva("Escreva a medida de semirreta\n")
		leia(valor1)

		escreva("Escreva a medida de outra semirreta\n")
		leia(valor2)

		escreva("Escreva a última medidade de uma semirreta\n")
		leia(valor3)


		se(valor1 != 0 e valor2 != 0 e valor3 != 0){
		
		
			se(valor1 > valor2 e valor1 > valor3){
		

				se(valor1 < valor2+valor3){
					escreva("É possivel um triângulo")
					}
				senao{
					escreva("Não é possivel formar um triangulo")
					}	
			}

			se(valor2 > valor1 e valor2 > valor3){
			
				se(valor2 < valor1+valor3){
					escreva("É possivel um triângulo")
				}	
				senao{
					escreva("Não é possivel formar um triangulo")
				}
			}

			se(valor3 > valor2 e valor3 > valor1){
			

				se(valor3 < valor2+valor1){
					escreva("É possivel um triângulo")
				}
				senao{
					escreva("Não é possivel formar um triangulo")
				}
			}

		
		}
		senao{
			escreva("Não é possivel formar um triangulo")
		}
		se(valor1 == valor2 e valor2 == valor3){
			escreva("É possivel fazer um triângulo")
		}
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */