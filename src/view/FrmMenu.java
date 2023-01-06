/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.Frame;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Takeshi
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu1
     */
    public FrmMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDesktopMain = new javax.swing.JDesktopPane();
        mainLayeredPane = new javax.swing.JLayeredPane();
        btn3Pontos = new javax.swing.JButton();
        UserIcon = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        jPanelBarraVerde = new javax.swing.JPanel();
        btnProcurarEmpresas = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnQuemSomos = new javax.swing.JButton();
        cardPane = new javax.swing.JPanel();
        homePane = new javax.swing.JLayeredPane();
        vamosTornar = new javax.swing.JLabel();
        mundoMelhor = new javax.swing.JLabel();
        logoSoma = new javax.swing.JLabel();
        btnSaibaMais = new javax.swing.JButton();
        quemSomosPaneScroll = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        quemSomosScroll = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        saiba = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        quemSomosScroll1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOMA");
        setLocationByPlatform(true);

        mainLayeredPane.setBackground(new java.awt.Color(242, 242, 242));
        mainLayeredPane.setBorder(new javax.swing.border.MatteBorder(null));
        mainLayeredPane.setPreferredSize(new java.awt.Dimension(1366, 768));
        mainLayeredPane.setRequestFocusEnabled(false);
        mainLayeredPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn3Pontos.setForeground(new java.awt.Color(255, 255, 255));
        btn3Pontos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuIcon.png"))); // NOI18N
        btn3Pontos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn3Pontos.setContentAreaFilled(false);
        btn3Pontos.setDisabledIcon(null);
        btn3Pontos.setFocusCycleRoot(true);
        btn3Pontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3PontosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3PontosMouseExited(evt);
            }
        });
        btn3Pontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3PontosActionPerformed(evt);
            }
        });
        mainLayeredPane.add(btn3Pontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, 53));

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile-user 64px.png"))); // NOI18N
        UserIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserIconMouseClicked(evt);
            }
        });
        mainLayeredPane.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 47, -1, -1));

        nomeUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeUsuario.setText("Olá, Nome do Usuário");
        nomeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeUsuarioMouseClicked(evt);
            }
        });
        mainLayeredPane.add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1058, 44, 192, 67));

        jPanelBarraVerde.setBackground(new java.awt.Color(7, 99, 36));
        jPanelBarraVerde.setForeground(new java.awt.Color(7, 99, 36));

        btnProcurarEmpresas.setBackground(new java.awt.Color(0, 102, 0));
        btnProcurarEmpresas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnProcurarEmpresas.setForeground(new java.awt.Color(255, 255, 255));
        btnProcurarEmpresas.setText("PROCURAR EMPRESAS");
        btnProcurarEmpresas.setBorder(null);
        btnProcurarEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarEmpresasActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(0, 102, 0));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.setBorder(null);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnQuemSomos.setBackground(new java.awt.Color(0, 102, 0));
        btnQuemSomos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnQuemSomos.setForeground(new java.awt.Color(255, 255, 255));
        btnQuemSomos.setText("QUEM SOMOS");
        btnQuemSomos.setBorder(null);
        btnQuemSomos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuemSomosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBarraVerdeLayout = new javax.swing.GroupLayout(jPanelBarraVerde);
        jPanelBarraVerde.setLayout(jPanelBarraVerdeLayout);
        jPanelBarraVerdeLayout.setHorizontalGroup(
            jPanelBarraVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraVerdeLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(btnProcurarEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnQuemSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanelBarraVerdeLayout.setVerticalGroup(
            jPanelBarraVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBarraVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnQuemSomos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProcurarEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelBarraVerdeLayout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainLayeredPane.add(jPanelBarraVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 142, 1364, 50));

        cardPane.setBackground(new java.awt.Color(255, 255, 255));
        cardPane.setBorder(new javax.swing.border.MatteBorder(null));
        cardPane.setLayout(new java.awt.CardLayout());

        homePane.setBackground(new java.awt.Color(255, 255, 255));
        homePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vamosTornar.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        vamosTornar.setForeground(new java.awt.Color(7, 99, 36));
        vamosTornar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vamosTornar.setText("VAMOS TORNAR O\n");
        vamosTornar.setToolTipText("");
        homePane.add(vamosTornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 112, -1, 65));

        mundoMelhor.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        mundoMelhor.setForeground(new java.awt.Color(7, 99, 36));
        mundoMelhor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundoMelhor.setText("MUNDO MELHOR?");
        mundoMelhor.setToolTipText("");
        homePane.add(mundoMelhor, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 183, 392, -1));

        logoSoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo verde.png"))); // NOI18N
        homePane.add(logoSoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 52, -1, 317));

        btnSaibaMais.setBackground(new java.awt.Color(7, 99, 36));
        btnSaibaMais.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnSaibaMais.setForeground(new java.awt.Color(255, 255, 255));
        btnSaibaMais.setText("SAIBA MAIS");
        btnSaibaMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaibaMaisActionPerformed(evt);
            }
        });
        homePane.add(btnSaibaMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 253, 237, 57));

        cardPane.add(homePane, "home");

        jScrollPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("na busca por empresas homologadas próximas.");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("de resíduos inorgânicos, otimizando processos internos e economizando tempo");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setText("transporte.  Essas características convergem para a missão de auxiliar na gestão");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setText("a cadeia  de fornecedores e  compradores, controle  de  produção e  rastreio  de ");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setText("reciclagem. Tem como campo de atuação o descarte sustentável, incluindo toda");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setText("resíduos inorgânicos com empresas interessadas em adquirir tais resíduos para");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setText("A plataforma tem como objetivo conectar indivíduos e/ou indústrias que geram");

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        jLabel17.setText("QUEM SOMOS?");

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instagramIcon.png"))); // NOI18N
        jButton1.setToolTipText("Visite nossa página do instagram");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout quemSomosScrollLayout = new javax.swing.GroupLayout(quemSomosScroll);
        quemSomosScroll.setLayout(quemSomosScrollLayout);
        quemSomosScrollLayout.setHorizontalGroup(
            quemSomosScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosScrollLayout.createSequentialGroup()
                .addGroup(quemSomosScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quemSomosScrollLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(quemSomosScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jButton1)))
                    .addGroup(quemSomosScrollLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel17)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        quemSomosScrollLayout.setVerticalGroup(
            quemSomosScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosScrollLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel17)
                .addGap(52, 52, 52)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(62, 62, 62))
        );

        jScrollPane1.setViewportView(quemSomosScroll);

        javax.swing.GroupLayout quemSomosPaneScrollLayout = new javax.swing.GroupLayout(quemSomosPaneScroll);
        quemSomosPaneScroll.setLayout(quemSomosPaneScrollLayout);
        quemSomosPaneScrollLayout.setHorizontalGroup(
            quemSomosPaneScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosPaneScrollLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 702, Short.MAX_VALUE))
        );
        quemSomosPaneScrollLayout.setVerticalGroup(
            quemSomosPaneScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosPaneScrollLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4647, Short.MAX_VALUE))
        );

        cardPane.add(quemSomosPaneScroll, "quemSomos");

        jScrollPane3.setBorder(new javax.swing.border.MatteBorder(null));

        quemSomosScroll1.setAutoscrolls(true);

        jButton2.setBackground(new java.awt.Color(242, 242, 242));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instagramIcon.png"))); // NOI18N
        jButton2.setToolTipText("Visite nossa página do instagram");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saibaMaisPage1.png"))); // NOI18N
        jLabel19.setText("na busca por empresas homologadas próximas.");

        javax.swing.GroupLayout quemSomosScroll1Layout = new javax.swing.GroupLayout(quemSomosScroll1);
        quemSomosScroll1.setLayout(quemSomosScroll1Layout);
        quemSomosScroll1Layout.setHorizontalGroup(
            quemSomosScroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosScroll1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(quemSomosScroll1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quemSomosScroll1Layout.setVerticalGroup(
            quemSomosScroll1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosScroll1Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 2952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(0, 56, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(quemSomosScroll1);

        javax.swing.GroupLayout saibaLayout = new javax.swing.GroupLayout(saiba);
        saiba.setLayout(saibaLayout);
        saibaLayout.setHorizontalGroup(
            saibaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saibaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 805, Short.MAX_VALUE))
        );
        saibaLayout.setVerticalGroup(
            saibaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saibaLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4651, Short.MAX_VALUE))
        );

        cardPane.add(saiba, "saibaMais");

        mainLayeredPane.add(cardPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 216, -1, -1));

        painelDesktopMain.setLayer(mainLayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelDesktopMainLayout = new javax.swing.GroupLayout(painelDesktopMain);
        painelDesktopMain.setLayout(painelDesktopMainLayout);
        painelDesktopMainLayout.setHorizontalGroup(
            painelDesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        painelDesktopMainLayout.setVerticalGroup(
            painelDesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktopMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktopMain)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarEmpresasActionPerformed
        FrmTransacao descartar = new FrmTransacao();
        descartar.setVisible(true);
        descartar.setExtendedState(this.getExtendedState());
        dispose();
    }//GEN-LAST:event_btnProcurarEmpresasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        CardLayout cl = (CardLayout) cardPane.getLayout();;
        cl.show(cardPane, "home");
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btn3PontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3PontosActionPerformed
        InFrmMais mais = new InFrmMais();
        painelDesktopMain.add(mais);
        mais.setSize(400, getHeight());
        try {
            mais.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn3PontosActionPerformed

    private void btn3PontosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3PontosMouseEntered
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/menuIconSelected.png"));
        btn3Pontos.setIcon(icone);
    }//GEN-LAST:event_btn3PontosMouseEntered

    private void btn3PontosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3PontosMouseExited
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/menuIcon.png"));
        btn3Pontos.setIcon(icone);
    }//GEN-LAST:event_btn3PontosMouseExited

    private void btnSaibaMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaibaMaisActionPerformed
        CardLayout cl = (CardLayout) cardPane.getLayout();;
        cl.show(cardPane, "saibaMais");
    }//GEN-LAST:event_btnSaibaMaisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            URI link = new URI("https://www.instagram.com/somabrampssol/");
            Desktop.getDesktop().browse(link);
        }catch(IOException | URISyntaxException erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UserIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserIconMouseClicked
        this.dispose();
        FrmPerfil perfil = new FrmPerfil();
        perfil.setVisible(true);
    }//GEN-LAST:event_UserIconMouseClicked

    private void nomeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeUsuarioMouseClicked
        this.dispose();
        FrmPerfil perfil = new FrmPerfil();
        perfil.setVisible(true);
    }//GEN-LAST:event_nomeUsuarioMouseClicked

    private void btnQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuemSomosActionPerformed
        CardLayout cl = (CardLayout) cardPane.getLayout();;
        cl.show(cardPane, "quemSomos");
    }//GEN-LAST:event_btnQuemSomosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserIcon;
    private javax.swing.JButton btn3Pontos;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProcurarEmpresas;
    private javax.swing.JButton btnQuemSomos;
    private javax.swing.JButton btnSaibaMais;
    private javax.swing.JPanel cardPane;
    private javax.swing.JLayeredPane homePane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanelBarraVerde;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel logoSoma;
    private javax.swing.JLayeredPane mainLayeredPane;
    private javax.swing.JLabel mundoMelhor;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JDesktopPane painelDesktopMain;
    private javax.swing.JPanel quemSomosPaneScroll;
    private javax.swing.JPanel quemSomosScroll;
    private javax.swing.JPanel quemSomosScroll1;
    private javax.swing.JPanel saiba;
    private javax.swing.JLabel vamosTornar;
    // End of variables declaration//GEN-END:variables
}
