/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.Window;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Takeshi
 */
public class FrmPerfil extends javax.swing.JFrame {

    /**
     * Creates new form FrmPerfil
     */
    public FrmPerfil() {
        initComponents();
        btnSalvar.setVisible(false);
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
        cardPane = new javax.swing.JPanel();
        perfil = new javax.swing.JPanel();
        fotoPerfil = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtSite = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        btnEditar = new javax.swing.JButton();
        rbtnAdquirir = new javax.swing.JRadioButton();
        rbtnDescartar = new javax.swing.JRadioButton();
        btnHistorico = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtRazaoSocial = new javax.swing.JTextField();
        btnVoltarPerfil = new javax.swing.JLabel();
        btnEditarFoto = new javax.swing.JButton();
        btnExcluirConta = new javax.swing.JButton();
        lblFundoPerfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardPane.setLayout(new java.awt.CardLayout());

        perfil.setBackground(new java.awt.Color(235, 218, 193));
        perfil.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile-user.png"))); // NOI18N
        fotoPerfil.setText("             Upload a photo here");
        fotoPerfil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        perfil.add(fotoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 260, 230));

        jPanel1.setBackground(new java.awt.Color(235, 218, 193));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtEmail.setBackground(new java.awt.Color(235, 218, 193));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setText("empresa@gmail.com");
        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtEmail.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtEmail.setEnabled(false);

        txtSite.setBackground(new java.awt.Color(235, 218, 193));
        txtSite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSite.setText("ifg.edu.com.br");
        txtSite.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "SITE (opicional)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtSite.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtSite.setEnabled(false);
        txtSite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSiteMouseClicked(evt);
            }
        });
        txtSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiteActionPerformed(evt);
            }
        });

        txtTelefone.setBackground(new java.awt.Color(235, 218, 193));
        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefone.setText("(61)-96741123");
        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "TELEFONE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtTelefone.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtTelefone.setEnabled(false);

        txtNomeFantasia.setBackground(new java.awt.Color(235, 218, 193));
        txtNomeFantasia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNomeFantasia.setText("Pipoqiunhas da Bilu");
        txtNomeFantasia.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "NOME DA EMPRESA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtNomeFantasia.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtNomeFantasia.setEnabled(false);

        txtEndereco.setBackground(new java.awt.Color(235, 218, 193));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEndereco.setText("Rua 30, nº11,Bairro Bosque,Formosa-GO");
        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "ENDEREÇO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtEndereco.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtEndereco.setEnabled(false);

        txtCnpj.setBackground(new java.awt.Color(235, 218, 193));
        txtCnpj.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CNPJ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setText("1234567890000");
        txtCnpj.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtCnpj.setEnabled(false);
        txtCnpj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCnpj.setOpaque(true);
        txtCnpj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCnpjMouseClicked(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 153, 0));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEditar.png"))); // NOI18N
        btnEditar.setText("Editar dados");
        btnEditar.setToolTipText("Clique para habilitar a edição");
        btnEditar.setBorder(null);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnAdquirir);
        rbtnAdquirir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnAdquirir.setText("Adquirir resíduos");
        rbtnAdquirir.setEnabled(false);
        rbtnAdquirir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAdquirirActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnDescartar);
        rbtnDescartar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbtnDescartar.setSelected(true);
        rbtnDescartar.setText("Descartar resíduos");
        rbtnDescartar.setEnabled(false);

        btnHistorico.setBackground(new java.awt.Color(255, 153, 0));
        btnHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconApertoDeMao.png"))); // NOI18N
        btnHistorico.setText("Histórico de transações");
        btnHistorico.setToolTipText("Histórico de transações");
        btnHistorico.setBorder(null);
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 153, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSalvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Salvar alterações");
        btnSalvar.setBorder(null);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtRazaoSocial.setBackground(new java.awt.Color(235, 218, 193));
        txtRazaoSocial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtRazaoSocial.setText("Pipoqiunhas da Bilu Distribuidora LTDA");
        txtRazaoSocial.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "RAZÃO SOCIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        txtRazaoSocial.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtRazaoSocial.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnDescartar)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnAdquirir)))
                        .addGap(0, 341, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRazaoSocial)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFantasia)
                            .addComponent(txtCnpj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail))))
                .addGap(31, 31, 31))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtSite, txtTelefone});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnDescartar)
                    .addComponent(rbtnAdquirir))
                .addGap(27, 27, 27)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        perfil.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 780, 540));

        btnVoltarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltarVerde.png"))); // NOI18N
        btnVoltarPerfil.setToolTipText("voltar");
        btnVoltarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarPerfilMouseExited(evt);
            }
        });
        perfil.add(btnVoltarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, 70));

        btnEditarFoto.setText("Editar foto de perfil");
        btnEditarFoto.setToolTipText("Upload de foto de perfil");
        btnEditarFoto.setBorder(null);
        btnEditarFoto.setBorderPainted(false);
        btnEditarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarFotoMouseClicked(evt);
            }
        });
        perfil.add(btnEditarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 140, -1));

        btnExcluirConta.setBackground(new java.awt.Color(255, 204, 255));
        btnExcluirConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluirConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconExcluir.png"))); // NOI18N
        btnExcluirConta.setText("Excluir conta");
        btnExcluirConta.setToolTipText("Excluir conta");
        btnExcluirConta.setBorder(null);
        btnExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirContaActionPerformed(evt);
            }
        });
        perfil.add(btnExcluirConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 660, 200, 50));

        lblFundoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoPerfil.png"))); // NOI18N
        perfil.add(lblFundoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        cardPane.add(perfil, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnAdquirirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAdquirirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAdquirirActionPerformed

    private void btnVoltarPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarPerfilMouseExited
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/voltarVerde.png"));
        btnVoltarPerfil.setIcon(icone);
    }//GEN-LAST:event_btnVoltarPerfilMouseExited

    private void btnVoltarPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarPerfilMouseEntered
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/voltarVerdeSelected.png"));
        btnVoltarPerfil.setIcon(icone);
    }//GEN-LAST:event_btnVoltarPerfilMouseEntered

    private void btnVoltarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarPerfilMouseClicked
        Window.getOwnerlessWindows()[0].setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarPerfilMouseClicked

    private void btnEditarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarFotoMouseClicked
        FrmFileChooser file = new FrmFileChooser();
        file.setVisible(true);
    }//GEN-LAST:event_btnEditarFotoMouseClicked

    private void txtCnpjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCnpjMouseClicked
        JOptionPane.showMessageDialog(this, txtCnpj.getText());
    }//GEN-LAST:event_txtCnpjMouseClicked

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
       FrmHistoricoTransacoes historico = new FrmHistoricoTransacoes();
       historico.setVisible(true);
       historico.setExtendedState(this.getExtendedState());
       this.dispose();
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        txtRazaoSocial.setEnabled(true);
        txtNomeFantasia.setEnabled(true);
        txtCnpj.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtSite.setEnabled(true);
        rbtnDescartar.setEnabled(true);
        rbtnAdquirir.setEnabled(true);
        btnSalvar.setVisible(true);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
     
        txtRazaoSocial.setEnabled(false);
        txtNomeFantasia.setEnabled(false);
        txtCnpj.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSite.setEnabled(false);
        rbtnDescartar.setEnabled(false);
        rbtnAdquirir.setEnabled(false);
        btnSalvar.setVisible(false);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirContaActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir sua conta?");
        
    }//GEN-LAST:event_btnExcluirContaActionPerformed

    private void txtSiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSiteMouseClicked
        try{
            URI link = new URI("https://"+txtSite.getText());
            Desktop.getDesktop().browse(link);
        }catch(IOException | URISyntaxException erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_txtSiteMouseClicked

    private void txtSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSiteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEditarFoto;
    private javax.swing.JButton btnExcluirConta;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel btnVoltarPerfil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel cardPane;
    private javax.swing.JLabel fotoPerfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFundoPerfil;
    private javax.swing.JPanel perfil;
    private javax.swing.JRadioButton rbtnAdquirir;
    private javax.swing.JRadioButton rbtnDescartar;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
