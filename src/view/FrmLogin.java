/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import dao.DaoUsuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import view.FrmMenu;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author ifg
 */
public class FrmLogin extends javax.swing.JFrame {
    /**
     * Creates new form TelaLogin
     */
    public FrmLogin() {
        initComponents();
        getRootPane().setDefaultButton(btnAcess); // Tk Para que o botão acessar seja selecionado por padrão. Assim é só apertar ENTER depois de colocar a senha
        this.setLocationRelativeTo(null);
        
        lblErro.setVisible(false); // Começa invisivel, só aparece quando erra
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogTroll = new javax.swing.JDialog();
        paneTroll = new javax.swing.JPanel();
        lblTrollface = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnAcess = new javax.swing.JButton();
        lblImagePadlock = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LogoSoma = new javax.swing.JLabel();
        btnCadastre = new javax.swing.JButton();
        lblErro = new javax.swing.JLabel();
        btnEsqueceu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        dialogTroll.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogTroll.setTitle("Vish mermão ");
        dialogTroll.setBounds(new java.awt.Rectangle(450, 420, 450, 420));

        lblTrollface.setBackground(new java.awt.Color(204, 255, 255));
        lblTrollface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trollface.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Já era kkkkkkkk");

        javax.swing.GroupLayout paneTrollLayout = new javax.swing.GroupLayout(paneTroll);
        paneTroll.setLayout(paneTrollLayout);
        paneTrollLayout.setHorizontalGroup(
            paneTrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTrollLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(paneTrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(paneTrollLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTrollface)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        paneTrollLayout.setVerticalGroup(
            paneTrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTrollLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTrollface)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogTrollLayout = new javax.swing.GroupLayout(dialogTroll.getContentPane());
        dialogTroll.getContentPane().setLayout(dialogTrollLayout);
        dialogTrollLayout.setHorizontalGroup(
            dialogTrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTrollLayout.setVerticalGroup(
            dialogTrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogTroll.getAccessibleContext().setAccessibleName("troll");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(102, 102, 102));
        lblUser.setText("Usuário/e-mail:");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 102, 102));
        lblPassword.setText("Senha:");

        btnAcess.setBackground(new java.awt.Color(37, 162, 90));
        btnAcess.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAcess.setForeground(new java.awt.Color(255, 255, 255));
        btnAcess.setText("Acessar");
        btnAcess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(28, 120, 66)));
        btnAcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessActionPerformed(evt);
            }
        });

        lblImagePadlock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblImagePadlock.setForeground(new java.awt.Color(102, 102, 102));
        lblImagePadlock.setText("Login");
        lblImagePadlock.setToolTipText("");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        LogoSoma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo verde.png"))); // NOI18N
        LogoSoma.setToolTipText("logo");

        btnCadastre.setForeground(new java.awt.Color(0, 102, 153));
        btnCadastre.setText("Não tem uma conta? Cadastre-se");
        btnCadastre.setToolTipText("Clique para cadastrar");
        btnCadastre.setBorder(null);
        btnCadastre.setBorderPainted(false);
        btnCadastre.setContentAreaFilled(false);
        btnCadastre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastreMouseExited(evt);
            }
        });
        btnCadastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastreActionPerformed(evt);
            }
        });

        lblErro.setForeground(new java.awt.Color(204, 0, 0));
        lblErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErro.setText("Usuário ou senha incorretos");

        btnEsqueceu.setForeground(new java.awt.Color(0, 102, 153));
        btnEsqueceu.setText("Esqueceu a senha?");
        btnEsqueceu.setToolTipText("Clique para cadastrar");
        btnEsqueceu.setBorder(null);
        btnEsqueceu.setBorderPainted(false);
        btnEsqueceu.setContentAreaFilled(false);
        btnEsqueceu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEsqueceuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEsqueceuMouseExited(evt);
            }
        });
        btnEsqueceu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueceuActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconExit40px.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 511, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addComponent(btnAcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwdPassword)
                            .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPassword)
                                    .addComponent(lblUser)
                                    .addComponent(lblImagePadlock, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(130, 130, 130)))
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(btnEsqueceu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(LogoSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagePadlock)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErro)
                .addGap(7, 7, 7)
                .addComponent(btnAcess, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEsqueceu)
                .addGap(8, 8, 8)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblErro.getAccessibleContext().setAccessibleName("credencial incorreta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        

    private void btnAcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessActionPerformed
        DaoUsuario daoUsuario = new DaoUsuario();
        String login = txtUser.getText();
        String senha = String.valueOf(pwdPassword.getPassword());
        Usuario user = daoUsuario.getUsuarioFromLogin(login, senha);
        
        if(user != null){
            FrmMenu menu = new FrmMenu(user);
            menu.setVisible(true);
            dispose();
        }
        else {
//            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos!", "Erro", JOptionPane.ERROR_MESSAGE);
            lblErro.setVisible(true);
        }
    }//GEN-LAST:event_btnAcessActionPerformed

    private void btnCadastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastreActionPerformed
       FrmCadastrar cadastro = new FrmCadastrar();
       cadastro.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnCadastreActionPerformed

    private void btnCadastreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastreMouseEntered
        btnCadastre.setForeground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnCadastreMouseEntered

    private void btnCadastreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastreMouseExited
        btnCadastre.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_btnCadastreMouseExited

    private void btnEsqueceuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEsqueceuMouseEntered
        btnEsqueceu.setForeground(new Color(0, 204, 204));
    }//GEN-LAST:event_btnEsqueceuMouseEntered

    private void btnEsqueceuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEsqueceuMouseExited
        btnEsqueceu.setForeground(new Color(0, 102, 153));
    }//GEN-LAST:event_btnEsqueceuMouseExited

    private void btnEsqueceuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueceuActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "Você esqueceu sua senha?");
        if (op==0) {

            dialogTroll.setVisible(true);
            dialogTroll.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnEsqueceuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoSoma;
    private javax.swing.JButton btnAcess;
    private javax.swing.JButton btnCadastre;
    private javax.swing.JButton btnEsqueceu;
    private javax.swing.JDialog dialogTroll;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblErro;
    private javax.swing.JLabel lblImagePadlock;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTrollface;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel paneTroll;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
