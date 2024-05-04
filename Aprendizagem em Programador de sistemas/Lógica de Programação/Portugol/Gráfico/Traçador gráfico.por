programa
{
	inclua biblioteca Teclado --> t
	inclua biblioteca Util --> u
	inclua biblioteca Graficos --> g
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{	g.iniciar_modo_grafico(verdadeiro)
		g.definir_dimensoes_janela(1024, 600)
		g.definir_titulo_janela("TRAÇADOR GRÁFICO DE FUNÇÕES")
		
		enquanto(nao t.tecla_pressionada(t.TECLA_ESC)){
		grafico()
	}
		
	}
	funcao grafico(){
		g.definir_cor(g.COR_BRANCO)
		g.limpar()						
		//definir retangulo eixo
		g.definir_cor(g.COR_PRETO)
		g.desenhar_retangulo(20, 10, 980, 80, falso, falso)
		g.desenhar_retangulo(20, 100, 450, 470, falso, falso)
		g.desenhar_retangulo(500, 100, 500, 470, falso, falso)
		g.definir_cor(g.COR_AZUL)
		para(inteiro i = 500; i <= 1000; i+=5){
			g.desenhar_linha(i, 333, i, 338)
		}
		para(inteiro i = 500; i <= 1000; i+=50){
			g.desenhar_linha(i, 320, i, 350)
		}
		para(inteiro i = 100; i <= 570; i+=47){
			g.desenhar_linha(735, i, 765, i)
		}
		para(inteiro i = 100; i <= 570; i+=4.7){
			g.desenhar_linha(748, i, 753, i)
		}
		
		eixo()
		g.renderizar()
	}
	funcao texto(){
		
	}
	funcao eixo(){
		g.definir_cor(g.COR_BRANCO)
		//definir eixo x
		g.desenhar_linha(500, 335, 1000, 335)
		//definir eixo y
		g.desenhar_linha(750, 100, 750, 570)
	}
	funcao parabola(){
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */