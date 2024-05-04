programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
		real notas[5][4],status
		cadeia nomes[5]

		para(inteiro i = 0; i<5; i++){
			escreva("Entre com o nome de um aluno: \n")
			leia(nomes[i])
		}
		para(inteiro i = 0; i<5; i++){
			para(inteiro j = 0; j<3; j++){
				escreva("Escreva a nota ", j+1, " de ", nomes[i],":\n" )
				leia(notas[i][j])
				
			}
			notas[i][3] = (notas[i][0]+notas[i][1]+notas[i][2])/3
		}

		para(inteiro i = 0; i<5; i++){
			
			escreva("A média final de ", nomes[i], " é: ", m.arredondar(notas[i][3], 2),"\n")
			se(notas[i][3] < 6){
				escreva("Este aluno está Reprovado\n")
			}
			senao se(notas[i][3] >=6 e notas[i][3]< 7){
				escreva("Este aluno está de recuperação\n")
			}
			senao{
				escreva("O aluno está aprovado\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 745; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */