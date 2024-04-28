programa
{
	//incluir biblioteca gráfico
	inclua biblioteca Util --> u	
	inclua biblioteca Teclado --> t
	inclua biblioteca Graficos --> g
	inteiro x = 550, y = 400, velocidade = 0
	cadeia vel
	funcao desenhar(){
		g.definir_cor(g.COR_AZUL)
		g.limpar()
		g.definir_cor(g.COR_BRANCO)
		g.desenhar_elipse(x, y, 50, 50, verdadeiro)
		g.definir_cor(g.COR_PRETO)
		g.desenhar_texto(100, 30, "Velocidade: " + (velocidade)+"")
		g.desenhar_texto(100, 60, "Y: " + (y)+"")
		g.desenhar_texto(100, 90, "X: " + (x)+"")
		g.definir_tamanho_texto(30.0)
		g.definir_estilo_texto(verdadeiro, verdadeiro, verdadeiro)
		g.renderizar()
		g.definir_titulo_janela("BOLOTA")
	}
	funcao tecla(){
		se(t.tecla_pressionada(t.TECLA_ESPACO)){
			enquanto(x< 1300){
				x+=velocidade
				u.aguarde(1)
				desenhar()
			}
		
		}
		
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
	funcao borda(){
		se(x >= 1199 )x = 30	
		se( y <= 10 ) 	y=831
		se(x<=1) x= 1170	
		se(y>= 870 )y = 30
	}
	
	funcao inicio()
	{
		g.iniciar_modo_grafico(verdadeiro)
		g.definir_dimensoes_janela(1200, 900)
		enquanto(nao t.tecla_pressionada(t.TECLA_ESC)){
			borda()
			tecla()
			desenhar()	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 805; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */