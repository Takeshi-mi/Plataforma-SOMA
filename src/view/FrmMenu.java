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
import javax.swing.JFrame;

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

        jScrollBar1 = new javax.swing.JScrollBar();
        painelDesktopMain = new javax.swing.JDesktopPane();
        mainPane = new javax.swing.JPanel();
        btn3Pontos = new javax.swing.JButton();
        UserIcon = new javax.swing.JLabel();
        nomeUsuario = new javax.swing.JLabel();
        jPanelBarraVerde = new javax.swing.JPanel();
        btnProcurarEmpresas = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnQuemSomos = new javax.swing.JButton();
        cardPane = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        vamosTornar1 = new javax.swing.JLabel();
        mundoMelhor1 = new javax.swing.JLabel();
        logoSoma1 = new javax.swing.JLabel();
        btnSaibaMais1 = new javax.swing.JButton();
        quemSomos = new javax.swing.JPanel();
        scpaneQuemSomos = new javax.swing.JScrollPane();
        quemSomosEnclosePane = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        saibaMais = new javax.swing.JPanel();
        scpaneSaibaMais = new javax.swing.JScrollPane();
        saibaMaisEnclosePane = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        jScrollBar1.setMaximum(3000);
        jScrollBar1.setUnitIncrement(50);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOMA");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1366, 750));
        setResizable(false);

        mainPane.setPreferredSize(new java.awt.Dimension(1366, 750));
        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        mainPane.add(btn3Pontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, -1, 53));

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile-user 64px.png"))); // NOI18N
        UserIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserIconMouseClicked(evt);
            }
        });
        mainPane.add(UserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 47, -1, -1));

        nomeUsuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeUsuario.setText("Olá, Nome do Usuário");
        nomeUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeUsuarioMouseClicked(evt);
            }
        });
        mainPane.add(nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1058, 44, 192, 67));

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

        mainPane.add(jPanelBarraVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 142, 1364, 50));

        cardPane.setBackground(new java.awt.Color(255, 255, 255));
        cardPane.setBorder(new javax.swing.border.MatteBorder(null));
        cardPane.setPreferredSize(new java.awt.Dimension(1366, 530));
        cardPane.setLayout(new java.awt.CardLayout());

        home.setPreferredSize(new java.awt.Dimension(1366, 530));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vamosTornar1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        vamosTornar1.setForeground(new java.awt.Color(7, 99, 36));
        vamosTornar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vamosTornar1.setText("VAMOS TORNAR O\n");
        vamosTornar1.setToolTipText("");
        home.add(vamosTornar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 112, -1, 65));

        mundoMelhor1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        mundoMelhor1.setForeground(new java.awt.Color(7, 99, 36));
        mundoMelhor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mundoMelhor1.setText("MUNDO MELHOR?");
        mundoMelhor1.setToolTipText("");
        home.add(mundoMelhor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(871, 183, 392, -1));

        logoSoma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo verde.png"))); // NOI18N
        home.add(logoSoma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 52, -1, 317));

        btnSaibaMais1.setBackground(new java.awt.Color(7, 99, 36));
        btnSaibaMais1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnSaibaMais1.setForeground(new java.awt.Color(255, 255, 255));
        btnSaibaMais1.setText("SAIBA MAIS");
        btnSaibaMais1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaibaMais1ActionPerformed(evt);
            }
        });
        home.add(btnSaibaMais1, new org.netbeans.lib.awtextra.AbsoluteConstraints(943, 253, 237, 57));

        cardPane.add(home, "home");

        quemSomos.setPreferredSize(new java.awt.Dimension(1366, 530));

        scpaneQuemSomos.setBorder(new javax.swing.border.MatteBorder(null));
        scpaneQuemSomos.setVerticalScrollBar(jScrollBar1);

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

        javax.swing.GroupLayout quemSomosEnclosePaneLayout = new javax.swing.GroupLayout(quemSomosEnclosePane);
        quemSomosEnclosePane.setLayout(quemSomosEnclosePaneLayout);
        quemSomosEnclosePaneLayout.setHorizontalGroup(
            quemSomosEnclosePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosEnclosePaneLayout.createSequentialGroup()
                .addGroup(quemSomosEnclosePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(quemSomosEnclosePaneLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(quemSomosEnclosePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jButton1)))
                    .addGroup(quemSomosEnclosePaneLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel17)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        quemSomosEnclosePaneLayout.setVerticalGroup(
            quemSomosEnclosePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosEnclosePaneLayout.createSequentialGroup()
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

        scpaneQuemSomos.setViewportView(quemSomosEnclosePane);

        javax.swing.GroupLayout quemSomosLayout = new javax.swing.GroupLayout(quemSomos);
        quemSomos.setLayout(quemSomosLayout);
        quemSomosLayout.setHorizontalGroup(
            quemSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosLayout.createSequentialGroup()
                .addComponent(scpaneQuemSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        quemSomosLayout.setVerticalGroup(
            quemSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quemSomosLayout.createSequentialGroup()
                .addComponent(scpaneQuemSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cardPane.add(quemSomos, "quemSomos");

        saibaMais.setPreferredSize(new java.awt.Dimension(1366, 530));

        scpaneSaibaMais.setBorder(new javax.swing.border.MatteBorder(null));
        scpaneSaibaMais.setRowHeaderView(null);
        scpaneSaibaMais.setVerticalScrollBar(jScrollBar1);

        saibaMaisEnclosePane.setAutoscrolls(true);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/saibaMaisPage1.png"))); // NOI18N
        jLabel19.setText("na busca por empresas homologadas próximas.");

        javax.swing.GroupLayout saibaMaisEnclosePaneLayout = new javax.swing.GroupLayout(saibaMaisEnclosePane);
        saibaMaisEnclosePane.setLayout(saibaMaisEnclosePaneLayout);
        saibaMaisEnclosePaneLayout.setHorizontalGroup(
            saibaMaisEnclosePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saibaMaisEnclosePaneLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        saibaMaisEnclosePaneLayout.setVerticalGroup(
            saibaMaisEnclosePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saibaMaisEnclosePaneLayout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 2952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        scpaneSaibaMais.setViewportView(saibaMaisEnclosePane);

        javax.swing.GroupLayout saibaMaisLayout = new javax.swing.GroupLayout(saibaMais);
        saibaMais.setLayout(saibaMaisLayout);
        saibaMaisLayout.setHorizontalGroup(
            saibaMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saibaMaisLayout.createSequentialGroup()
                .addComponent(scpaneSaibaMais, javax.swing.GroupLayout.PREFERRED_SIZE, 1361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        saibaMaisLayout.setVerticalGroup(
            saibaMaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saibaMaisLayout.createSequentialGroup()
                .addComponent(scpaneSaibaMais, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cardPane.add(saibaMais, "saibaMais");

        mainPane.add(cardPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 216, -1, -1));

        painelDesktopMain.setLayer(mainPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelDesktopMainLayout = new javax.swing.GroupLayout(painelDesktopMain);
        painelDesktopMain.setLayout(painelDesktopMainLayout);
        painelDesktopMainLayout.setHorizontalGroup(
            painelDesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelDesktopMainLayout.setVerticalGroup(
            painelDesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelDesktopMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.dispose();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            URI link = new URI("https://www.instagram.com/somabrampssol/");
            Desktop.getDesktop().browse(link);
        }catch(IOException | URISyntaxException erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UserIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserIconMouseClicked
        FrmPerfil perfil = new FrmPerfil();
        perfil.setVisible(true);
        perfil.setExtendedState(this.getExtendedState());
        this.dispose();
    }//GEN-LAST:event_UserIconMouseClicked

    private void nomeUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeUsuarioMouseClicked
        FrmPerfil perfil = new FrmPerfil();
        perfil.setVisible(true);
        perfil.setExtendedState(this.getExtendedState());
        this.dispose();
    }//GEN-LAST:event_nomeUsuarioMouseClicked

    private void btnQuemSomosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuemSomosActionPerformed
        CardLayout cl = (CardLayout) cardPane.getLayout();;
        cl.show(cardPane, "quemSomos");
    }//GEN-LAST:event_btnQuemSomosActionPerformed

    private void btnSaibaMais1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaibaMais1ActionPerformed
        CardLayout cl = (CardLayout) cardPane.getLayout();;
        cl.show(cardPane, "saibaMais");
    }//GEN-LAST:event_btnSaibaMais1ActionPerformed

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
    private javax.swing.JButton btnSaibaMais1;
    private javax.swing.JPanel cardPane;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel logoSoma1;
    private javax.swing.JPanel mainPane;
    private javax.swing.JLabel mundoMelhor1;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JDesktopPane painelDesktopMain;
    private javax.swing.JPanel quemSomos;
    private javax.swing.JPanel quemSomosEnclosePane;
    private javax.swing.JPanel saibaMais;
    private javax.swing.JPanel saibaMaisEnclosePane;
    private javax.swing.JScrollPane scpaneQuemSomos;
    private javax.swing.JScrollPane scpaneSaibaMais;
    private javax.swing.JLabel vamosTornar1;
    // End of variables declaration//GEN-END:variables
}
