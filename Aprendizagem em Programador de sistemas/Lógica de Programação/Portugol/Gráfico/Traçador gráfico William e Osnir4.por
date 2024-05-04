programa
{
    inclua biblioteca Mouse --> mou
    inclua biblioteca Teclado --> t
    inclua biblioteca Util --> u
    inclua biblioteca Graficos --> g
    inclua biblioteca Matematica --> m

    inteiro  CINZA = g.criar_cor(211, 211, 211), x_mouse=0, y_mouse= 0
    inteiro CINZA2 = g.criar_cor(128, 128, 128), a = 1, b =6, c=5
    inteiro cont = 5, cont2 = -5, x = 0
    inteiro vetor_x[1000],vetor_x2[1000], vetor_y[1000], j = 0, i = 0, n =0,auxi = 0,auxi2 = 0,auxi3 = 0, auxi4 = 0
    logico avermelhar1 = falso, avermelhar2 = falso, avermelhar3 = falso, avermelhar4 = falso, avermelhar5 = falso
    real x1=0.00,x2=0.00,xv=0.00,yv=0.00,delta=0.00,y =335.00, xv2 = xv, yv2 = yv,y2, d =0
    inteiro progresso = 0
    funcao inicio()
    {   g.iniciar_modo_grafico(verdadeiro)
        g.definir_dimensoes_janela(1024, 600)
        g.definir_titulo_janela("TRAÇADOR GRÁFICO DE FUNÇÕES")
        
        enquanto(nao t.tecla_pressionada(t.TECLA_ESC)){
            teclado()
            grafico()
            mouse()
            equacoes()
        }
    }
    funcao teclado(){
        u.aguarde(125)
        se(mou.botao_pressionado(mou.BOTAO_ESQUERDO) e y_mouse <= 160 e y_mouse >= 120 e x_mouse >= 40 e x_mouse <= 80){
            avermelhar1 = verdadeiro
            avermelhar2 = falso
            avermelhar3 = falso
            
            
        }
        se(mou.botao_pressionado(mou.BOTAO_ESQUERDO) e y_mouse <= 160 e y_mouse >= 120 e x_mouse >= 158 e x_mouse <= 198){
            avermelhar1 = falso
            avermelhar2 = verdadeiro
            avermelhar3 = falso
            
        }
        se(mou.botao_pressionado(mou.BOTAO_ESQUERDO)e y_mouse <= 160 e y_mouse >= 120 e x_mouse >= 272 e x_mouse <= 312 ){
            avermelhar1 = falso
            avermelhar2 = falso
            avermelhar3 = verdadeiro
            
        }
         se(mou.botao_pressionado(mou.BOTAO_ESQUERDO)e y_mouse <= 87 e y_mouse >= 47 e x_mouse >= 900 e x_mouse <= 940 ){
            avermelhar4 = verdadeiro
            avermelhar5= falso
            
        }
        se(mou.botao_pressionado(mou.BOTAO_ESQUERDO)e y_mouse <= 87 e y_mouse >= 47 e x_mouse >= 950 e x_mouse <= 990 ){
            avermelhar4 = falso
            avermelhar5= verdadeiro
            
        }
        se(t.tecla_pressionada(t.TECLA_ADICAO) e avermelhar1 == verdadeiro){
            a+=1
        }

        se(t.tecla_pressionada(t.TECLA_SUBTRACAO)e avermelhar1 == verdadeiro){
            a-=1
        }
        
        se(t.tecla_pressionada(t.TECLA_ADICAO)e avermelhar2 == verdadeiro){
            b+=1
        }
        se(t.tecla_pressionada(t.TECLA_SUBTRACAO)e avermelhar2 == verdadeiro){
            b-=1
        }
        se(t.tecla_pressionada(t.TECLA_ADICAO)e avermelhar3 == verdadeiro){
            c+=1
        }
        se(t.tecla_pressionada(t.TECLA_SUBTRACAO)e avermelhar3 == verdadeiro){
            c-=1
        }
    }
    funcao coeficientes(){
        g.definir_cor(g.COR_PRETO)
        g.definir_tamanho_texto(28.00)
        g.desenhar_texto(52, 127, a+"")
        g.desenhar_texto(170, 127, b+"")
        g.desenhar_texto(284, 127, c+"")
    }
    funcao grafico(){
        g.definir_cor(g.COR_BRANCO)
        g.limpar()                        
        //definir retangulo eixo
        	
        para(inteiro i = 100; i <= 570; i+=4.7){
            g.definir_cor(CINZA)
            g.desenhar_linha(500, i, 1000, i)
        }
        para(inteiro i=500; i<=1000; i+=5){
            g.definir_cor(CINZA)
            g.desenhar_linha(i, 100, i, 570)
        }
        para(inteiro i = 100; i <= 570; i+=47){
            g.definir_cor(CINZA2)
            g.desenhar_linha(495, i, 1000, i)
        }
        para(inteiro i = 500; i <= 1000; i+=50){
            g.definir_cor(CINZA2)
            g.desenhar_linha(i, 100, i, 575)
        }
        para(inteiro i = 500; i <= 1000; i+=5){
            g.definir_cor(g.COR_PRETO)
            g.desenhar_linha(i, 332, i, 338)
        }
        para(inteiro i= 500; i<=1000; i+=50){
            g.definir_cor(g.COR_PRETO)
            g.desenhar_linha(i, 319, i, 350)
        }
        para(inteiro i = 100; i<= 570; i+=4.7){
            g.definir_cor(g.COR_PRETO)
            g.desenhar_linha(747, i, 753, i)
        }
        para(inteiro i = 100; i <= 570; i+=47){
            g.definir_cor(g.COR_PRETO)
            g.desenhar_linha(734, i, 765, i)
        }
        parabola()
        parabola2()
        g.definir_cor(g.COR_BRANCO)
        g.desenhar_retangulo(0, 0, 500, 1000, falso, verdadeiro)
        g.desenhar_retangulo(0, 0, 1000, 100, falso, verdadeiro)
        g.desenhar_retangulo(0, 570, 1000, 50, falso, verdadeiro)
        g.definir_cor(g.COR_PRETO)
		g.desenhar_retangulo(20, 10, 980, 80, falso, falso)
		g.desenhar_retangulo(20, 100, 450, 470, falso, falso)
		g.desenhar_retangulo(500, 100, 500, 470, falso, falso)
       	g.definir_cor(g.COR_AZUL)
        numeros()
        quadrados()
        coeficientes()
        
        eixo()
        se(delta<=0){
			g.definir_tamanho_texto(15.0)	
			g.definir_cor(g.COR_PRETO)
			g.desenhar_texto(50, 400, "Para delta negativo, existem apenas raízes complexas. ")
			g.desenhar_texto(50, 430, "Delta é:"+delta)
		}
        g.renderizar()
    }
    funcao numeros(){
        cont = 5
        se(cont>-6){
            g.definir_cor(g.COR_PRETO)
            g.definir_tamanho_texto(12.00)
            para(inteiro i = 95; i<=570; i+=47){
                g.desenhar_texto(475, i, ""+cont)
                cont-=1
            }
        }
        cont2 = -5
        se(cont2<6){
            g.definir_cor(g.COR_PRETO)
            g.definir_tamanho_texto(12.00)
            para(inteiro i = 497; i<=1000; i+=50){
                g.desenhar_texto(i, 581, ""+cont2)
                cont2+=1
            }
        }
    }
    funcao quadrados(){
        g.definir_cor(g.COR_PRETO)
        g.desenhar_retangulo(40, 120, 40, 40, falso, falso)
        se(avermelhar1 == verdadeiro){
            g.definir_cor(g.COR_VERMELHO)
            g.desenhar_retangulo(40, 120, 40, 40, falso, falso)
        }
        g.definir_cor(g.COR_PRETO)
        g.definir_tamanho_texto(34.00)
        g.desenhar_texto(90, 125, "X²+")
        g.desenhar_retangulo(158, 120, 40, 40, falso, falso)
        se(avermelhar2==verdadeiro){
            g.definir_cor(g.COR_VERMELHO)
            g.desenhar_retangulo(158, 120, 40, 40, falso, falso)
        }
        g.definir_cor(g.COR_PRETO)
        g.desenhar_texto(209, 125, "X +")
        g.desenhar_retangulo(272, 120, 40, 40, falso, falso)
        se(avermelhar3==verdadeiro){
            g.definir_cor(g.COR_VERMELHO)
            g.desenhar_retangulo(272, 120, 40, 40, falso, falso)
        }
        
       /* g.definir_cor(g.COR_PRETO)
        g.desenhar_texto(322, 125, "= 0")
        g.desenhar_retangulo(900, 47, 40, 40, falso, falso)
        g.definir_tamanho_texto(30.00)
        g.desenhar_texto(910, 53, "+")
        se(avermelhar4==verdadeiro){
            g.definir_cor(g.COR_VERMELHO)
            g.desenhar_texto(910, 53, "+")
            g.desenhar_retangulo(900, 47, 40, 40, falso, falso)
            avermelhar4 = falso
        }
        g.definir_cor(g.COR_PRETO)
        g.desenhar_retangulo(950, 47, 40, 40, falso, falso)
        g.definir_tamanho_texto(40.00)
        g.desenhar_texto(963, 50, "-")
        se(avermelhar5==verdadeiro){
            g.definir_cor(g.COR_VERMELHO)
            g.desenhar_texto(963, 50, "-")
            g.desenhar_retangulo(950, 47, 40, 40, falso, falso)
            avermelhar5 = falso
        }*/
    }
    funcao texto(){
        
    }
    funcao eixo(){
        g.definir_cor(g.COR_VERMELHO)
        //definir eixo x
        g.desenhar_linha(500*10, 335*10, 1000*10, 335*10)
        //definir eixo y
        g.desenhar_linha(750*10, 100*10, 750*10, 570*10)
    }
    funcao parabola(){
		se(delta>0){    	
		    	   g.definir_tamanho_texto(10.0)
		    	   g.definir_cor(g.COR_PRETO)
		        g.desenhar_elipse((x1*10)+750, 335, 15, 15, verdadeiro)
		        g.definir_cor(g.COR_BRANCO)
		        g.desenhar_texto((x1*10)+752, 337, "X1")
		        g.definir_cor(g.COR_PRETO)
		        g.desenhar_elipse((x2*10)+750, 335, 15, 15, verdadeiro)
		        g.definir_cor(g.COR_BRANCO)
		        g.desenhar_texto((x2*10)+752, 337, "X2")
		        g.definir_cor(g.COR_PRETO)
		        g.desenhar_elipse((xv*10)+750, (yv*10)+335, 15, 15, verdadeiro)
		        g.definir_cor(g.COR_BRANCO)
		        g.desenhar_texto((xv*10)+755, (yv*10)+337, "V")
		        g.definir_cor(g.COR_PRETO)
		        se(c>=0 ou c<=0){
		        	g.desenhar_elipse(750, (-c*10)+335, 15, 15, verdadeiro)
		        	g.definir_cor(g.COR_BRANCO)
		          g.desenhar_texto(753, (-c*10)+337, "C")
		          g.definir_cor(g.COR_PRETO)
		        }
		}
		
    }
    funcao mouse(){
        x_mouse = mou.posicao_x()
        y_mouse = mou.posicao_y()
        se(0==0){
            
        }
        
    }
	funcao equacoes(){
    	xv= 2*a
    	xv = -(b)/xv
    	delta = m.potencia(b, 2)-(4*a*c)
    	yv = 4*a
    	yv = delta/yv
    	x1 = (-(b)+m.raiz(delta, 2))/(2*a)
	x2 = (-(b)-m.raiz(delta, 2))/(2*a)
	
	}
	funcao parabola2(){
			pontos_xy()
			linha_x()
			para(inteiro i = 0;i<90;i++){
				g.desenhar_elipse(vetor_x[i], vetor_y[i],10,10,verdadeiro)
			}
		
		
		
	}
	funcao pontos_xy(){
		para(inteiro i = 0; i<90;i++){
			vetor_y[i] = (a*((xv+i)*(xv+i))+(b*xv)+c)+335
			vetor_x[i] = 750+i
			vetor_x[i] = 750-i
		}
		

		
	}
    funcao linha_x(){
    	se(xv<0.0 e x1>0){
    		d=x1-(-xv)
    		
    	}
    	se(xv>0.0 e x1>0){
    		d=x1-xv
    		para(inteiro i = 0;i<d*10;i++){
    			
    		}
    	}
    	se(xv<0 e x1<0){
    		d=x1+(-(xv))
    		para(inteiro i = 0;i<d*10;i++){
    			
    		}
    	}
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor;
 */