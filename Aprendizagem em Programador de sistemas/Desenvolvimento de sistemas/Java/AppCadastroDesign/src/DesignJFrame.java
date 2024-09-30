
import java.util.ArrayList;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author william_c_pereira
 */
//William Colasso Pereira
//Data: 30/09/24
public class DesignJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DesignJFrame
     */
    public static ArrayList<Cliente> listaCliente;
    public static ArrayList<Produto> listaProduto;
    public static ArrayList<Fornecedor> listaFornecedor;
    public boolean isEditing = false;

    //Função de manipulação dos dados do cliente
    public void tblCliente() {
        DefaultTableModel modeloCli = new DefaultTableModel(new Object[]{"Código",
            "Nome",
            "Telefone",
            "Email",
            "Endereço"}, 0);

        for (int i = 0; i < listaCliente.size(); i++) {
            Object linhaCli[] = new Object[]{listaCliente.get(i).getCodigo(),
                listaCliente.get(i).getNome(),
                listaCliente.get(i).getFone(),
                listaCliente.get(i).getEmail(),
                listaCliente.get(i).getEndereco()};
            modeloCli.addRow(linhaCli);
        }
        jTbCli.setModel(modeloCli);
        jTbCli.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTbCli.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTbCli.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTbCli.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTbCli.getColumnModel().getColumn(4).setPreferredWidth(80);
    }

    public void tblProduto() {
        DefaultTableModel modeloPro = new DefaultTableModel(new Object[]{"Código",
            "Descrição",
            "Unidade",
            "Quantidade",
            "Preço"}, 0);

        for (int i = 0; i < listaProduto.size(); i++) {
            Object linhaPro[] = new Object[]{listaProduto.get(i).getCod(),
                listaProduto.get(i).getDesc(),
                listaProduto.get(i).getUnidade(),
                listaProduto.get(i).getQtd(),
                listaProduto.get(i).getPreco()};
            modeloPro.addRow(linhaPro);
        }
        jTbPro.setModel(modeloPro);
        jTbPro.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTbPro.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTbPro.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTbPro.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTbPro.getColumnModel().getColumn(4).setPreferredWidth(80);
    }

    public void tblFornecedor() {
        DefaultTableModel modeloFor = new DefaultTableModel(new Object[]{"Código",
            "Nome",
            "Contato",
            "Telefone",
            "Email"}, 0);

        for (int i = 0; i < listaFornecedor.size(); i++) {
            Object linhaFor[] = new Object[]{listaFornecedor.get(i).getCod(),
                listaFornecedor.get(i).getEmpresa(),
                listaFornecedor.get(i).getContato(),
                listaFornecedor.get(i).getFone(),
                listaFornecedor.get(i).getEmail()};
            modeloFor.addRow(linhaFor);
        }
        jTbFor.setModel(modeloFor);
        jTbFor.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTbFor.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTbFor.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTbFor.getColumnModel().getColumn(3).setPreferredWidth(80);
        jTbFor.getColumnModel().getColumn(4).setPreferredWidth(80);
    }

    public static void saveCli() {
        String fileCli = "cliente.db";
        String linhaCli = "";

        for (int i = 0; i < listaCliente.size(); i++) {
            linhaCli += listaCliente.get(i).getCodigo() + ";"
                    + listaCliente.get(i).getNome() + ";"
                    + listaCliente.get(i).getFone() + ";"
                    + listaCliente.get(i).getEmail() + ";"
                    + listaCliente.get(i).getEndereco() + "\n";
        }
        if (Arquivo.write(fileCli, linhaCli)) {
            JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro na gravação do arquivo");
        }
    }

    public static void savePro() {
        String filePro = "produto.db";
        String linhaPro = "";

        for (int i = 0; i < listaProduto.size(); i++) {
            linhaPro += listaProduto.get(i).getCod() + ";"
                    + listaProduto.get(i).getUnidade() + ";"
                    + listaProduto.get(i).getQtd() + ";"
                    + listaProduto.get(i).getPreco() + ";"
                    + listaProduto.get(i).getDesc() + "\n";
        }

        if (Arquivo.write(filePro, linhaPro)) {
            JOptionPane.showMessageDialog(null, "Arquivo gravado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro na gravação do arquivo");
        }
    }

    public static void saveFor() {
        String fileFor = "fornecedor.db";
        String linhaFor = "";

        for (int i = 0; i < listaFornecedor.size(); i++) {
            linhaFor += listaFornecedor.get(i).getCod() + ";"
                    + listaFornecedor.get(i).getEmpresa() + ";"
                    + listaFornecedor.get(i).getContato() + ";"
                    + listaFornecedor.get(i).getFone() + ";"
                    + listaFornecedor.get(i).getEmail() + "\n";
        }
        if (Arquivo.write(fileFor, linhaFor)) {
            JOptionPane.showMessageDialog(null, "Arquivo alterado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro na gravação do arquivo");
        }
    }

    public static void loadCli() {
        String fileCli = "cliente.db";
        String conteudo = Arquivo.read(fileCli);

        if (conteudo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro de leitura do arquivo.");
        } else {
            String[] linhaCli = conteudo.split("\n");
            String[] dadosCli;

            for (int i = 0; i < linhaCli.length; i++) {
                dadosCli = linhaCli[i].split(";");
                Cliente cli = new Cliente();
                cli.setCodigo(Integer.parseInt(dadosCli[0]));
                cli.setNome(dadosCli[1]);
                cli.setFone(dadosCli[2]);
                cli.setEmail(dadosCli[3]);
                cli.setEndereco(dadosCli[4]);
                listaCliente.add(cli);
            }
        }
    }

    public static void loadPro() {
        String filePro = "produto.db";
        String conteudo = Arquivo.read(filePro);

        if (conteudo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro de leitura do arquivo.");
        } else {
            String[] linhaPro = conteudo.split("\n");
            String[] dadosPro;

            for (int i = 0; i < linhaPro.length; i++) {
                dadosPro = linhaPro[i].split(";");
                Produto pro = new Produto();
                pro.setCod(Integer.parseInt(dadosPro[0]));
                pro.setUnidade(dadosPro[1]);
                pro.setQtd(Float.parseFloat(dadosPro[2]));
                pro.setPreco(Float.parseFloat(dadosPro[3]));
                pro.setDesc(dadosPro[4]);
                listaProduto.add(pro);
            }
        }
    }

    public static void loadFor() {
        String fileFor = "fornecedor.db";
        String conteudo = Arquivo.read(fileFor);
        if (conteudo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro de leitura do arquivo.");
        } else {
            String[] linhaFor = conteudo.split("\n");
            String[] dadosFor;

            for (int i = 0; i < linhaFor.length; i++) {
                dadosFor = linhaFor[i].split(";");
                Fornecedor forn = new Fornecedor();

                forn.setCod(Integer.parseInt(dadosFor[0]));
                forn.setEmpresa(dadosFor[1]);
                forn.setContato(dadosFor[2]);
                forn.setFone(dadosFor[3]);
                forn.setEmail(dadosFor[4]);
                listaFornecedor.add(forn);
            }

        }

    }

    public DesignJFrame() {
        listaCliente = new ArrayList<>();
        listaProduto = new ArrayList<>();
        listaFornecedor = new ArrayList<>();
        loadCli();
        loadPro();
        loadFor();
        initComponents();
        tblCliente();
        tblProduto();
        tblFornecedor();
        inicilize();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPCli = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbCli = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTfFoneCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTfNomeCli = new javax.swing.JTextField();
        btnSaveCli = new javax.swing.JButton();
        btnCanCli = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTfEmailCli = new javax.swing.JTextField();
        jTfCodCli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTaEndCli = new javax.swing.JTextArea();
        btnExcCli = new javax.swing.JButton();
        btnEditCli = new javax.swing.JButton();
        btnNewCli = new javax.swing.JButton();
        jPPro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbPro = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTfCodPro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTfQtdPro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTfUniPro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTfPrePro = new javax.swing.JTextField();
        jTfDesPro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnSavePro = new javax.swing.JButton();
        btnCanPro = new javax.swing.JButton();
        btnExcPro = new javax.swing.JButton();
        btnEditPro = new javax.swing.JButton();
        btnNewPro = new javax.swing.JButton();
        jPFor = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTfCodFor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTfFoneFor = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTfContFor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTfEmailFor = new javax.swing.JTextField();
        jTfEmpFor = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        btnNewFor = new javax.swing.JButton();
        btnEditFor = new javax.swing.JButton();
        btnExcFor = new javax.swing.JButton();
        btnCanFor = new javax.swing.JButton();
        btnSaveFor = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTbFor = new javax.swing.JTable();

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Matricula:");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Telefone:");

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Nome:");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Email:");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jButton5.setText("Salvar");

        jButton6.setText("Limpar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matricula", "Nome", "Telefone", "Email"
            }
        ));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCCPF-SISTEMA DE CADASTRO CLIENTE -PRODUTO-FORNECEDOR");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPCliMouseClicked(evt);
            }
        });

        jTbCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTbCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Telefone", "Email", "Endereço"
            }
        ));
        jTbCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbCliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbCli);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Telefone:");

        jTfFoneCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfFoneCliActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jTfNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfNomeCliActionPerformed(evt);
            }
        });

        btnSaveCli.setText("Salvar");
        btnSaveCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCliActionPerformed(evt);
            }
        });

        btnCanCli.setText("Cancelar");
        btnCanCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanCliActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Email:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Código:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Endereço:");

        jTaEndCli.setColumns(20);
        jTaEndCli.setRows(5);
        jScrollPane4.setViewportView(jTaEndCli);

        btnExcCli.setText("Excluir");
        btnExcCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcCliActionPerformed(evt);
            }
        });

        btnEditCli.setText("Editar");
        btnEditCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCliActionPerformed(evt);
            }
        });

        btnNewCli.setText("Novo");
        btnNewCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(jTfCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addComponent(jTfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jTfEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTfFoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCanCli, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(btnSaveCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNewCli)
                        .addGap(20, 20, 20)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnEditCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcCli)
                        .addGap(21, 21, 21)
                        .addComponent(btnCanCli)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveCli)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTfFoneCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfEmailCli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPCliLayout = new javax.swing.GroupLayout(jPCli);
        jPCli.setLayout(jPCliLayout);
        jPCliLayout.setHorizontalGroup(
            jPCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCliLayout.createSequentialGroup()
                .addGroup(jPCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCliLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCliLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPCliLayout.setVerticalGroup(
            jPCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCliLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPCli);

        jPPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTbPro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTbPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Unidade", "Quantidade", "Preço"
            }
        ));
        jTbPro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbProMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTbPro);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Código");

        jTfCodPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfCodProActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Quantidade:");

        jTfQtdPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfQtdProActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Descrição:");

        jTfUniPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfUniProActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Preço:");

        jTfPrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfPreProActionPerformed(evt);
            }
        });

        jTfDesPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfDesProActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Unidade:");

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

        btnExcPro.setText("Excluir");
        btnExcPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcProActionPerformed(evt);
            }
        });

        btnEditPro.setText("Editar");
        btnEditPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProActionPerformed(evt);
            }
        });

        btnNewPro.setText("Novo");
        btnNewPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)
                        .addComponent(jTfCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfUniPro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfQtdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfPrePro))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jTfDesPro, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCanPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSavePro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewPro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnNewPro)
                        .addGap(20, 20, 20)
                        .addComponent(btnEditPro)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcPro)
                        .addGap(21, 21, 21)
                        .addComponent(btnCanPro)
                        .addGap(18, 18, 18)
                        .addComponent(btnSavePro))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTfCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfUniPro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTfQtdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jTfPrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jTfDesPro))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPProLayout = new javax.swing.GroupLayout(jPPro);
        jPPro.setLayout(jPProLayout);
        jPProLayout.setHorizontalGroup(
            jPProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPProLayout.setVerticalGroup(
            jPProLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Produto", jPPro);

        jPFor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPForMouseClicked(evt);
            }
        });
        jPFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPForKeyPressed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Código");

        jTfCodFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfCodForActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Telefone:");

        jTfFoneFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfFoneForActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Empresa:");

        jTfContFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfContForActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("Email:");

        jTfEmailFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfEmailForActionPerformed(evt);
            }
        });

        jTfEmpFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfEmpForActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Contato:");

        btnNewFor.setText("Novo");
        btnNewFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewForActionPerformed(evt);
            }
        });

        btnEditFor.setText("Editar");
        btnEditFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditForActionPerformed(evt);
            }
        });

        btnExcFor.setText("Excluir");
        btnExcFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcForActionPerformed(evt);
            }
        });

        btnCanFor.setText("Cancelar");
        btnCanFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanForActionPerformed(evt);
            }
        });

        btnSaveFor.setText("Salvar");
        btnSaveFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveForActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTfCodFor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfContFor, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTfFoneFor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfEmailFor))
                    .addComponent(jTfEmpFor))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCanFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaveFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewFor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btnNewFor)
                        .addGap(20, 20, 20)
                        .addComponent(btnEditFor)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcFor)
                        .addGap(21, 21, 21)
                        .addComponent(btnCanFor)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveFor))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jTfCodFor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfContFor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jTfFoneFor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(jTfEmailFor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jTfEmpFor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTbFor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTbFor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Contato", "Telefone", "Email"
            }
        ));
        jTbFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbForMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTbFor);

        javax.swing.GroupLayout jPForLayout = new javax.swing.GroupLayout(jPFor);
        jPFor.setLayout(jPForLayout);
        jPForLayout.setHorizontalGroup(
            jPForLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPForLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPForLayout.setVerticalGroup(
            jPForLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPForLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fornecedor", jPFor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void enableButtons(boolean choose) {
        btnNewCli.setEnabled(choose);
        btnCanCli.setEnabled(choose);
        btnEditCli.setEnabled(choose);
        btnExcCli.setEnabled(choose);
        btnSaveCli.setEnabled(choose);

        btnNewPro.setEnabled(choose);
        btnCanPro.setEnabled(choose);
        btnEditPro.setEnabled(choose);
        btnExcPro.setEnabled(choose);
        btnSavePro.setEnabled(choose);

        btnNewFor.setEnabled(choose);
        btnCanFor.setEnabled(choose);
        btnEditFor.setEnabled(choose);
        btnExcFor.setEnabled(choose);
        btnSaveFor.setEnabled(choose);
    }

    public void enableInputs(boolean choose) {
        jTfCodCli.setEnabled(choose);
        jTfCodFor.setEnabled(choose);
        jTfNomeCli.setEnabled(choose);
        jTfFoneCli.setEnabled(choose);
        jTfEmailCli.setEnabled(choose);
        jTaEndCli.setEnabled(choose);

        jTfCodFor.setEnabled(choose);
        jTfEmpFor.setEnabled(choose);
        jTfContFor.setEnabled(choose);
        jTfFoneFor.setEnabled(choose);
        jTfEmailFor.setEnabled(choose);

        jTfCodPro.setEnabled(choose);
        jTfDesPro.setEnabled(choose);
        jTfUniPro.setEnabled(choose);
        jTfQtdPro.setEnabled(choose);
        jTfPrePro.setEnabled(choose);

        if (!choose) {
            jTfCodCli.setText("");
            jTfNomeCli.setText("");
            jTfFoneCli.setText("");
            jTfEmailCli.setText("");
            jTaEndCli.setText("");  // Para o campo de texto de endereço, supondo que seja uma JTextArea

            jTfCodPro.setText("");
            jTfDesPro.setText("");
            jTfUniPro.setText("");
            jTfQtdPro.setText("");
            jTfPrePro.setText("");

            jTfCodFor.setText("");
            jTfEmpFor.setText("");
            jTfContFor.setText("");
            jTfFoneFor.setText("");
            jTfEmailFor.setText("");

        }

    }

    public void inicilize() {
        enableButtons(false);
        enableInputs(false);
        btnNewCli.setEnabled(true);
        btnNewPro.setEnabled(true);
        btnNewFor.setEnabled(true);
        isEditing = false;
    }

    private void jTfFoneCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfFoneCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfFoneCliActionPerformed

    private void jTfNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfNomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfNomeCliActionPerformed

    private void jTfCodProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCodProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCodProActionPerformed

    private void jTfQtdProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfQtdProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfQtdProActionPerformed

    private void jTfUniProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfUniProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfUniProActionPerformed

    private void jTfPreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfPreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfPreProActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTfDesProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfDesProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfDesProActionPerformed

    private void jTfCodForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCodForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCodForActionPerformed

    private void jTfFoneForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfFoneForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfFoneForActionPerformed

    private void jTfContForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfContForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfContForActionPerformed

    private void jTfEmailForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfEmailForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfEmailForActionPerformed

    private void jTfEmpForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfEmpForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfEmpForActionPerformed

    private void btnEditProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProActionPerformed
        enableButtons(false);
        btnSavePro.setEnabled(true);
        btnCanPro.setEnabled(true);
        btnEditPro.setEnabled(false);
        enableInputs(true);
        isEditing = true;
    }//GEN-LAST:event_btnEditProActionPerformed

    private void btnEditForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditForActionPerformed

        enableInputs(true);
        btnCanFor.setEnabled(true);
        btnEditFor.setEnabled(false);
        btnSaveFor.setEnabled(true);
        btnExcFor.setEnabled(false);
        isEditing = true;
    }//GEN-LAST:event_btnEditForActionPerformed

    private void btnSaveCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCliActionPerformed

        int cod = Integer.parseInt(jTfCodCli.getText());
        String nome = jTfNomeCli.getText();
        String telefone = jTfFoneCli.getText();
        String email = jTfEmailCli.getText();
        String endereco = jTaEndCli.getText();

        int a = JOptionPane.showConfirmDialog(null, "Deseja Realmente salvar essas informações?\n\n"
                + "Código: `" + cod
                + "\nNome: " + nome
                + "\nTelefone: " + telefone
                + "\nEmail: " + email
                + "\nEndereço: " + endereco,
                "Confirmar", JOptionPane.YES_OPTION);

        if (a == JOptionPane.YES_OPTION && (!nome.isEmpty() && !telefone.isEmpty() && !email.isEmpty() && !endereco.isEmpty() && cod >= 0)) {
            Cliente cliente = new Cliente(nome, telefone);
            cliente.setCodigo(cod);
            cliente.setFone(telefone);
            cliente.setEmail(email);
            cliente.setEndereco(endereco);
            if (isEditing) {
                int linhaSelecionada = jTbCli.getSelectedRow();
                listaCliente.remove(linhaSelecionada);
                listaCliente.add(linhaSelecionada, cliente);
            } else {
                listaCliente.add(cliente);
            }
            inicilize();
            tblCliente();
            saveCli();

        } else if ((!nome.isEmpty() || !telefone.isEmpty() || !email.isEmpty() || !endereco.isEmpty() || cod >= 0)) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
        }
    }//GEN-LAST:event_btnSaveCliActionPerformed

    private void btnSaveProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProActionPerformed
        int cod = Integer.parseInt(jTfCodPro.getText());
        String descricao = jTfDesPro.getText();
        String unidade = jTfUniPro.getText();
        float quantidade = Float.parseFloat(jTfQtdPro.getText());
        float preco = Float.parseFloat(jTfPrePro.getText());

        int a = JOptionPane.showConfirmDialog(null, "Deseja Realmente salvar essas informações?\n\n"
                + "Código: `" + cod
                + "\nDescrição " + descricao
                + "\nUnidade:: " + unidade
                + "\nQuantidade: " + quantidade
                + "\nPreço: R$" + preco,
                "Confirmar", JOptionPane.YES_OPTION);

        if (a == JOptionPane.YES_OPTION && (!descricao.isEmpty() && !unidade.isEmpty() && quantidade >= 0 && preco >= 0 && cod >= 0)) {
            Produto produto = new Produto(cod, descricao, unidade, quantidade, preco);
            produto.setCod(cod);
            produto.setDesc(descricao);
            produto.setUnidade(unidade);
            produto.setQtd(quantidade);
            produto.setPreco(preco);
            if (isEditing) {
                int linhaSelecionada = jTbPro.getSelectedRow();
                listaProduto.remove(linhaSelecionada);
                listaProduto.add(linhaSelecionada, produto);
                isEditing = false;
            } else {
                listaProduto.add(produto);
            }

            inicilize();
            tblProduto();
            savePro();
        } else if ((!descricao.isEmpty() || !unidade.isEmpty() || quantidade >= 0 || preco >= 0 || cod >= 0)) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
        }

    }//GEN-LAST:event_btnSaveProActionPerformed

    private void btnSaveForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveForActionPerformed
        int cod = Integer.parseInt(jTfCodFor.getText());
        String empresa = jTfEmpFor.getText();
        String contato = jTfContFor.getText();
        String fone = jTfFoneFor.getText();
        String email = jTfEmailFor.getText();

        int a = JOptionPane.showConfirmDialog(null, "Deseja realmente salvar essas informações?\n\n"
                + "Código: " + cod
                + "\nEmpresa: " + empresa
                + "\nContato: " + contato
                + "\nFone: " + fone
                + "\nEmail: " + email,
                "Confirmar", JOptionPane.YES_OPTION);

        if (a == JOptionPane.YES_OPTION && (!empresa.isEmpty() && !contato.isEmpty() && !fone.isEmpty() && !email.isEmpty() && cod >= 0)) {
            Fornecedor fornecedor = new Fornecedor(cod, empresa, contato, fone, email);
            fornecedor.setCod(cod);
            fornecedor.setEmpresa(empresa);
            fornecedor.setContato(contato);
            fornecedor.setFone(fone);
            fornecedor.setEmail(email);

            if (isEditing) {
                int linhaSelecionada = jTbFor.getSelectedRow();
                listaFornecedor.remove(linhaSelecionada);
                listaFornecedor.add(linhaSelecionada, fornecedor);
                isEditing = false;
            } else {
                listaFornecedor.add(fornecedor);
            }
            inicilize();
            tblFornecedor();
            saveFor();
        } else if ((!empresa.isEmpty() || !contato.isEmpty() || !fone.isEmpty() || !email.isEmpty() || cod >= 0)) {
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
        }

    }//GEN-LAST:event_btnSaveForActionPerformed

    private void jTbForMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbForMouseClicked
        int linhaSelecionada = jTbFor.getSelectedRow();
        inicilize();
        jTfCodFor.setText(jTbFor.getValueAt(linhaSelecionada, 0).toString());
        jTfEmpFor.setText(jTbFor.getValueAt(linhaSelecionada, 1).toString());
        jTfContFor.setText(jTbFor.getValueAt(linhaSelecionada, 2).toString());
        jTfFoneFor.setText(jTbFor.getValueAt(linhaSelecionada, 3).toString());
        jTfEmailFor.setText(jTbFor.getValueAt(linhaSelecionada, 4).toString());

        btnNewFor.setEnabled(false);
        btnEditFor.setEnabled(true);
        btnCanFor.setEnabled(true);
        btnExcFor.setEnabled(true);

    }//GEN-LAST:event_jTbForMouseClicked

    private void jTbCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbCliMouseClicked
        btnExcCli.setEnabled(true);
        btnCanCli.setEnabled(true);
        btnNewCli.setEnabled(false);
        btnSaveCli.setEnabled(false);
        btnEditCli.setEnabled(true);
        enableInputs(false);

        int linhaSelecionada = jTbCli.getSelectedRow();
        jTfCodCli.setText(jTbCli.getValueAt(linhaSelecionada, 0).toString());
        jTfNomeCli.setText(jTbCli.getValueAt(linhaSelecionada, 1).toString());
        jTfFoneCli.setText(jTbCli.getValueAt(linhaSelecionada, 2).toString());
        jTfEmailCli.setText(jTbCli.getValueAt(linhaSelecionada, 3).toString());
        jTaEndCli.setText(jTbCli.getValueAt(linhaSelecionada, 4).toString());

    }//GEN-LAST:event_jTbCliMouseClicked

    private void jTbProMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbProMouseClicked
        
        enableButtons(false);
        btnExcPro.setEnabled(true);
        btnCanPro.setEnabled(true);
        btnEditPro.setEnabled(true);
        enableInputs(false);
        
        int linhaSelecionada = jTbPro.getSelectedRow();
        jTfCodPro.setText(jTbPro.getValueAt(linhaSelecionada, 0).toString());
        jTfDesPro.setText(jTbPro.getValueAt(linhaSelecionada, 1).toString());
        jTfUniPro.setText(jTbPro.getValueAt(linhaSelecionada, 2).toString());
        jTfQtdPro.setText(jTbPro.getValueAt(linhaSelecionada, 3).toString());
        jTfPrePro.setText(jTbPro.getValueAt(linhaSelecionada, 4).toString());
        
    }//GEN-LAST:event_jTbProMouseClicked

    private void btnExcCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcCliActionPerformed

        int linhaSelecionada = jTbCli.getSelectedRow();

        int a = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir?", "Confirmar", JOptionPane.YES_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            listaCliente.remove(linhaSelecionada);
            saveCli();
            tblCliente();
            enableButtons(false);
            btnNewCli.setEnabled(true);
            enableInputs(false);
        }
    }//GEN-LAST:event_btnExcCliActionPerformed


    private void btnEditCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCliActionPerformed
        enableButtons(false);
        btnSaveCli.setEnabled(true);
        btnCanCli.setEnabled(true);
        btnEditCli.setEnabled(false);
        enableInputs(true);
        isEditing = true;

    }//GEN-LAST:event_btnEditCliActionPerformed

    private void btnNewCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCliActionPerformed
        btnSaveCli.setEnabled(true);
        btnNewCli.setEnabled(false);
        btnCanCli.setEnabled(true);
        enableInputs(true);
    }//GEN-LAST:event_btnNewCliActionPerformed

    private void btnCanCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanCliActionPerformed
        enableButtons(false);
        btnNewCli.setEnabled(true);
        enableInputs(false);
        isEditing = false;
    }//GEN-LAST:event_btnCanCliActionPerformed

    private void btnNewProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProActionPerformed
        btnSavePro.setEnabled(true);
        btnNewPro.setEnabled(false);
        btnCanPro.setEnabled(true);
        enableInputs(true);
    }//GEN-LAST:event_btnNewProActionPerformed

    private void btnCanProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanProActionPerformed
        enableButtons(false);
        btnNewPro.setEnabled(true);
        enableInputs(false);
    }//GEN-LAST:event_btnCanProActionPerformed

    private void btnExcProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcProActionPerformed
        int linhaSelecionada = jTbPro.getSelectedRow();

        int a = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir?", "Confirmar", JOptionPane.YES_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            listaProduto.remove(linhaSelecionada);
            savePro();
            tblProduto();
            enableButtons(false);
            btnNewPro.setEnabled(true);
            enableInputs(false);
        }
        enableButtons(false);
        btnNewPro.setEnabled(true);
        enableInputs(false);

    }//GEN-LAST:event_btnExcProActionPerformed

    private void jPCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPCliMouseClicked
        inicilize();
    }//GEN-LAST:event_jPCliMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        inicilize();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPForKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPForKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPForKeyPressed

    private void jPForMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPForMouseClicked
        inicilize();
    }//GEN-LAST:event_jPForMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void btnNewForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewForActionPerformed
        enableButtons(false);
        enableInputs(true);
        btnCanFor.setEnabled(true);
        btnSaveFor.setEnabled(true);
        isEditing = false;
    }//GEN-LAST:event_btnNewForActionPerformed

    private void btnCanForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanForActionPerformed
        inicilize();
    }//GEN-LAST:event_btnCanForActionPerformed

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel8MouseClicked

    private void btnExcForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcForActionPerformed
        int linhaSelecionada = jTbFor.getSelectedRow();

        int a = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir?", "Confirmar", JOptionPane.YES_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            listaFornecedor.remove(linhaSelecionada);
            saveFor();
            tblFornecedor();
            enableButtons(false);
            btnNewFor.setEnabled(true);
            enableInputs(false);
        }
        enableButtons(false);
        btnNewFor.setEnabled(true);
        enableInputs(false);
    }//GEN-LAST:event_btnExcForActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesignJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignJFrame().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCanCli;
    private javax.swing.JButton btnCanFor;
    private javax.swing.JButton btnCanPro;
    private javax.swing.JButton btnEditCli;
    private javax.swing.JButton btnEditFor;
    private javax.swing.JButton btnEditPro;
    private javax.swing.JButton btnExcCli;
    private javax.swing.JButton btnExcFor;
    private javax.swing.JButton btnExcPro;
    private javax.swing.JButton btnNewCli;
    private javax.swing.JButton btnNewFor;
    private javax.swing.JButton btnNewPro;
    private javax.swing.JButton btnSaveCli;
    private javax.swing.JButton btnSaveFor;
    private javax.swing.JButton btnSavePro;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPCli;
    private javax.swing.JPanel jPFor;
    private javax.swing.JPanel jPPro;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTaEndCli;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTbCli;
    private javax.swing.JTable jTbFor;
    private javax.swing.JTable jTbPro;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTfCodCli;
    private javax.swing.JTextField jTfCodFor;
    private javax.swing.JTextField jTfCodPro;
    private javax.swing.JTextField jTfContFor;
    private javax.swing.JTextField jTfDesPro;
    private javax.swing.JTextField jTfEmailCli;
    private javax.swing.JTextField jTfEmailFor;
    private javax.swing.JTextField jTfEmpFor;
    private javax.swing.JTextField jTfFoneCli;
    private javax.swing.JTextField jTfFoneFor;
    private javax.swing.JTextField jTfNomeCli;
    private javax.swing.JTextField jTfPrePro;
    private javax.swing.JTextField jTfQtdPro;
    private javax.swing.JTextField jTfUniPro;
    // End of variables declaration//GEN-END:variables
}
