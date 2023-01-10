/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.DaoTransacao;
import java.awt.Window;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Residuo;
import model.Transacao;


/**
 *
 * @author Takeshi
 */
public class FrmHistoricoTransacoes extends javax.swing.JFrame {
    
    DaoTransacao daoTransacao = new DaoTransacao();
    List<Transacao> lista = daoTransacao.getAll();
    Map<Integer, String> mapTipo = Map.of(
        Residuo.METAL, "METAL",
        Residuo.PAPEL, "PAPEL",
        Residuo.PLASTICO, "PLASTICO",
        Residuo.VIDRO, "VIDRO"
    );

    
    public FrmHistoricoTransacoes() {
        initComponents();
        
        preencherTabela();
    }

    public void preencherTabela(){
        int[] preferedWidth = new int[]{400, 400, 400, 200, 200, 150, 150, 150};
        DefaultTableCellRenderer centerCell = new DefaultTableCellRenderer();
        centerCell.setHorizontalAlignment(SwingConstants.CENTER);
        
        for (int i=0; i<tblHistoricoTransacao.getColumnCount(); i++) {
            tblHistoricoTransacao.getColumnModel().getColumn(i).setPreferredWidth(preferedWidth[i]); //PreferredWidth é a largura medida em pixels
            tblHistoricoTransacao.getColumnModel().getColumn(i).setCellRenderer(centerCell);
        }

        DefaultTableModel modelo = (DefaultTableModel)tblHistoricoTransacao.getModel();
        modelo.setNumRows(0); //Limpar a tabela
    
        for(Transacao t: lista){
            modelo.addRow(new Object[]{
                t.horario.toString(),
                t.idComprador,
                t.idVendedor,
                mapTipo.get(t.tipoResiduo),
                t.quantidade,
                t.valorUnitario,
                t.valorTransporte,
                (t.quantidade*t.valorUnitario)-t.valorTransporte
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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Data/hora", "Comprador", "Vendedor", "Tipo", "Quantidade", "Valor Unitário", "Transporte", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHistoricoTransacao);

        mainPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 1230, 400));

        btnPesquisar1.setBackground(new java.awt.Color(255, 102, 0));
        btnPesquisar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar1.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconFiltrar.png"))); // NOI18N
        btnPesquisar1.setText("FILTRAR");
        mainPane.add(btnPesquisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 194, 38));

        lblFundoHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoHistoricoTransacoes.png"))); // NOI18N
        lblFundoHistorico.setToolTipText("");
        mainPane.add(lblFundoHistorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(mainPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarHistoricoMouseClicked
        FrmMenu.visible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFundoHistorico;
    private javax.swing.JLabel lblTitleHistorico;
    private javax.swing.JPanel mainPane;
    private javax.swing.JTable tblHistoricoTransacao;
    // End of variables declaration//GEN-END:variables
}
