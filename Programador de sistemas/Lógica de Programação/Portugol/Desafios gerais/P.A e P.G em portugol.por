programa
{
	inclua biblioteca Util--> u
	

    real chose, num1, num2, auxiliar, tempo = 7, auxiliar2 = 1, auxiliar3
    logico continuar = verdadeiro, menu = verdadeiro
	funcao inicio()
{

    enquanto (continuar == verdadeiro) {
        se (menu == verdadeiro) {
            limpa()
            escreva("Digite sua chose:\n")
            escreva("1-=======Progressão Aritmética===========\n")
            escreva("2-=======Soma de Progressão Geométrica=====\n")
            escreva("3-=======Fórmula.A========================\n")
            escreva("4-=======Razão Geométrica==================\n")
            escreva("5-=======Configurações=========================\n")
            escreva("6-=======Sair=============================\n")
            leia(chose)
            limpa()
        }
        menu = falso

        se (chose == 1) progressaoAritmetica()
            
        senao se (chose == 2) progressaoGeometrica()
            
        senao se (chose == 3) formulaA()
            
        senao se (chose == 4) razaoGeometrica()
            
        senao se (chose == 5)  configuracoes()
           
        senao se (chose == 6) continuar = falso
            
        senao menu = verdadeiro
            
        }
    }


funcao progressaoAritmetica()
{
    limpa()

    escreva("Qual é o primeiro número da sequência? (zero para sair)\n")
    leia(num1)
    limpa()

    se (num1 != 0) {
        escreva("Qual é o último número da sequência?\n")
        leia(num2)
        escreva("Quantos elementos possui a sequência? (responda o mesmo que a segunda pergunta, se o primeiro número for 1)\n")
        leia(auxiliar)
        num1 = (((num1 + num2) * auxiliar) / 2)
        escreva("A soma aritmética é:\n")
        escreva(num1 + "\n" + "Continuando em:")

        para (inteiro i = tempo; i > 0; i--) {
            escreva(i, "..")
            u.aguarde(tempo*100)
        }
	}
    senao{
        menu = verdadeiro
    }
}

funcao progressaoGeometrica()
{
    limpa()

    escreva("Qual é o primeiro número da sequência? (zero para sair)\n")
    leia(num1)
    limpa()

    se (num1 != 0) {
        escreva("Qual é a razão da sequência?\n")
        leia(auxiliar)
        escreva("Qual é o último elemento da sequência?\n")
        leia(auxiliar3)
        para (inteiro i = 0; i < auxiliar3; i++) {
            auxiliar2 *= auxiliar
        }
        num1 = (num1 * (auxiliar2 - 1)) / (auxiliar - 1)
        escreva("A soma da Progressão Geométrica é:\n")
        escreva(num1 + "\n" + "Continuando em:")

        para (inteiro i = tempo; i > 0; i--) {
            escreva(i, "..")
            u.aguarde(tempo*100)
        }
	} 
    senao{
        menu = verdadeiro
    }
}

funcao formulaA()
{
    limpa()

    escreva("Qual é o primeiro número da sequência? (zero para sair)\n")
    leia(num1)
    limpa()

    se (num1 != 0) {
        escreva("Qual número você deseja saber?\n")
        leia(num2)
        escreva("Qual é a razão da P.A?\n")
        leia(auxiliar)
        num1 = num1 + ((num2 - 1) * auxiliar)
        escreva("O termo 'n' é:\n")
        escreva(num1 + "\n" + "Continuando em:")
       para (inteiro i = tempo; i > 0; i--) {
            escreva(i, "..")
            u.aguarde(tempo*100)
        }
    } 
    senao{
        menu = verdadeiro
    }
}

funcao razaoGeometrica()
{
    limpa()

    escreva("Qual é o primeiro número da sequência? (zero para sair)\n")
    leia(num1)
    limpa()

    se (num1 != 0) {
        escreva("Qual é o segundo número da sequência?\n")
        leia(num2)
        num1 = num2 / num1
        escreva("A razão é:\n")
        escreva(num1 + "\n" + "Continuando em:")

        para (inteiro i = tempo; i > 0; i--) {
            escreva(i, "..")
            u.aguarde(tempo*100)
        }
    }
    senao{
        menu = verdadeiro
    }
}

funcao configuracoes()
{
    limpa()
    escreva("Digite sua chose: \n")
    escreva("1-=======Tempo de espera===========\n")
    leia(chose)
    limpa()

    se (chose == 1) {
        escreva("Digite um novo tempo de espera")
        leia(tempo)
        
        escreva("O novo tempo é:" + tempo + "\n")
        para (inteiro i = tempo; i > 0; i--) {
            escreva(i, "..")
            u.aguarde(tempo*100)
        }
        menu = verdadeiro
    }
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1275; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */