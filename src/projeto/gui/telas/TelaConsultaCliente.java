/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui.telas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import projeto.erro.ConexaoException;
import projeto.erro.DaoException;
import projeto.erro.RegraExceptionCliente;
import projeto.negocio.classesBasicas.Cliente;
import projeto.negocio.fachada.FachadaCliente;
import projeto.util.Msg;
import projeto.util.TableClientes;

/**
 *
 * @author Mario
 */
public class TelaConsultaCliente extends javax.swing.JFrame {

    /**
     * Creates new form PropostaControle
     */
    public TelaConsultaCliente() {
        initComponents();
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextNomeControl = new javax.swing.JTextField();
        jTextCpfControl = new javax.swing.JTextField();
        jTextTelControl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        txtCPFClienteConsultar = new javax.swing.JFormattedTextField();
        jPesquisarCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextIdCliente = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        jTextNomeControl.setEnabled(false);
        jTextNomeControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeControlActionPerformed(evt);
            }
        });

        jTextCpfControl.setEnabled(false);

        jTextTelControl.setEnabled(false);

        jTableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCliente);

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/gui/icones/reload.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/gui/icones/trash.gif"))); // NOI18N
        jButtonDeletar.setText("Deletar");
        jButtonDeletar.setEnabled(false);
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/gui/icones/salvar_1.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/gui/icones/excluir.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        try {
            txtCPFClienteConsultar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPesquisarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/gui/icones/zoom.png"))); // NOI18N
        jPesquisarCliente.setText("Pesquisar");
        jPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisarClienteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Filtrar por CPF - ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Id Cliente :");

        jTextIdCliente.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Controle de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNomeControl, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTelControl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextCpfControl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPFClienteConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPesquisarCliente)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextNomeControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCpfControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextTelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPFClienteConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeControlActionPerformed

    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        String cpf = "" + (jTableCliente.getValueAt(jTableCliente.getSelectedRow(), 2));
        
        FachadaCliente fachadaCliente = new FachadaCliente();
        try {
            Cliente cliente = fachadaCliente.consultarCliente(cpf);
            
            jTextIdCliente.setText(String.valueOf(cliente.getCodigoCliente()));
            jTextNomeControl.setText(cliente.getNome());
            jTextCpfControl.setText(cliente.getCpf());
            jTextTelControl.setText(cliente.getTelefone());
            jButtonAlterar.setEnabled(true);
            jButtonDeletar.setEnabled(true);
            
        } catch (RegraExceptionCliente ex) {
            Msg.msgErro("Erro ao tentar pegar Cliente", "Error");
        } catch (ConexaoException ex) {
            Msg.msgErro("Erro ao tentar pegar Cliente", "Erro de conexao");
        } catch (DaoException ex) {
            Msg.msgErro("Erro ao tentar pegar Cliente", "Erro de SQL");
        }
        
    }//GEN-LAST:event_jTableClienteMouseClicked

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed

        jTextNomeControl.setEnabled(true);
        jTextCpfControl.setEnabled(true);
        jTextTelControl.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonCancelar.setEnabled(true);

    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed

        FachadaCliente fachada = new FachadaCliente();
        try {
            fachada.deletarCliente(Integer.parseInt(jTextIdCliente.getText()));
        } catch (RegraExceptionCliente ex) {
            JOptionPane.showMessageDialog(this , "Erro ao deletar cliente " + ex.getMessage(),"Erro!",JOptionPane.ERROR_MESSAGE);
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(this , "Erro ao deletar cliente " + ex.getMessage(),"Erro de conexao!",JOptionPane.ERROR_MESSAGE);
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(this , "Erro ao deletar cliente " + ex.getMessage(),"Erro SQL!",JOptionPane.ERROR_MESSAGE);
        }

        jTextNomeControl.setEnabled(false);
        jTextCpfControl.setEnabled(false);
        jTextTelControl.setEnabled(false);
        jTextIdCliente.setText("");
        jTextNomeControl.setText("");
        jTextCpfControl.setText("");
        jTextTelControl.setText("");
        txtCPFClienteConsultar.setText("");

        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        
        preencherTabela();
        
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        
        String cpfConverte = jTextCpfControl.getText().replaceAll("[^0-9]", "");
        String telefoneConverte = jTextTelControl.getText().replaceAll("[^0-9]", "");

        Cliente cliente = new Cliente();
        FachadaCliente fachada = new FachadaCliente();
        cliente.setCodigoCliente(Integer.parseInt(jTextIdCliente.getText()));
        cliente.setNome(jTextNomeControl.getText());
        cliente.setCpf(cpfConverte);
        cliente.setTelefone(telefoneConverte);

        try{
            
            fachada.alterarCliente(cliente);
            jTextIdCliente.setText("");
            jTextNomeControl.setText("");
            jTextCpfControl.setText("");
            jTextTelControl.setText("");

        }catch(RegraExceptionCliente ex ){
            JOptionPane.showMessageDialog(this , "Erro ao inserir cliente " + ex.getMessage(),"ERRO!",JOptionPane.ERROR_MESSAGE);
        }catch(ConexaoException ex){
            JOptionPane.showMessageDialog(this , "ERRO! " + ex.getMessage(),"Erro Conexão",JOptionPane.ERROR_MESSAGE);
        }catch(DaoException ex){
            JOptionPane.showMessageDialog(this , "ERRO! " + ex.getMessage(),"Erro SQL",JOptionPane.ERROR_MESSAGE);
        }

        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jPesquisarCliente.setEnabled(true);

        jTextNomeControl.setEnabled(false);
        jTextCpfControl.setEnabled(false);
        jTextTelControl.setEnabled(false);
        txtCPFClienteConsultar.setEnabled(true);
        
        preencherTabela();

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        jTextIdCliente.setText("");
        jTextNomeControl.setText("");
        jTextCpfControl.setText("");
        jTextTelControl.setText("");

        jButtonAlterar.setEnabled(false);
        jButtonDeletar.setEnabled(false);
        jButtonCancelar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jPesquisarCliente.setEnabled(true);

        jTextNomeControl.setEnabled(false);
        jTextCpfControl.setEnabled(false);
        jTextTelControl.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisarClienteActionPerformed

        FachadaCliente fachada = new FachadaCliente();
        Cliente cliente = null;
        String cpf = txtCPFClienteConsultar.getText().replaceAll("[^0-9]", "");
        try {
            cliente = fachada.consultarCliente(cpf);
        } catch (RegraExceptionCliente ex) {
            JOptionPane.showMessageDialog(this , "Erro ao consultar cliente " + ex.getMessage(),"Erro!",JOptionPane.ERROR_MESSAGE);
        } catch (ConexaoException ex) {
            JOptionPane.showMessageDialog(this , "Erro ao consultar cliente " + ex.getMessage(),"Erro de conexao!",JOptionPane.ERROR_MESSAGE);
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(this , "Erro ao consultar cliente " + ex.getMessage(),"Erro SQL!",JOptionPane.ERROR_MESSAGE);
        }

        if(cliente != null){
            
            jTextIdCliente.setText(String.valueOf(cliente.getCodigoCliente()));
            jTextNomeControl.setText(cliente.getNome());
            jTextCpfControl.setText(cliente.getCpf());
            jTextTelControl.setText(cliente.getTelefone());
            txtCPFClienteConsultar.setText("");
            jButtonAlterar.setEnabled(true);
            jButtonDeletar.setEnabled(true);
            jButtonCancelar.setEnabled(true);

        }else{
            JOptionPane.showMessageDialog(null, "Não foi possivel pesquisar o cliente", "Erro ao consultar cliente", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jPesquisarClienteActionPerformed

    public void preencherTabela(){
        FachadaCliente fachadaCliente = new FachadaCliente();
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        ArrayList data = new ArrayList();
        String [] colunas = new String []{"Id", "Nome", "CPF", "Telefone"};
        try {
            listaClientes = fachadaCliente.listarCliente();
            for(Cliente lCliente : listaClientes){
                data.add(new Object[]{lCliente.getCodigoCliente(),lCliente.getNome(),lCliente.getCpf(),lCliente.getTelefone()});
            }
        } catch (RegraExceptionCliente | ConexaoException | DaoException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro ao listar os clientes",JOptionPane.ERROR_MESSAGE);
        }
        
        TableClientes tabela = new TableClientes(data, colunas);
        jTableCliente.setModel(tabela);
        jTableCliente.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableCliente.getColumnModel().getColumn(0).setResizable(false);
        jTableCliente.getColumnModel().getColumn(1).setPreferredWidth(160);
        jTableCliente.getColumnModel().getColumn(1).setResizable(false);
        jTableCliente.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableCliente.getColumnModel().getColumn(2).setResizable(false);
        jTableCliente.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableCliente.getColumnModel().getColumn(3).setResizable(false);
        jTableCliente.getTableHeader().setReorderingAllowed(false);
        jTableCliente.setAutoResizeMode(jTableCliente.AUTO_RESIZE_OFF);
        jTableCliente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
    
    
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
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPesquisarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTextField jTextCpfControl;
    private javax.swing.JTextField jTextIdCliente;
    private javax.swing.JTextField jTextNomeControl;
    private javax.swing.JTextField jTextTelControl;
    private javax.swing.JFormattedTextField txtCPFClienteConsultar;
    // End of variables declaration//GEN-END:variables
}
