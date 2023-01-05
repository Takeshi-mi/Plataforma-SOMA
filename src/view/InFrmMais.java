/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author Admin
 */
public class InFrmMais extends javax.swing.JInternalFrame {

    /**
     * Creates new form InFrmMais
     */
    public InFrmMais() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnSuporte = new javax.swing.JButton();
        btnSaibaMais = new javax.swing.JButton();
        lblFundo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(7, 99, 36));
        setBorder(null);
        setForeground(java.awt.Color.lightGray);
        setFrameIcon(null);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(7, 99, 36));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(59, 56, 58));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconExit.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setBorder(null);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 120, 60));

        btnSuporte.setBackground(new java.awt.Color(0, 102, 0));
        btnSuporte.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSuporte.setForeground(new java.awt.Color(255, 255, 255));
        btnSuporte.setText("PROCURAR EMPRESAS");
        btnSuporte.setBorder(null);
        btnSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuporteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSuporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 350, -1));

        btnSaibaMais.setBackground(new java.awt.Color(7, 99, 36));
        btnSaibaMais.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnSaibaMais.setForeground(new java.awt.Color(255, 255, 255));
        btnSaibaMais.setText("SAIBA MAIS");
        btnSaibaMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaibaMaisActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaibaMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 237, 57));

        lblFundo.setBackground(new java.awt.Color(0, 102, 51));
        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/internalFrameMenuFundo.png"))); // NOI18N
        lblFundo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(lblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 740));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        if (this.getMousePosition(true)==null) {
            this.dispose();
        }
    }//GEN-LAST:event_formMouseExited

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        FrmTransacao descartar = new FrmTransacao();
        descartar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSuporteActionPerformed

    private void btnSaibaMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaibaMaisActionPerformed

    }//GEN-LAST:event_btnSaibaMaisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaibaMais;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFundo;
    // End of variables declaration//GEN-END:variables
}
