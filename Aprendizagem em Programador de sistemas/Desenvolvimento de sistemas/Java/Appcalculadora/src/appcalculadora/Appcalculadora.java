/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcalculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Appcalculadora {

    public static void main(String[] args) {
        
        
        
        
        
        
        //Declaração de variáveis
        
        String telaString = "";
        
        //Form
        JFrame form_principal = new JFrame();
        form_principal.setSize(400, 600);
        form_principal.setTitle("Calculadora");     //Título janela
        
        form_principal.setLocationRelativeTo(null);   //Centralizando janela a tela

        form_principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        form_principal.setLayout(null);           //Desativando design padrão  
        
        //Cores 
        //Apenas branco
        
        //Input
        JTextField input_prompt = new JTextField();
        input_prompt.setBounds(17, 20, 350, 95);
        input_prompt.setFont(new Font("Arial", Font.BOLD, 18));      //Nova fonte Arial
        input_prompt.setEditable(false);
        input_prompt.setText("");
        input_prompt.setHorizontalAlignment(SwingConstants.RIGHT);
        //Botões
        
        //Botão Limpar "C"
        JButton bt_Limpar = new JButton();
        bt_Limpar.setBounds(27, 145, 70, 50);
        bt_Limpar.setText("C");
        bt_Limpar.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Limpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText("");
            }
        
        }); 
        //Botão deletar último caracter
        JButton bt_Deletar = new JButton();
        bt_Deletar.setBounds(115, 145, 70, 50);
        bt_Deletar.setText("<");
        bt_Deletar.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Deletar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(input_prompt.getText().length()>0){
                   input_prompt.setText(input_prompt.getText().substring(0, input_prompt.getText().length()-1)); 
                }
                
            }
        
        }); 
        //Botão abrir parenteses "("
        JButton bt_Abr_par = new JButton();
        bt_Abr_par.setBounds(195, 145, 70, 50);
        bt_Abr_par.setText("(");
        bt_Abr_par.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Abr_par.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"(");
            }
        
        });
        //Botão Fechar parenteses ")"
        JButton bt_Fhc_par = new JButton();
        bt_Fhc_par.setBounds(275, 145, 70, 50);
        bt_Fhc_par.setText(")");
        bt_Fhc_par.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Fhc_par.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+")");
            }
        
        });
        //Botão que mostra o valor sete 
        JButton bt_Sete = new JButton();
        bt_Sete.setBounds(27, 225, 70, 50);
        bt_Sete.setText("7");
        bt_Sete.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Sete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"7");
            }
        
        }); 
         //Botão que mostra o valor oito 
        JButton bt_Oito = new JButton();
        bt_Oito.setBounds(115, 225, 70, 50);
        bt_Oito.setText("8");
        bt_Oito.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Oito.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"8");
            }
        
        }); 
        //Botão que mostra o valor nove 
        JButton bt_Nove = new JButton();
        bt_Nove.setBounds(195, 225, 70, 50);
        bt_Nove.setText("9");
        bt_Nove.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Nove.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"9");
            }
        
        });
        //Mostra a barra no prompt 
        JButton bt_Barra = new JButton();
        bt_Barra.setBounds(275, 225, 70, 50);
        bt_Barra.setText("/");
        bt_Barra.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Barra.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"/");
            }
        
        });
        //Botão que mostra o valor quatro 
        JButton bt_Quatro = new JButton();
        bt_Quatro.setBounds(27, 305, 70, 50);
        bt_Quatro.setText("4");
        bt_Quatro.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Quatro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"4");
            }
        
        });
        //Botão que mostra o valor cinco 
        JButton bt_Cinco = new JButton();
        bt_Cinco.setBounds(115, 305, 70, 50);
        bt_Cinco.setText("5");
        bt_Cinco.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Cinco.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"5");
            }
        
        });
        //Botão que mostra o valor seis 
        JButton bt_Seis = new JButton();
        bt_Seis.setBounds(195, 305, 70, 50);
        bt_Seis.setText("6");
        bt_Seis.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Seis.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"6");
            }
        
        });
        //Mostra o simbolo do sinal de operação
        JButton bt_X = new JButton();
        bt_X.setBounds(275, 305, 70, 50);
        bt_X.setText("X");
        bt_X.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_X.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"*");
            }
        
        });
        //Botão que mostra o valor um  
        JButton bt_Um = new JButton();
        bt_Um.setBounds(27, 385, 70, 50);
        bt_Um.setText("1");
        bt_Um.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Um.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"1");
            }
        
        }); 
        //Botão que mostra o valor dois 
        JButton bt_Dois = new JButton();
        bt_Dois.setBounds(115, 385, 70, 50);
        bt_Dois.setText("2");
        bt_Dois.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Dois.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"2");
            }
        
        }); 
        //Botão que mostra o valor três 
        JButton bt_Tres = new JButton();
        bt_Tres.setBounds(195, 385, 70, 50);
        bt_Tres.setText("3");
        bt_Tres.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Tres.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"3");
            }
        
        }); 
        //Sinal da operação "-"
        JButton bt_Menos = new JButton();
        bt_Menos.setBounds(275, 385, 70, 50);
        bt_Menos.setText("-");
        bt_Menos.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Menos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"-");
            }
        
        });
        //Número zero "0"
        JButton bt_Zero = new JButton();
        bt_Zero.setBounds(27, 465, 70, 50);
        bt_Zero.setText("0");
        bt_Zero.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Zero.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"0");
            }
        
        });
        //Sinal de ponto "."
        JButton bt_Ponto = new JButton();
        bt_Ponto.setBounds(115, 465, 70, 50);
        bt_Ponto.setText(".");
        bt_Ponto.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Ponto.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+".");
            }
        
        });
        //Botão sinal de igualdade "="
        JButton bt_Igual = new JButton();
        bt_Igual.setBounds(195, 465, 70, 50);
        bt_Igual.setText("=");
        bt_Igual.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Igual.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String exp = input_prompt.getText();
                
                System.out.println(">>>"+exp);
                Calculadora calculo = new Calculadora();
                String resultado = calculo.evalExp(exp);
                input_prompt.setText(resultado);
            }
        
        });
        
        
        //Botão sinal de soma "+"
        JButton bt_Mais = new JButton();
        bt_Mais.setBounds(275, 465, 70, 50);
        bt_Mais.setText("+");
        bt_Mais.setFont(new Font("Arial", Font.BOLD, 20));      //Nova fonte Arial
        
        bt_Mais.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input_prompt.setText(input_prompt.getText()+"+");
            }
        
        });
         
        
        
        //Adicionando ao Form
        form_principal.add(bt_Zero);
        form_principal.add(bt_Ponto);
        form_principal.add(bt_Igual);
        form_principal.add(bt_Mais); 
        form_principal.add(bt_Um);
        form_principal.add(bt_Dois);
        form_principal.add(bt_Tres);
        form_principal.add(bt_Menos);  
        form_principal.add(bt_Quatro);
        form_principal.add(bt_Cinco);
        form_principal.add(bt_Seis);
        form_principal.add(bt_X); 
        form_principal.add(bt_Barra);
        form_principal.add(bt_Nove);
        form_principal.add(bt_Oito);
        form_principal.add(bt_Sete); 
        form_principal.add(bt_Fhc_par);
        form_principal.add(bt_Abr_par);
        form_principal.add(bt_Deletar);
        form_principal.add(bt_Limpar);
        form_principal.add(input_prompt);
        form_principal.setVisible(true);          //Visibilidade verdadeira
    }
    
}
