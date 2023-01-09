/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.DaoTransacao;
import static java.awt.image.ImageObserver.WIDTH;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.Transacao;


/**
 *
 * @author Takeshi
 */
public class FrmHistoricoTransacoes extends javax.swing.JFrame {
    
    DaoTransacao daoTransacao = new DaoTransacao();
    List<Transacao> lista = new ArrayList<>();

    
    public FrmHistoricoTransacoes() {
        initComponents();
        
        lista = daoTransacao.getAll();
        preencherTabela();
    }

    
    public void preencherTabela(){
    //TN Preenche a tabela de acordo com o banco de dados.    
        
    tblHistoricoTransacao.getColumnModel().getColumn(0).setPreferredWidth(20); //PreferredWidth é a largura medida em pixels
    tblHistoricoTransacao.getColumnModel().getColumn(1).setPreferredWidth(50); 
    tblHistoricoTransacao.getColumnModel().getColumn(2).setPreferredWidth(2);
    tblHistoricoTransacao.getColumnModel().getColumn(3).setPreferredWidth(20);
    tblHistoricoTransacao.getColumnModel().getColumn(4).setPreferredWidth(20);
    tblHistoricoTransacao.getColumnModel().getColumn(5).setPreferredWidth(20);
    tblHistoricoTransacao.getColumnModel().getColumn(6).setPreferredWidth(20);
    
    DefaultTableModel modelo = (DefaultTableModel)tblHistoricoTransacao.getModel();
    modelo.setNumRows(0); //Limpar a tabela
    
    for(int i=0;i<lista.size();i++){
        modelo.addRow(new Object[]{
            lista.get(i).horario,


                    });
    }
}


    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        btnVoltarHistorico = new javax.swing.JLabel();
        lblTitleHistorico = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistoricoTransacao = new javax.swing.JTable();
        btnPesquisar1 = new javax.swing.JButton();
        cbxTipo = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        lblFundoHistorico = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPane.setPreferredSize(new java.awt.Dimension(1366, 750));
        mainPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltarHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltarVerde.png"))); // NOI18N
        btnVoltarHistorico.setToolTipText("voltar");
        btnVoltarHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarHistoricoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarHistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarHistoricoMouseExited(evt);
            }
        });
        mainPane.add(btnVoltarHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lblTitleHistorico.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblTitleHistorico.setText("Histórico de Transações");
        mainPane.add(lblTitleHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 550, 70));

        tblHistoricoTransacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Data/hora", "Comprador", "Vendedor", "Tipo", "Quantidade", "Valor", "Transporte"
            }
        ));
        jScrollPane1.setViewportView(tblHistoricoTransacao);

        mainPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1230, 400));

        btnPesquisar1.setBackground(new java.awt.Color(255, 102, 0));
        btnPesquisar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar1.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconFiltrar.png"))); // NOI18N
        btnPesquisar1.setText("FILTRAR");
        mainPane.add(btnPesquisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 194, 38));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAPEL", "PLÁSTICO", "METAL", "VIDRO" }));
        mainPane.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setText("TIPO DE RESÍDUO");
        mainPane.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 127, -1));

        lblFundoHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoHistoricoTransacoes.png"))); // NOI18N
        lblFundoHistorico.setToolTipText("");
        mainPane.add(lblFundoHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(mainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarHistoricoMouseClicked
        FrmMenu menu = new FrmMenu();
        menu.setVisible(true);
        menu.setExtendedState(this.getExtendedState());

        dispose();
    }//GEN-LAST:event_btnVoltarHistoricoMouseClicked

    private void btnVoltarHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarHistoricoMouseEntered
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/voltarVerdeSelected.png"));
        btnVoltarHistorico.setIcon(icone);
    }//GEN-LAST:event_btnVoltarHistoricoMouseEntered

    private void btnVoltarHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarHistoricoMouseExited
        ImageIcon icone = new ImageIcon(getClass().getResource("/images/voltarVerde.png"));
        btnVoltarHistorico.setIcon(icone);
    }//GEN-LAST:event_btnVoltarHistoricoMouseExited

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
            java.util.logging.Logger.getLogger(FrmHistoricoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHistoricoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHistoricoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHistoricoTransacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHistoricoTransacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JLabel btnVoltarHistorico;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFundoHistorico;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitleHistorico;
    private javax.swing.JPanel mainPane;
    private javax.swing.JTable tblHistoricoTransacao;
    // End of variables declaration//GEN-END:variables
}
