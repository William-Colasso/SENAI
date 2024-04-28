programa
{
	inclua biblioteca Graficos -->g
	inclua biblioteca Arquivos --> a
	inclua biblioteca Util --> u
	inclua biblioteca Teclado --> t
	inteiro velocidade = 2,x = 0, y = 0
	logico vida = falso
	cadeia caminho_lula = "./Logo pt"
	funcao tecla(){
		se(t.tecla_pressionada(t.TECLA_SUBTRACAO)){
			velocidade-= 1
			u.aguarde(50)
		}
		se(t.tecla_pressionada(t.TECLA_ADICAO)){
			velocidade+= 1
			u.aguarde(50)
		}
		se(velocidade <= 0 ){
			velocidade = 1
		}
		se(t.tecla_pressionada(t.TECLA_A) ou t.tecla_pressionada(t.TECLA_SETA_ESQUERDA)){
			x-=velocidade
			u.aguarde(3)
		}
			se(t.tecla_pressionada(t.TECLA_D)ou t.tecla_pressionada(t.TECLA_SETA_DIREITA)){
			x+=velocidade
			u.aguarde(3)
		}
			se(t.tecla_pressionada(t.TECLA_S)ou t.tecla_pressionada(t.TECLA_SETA_ABAIXO)){
			y+=velocidade
			u.aguarde(3)
		}
			se(t.tecla_pressionada(t.TECLA_W)ou t.tecla_pressionada(t.TECLA_SETA_ACIMA)){
			y-=velocidade
			u.aguarde(3)
		}
	}
	funcao lulas(){
		inteiro x_Lula, y_Lula
	}
	funcao grafico(){
		g.definir_cor(g.COR_PRETO)
		g.renderizar()
	}
	funcao arquivos (){
		a.abrir_arquivo(Logo pt, a.MODO_LEITURA)
	}
	funcao inicio()
	{
		g.iniciar_modo_grafico(verdadeiro)
		g.definir_dimensoes_janela(800, 600)
		enquanto(nao t.tecla_pressionada(t.TECLA_ESC)){
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */