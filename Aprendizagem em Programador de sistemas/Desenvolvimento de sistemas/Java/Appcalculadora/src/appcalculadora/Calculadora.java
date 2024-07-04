
package appcalculadora;

/**
 *
 * @author william_c_pereira
 */
public class Calculadora {

    private char par;           //Verifica se os pares de "(", "[" ou "{" estão corretos
    private boolean ok = true;  //Retorno do método expOk()
    private String infixa;      //Recebe a expressão INFIXA para decompor

    private String[] expInfixa = new String[50]; //Guarda a expressão infixa decomposta

    private double resultado;   //Guarda o resultado da expressão calculada

    private String[] npr = new String[100];
    private String input = "";

    //Construtor da classe
    public Calculadora() {

    }
    
    //Métodos para cinverter e avalar a expressão
    //Avaliar a expressão
    
    public String evalExp(String strInFixa){
        if(expOk(strInFixa)){
            this.expInfixa = decompor(strInFixa);
            this.npr = posFixa();
            System.out.println("Expressão balanceada!");
            
            for (int i = 0; npr[i]!=null; i++) {
                System.out.println(npr[i]+"");
            }
            this.resultado = calcular();
        }else{
            System.out.println("Expressão não balanceada!");
        }
        return String.copyValueOf(resultado);
    }

}
