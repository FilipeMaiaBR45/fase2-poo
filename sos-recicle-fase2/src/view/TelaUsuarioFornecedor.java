/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MissaoDao;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import model.Missao;
import model.Status;
import view.model.LoginModel;

/**
 *
 * @author filip
 */
public class TelaUsuarioFornecedor extends javax.swing.JFrame {
    
    
    DefaultListModel model = new DefaultListModel();
        
    

    /**
     * Creates new form TelaUsuarioFornecedor
     */
    public TelaUsuarioFornecedor() {
        
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        
       // mostrarTabelaMissoes();
       
       
    }
    
    public void receberEmail(LoginModel model){
        jLabelEmailFornecedor.setText(model.getEmail());
    }
    
    /*
    public void mostrarTabelaMissoes(){
        DefaultTableModel modelo = (DefaultTableModel) jTableMissoesDisponiveis.getModel();
        
        MissaoDao mdao = new MissaoDao();
        
        for(Missao m: mdao.listarMissoesEmAberto()){
          modelo.addRow(new Object[]{
              m.getId(),
              m.getNome(),
              m.getObjetivo(),
              m.getEmailDoCriador(),
              m.getMaterial().getTipoDoMaterial()
              
          });
        }

    }
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabelNomeUsuarioFornecedor = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonAceitarMissaoFornecedor = new javax.swing.JButton();
        ButtonVisualizarPerfilFornecedor = new javax.swing.JButton();
        jButtonAtualizarListaEmAberto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMissoesDisponiveis = new javax.swing.JList<>();
        jLabelEmailFornecedor = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelMissoesFornecedorAceitas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMissoesAceitas = new javax.swing.JList<>();
        jButtonAtualizarListaAceitas = new javax.swing.JButton();
        jPanelMissoesFornecedorConclidas = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListMissoesConcluidas = new javax.swing.JList<>();
        jButtonAtualizarListaConcluidas = new javax.swing.JButton();
        jPanelMissoesFornecedorNaoConcluida = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListMissoesNaoConcluidas = new javax.swing.JList<>();
        jButtonAtualizarListaNaoConcluidas = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelNomeUsuarioFornecedor.setText("BEM VINDO");

        jLabel2.setText("MISS??ES DISPONIVEIS");

        jLabel3.setText("  SUAS MISS??ES");

        ButtonAceitarMissaoFornecedor.setText("ACEITAR MISS??O");
        ButtonAceitarMissaoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceitarMissaoFornecedorActionPerformed(evt);
            }
        });

        ButtonVisualizarPerfilFornecedor.setText("VISUALIZAR RANKING");
        ButtonVisualizarPerfilFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVisualizarPerfilFornecedorActionPerformed(evt);
            }
        });

        jButtonAtualizarListaEmAberto.setText("ATUALIZAR LISTA DE MISS??ES");
        jButtonAtualizarListaEmAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListaEmAbertoActionPerformed(evt);
            }
        });

        jListMissoesDisponiveis.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListMissoesDisponiveis);

        jScrollPane2.setViewportView(jListMissoesAceitas);

        jButtonAtualizarListaAceitas.setText("ATUALIZAR");
        jButtonAtualizarListaAceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListaAceitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMissoesFornecedorAceitasLayout = new javax.swing.GroupLayout(jPanelMissoesFornecedorAceitas);
        jPanelMissoesFornecedorAceitas.setLayout(jPanelMissoesFornecedorAceitasLayout);
        jPanelMissoesFornecedorAceitasLayout.setHorizontalGroup(
            jPanelMissoesFornecedorAceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMissoesFornecedorAceitasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizarListaAceitas)
                .addGap(149, 149, 149))
            .addGroup(jPanelMissoesFornecedorAceitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMissoesFornecedorAceitasLayout.setVerticalGroup(
            jPanelMissoesFornecedorAceitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMissoesFornecedorAceitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtualizarListaAceitas)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ACEITAS", jPanelMissoesFornecedorAceitas);

        jScrollPane3.setViewportView(jListMissoesConcluidas);

        jButtonAtualizarListaConcluidas.setText("ATUALIZAR");
        jButtonAtualizarListaConcluidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListaConcluidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMissoesFornecedorConclidasLayout = new javax.swing.GroupLayout(jPanelMissoesFornecedorConclidas);
        jPanelMissoesFornecedorConclidas.setLayout(jPanelMissoesFornecedorConclidasLayout);
        jPanelMissoesFornecedorConclidasLayout.setHorizontalGroup(
            jPanelMissoesFornecedorConclidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMissoesFornecedorConclidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelMissoesFornecedorConclidasLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButtonAtualizarListaConcluidas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMissoesFornecedorConclidasLayout.setVerticalGroup(
            jPanelMissoesFornecedorConclidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMissoesFornecedorConclidasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAtualizarListaConcluidas)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONCLUIDAS", jPanelMissoesFornecedorConclidas);

        jScrollPane4.setViewportView(jListMissoesNaoConcluidas);

        jButtonAtualizarListaNaoConcluidas.setText("ATUALIZAR");
        jButtonAtualizarListaNaoConcluidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarListaNaoConcluidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMissoesFornecedorNaoConcluidaLayout = new javax.swing.GroupLayout(jPanelMissoesFornecedorNaoConcluida);
        jPanelMissoesFornecedorNaoConcluida.setLayout(jPanelMissoesFornecedorNaoConcluidaLayout);
        jPanelMissoesFornecedorNaoConcluidaLayout.setHorizontalGroup(
            jPanelMissoesFornecedorNaoConcluidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMissoesFornecedorNaoConcluidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMissoesFornecedorNaoConcluidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAtualizarListaNaoConcluidas)
                .addGap(146, 146, 146))
        );
        jPanelMissoesFornecedorNaoConcluidaLayout.setVerticalGroup(
            jPanelMissoesFornecedorNaoConcluidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMissoesFornecedorNaoConcluidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAtualizarListaNaoConcluidas)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("N??O CONCLUIDAS", jPanelMissoesFornecedorNaoConcluida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtualizarListaEmAberto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAceitarMissaoFornecedor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomeUsuarioFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEmailFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonVisualizarPerfilFornecedor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNomeUsuarioFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabelEmailFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonVisualizarPerfilFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtualizarListaEmAberto)
                    .addComponent(ButtonAceitarMissaoFornecedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAceitarMissaoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceitarMissaoFornecedorActionPerformed
        int idMissao;
        String emailFornecedor = jLabelEmailFornecedor.getText();
        
        Missao m = new Missao();
        Status s = new Status();
        
        MissaoDao mdao = new MissaoDao();
        
        m.setEmailDoFornecedor(emailFornecedor);
        
        s.setStatus(1);
        m.setStatus(s);
        
        int i = jListMissoesDisponiveis.getSelectedIndex();
        
       idMissao =  mdao.listarMissoesEmAberto().get(i).getId();
       
       mdao.aceitarMissao(m, idMissao);
       
      
       
       
       DefaultListModel modelo = new DefaultListModel();
        
        jListMissoesDisponiveis.setModel(modelo);
        
        //MissaoDao mdao = new MissaoDao();
        
        
        
        for(Missao ma: mdao.listarMissoesEmAberto()){
         /*
            modelo.addElement(new Object[]{
              m.getId(),
              m.getNome(),
              m.getPontuacao(),
              m.getEmailDoCriador(),
              m.getMaterial().getTipoDoMaterial()
              
          });
            */
         
