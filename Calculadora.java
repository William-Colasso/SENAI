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
    public String evalExp(String strFixa) {
        if (expOk(strFixa)) {
            this.expInfixa = decompor(strFixa);
            this.npr = posFixa();
            System.out.println("Expressão balanceada!");

            for (int i = 0; npr[i] != null; i++) {
                System.out.println(npr[i] + " ");
            }
            this.resultado = calcular();
        } else {
            System.out.println("Expressão não balanceada!");
        }
        return String.valueOf(resultado);
    }

    //Verificar se a expressão está balanceada
    public boolean expOk(String str) {
        Pilha p = new Pilha();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[' || str.charAt(i) == ')') {
                p.empilha(str.charAt(i));
            } else if (str.charAt(i) == ']' || str.charAt(i) == ')') {
                if (!p.vazia()) {
                    par = p.desempilha().toString().charAt(0);
                } else {
                    ok = false;
                }
                if (par != '[' && par != '(') {
                    ok = false;
                }
            }
        }
        if (!p.vazia()) {
            ok = false;
        }
        return ok;
    }

    //Decompor a string da expressão infixa em um vetor de Strings
    public String[] decompor(String str) {
        this.infixa = str;
        String[] arrayInfixa = new String[50];

        int indexIni = 0;
        boolean operando = false;
        boolean fimOperando = true;
        int indexArray = 0;

        for (int x = 0; x < infixa.length(); x++) {
            char ch = infixa.charAt(x);
            if ((ch >= '0') && (ch <= '9')) {
                operando = true;
                fimOperando = false;

            } else if ((ch == '(') || (ch == ')') || (ch == '*') || (ch == '/') || (ch == '+') || (ch == '-')) {
                if (operando) {
                    fimOperando = true;
                } else {
                    operando = false;
                    fimOperando = false;
                }
            }
            if (operando && fimOperando) {    //Se era um operador e terminou
                //colocando na matriz
                arrayInfixa[indexArray] = infixa.substring(indexIni, x);
                indexArray++;
                operando = false;
                indexIni = x;

                //colocando na matriz
                arrayInfixa[indexArray] = infixa.substring(indexIni, x + 1);
                indexArray++;
                indexIni = x + 1;
            } else if (!operando && !fimOperando) {    //Se era um operador coloca na matriz
                arrayInfixa[indexArray] = infixa.substring(indexIni, x + 1);
                indexArray++;
                indexIni = x + 1;
            }

        }
        if (indexIni < infixa.length()) {
            arrayInfixa[indexArray] = infixa.substring(indexIni, infixa.length());
        }
        this.expInfixa = arrayInfixa;

        return arrayInfixa;
    }

    //Converter arraInfixa para a notação polonesa reversa
    public String[] posFixa() {
        String[] arraynpr = new String[100];
        Pilha p = new Pilha();
        int indexArray = 0;

        for (int i = 0; expInfixa[i] != null; i++) {
            String valor = expInfixa[i];

            if (valor.charAt(0) == '+' || valor.charAt(0) == '-' || valor.charAt(0) == '*' || valor.charAt(0) == '/') {
                while (!p.vazia() && pri(p.topo().toString().charAt(0)) >= pri(valor.charAt(0))) {
                    arraynpr[indexArray] = p.desempilha().toString();
                    indexArray++;
                }
                p.empilha(valor);
            } else if (valor.charAt(0) == '(') {
                p.empilha(valor);
            } else if (valor.charAt(0) == ')') {
                while (p.topo().toString().charAt(0) != '(') {
                    arraynpr[indexArray] = p.desempilha().toString();
                    indexArray++;
                }
                p.desempilha();
            } else {
                arraynpr[indexArray] = valor;
                indexArray++;
            }
        }
        while (!p.vazia()) {
            arraynpr[indexArray] = p.desempilha().toString();
            indexArray++;
        }
        return arraynpr;
    }

    //Métodos para executar a Operação
    //Criar operação
    public double calcular() {
        Pilha p = new Pilha();
        double res = 0;
        for (int i = 0; npr[i] != null; i++) {
            input = npr[i];

            //1ª verificar se é um operando ou operador
            //Criar a operação ==> Resultando = esquerdo OPERA Direito (res=x+y)
            //Calcular a operação e retornar o valor
            if (isOperando(input)) {
                p.empilha(Double.parseDouble(input));
            } else if (isOperador(input)) {
                double atual = fazOperacao(input, p);
                p.empilha(atual);
                res = atual;
            }
        }
        return res;
    }

    public double fazOperacao(String operador, Pilha p) {
        double temp;
        if (p.vazia()) {
            temp = 0;

        } else {
            temp = Double.parseDouble(p.desempilha().toString());
        }
        if (p.vazia()) {
            temp = calcValores(operador, Double.parseDouble(p.desempilha().toString()), temp);
        }
        return temp;
    }

    public double calcValores(String operador, double esquerdo, double direito) {

        if (operador.equals("+")) {
            return esquerdo + direito;
        } else if (operador.equals("-")) {
            return esquerdo - direito;
        } else if (operador.equals("*")) {
            return esquerdo * direito;
        } else if (operador.equals("/")) {
            if (direito == 0) {
                System.out.println("Erro: Não Pode dividir por zero");
                return esquerdo;
            }
            return esquerdo / direito;

        } else {
            return esquerdo;
        }

    }
    
    //Metodos auxiliares
    //Verificar se é um operador
    
    public boolean isOperador(String input){
        if(input==null){
            return false;
        }
        return input.equals("+")||input.equals("-")|| input.equals("*")|| input.equals("/");
    }
    public boolean isOperando(String input){
        if(input==null){
            return false;
        }
        
        try{
            Double.parseDouble(input);
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
    
    //Verificar e retornar a prioridade do operador
    
    private int pri(char op){
        int nPri = 0;
        if(op=='/'||op=='*'){
            nPri=3;
        }
        if(op=='+'||op=='-'){
            nPri=2;
        }
        if(op=='('){
            nPri=1;
        }
        return nPri;
    }

}
