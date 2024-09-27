
package appexecform;

import javax.swing.*;

/**
 *
 * @author William Colasso
 */
public class AppExecForm extends JFrame{

    public AppExecForm() {
        setTitle("Exercicio de Formulaário Codando");
        setSize(400,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        AppExecForm form = new AppExecForm();
        
        
        
        JLabel labelEmpresa = new JLabel("Empresa tal");
        JButton empresaBotao = new JButton("Gerar Pedido");
        labelEmpresa.setBounds(30, 20, 100, 30);
        empresaBotao.setBounds(225, 20, 125, 30);
        
        
        JLabel labelFormServico = new JLabel("Formulario de serviços");
         JButton FormServicoBotao = new JButton("Limpar Pedido");
        labelFormServico.setBounds(30, 60, 200, 30);
        FormServicoBotao.setBounds(225, 60, 125, 30);
        
        JLabel labelOrdem = new JLabel("Ordem de serviço");
        
        String[] items = {"Item 1", "Item 2", "Item 3"};
        
        JComboBox<String> combo = new JComboBox<>(items);
        
        
        
        
        labelOrdem.setBounds(30, 100, 200, 30);
        combo.setBounds(225, 100, 125, 30);
        JLabel labelQuantidade = new JLabel("Quantidade");
        JTextField textQuantidade = new JTextField();
        labelQuantidade.setBounds(30, 140, 200, 30);
        textQuantidade.setBounds(30, 165, 35, 30);
        
        
        JLabel labelServico = new JLabel("Serviço");
        JTextField textServico = new JTextField();
        labelServico.setBounds(127, 140, 200, 30);
        textServico.setBounds(127, 165, 35, 30);
        
        
        JLabel labelDescricao = new JLabel("Descrição");
        JTextField textDescricao = new JTextField();
        labelDescricao.setBounds(197, 140, 200, 30);
        textDescricao.setBounds(197, 165, 35, 30);
        
        JLabel labelValor = new JLabel("Valor");
        JTextField textValor = new JTextField();
        labelValor.setBounds(281, 140, 200, 30);
        textValor.setBounds(281, 165, 35, 30);
        
        
        
        
        form.add(labelEmpresa);
        form.add(empresaBotao);
        form.add(labelFormServico);
        form.add(FormServicoBotao);
        form.add(labelOrdem);
        form.add(combo);
        form.add(labelQuantidade);
        form.add(textQuantidade);
        form.add(labelServico);
        form.add(textServico);
        form.add(labelDescricao);
        form.add(textDescricao);
        form.add(labelValor);
        form.add(textValor);
        
        form.setVisible(true);
    }
    
}
