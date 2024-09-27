
package appcodeform;

import javax.swing.*;

/**
 *
 * @author William Colasso
 */
public class AppCodeForm extends JFrame {

    public AppCodeForm(){
        setTitle("Aplicativo Exemplo de Formulaário");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }
    
    
   
    public static void main(String[] args) {
        AppCodeForm form = new AppCodeForm();
        form.setVisible(true);
        
        JLabel labelNome = new JLabel("Nome do Aluno");
        labelNome.setBounds(100, 50, 100, 30);
      
        
        JTextField textNome = new JTextField();
        textNome.setBounds(100, 90, 200, 30);
        
        form.add(labelNome);
        form.add(textNome);
    }
    
}
