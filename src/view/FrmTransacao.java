/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.DaoEmpresa;
import dao.DaoResiduo;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Window;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empresa;
import model.Residuo;

/**
 *
 * @author Takeshi
 */
public class FrmTransacao extends javax.swing.JFrame {
    DaoEmpresa daoEmpresa = new DaoEmpresa();
    DaoResiduo daoResiduo = new DaoResiduo();
    List<Empresa> lista = new ArrayList<>();
    List<Residuo> resList = new ArrayList<>();

    /**
     * Creates new form FrmMovimentacao
     */
    public FrmTransacao() {
        initComponents();
        this.setLocationRelativeTo(null);  // Tk Para surgir no centro da tela
        
        lista = daoEmpresa.getAll();
        resList = daoResiduo.getAll();
        preencherTabela();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void preencherContatoByTable(){
        
        int lineChoose = tblDescartarResíduos.getSelectedRow();
        txtEmpresaNome.setText(tblDescartarResíduos.getValueAt(lineChoose, 0).toString());
        txtTelefone.setText(tblDescartarResíduos.getValueAt(lineChoose, 1).toString());
        lblEmail.setText(tblDescartarResíduos.getValueAt(lineChoose,2).toString());
        lblSiteAzul.setText(tblDescartarResíduos.getValueAt(lineChoose,3).toString());
        lblSite.setText(tblDescartarResíduos.getValueAt(lineChoose,4).toString());
    }
    
        public void preencherValorByTable(){
       // T-N Método para preencher o valor da transação para o cliente saber quanto irá ganhar de acordo com a empresa que ele selecionou na tabela. Fica no cartão no canto inferior direito.
       // T-N Além do valor preenche a distância e o transporte. No futuro usaremos alguma API para calcular isso. No momento estamos usando números aleatórios só para simular. 
       
        int lineChoose = tblDescartarResíduos.getSelectedRow();
        Double preco = Double.valueOf((String) tblDescartarResíduos.getValueAt(lineChoose, 4));
        int aleatorio = (int) (Math.random()*100);

        try{
            double qtd = Double.valueOf(txtQtd.getText()).doubleValue();
            double valor = preco*qtd;
            txtValor.setText(String.valueOf(String.format("%.2f",valor)));
            txtDistancia.setText(aleatorio+" km");
            txtTransporte.setText(String.valueOf(String.format("-%.2f", aleatorio*0.8))); //Takeshi-Naoki Formatar para ficar com 2 casas decimais e ao invés de infinitos números decimais na tela
            txtTotal.setText(String.valueOf(String.format("%.2f", (valor-(aleatorio*0.8)))));
            if((valor-(aleatorio*0.8))<0){
                txtTotal.setForeground(Color.RED);
            }else{
                txtTotal.setForeground(Color.GREEN);
                
               
                
            }
            
            
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido em Quantidade. Use ponto ao invés de vírgula. /n Selecione uma linha da tabela");
            
             // Takeshi-Naoki cairá aqui se a string não for um valor 
             //que possa ser convertido em inteiro   
            }
    }
    
    public void preencherTabela(){
        //TN Preenche a tabela de acordo com o banco de dados.    

        tblDescartarResíduos.getColumnModel().getColumn(0).setWidth(2); //PreferredWidth é a largura medida em pixels
        tblDescartarResíduos.getColumnModel().getColumn(1).setPreferredWidth(2);
        tblDescartarResíduos.getColumnModel().getColumn(2).setPreferredWidth(30);
        tblDescartarResíduos.getColumnModel().getColumn(3).setPreferredWidth(20);
        tblDescartarResíduos.getColumnModel().getColumn(4).setPreferredWidth(20);

        DefaultTableModel modelo = (DefaultTableModel)tblDescartarResíduos.getModel();
        modelo.setNumRows(0); //Limpar a tabela

        for(int i=0;i<lista.size();i++){
            modelo.addRow(new Object[]{
                lista.get(i).nomeFantasia,
                resList.get(i).tipoResiduo,
                resList.get(i).capacidade,
                lista.get(i).cidade,
                resList.get(i).preco,
            });
        }
    }

    
    
    
    
    
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
        infoContato = new javax.swing.JPanel();
        lblEmpresa = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmpresaNome = new javax.swing.JTextField();
        lblSite = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        lblSiteAzul = new javax.swing.JLabel();
        lblEmailAdress = new javax.swing.JLabel();
        lblKg = new javax.swing.JTextField();
        valores = new javax.swing.JPanel();
        lblDistancia = new javax.swing.JLabel();
        lblTransporte = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtDistancia = new javax.swing.JTextField();
        lblValor1 = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lblValor3 = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        txtQtd = new javax.swing.JTextField();
        btnPesquisar1 = new javax.swing.JButton();
        lblFundoTransacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        painelDeCima.setBackground(new java.awt.Color(255, 255, 255));
        painelDeCima.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelDeCima.setPreferredSize(new java.awt.Dimension(1366, 768));
        painelDeCima.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        painelDeCima.add(btnVoltarTransacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 6, -1, -1));

        lblLocalizacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLocalizacao.setText("LOCALIZAÇÃO");
        painelDeCima.add(lblLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 91, 108, -1));

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuantidade.setText("QUANTIDADE:");
        painelDeCima.add(lblQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 161, 100, -1));

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAPEL", "PLÁSTICO", "METAL", "VIDRO" }));
        painelDeCima.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 132, -1, -1));

        txtLocalizacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLocalizacao.setText("Cidade - UF");
        painelDeCima.add(txtLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 88, 406, -1));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setText("TIPO DE RESÍDUO");
        painelDeCima.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, 127, -1));

        tblDescartarResíduos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Suricato", "4141412", "333@gmail.com", "Rua 40, avenida tal, n13FormosaGO", "5"},
                {"12", "2222", "we@gmail", "333", "3.90"},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Tipo", "Capacidade", "Localização", "Preço/kg"
            }
        ));
        tblDescartarResíduos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDescartarResíduosMouseClicked(evt);
            }
        });
        jScrollTabela.setViewportView(tblDescartarResíduos);
        if (tblDescartarResíduos.getColumnModel().getColumnCount() > 0) {
            tblDescartarResíduos.getColumnModel().getColumn(1).setPreferredWidth(30);
            tblDescartarResíduos.getColumnModel().getColumn(2).setPreferredWidth(30);
        }

        painelDeCima.add(jScrollTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 245, 1343, 283));

        infoContato.setMaximumSize(new java.awt.Dimension(500, 780));
        infoContato.setPreferredSize(new java.awt.Dimension(500, 157));

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresa.setText("EMPRESA");

        lblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelefone.setText("TELEFONE");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("E-MAIL");

        txtEmpresaNome.setEditable(false);
        txtEmpresaNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblSite.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSite.setText("SITE");

        txtTelefone.setEditable(false);
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setText("");

        lblSiteAzul.setForeground(new java.awt.Color(0, 102, 255));
        lblSiteAzul.setText("www.google.com");
        lblSiteAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSiteAzulMouseClicked(evt);
            }
        });

        lblEmailAdress.setText("empresa@gmail.com");

        javax.swing.GroupLayout infoContatoLayout = new javax.swing.GroupLayout(infoContato);
        infoContato.setLayout(infoContatoLayout);
        infoContatoLayout.setHorizontalGroup(
            infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSite)
                    .addComponent(lblEmail)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmpresa))
                .addGap(27, 27, 27)
                .addGroup(infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpresaNome)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSiteAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmailAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347))
        );
        infoContatoLayout.setVerticalGroup(
            infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoContatoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpresa)
                    .addComponent(txtEmpresaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblEmailAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSite)
                    .addComponent(lblSiteAzul))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        painelDeCima.add(infoContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 546, 527, -1));

        lblKg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKg.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lblKg.setText("kg");
        lblKg.setBorder(null);
        painelDeCima.add(lblKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 161, 33, -1));

        lblDistancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDistancia.setText("DISTÂNCIA");

        lblTransporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTransporte.setText("TRANSPORTE");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTotal.setText("TOTAL");

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor.setText("VALOR");

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValor.setForeground(new java.awt.Color(51, 255, 0));
        txtValor.setText("0.00");
        txtValor.setToolTipText("");

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(51, 255, 0));
        txtTotal.setText("0.00");

        txtDistancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDistancia.setText("0 km");

        lblValor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor1.setText("R$");

        lblValor2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor2.setText("R$");

        lblValor3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValor3.setText("R$");

        txtTransporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTransporte.setForeground(new java.awt.Color(255, 0, 0));
        txtTransporte.setText("0.00");

        javax.swing.GroupLayout valoresLayout = new javax.swing.GroupLayout(valores);
        valores.setLayout(valoresLayout);
        valoresLayout.setHorizontalGroup(
            valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valoresLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal)
                    .addComponent(lblTransporte)
                    .addComponent(lblDistancia)
                    .addComponent(lblValor))
                .addGap(31, 31, 31)
                .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(valoresLayout.createSequentialGroup()
                        .addComponent(lblValor1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDistancia)
                            .addComponent(txtValor)))
                    .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(valoresLayout.createSequentialGroup()
                            .addComponent(lblValor2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTransporte))
                        .addGroup(valoresLayout.createSequentialGroup()
                            .addComponent(lblValor3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
        );
        valoresLayout.setVerticalGroup(
            valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valoresLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistancia)
                    .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTransporte)
                    .addComponent(lblValor2)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(valoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValor3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        painelDeCima.add(valores, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 330, -1));

        btnLimpar.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconLimpar.png"))); // NOI18N
        btnLimpar.setText("LIMPAR BUSCA");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        painelDeCima.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 194, 38));

        btnConfirmar.setBackground(new java.awt.Color(0, 102, 51));
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("CONFIRMAR");
        painelDeCima.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 550, 138, 57));

        buttonGroup1.add(jToggleButton1);
        jToggleButton1.setText("PAPEL");
        painelDeCima.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        buttonGroup1.add(jToggleButton2);
        jToggleButton2.setText("METAL");
        painelDeCima.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        buttonGroup1.add(jToggleButton3);
        jToggleButton3.setText("VIDRO");
        painelDeCima.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        buttonGroup1.add(jToggleButton4);
        jToggleButton4.setText("PLASTICO");
        painelDeCima.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        txtQtd.setText("0");
        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });
        painelDeCima.add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 160, 70, -1));

        btnPesquisar1.setBackground(new java.awt.Color(255, 102, 0));
        btnPesquisar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPesquisar1.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btnPesquisar1.setText("PESQUISAR");
        btnPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar1ActionPerformed(evt);
            }
        });
        painelDeCima.add(btnPesquisar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 189, 194, 38));

        lblFundoTransacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundoTransacao.png"))); // NOI18N
        painelDeCima.add(lblFundoTransacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
                .addComponent(painelDeCima, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTransacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarTransacaoMouseClicked
        FrmMenu.visible(true);
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

    private void tblDescartarResíduosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDescartarResíduosMouseClicked
        preencherValorByTable();
    }//GEN-LAST:event_tblDescartarResíduosMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //limpaTabela
    ((DefaultTableModel) tblDescartarResíduos.getModel()).setRowCount(0);
     
    }//GEN-LAST:event_btnLimparActionPerformed

    private void lblSiteAzulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSiteAzulMouseClicked
        // TN Redireciona para o site quando clicar no campo site no cartão de informações da empresa escolhida. 
        try{
            URI link = new URI("https://"+lblSiteAzul.getText());
            Desktop.getDesktop().browse(link);
        }catch(IOException | URISyntaxException erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_lblSiteAzulMouseClicked

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btnPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar1ActionPerformed
        preencherTabela();
    }//GEN-LAST:event_btnPesquisar1ActionPerformed

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
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JLabel btnVoltarTransacao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel infoContato;
    private javax.swing.JScrollPane jScrollTabela;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JLabel lblDistancia;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailAdress;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblFundoTransacao;
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
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JLabel lblValor3;
    private javax.swing.JPanel painelDeCima;
    private javax.swing.JTable tblDescartarResíduos;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtEmpresaNome;
    private javax.swing.JTextField txtLocalizacao;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTransporte;
    private javax.swing.JTextField txtValor;
    private javax.swing.JPanel valores;
    // End of variables declaration//GEN-END:variables
}