         modelo.addElement("id: " + ma.getId() + "|" + " nome: " + ma.getNome() + "|" + " pontucao da miss??o " + ma.getPontuacao());
        }
       
       
    }//GEN-LAST:event_ButtonAceitarMissaoFornecedorActionPerformed

    private void ButtonVisualizarPerfilFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVisualizarPerfilFornecedorActionPerformed
      Ranking tela = new Ranking();
      tela.show();
    }//GEN-LAST:event_ButtonVisualizarPerfilFornecedorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //int idMissao;
        String emailFornecedor = jLabelEmailFornecedor.getText();
        
        DefaultListModel modelo1 = new DefaultListModel();
        DefaultListModel modelo2 = new DefaultListModel();
        DefaultListModel modelo3 = new DefaultListModel();
        DefaultListModel modelo4 = new DefaultListModel();
        
        
        jListMissoesDisponiveis.setModel(modelo1);
        jListMissoesAceitas.setModel(modelo2);
        jListMissoesConcluidas.setModel(modelo3);
        jListMissoesNaoConcluidas.setModel(modelo4);
        
        MissaoDao mdao = new MissaoDao();
        
        
        
        for(Missao m: mdao.listarMissoesEmAberto()){
         
         
         modelo1.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
        //-------------------------------------------------------------------------
        for(Missao m: mdao.listarMissoesPorUsuarioFornecedor(1, emailFornecedor)){
         
         
         modelo2.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
        
        for(Missao m: mdao.listarMissoesPorUsuarioFornecedor(2, emailFornecedor)){
         
         
         modelo3.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
        
        for(Missao m: mdao.listarMissoesPorUsuarioFornecedor(3, emailFornecedor)){
         
         
         modelo4.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jButtonAtualizarListaEmAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListaEmAbertoActionPerformed
    
     DefaultListModel modelo1 = new DefaultListModel();
     
     
        
        jListMissoesDisponiveis.setModel(modelo1);
        
        MissaoDao mdao = new MissaoDao();
        
        
        
       for(Missao m: mdao.listarMissoesEmAberto()){
         
         
         modelo1.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
        
        
        
            
        
       
    }//GEN-LAST:event_jButtonAtualizarListaEmAbertoActionPerformed

    private void jButtonAtualizarListaAceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListaAceitasActionPerformed
         DefaultListModel modelo2 = new DefaultListModel();
         
         String emailFornecedor = jLabelEmailFornecedor.getText();
        
        jListMissoesAceitas.setModel(modelo2);
        
        MissaoDao mdao = new MissaoDao();
        
        
        
        for(Missao m: mdao.listarMissoesPorUsuarioFornecedor(1, emailFornecedor)){
        
            
        modelo2.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
    }//GEN-LAST:event_jButtonAtualizarListaAceitasActionPerformed

    private void jButtonAtualizarListaConcluidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListaConcluidasActionPerformed
        DefaultListModel modelo3 = new DefaultListModel();
         
         String emailFornecedor = jLabelEmailFornecedor.getText();
        
        jListMissoesConcluidas.setModel(modelo3);
        
        MissaoDao mdao = new MissaoDao();
        
        
        
        for(Missao m: mdao.listarMissoesPorUsuarioFornecedor(2, emailFornecedor)){
        
            
        modelo3.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
    }//GEN-LAST:event_jButtonAtualizarListaConcluidasActionPerformed

    private void jButtonAtualizarListaNaoConcluidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarListaNaoConcluidasActionPerformed
        DefaultListModel modelo4 = new DefaultListModel();
         
         String emailFornecedor = jLabelEmailFornecedor.getText();
        
        jListMissoesNaoConcluidas.setModel(modelo4);
        
        MissaoDao mdao = new MissaoDao();
        
        
        
        for(Missao m: mdao.listarMissoesPorUsuarioFornecedor(3, emailFornecedor)){
        
            
        modelo4.addElement("(id: " + m.getId() + ")"  + " (nome da miss??o: " + m.getNome() + ") " + "(pontu????o"  + m.getPontuacao() + ")" + "email do criador: " + m.getEmailDoCriador() + ")");
        }
    }//GEN-LAST:event_jButtonAtualizarListaNaoConcluidasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUsuarioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUsuarioFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUsuarioFornecedor().setVisible(true);
                
            }
            
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceitarMissaoFornecedor;
    private javax.swing.JButton ButtonVisualizarPerfilFornecedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAtualizarListaAceitas;
    private javax.swing.JButton jButtonAtualizarListaConcluidas;
    private javax.swing.JButton jButtonAtualizarListaEmAberto;
    private javax.swing.JButton jButtonAtualizarListaNaoConcluidas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelEmailFornecedor;
    private javax.swing.JLabel jLabelNomeUsuarioFornecedor;
    private javax.swing.JList<String> jListMissoesAceitas;
    private javax.swing.JList<String> jListMissoesConcluidas;
    private javax.swing.JList<String> jListMissoesDisponiveis;
    private javax.swing.JList<String> jListMissoesNaoConcluidas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMissoesFornecedorAceitas;
    private javax.swing.JPanel jPanelMissoesFornecedorConclidas;
    private javax.swing.JPanel jPanelMissoesFornecedorNaoConcluida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
