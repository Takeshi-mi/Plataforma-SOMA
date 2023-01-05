/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ImageIcon;

/**
 *
 * @author Takeshi
 */
public class FrmTransacao extends javax.swing.JFrame {

    /**
     * Creates new form FrmMovimentacao
     */
    public FrmTransacao() {
        initComponents();
        this.setLocationRelativeTo(null);  // Tk Para surgir no centro da tela
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
        painelDeCima = new javax.swing.JPanel();
        btnVoltarTransacao = new javax.swing.JLabel();
        lblLocalizacao = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtLocalizacao = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        jScrollTabela = new javax.swing.JScrollPane();
        tblDescartarResíduos = new javax.swing.JTable();
        txtFormatedQtd = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmpresaNome = new javax.swing.JTextField();
        lblSite = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblSiteAzul = new javax.swing.JLabel();
        lblEmailAdress = new javax.swing.JLabel();
        lblKg = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblDistancia = new javax.swing.JLabel();
        lblTransporte = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        painelDeCima.setBackground(new java.awt.Color(255, 255, 255));
        painelDeCima.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelDeCima.setPreferredSize(new java.awt.Dimension(1366, 768));

        btnVoltarTransacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltarVerde.png"))); // NOI18N
        btnVoltarTransacao.setToolTipText("voltar");
        btnVoltarTransacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarTransacaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarTransacaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarTransacaoMouseExited(evt);
            }
        });

        lblLocalizacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLocalizacao.setText("LOCALIZAÇÃO");

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuantidade.setText("QUANTIDADE:");

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAPEL", "PLÁSTICO", "METAL", "VIDRO" }));

        txtLocalizacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLocalizacao.setText("Rua x, Formosa - GO");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setText("TIPO DE RESÍDUO");

        tblDescartarResíduos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "Rua 40, avenida tal, n13FormosaGO", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Tipo", "Capacidade", "Localização", "Preço/kg"
            }
        ));
        jScrollTabela.setViewportView(tblDescartarResíduos);
        if (tblDescartarResíduos.getColumnModel().getColumnCount() > 0) {
            tblDescartarResíduos.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblDescartarResíduos.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        txtFormatedQtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 780));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 157));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("EMPRESA");

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefone.setText("TELEFONE");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("E-MAIL");

        txtEmpresaNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpresaNome.setText("SJS Plastic");

        lblSite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSite.setText("SITE");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblSiteAzul.setForeground(new java.awt.Color(0, 102, 255));
        lblSiteAzul.setText("empresa.com.br");

        lblEmailAdress.setText("empresa@gmail.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSite)
                    .addComponent(lblEmail)
                    .addComponent(lblTelefone)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpresaNome)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSiteAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmailAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmpresaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblEmailAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSite)
                    .addComponent(lblSiteAzul))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lblKg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKg.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblKg.setText("kg");
        lblKg.setBorder(null);

        lblDistancia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDistancia.setText("DISTÂNCIA");

        lblTransporte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTransporte.setText("TRANSPORTE");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotal.setText("TOTAL");

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor.setText("VALOR");

        jTextField4.setForeground(new java.awt.Color(0, 102, 0));
        jTextField4.setText("R$500,00");

        jTextField5.setForeground(new java.awt.Color(0, 102, 0));
        jTextField5.setText("R$400,00");

        jTextField6.setForeground(new java.awt.Color(153, 0, 0));
        jTextField6.setText("-R$100,00");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setText("100 km");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal)
                    .addComponent(lblTransporte)
                    .addComponent(lblDistancia)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistancia)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransporte)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        btnPesquisar.setBackground(new java.awt.Color(255, 102, 0));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CONFIRMAR");

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("PAPEL");

        jToggleButton2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("METAL");

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("VIDRO");

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("PLASTICO");

        javax.swing.GroupLayout painelDeCimaLayout = new javax.swing.GroupLayout(painelDeCima);
        painelDeCima.setLayout(painelDeCimaLayout);
        painelDeCimaLayout.setHorizontalGroup(
            painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeCimaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDeCimaLayout.createSequentialGroup()
                        .addComponent(btnVoltarTransacao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelDeCimaLayout.createSequentialGroup()
                        .addComponent(jScrollTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 1343, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(painelDeCimaLayout.createSequentialGroup()
                        .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelDeCimaLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelDeCimaLayout.createSequentialGroup()
                                .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelDeCimaLayout.createSequentialGroup()
                                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jToggleButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jToggleButton4))
                                    .addGroup(painelDeCimaLayout.createSequentialGroup()
                                        .addComponent(txtFormatedQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblKg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelDeCimaLayout.setVerticalGroup(
            painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDeCimaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarTransacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocalizacao)
                    .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtFormatedQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelDeCimaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDeCima, javax.swing.GroupLayout.DEFAULT_SIZE, 1419, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDeCima, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnVoltarTransacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarTransacaoMouseClicked
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        menu.setExtendedState(this.getExtendedState());

        dispose();
    }//GEN-LAST:event_btnVoltarTransacaoMouseClicked

    private void btnVoltarTransacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarTransacaoMouseEntered
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/voltarVerdeSelected.png"));
        btnVoltarTransacao.setIcon(icone);
    }//GEN-LAST:event_btnVoltarTransacaoMouseEntered

    private void btnVoltarTransacaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarTransacaoMouseExited
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/voltarVerde.png"));
        btnVoltarTransacao.setIcon(icone);
    }//GEN-LAST:event_btnVoltarTransacaoMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTransacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel btnVoltarTransacao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollTabela;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailAdress;
    private javax.swing.JTextField lblKg;
    private javax.swing.JLabel lblLocalizacao;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblSite;
    private javax.swing.JLabel lblSiteAzul;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTransporte;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painelDeCima;
    private javax.swing.JTable tblDescartarResíduos;
    private javax.swing.JTextField txtEmpresaNome;
    private javax.swing.JFormattedTextField txtFormatedQtd;
    private javax.swing.JTextField txtLocalizacao;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
