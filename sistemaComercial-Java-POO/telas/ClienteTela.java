/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import entidades.Cliente;
import entidades.Cidade;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.HibernateUtil;

/**
 *
 * @author jaimedias
 */
public class ClienteTela extends javax.swing.JDialog {

    private Cliente cliente;
    private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private List<Cidade> listaCidades = new ArrayList<Cidade>();

    /**
     * Creates new form PessoaTela
     */
    public ClienteTela(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        montaTabela();
        validaTela("inicio");
        montaCombo();
    }
    
    public void montaCombo(){
        listaCidades = HibernateUtil.getSession().createQuery("from Cidade").list();
        cCidade.removeAllItems();
        for(Cidade e : listaCidades){
            cCidade.addItem(e.getNome());
        }
    }

    public void validaTela(String acao) {
        if (acao.equals("inicio")) {
            cNome.setEnabled(false);
            cCidade.setEnabled(false);
            cTelefone.setEnabled(false);
            cEndereco.setEnabled(false);
            cCpf.setEnabled(false);
            btNovo.setEnabled(true);
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
            btCancelar.setEnabled(false);
            btSalvar.setEnabled(false);
            btSair.setEnabled(true);
        }else if(acao.equals("novo")){
            cNome.setEnabled(true);
            cCidade.setEnabled(true);
            cTelefone.setEnabled(true);
            cEndereco.setEnabled(true);
            cCpf.setEnabled(true);
            btNovo.setEnabled(false);
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
            btCancelar.setEnabled(true);
            btSalvar.setEnabled(true);
            btSair.setEnabled(false);
        }else if(acao.equals("selecionado")){
            cNome.setEnabled(false);
            cCidade.setEnabled(false);
            cTelefone.setEnabled(false);
            cEndereco.setEnabled(false);
            cCpf.setEnabled(false);
            btNovo.setEnabled(true);
            btEditar.setEnabled(true);
            btExcluir.setEnabled(true);
            btCancelar.setEnabled(false);
            btSalvar.setEnabled(false);
            btSair.setEnabled(true);
        }
    }

    public List<Cidade> getListaCidades() {
        return listaCidades;
    }

    public void setListaCidades(List<Cidade> listaCidades) {
        this.listaCidades = listaCidades;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cCodigo = new javax.swing.JTextField();
        cNome = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        cCidade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cTelefone = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Estado");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Cliente");

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Cidade:");

        cCodigo.setEditable(false);
        cCodigo.setEnabled(false);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabela);

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        cCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("CPF / CNPJ:");

        cCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCpfActionPerformed(evt);
            }
        });

        jLabel6.setText("Endereço:");

        cEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEnderecoActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cTelefone)
                                    .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btCancelar, btEditar, btExcluir, btNovo, btSair, btSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btSair)
                    .addComponent(btSalvar)
                    .addComponent(btCancelar)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validaCampos()) {
            if (cCodigo.getText().equals("")) {
                cliente.setId(null);
            } else {
                cliente.setId(Long.parseLong(cCodigo.getText()));
            }

            cliente.setNome(cNome.getText());
            cliente.setCidade(listaCidades.get(cCidade.getSelectedIndex()));
            cliente.setCpfcnpj(cCpf.getText());
            cliente.setEndereco(cEndereco.getText());
            cliente.setTelefone(cTelefone.getText());

            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().merge(cliente);
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();

            montaTabela();
            limpaCampos();
            validaTela("inicio");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    public void limpaCampos() {
        cCodigo.setText("");
        cNome.setText("");
        cCpf.setText("");
        cEndereco.setText("");
        cTelefone.setText("");
        cCidade.setSelectedItem(null);
    }

    public boolean validaCampos() {
        if (cNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O nome é obrigatório!");
            return false;
        }
        if (cCidade.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "O cidade é obrigatória!");
            return false;
        }
        return true;
    }

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed

        //Simplesmente oculta a tela, mas o sistema continua em execução.
        dispose();
        //Mata a aplicação, fecha o sistema por completo.
//        System.exit(1);

    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed

        Cliente cid = listaClientes.get(tabela.getSelectedRow());

        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(cid);
        HibernateUtil.commitTransaction();
        HibernateUtil.closeSession();

        montaTabela();
        limpaCampos();
        validaTela("inicio");

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        cliente = new Cliente();
        limpaCampos();
        validaTela("novo");
    }//GEN-LAST:event_btNovoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        limpaCampos();
        validaTela("inicio");
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed

        validaTela("novo");
    }//GEN-LAST:event_btEditarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        cliente = listaClientes.get(tabela.getSelectedRow());
        cCodigo.setText(cliente.getId().toString());
        cNome.setText(cliente.getNome());
        cCpf.setText(cliente.getCpfcnpj());
        cTelefone.setText(cliente.getTelefone());
        cEndereco.setText(cliente.getEndereco());
        cCidade.setSelectedItem(cliente.getCidade().getNome());
        
        validaTela("selecionado");
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseClicked

    private void cCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCpfActionPerformed

    private void cEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cEnderecoActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteTela dialog = new ClienteTela(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cCidade;
    private javax.swing.JTextField cCodigo;
    private javax.swing.JTextField cCpf;
    private javax.swing.JTextField cEndereco;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    public void montaTabela() {
        listaClientes = HibernateUtil.getSession().createQuery("from Cliente").list();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Documento");
        modelo.addColumn("Endereço");
        modelo.addColumn("Cidade");
        modelo.addColumn("Estado");
        for (Cliente pes : listaClientes) {
            modelo.addRow(new Object[]{pes.getId(), pes.getNome(), pes.getCpfcnpj(), pes.getEndereco(), pes.getCidade().getNome(), pes.getCidade().getEstado().getSigla()});
        }
        tabela.setModel(modelo);
    }
}
