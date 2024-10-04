/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import view.FormMain;
import dao.ProdutoDaoImpl;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author William_c_Pereira
 */
public class FormProduto extends javax.swing.JInternalFrame {

    ProdutoDaoImpl produtoDaoImpl = new ProdutoDaoImpl();

    public static List<Produto> listaProduto;
    public boolean isEditing = false;

    public void tblProduto() {

        listaProduto = produtoDaoImpl.getAllProdutos();

        DefaultTableModel modeloPro = new DefaultTableModel(new Object[]{"Código",
            "Preço",
            "Unidade",
            "Quantidade",
            "Descrição"}, 0);

        for (int i = 0; i < listaProduto.size(); i++) {
            Object linhaPro[] = new Object[]{
                listaProduto.get(i).getCod(),
                listaProduto.get(i).getPreco(),
                listaProduto.get(i).getUnidade(),
                listaProduto.get(i).getQtd(),
                listaProduto.get(i).getDescricao()
            };
            modeloPro.addRow(linhaPro);
        }
        jTbPro.setModel(modeloPro);
        jTbPro.getColumnModel().getColumn(0).setPreferredWidth(100);
        jTbPro.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTbPro.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTbPro.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTbPro.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    public FormProduto() {
        initComponents();
        tblProduto();
        inicilize();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTfQtdPro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnExcPro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNewPro = new javax.swing.JButton();
        jTfCodPro = new javax.swing.JTextField();
        btnEditPro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSavePro = new javax.swing.JButton();
        jTfPrePro = new javax.swing.JTextField();
        btnCanPro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbPro = new javax.swing.JTable();
        jTfUniPro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTfDescPro = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);

        jLabel4.setText("Quantidade:");

        jLabel5.setText("Descrição:");

        btnExcPro.setText("Excluir");
        btnExcPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcProActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        btnNewPro.setText("Novo");
        btnNewPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProActionPerformed(evt);
            }
        });

        btnEditPro.setText("Editar");
        btnEditPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProActionPerformed(evt);
            }
        });

        jLabel2.setText("Preço:");

        btnSavePro.setText("Salvar");
        btnSavePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProActionPerformed(evt);
            }
        });

        btnCanPro.setText("Cancelar");
        btnCanPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanProActionPerformed(evt);
            }
        });

        jLabel3.setText("Unidade:");

        jTbPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Preço", "Unidade", "Quantidade", "Descrição"
            }
        ));
        jTbPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbProMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTbPro);

        jTfDescPro.setColumns(20);
        jTfDescPro.setRows(5);
        jScrollPane1.setViewportView(jTfDescPro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTfQtdPro, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jTfUniPro)
                    .addComponent(jTfPrePro)
                    .addComponent(jTfCodPro)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnNewPro)
                .addGap(70, 70, 70)
                .addComponent(btnEditPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnExcPro)
                .addGap(63, 63, 63)
                .addComponent(btnCanPro)
                .addGap(61, 61, 61)
                .addComponent(btnSavePro)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTfCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfPrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfUniPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfQtdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcPro)
                    .addComponent(btnNewPro)
                    .addComponent(btnEditPro)
                    .addComponent(btnSavePro)
                    .addComponent(btnCanPro))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProActionPerformed
        btnSavePro.setEnabled(true);
        btnNewPro.setEnabled(false);
        btnCanPro.setEnabled(true);
        enableInputs(true);
    }//GEN-LAST:event_btnNewProActionPerformed

    private void btnEditProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProActionPerformed
        enableButtons(false);
        btnSavePro.setEnabled(true);
        btnCanPro.setEnabled(true);
        btnEditPro.setEnabled(false);
        enableInputs(true);
        isEditing = true;
    }//GEN-LAST:event_btnEditProActionPerformed

    private void btnExcProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcProActionPerformed
        int linhaSelecionada = jTbPro.getSelectedRow();
        if (linhaSelecionada != -1) {
            int a = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir?", "Confirmar", JOptionPane.YES_OPTION);

            if (a == JOptionPane.YES_OPTION) {

                int codigo = Integer.parseInt(jTbPro.getValueAt(linhaSelecionada, 0).toString());

                produtoDaoImpl.deleteProduto(codigo);

                enableButtons(false);
                btnNewPro.setEnabled(true);
                enableInputs(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um cliente para excluir.");
        }

        tblProduto();
        inicilize();
    }//GEN-LAST:event_btnExcProActionPerformed

    private void btnCanProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanProActionPerformed
        enableButtons(false);
        btnNewPro.setEnabled(true);
        enableInputs(false);
    }//GEN-LAST:event_btnCanProActionPerformed

    private void btnSaveProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProActionPerformed

        String descricao = jTfDescPro.getText();
        String unidade = jTfUniPro.getText();
        float quantidade = Float.parseFloat(jTfQtdPro.getText());
        float preco = Float.parseFloat(jTfPrePro.getText());

        int a = JOptionPane.showConfirmDialog(null, "Deseja Realmente salvar essas informações?\n\n"
                + "\nDescrição " + descricao
                + "\nUnidade:: " + unidade
                + "\nQuantidade: " + quantidade
                + "\nPreço: R$" + preco,
                "Confirmar", JOptionPane.YES_OPTION);

        if (a == JOptionPane.YES_OPTION && (!descricao.isEmpty() && !unidade.isEmpty() && quantidade >= 0 && preco >= 0)) {

            if (isEditing) {
                int cod = Integer.parseInt(jTfCodPro.getText());
                Produto produto = new Produto(cod, descricao, unidade, quantidade, preco);
                produtoDaoImpl.updateProduto(produto);

                isEditing = false;
            } else {
                Produto produto = new Produto(descricao, unidade, quantidade, preco);
                produtoDaoImpl.addProduto(produto);
            }

            tblProduto();
            inicilize();
        } else if ((descricao.isEmpty() || unidade.isEmpty() || quantidade >= 0 || preco >= 0)) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
        }
    }//GEN-LAST:event_btnSaveProActionPerformed

    private void jTbProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbProMouseClicked
       enableButtons(false);
        btnExcPro.setEnabled(true);
        btnCanPro.setEnabled(true);
        btnEditPro.setEnabled(true);
        enableInputs(false);

        int linhaSelecionada = jTbPro.getSelectedRow();
        jTfCodPro.setText(jTbPro.getValueAt(linhaSelecionada, 0).toString());
        jTfDescPro.setText(jTbPro.getValueAt(linhaSelecionada, 4).toString());
        jTfUniPro.setText(jTbPro.getValueAt(linhaSelecionada, 2).toString());
        jTfQtdPro.setText(jTbPro.getValueAt(linhaSelecionada, 3).toString());
        jTfPrePro.setText(jTbPro.getValueAt(linhaSelecionada, 1).toString());

    }//GEN-LAST:event_jTbProMouseClicked

    public void enableButtons(boolean choose) {
        btnNewPro.setEnabled(choose);
        btnCanPro.setEnabled(choose);
        btnEditPro.setEnabled(choose);
        btnExcPro.setEnabled(choose);
        btnSavePro.setEnabled(choose);
    }

    public void enableInputs(boolean choose) {
        jTfCodPro.setEnabled(false);
        jTfUniPro.setEnabled(choose);
        jTfQtdPro.setEnabled(choose);
        jTfPrePro.setEnabled(choose);
        jTfDescPro.setEnabled(choose);
        if (!choose) {
            jTfCodPro.setText("");
            jTfUniPro.setText("");
            jTfQtdPro.setText("");
            jTfPrePro.setText("");
            jTfDescPro.setText("");
        }
    }

    public void inicilize() {
        enableButtons(false);
        enableInputs(false);
        btnNewPro.setEnabled(true);
        isEditing = false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanPro;
    private javax.swing.JButton btnEditPro;
    private javax.swing.JButton btnExcPro;
    private javax.swing.JButton btnNewPro;
    private javax.swing.JButton btnSavePro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTbPro;
    private javax.swing.JTextField jTfCodPro;
    private javax.swing.JTextArea jTfDescPro;
    private javax.swing.JTextField jTfPrePro;
    private javax.swing.JTextField jTfQtdPro;
    private javax.swing.JTextField jTfUniPro;
    // End of variables declaration//GEN-END:variables
}
