programa
{
	
	funcao inicio()
	{
		//Definição de variável
		cadeia nome, status = ""
		real altura, peso, IMC

          //Inicialização de varáveis

          escreva("Digite seu nome \n")
          leia(nome)

          escreva("Digite sua altura, em metros \n")
          leia(altura)

          escreva("Digite seu pesso em Kg \n")
          leia(peso)

          //Calcular IMC

		IMC = (peso / altura) / altura
		
		se(IMC>=40){
			status = "Obesidade Grau III"
		}
          senao se(IMC < 40 e IMC >= 35){
			status = "Obesidade grau II"
		} 
		senao se(IMC <= 34.9 e IMC >= 30){
			status = "Obesidade Grau I"	
		}
		senao se(IMC <= 29.9 e IMC > 25){
			status = "Acima do peso"
		}
		senao se(IMC <= 24.9 e IMC > 18.5){
			status = "Peso normal"
		}		 			
		senao se(IMC <= 18.4 e IMC >= 17){
			status = "Abaixo do peso"
		}
		senao se(IMC <= 16.9){
			status = "Muito abaixo do peso"
		}						
		escreva(nome  , "Seu IMC é: ", IMC, "Você está ", status)
	   
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 927; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */