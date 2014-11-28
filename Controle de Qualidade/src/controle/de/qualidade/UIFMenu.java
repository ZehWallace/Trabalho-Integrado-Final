/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle.de.qualidade;

/**
 *
 * @author Bruno
 */
public class UIFMenu extends javax.swing.JFrame {
    private final Funcionario f;

    /**
     * Creates new form FMenu
     * @param f
     */
    public UIFMenu(Funcionario f) {
        initComponents();
        BemVindoPanel.setVisible(true);
        ClientePanel.setVisible(false);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(false);
        FuncionarioPanel.setVisible(false);
        GeralPanel.setVisible(false);
        LimparPanel.setVisible(false);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(false);
        SetorPanel.setVisible(false);
        this.f = f;
        jLabel16.setText(f.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        GeralPanel = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataIni = new javax.swing.text.MaskFormatter("##/##/####");

            jTextField1 = new javax.swing.JFormattedTextField(dataIni);
        }catch(Exception e){
        }
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataFim = new javax.swing.text.MaskFormatter("##/##/####");

            jTextField2 = new javax.swing.JFormattedTextField(dataFim);
        }catch(Exception e){
        }
        jPanel16 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        SetorPanel = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        ClientePanel = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        FuncionarioPanel = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        ProdutoPanel = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        LimparPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        DadosSetoresPanel = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        DadosProdutosPanel = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        SairPanel = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        BemVindoPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Funcionário");
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        GeralPanel.setLayout(new java.awt.GridLayout(5, 0));
        GeralPanel.add(jPanel15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Data:");
        jPanel13.add(jLabel2);

        GeralPanel.add(jPanel13);

        jLabel1.setText("De: ");
        jPanel14.add(jLabel1);

        jTextField1.setColumns(8);
        jPanel14.add(jTextField1);

        jLabel3.setText("Até: ");
        jPanel14.add(jLabel3);

        jTextField2.setColumns(8);
        jPanel14.add(jTextField2);

        GeralPanel.add(jPanel14);
        GeralPanel.add(jPanel16);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton3.setText("Confirmar");
        jPanel21.add(jButton3);

        GeralPanel.add(jPanel21);

        getContentPane().add(GeralPanel);

        SetorPanel.setLayout(new java.awt.GridLayout(5, 0));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Venda");
        jPanel26.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Atendimento");
        jPanel26.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Oficina");
        jPanel26.add(jRadioButton3);

        SetorPanel.add(jPanel26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Data:");
        jPanel18.add(jLabel4);

        SetorPanel.add(jPanel18);

        jLabel5.setText("De: ");
        jPanel19.add(jLabel5);

        jTextField3.setColumns(8);
        jPanel19.add(jTextField3);

        jLabel6.setText("Até: ");
        jPanel19.add(jLabel6);

        jTextField4.setColumns(8);
        jPanel19.add(jTextField4);

        SetorPanel.add(jPanel19);
        SetorPanel.add(jPanel31);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton6.setText("Confirmar");
        jPanel32.add(jButton6);

        SetorPanel.add(jPanel32);

        getContentPane().add(SetorPanel);

        ClientePanel.setLayout(new java.awt.GridLayout(5, 0));
        ClientePanel.add(jPanel17);

        jLabel9.setText("CPF do Cliente:");
        jPanel20.add(jLabel9);

        jTextField6.setColumns(8);
        jPanel20.add(jTextField6);

        ClientePanel.add(jPanel20);
        ClientePanel.add(jPanel5);
        ClientePanel.add(jPanel4);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton2.setText("Confirmar");
        jPanel6.add(jButton2);

        ClientePanel.add(jPanel6);

        getContentPane().add(ClientePanel);

        FuncionarioPanel.setLayout(new java.awt.GridLayout(5, 0));
        FuncionarioPanel.add(jPanel22);

        jLabel10.setText("CPF do Funcionário:");
        jPanel23.add(jLabel10);

        jTextField7.setColumns(8);
        jPanel23.add(jTextField7);

        FuncionarioPanel.add(jPanel23);
        FuncionarioPanel.add(jPanel7);
        FuncionarioPanel.add(jPanel8);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton4.setText("Confirmar");
        jPanel9.add(jButton4);

        FuncionarioPanel.add(jPanel9);

        getContentPane().add(FuncionarioPanel);

        ProdutoPanel.setLayout(new java.awt.GridLayout(5, 0));
        ProdutoPanel.add(jPanel24);

        jLabel11.setText("Cod. Produto");
        jPanel25.add(jLabel11);

        jTextField8.setColumns(20);
        jPanel25.add(jTextField8);

        ProdutoPanel.add(jPanel25);
        ProdutoPanel.add(jPanel10);
        ProdutoPanel.add(jPanel11);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton5.setText("Confirmar");
        jPanel12.add(jButton5);

        ProdutoPanel.add(jPanel12);

        getContentPane().add(ProdutoPanel);

        LimparPanel.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(5, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Data:");
        jPanel33.add(jLabel7);

        jPanel1.add(jPanel33);

        jLabel8.setText("De: ");
        jPanel34.add(jLabel8);

        jTextField5.setColumns(8);
        jPanel34.add(jTextField5);

        jLabel12.setText("Até: ");
        jPanel34.add(jLabel12);

        jTextField9.setColumns(8);
        jPanel34.add(jTextField9);

        jPanel1.add(jPanel34);
        jPanel1.add(jPanel35);
        jPanel1.add(jPanel36);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton7.setText("Confirmar");
        jPanel37.add(jButton7);

        jPanel1.add(jPanel37);

        LimparPanel.add(jPanel1);

        getContentPane().add(LimparPanel);

        DadosSetoresPanel.setLayout(new java.awt.GridLayout(4, 0));
        DadosSetoresPanel.add(jPanel44);

        buttonGroup2.add(jRadioButton7);
        jRadioButton7.setText("Geral");
        jPanel49.add(jRadioButton7);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Venda");
        jPanel49.add(jRadioButton4);

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Atendimento");
        jPanel49.add(jRadioButton5);

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Oficina");
        jPanel49.add(jRadioButton6);

        DadosSetoresPanel.add(jPanel49);
        DadosSetoresPanel.add(jPanel50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Confirmar");
        jPanel51.add(jButton1);

        DadosSetoresPanel.add(jPanel51);

        getContentPane().add(DadosSetoresPanel);

        DadosProdutosPanel.setLayout(new java.awt.GridLayout(5, 0));
        DadosProdutosPanel.add(jPanel39);

        jLabel13.setText("Cod. Produto");
        jPanel40.add(jLabel13);

        jTextField10.setColumns(20);
        jPanel40.add(jTextField10);

        DadosProdutosPanel.add(jPanel40);
        DadosProdutosPanel.add(jPanel41);
        DadosProdutosPanel.add(jPanel42);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton8.setText("Confirmar");
        jPanel43.add(jButton8);

        DadosProdutosPanel.add(jPanel43);

        getContentPane().add(DadosProdutosPanel);

        SairPanel.setLayout(new java.awt.GridLayout(5, 0));
        SairPanel.add(jPanel28);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("Deseja voltar ao menu inicial?");
        jPanel29.add(jLabel14);

        SairPanel.add(jPanel29);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("Confirmar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton9);

        SairPanel.add(jPanel30);

        getContentPane().add(SairPanel);

        BemVindoPanel.setLayout(new java.awt.GridLayout(5, 0));
        BemVindoPanel.add(jPanel2);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Bem Vindo");
        jPanel3.add(jLabel15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("jLabel16");
        jPanel3.add(jLabel16);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("!");
        jPanel3.add(jLabel17);

        BemVindoPanel.add(jPanel3);
        BemVindoPanel.add(jPanel27);
        BemVindoPanel.add(jPanel38);
        BemVindoPanel.add(jPanel45);

        getContentPane().add(BemVindoPanel);

        jMenu6.setText("Histórico");

        jMenu1.setText("Visualizar");

        jMenuItem1.setText("Geral");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Setor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Funcionario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenu6.add(jMenu1);

        jMenuItem8.setText("Limpar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Sumarização");

        jMenuItem6.setText("Setor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuBar1.add(jMenu7);

        jMenu5.setText("Sair");

        jMenuItem9.setText("Logout");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        BemVindoPanel.setVisible(false);
        ClientePanel.setVisible(false);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(false);
        FuncionarioPanel.setVisible(false);
        GeralPanel.setVisible(true);
        LimparPanel.setVisible(false);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(false);
        SetorPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        BemVindoPanel.setVisible(false);
        ClientePanel.setVisible(false);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(false);
        FuncionarioPanel.setVisible(false);
        GeralPanel.setVisible(false);
        LimparPanel.setVisible(false);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(false);
        SetorPanel.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        BemVindoPanel.setVisible(false);
        ClientePanel.setVisible(true);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(false);
        FuncionarioPanel.setVisible(false);
        GeralPanel.setVisible(false);
        LimparPanel.setVisible(false);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(false);
        SetorPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        BemVindoPanel.setVisible(false);
        ClientePanel.setVisible(false);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(false);
        FuncionarioPanel.setVisible(true);
        GeralPanel.setVisible(false);
        LimparPanel.setVisible(false);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(false);
        SetorPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        BemVindoPanel.setVisible(false);
        ClientePanel.setVisible(false);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(true);
        FuncionarioPanel.setVisible(false);
        GeralPanel.setVisible(false);
        LimparPanel.setVisible(false);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(false);
        SetorPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        BemVindoPanel.setVisible(false);
        ClientePanel.setVisible(false);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(false);
        FuncionarioPanel.setVisible(false);
        GeralPanel.setVisible(false);
        LimparPanel.setVisible(true);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(false);
        SetorPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        BemVindoPanel.setVisible(false);
        ClientePanel.setVisible(false);
        DadosProdutosPanel.setVisible(false);
        DadosSetoresPanel.setVisible(false);
        FuncionarioPanel.setVisible(false);
        GeralPanel.setVisible(false);
        LimparPanel.setVisible(false);
        ProdutoPanel.setVisible(false);
        SairPanel.setVisible(true);
        SetorPanel.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new UILogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BemVindoPanel;
    private javax.swing.JPanel ClientePanel;
    private javax.swing.JPanel DadosProdutosPanel;
    private javax.swing.JPanel DadosSetoresPanel;
    private javax.swing.JPanel FuncionarioPanel;
    private javax.swing.JPanel GeralPanel;
    private javax.swing.JPanel LimparPanel;
    private javax.swing.JPanel ProdutoPanel;
    private javax.swing.JPanel SairPanel;
    private javax.swing.JPanel SetorPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}