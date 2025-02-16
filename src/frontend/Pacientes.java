/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import dao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linco
 */
public class Pacientes extends javax.swing.JFrame {

    /**
     * Creates new form Pacientes
     */
    public Pacientes() {
        initComponents();
        carregarTabela();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");
            campoCPF = new javax.swing.JFormattedTextField(cpf);
        } catch (Exception e) {
        }
        campoRGe = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter rg = new javax.swing.text.MaskFormatter("##########");
            campoRGe = new javax.swing.JFormattedTextField(rg);
        } catch (Exception e) {
        }
        campoDataNasc = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter dataNas = new javax.swing.text.MaskFormatter("##/##/####");
            campoDataNasc = new javax.swing.JFormattedTextField(dataNas);
        } catch (Exception e) {
        }
        campoNomeMae = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPaciente = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pacientes");
        setMaximumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel4.setText("RG");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel5.setText("Data Nasc");

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jLabel6.setText("Nome da Mãe");

        campoID.setEditable(false);
        campoID.setBackground(new java.awt.Color(204, 204, 204));
        campoID.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        campoNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoCPF.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        campoRGe.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        campoDataNasc.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        campoDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataNascActionPerformed(evt);
            }
        });

        campoNomeMae.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "RGF", "Data Nasc", "Nome da Mãe"
            }
        ));
        tabelaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPaciente);

        jMenu1.setText("Cadastros");
        jMenu1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Gabriola", 0, 16)); // NOI18N
        jMenuItem1.setText("Vacinas");
        jMenuItem1.setInheritsPopupMenu(true);
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Gabriola", 0, 16)); // NOI18N
        jMenuItem2.setText("Pacientes");
        jMenuItem2.setEnabled(false);
        jMenuItem2.setInheritsPopupMenu(true);
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agenda");
        jMenu2.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoRGe, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(campoNome)
                            .addComponent(campoNomeMae))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoRGe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        Vacinas vacinas = new Vacinas();
        vacinas.setVisible(true);
        vacinas.carregarTabela();
      
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
                
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
    
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        this.dispose();
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
//        if (this.campoNome.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Informe o nome do paciente!");
//        } else if (this.campoCPF.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Informe o CPF do paciente!");
//        } else if (this.campoDataNasc.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Informe a data de Nascimento do paciente!");
//        } else if (this.campoRGe.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Informe o RG do paciente!");
//        } else if (this.campoNomeMae.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null, "Informe o nome da mãe do paciente!");
//        }else {
//            inserirCadastro();
//            carregarTabela();
            Pacientes_Tela_Cadastro telaPaciente = new Pacientes_Tela_Cadastro();
            telaPaciente.setVisible(true);
            this.dispose();
           
        
          

        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tabelaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPacienteMouseClicked
        int linha = tabelaPaciente.getSelectedRow();
        campoID.setText(tabelaPaciente.getValueAt(linha, 0).toString());
        campoNome.setText(tabelaPaciente.getValueAt(linha, 1).toString());
        campoCPF.setText(tabelaPaciente.getValueAt(linha, 2).toString());
        campoRGe.setText(tabelaPaciente.getValueAt(linha, 3).toString());
        campoDataNasc.setText(tabelaPaciente.getValueAt(linha, 4).toString());
        campoNomeMae.setText(tabelaPaciente.getValueAt(linha, 5).toString());
    }//GEN-LAST:event_tabelaPacienteMouseClicked

    private void campoDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataNascActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int confirma = JOptionPane.showConfirmDialog(this,"Deseja realmente alterar esses dados? ", "Confirma", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(confirma==JOptionPane.YES_OPTION){
            atualizarPaciente();
            carregarTabela();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       int confirma = JOptionPane.showConfirmDialog(this,"Deseja realmente Excluir? ", "Confirma", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(confirma==JOptionPane.YES_OPTION){
            excluirPaciente();
            carregarTabela();
            
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes().setVisible(true);
            }
        });
    }
    
    
    public void inserirCadastro() {
        try {
            
            // Conecta ao banco de dados
            Connection con = Conexao.conector();
            // Monta a consulta SQL e prepara para executar
            String sql = "insert into paciente(pc_nome, pc_cpf, pc_rg, pc_data_nasc, pc_nome_mae) values (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            String dataHora = campoDataNasc.getText();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(dataHora);
            String dataBD = formato.format(dataFormatada);
            
            // Define os dados para inserir
            ps.setString(1, campoNome.getText());
            ps.setString(2, campoCPF.getText());
            ps.setString(3, campoRGe.getText());
            ps.setString(4, dataBD);
            ps.setString(5, campoNomeMae.getText());
            // Executa a acao para inserir o registro no banco
            ps.executeUpdate();
            // Mensagem de confirmacao do cadastro
            JOptionPane.showMessageDialog(null, "Paciente cadastrado com sucesso!");
            // Limpa campos
            campoNome.setText("");
            campoCPF.setText("");
            campoDataNasc.setText("");
            campoNomeMae.setText("");
            campoRGe.setText("");
            // Finaliza conexao
            ps.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao inserir registro: " + e);
        }
    }
    
    public void carregarTabela() {
        try {
            // Conecta ao banco de dados
            Connection con = Conexao.conector();
            // Monta a consulta SQL e prepara para executar
            String sql = "select pc_id, pc_nome, pc_cpf, pc_rg, date_format(pc_data_nasc,'%d/%m/%Y')pc_data_nasc, pc_nome_mae from paciente";
            PreparedStatement ps = con.prepareStatement(sql);
            // Executa a consulta, atribuindo resultado para a variavel rs
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tabelaPaciente.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    // retorna os dados da tabela do BD, cada campo e um coluna.
                    rs.getInt("pc_id"),
                    rs.getString("pc_nome"),
                    rs.getString("pc_cpf"),
                    rs.getString("pc_rg"),
                    rs.getString("pc_data_nasc"),
                    rs.getString("pc_nome_mae")
                });
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar tabela!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao carregar tabela: " + e);
        }
    }
    
     public void atualizarPaciente() {
         if(isDataValida()){
        try {
            
            // Conecta ao banco de dados
            Connection con = Conexao.conector();
            // Monta a consulta SQL e prepara para executar
            String sql = "UPDATE paciente SET pc_nome = ?, pc_cpf = ?, pc_rg = ?, pc_data_nasc = ?, pc_nome_mae = ? WHERE pc_id = ?";
            
            
            
            PreparedStatement ps = con.prepareStatement(sql);
            // Define os dados para atualizar
            
            String dataHora = campoDataNasc.getText();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            Date dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(dataHora);
            String dataBD = formato.format(dataFormatada);
                            
            ps.setString(1, campoNome.getText());
            ps.setString(2, campoCPF.getText());
            ps.setString(3, campoRGe.getText());
            ps.setString(4, dataBD);
            ps.setString(5, campoNomeMae.getText());
            ps.setString(6, campoID.getText());
            // Executa a acao para inserir o registro no banco
            ps.executeUpdate();
            // Mensagem de confirmacao do cadastro
            JOptionPane.showMessageDialog(null, "Paciente atualizado com sucesso!");
            // Limpa campos
            //campoID.setText("");
            //campoNome.setText("");
            //campoCPF.setText("");
            // Finaliza conexao
            ps.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro!", "Erro", JOptionPane.ERROR_MESSAGE);
            System.out.println("Erro ao atualizar registro: " + e);
        }
    }else{
             JOptionPane.showMessageDialog(null, "Erro, não foi possível atualizar");
         }
    }
     
     public void excluirPaciente() {
        try {
            // Conecta ao banco de dados
            Connection con = Conexao.conector();
            // Monta a consulta SQL e prepara para executar
            String sql = "delete from agendavacina.paciente where pc_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            // Define o ID que deve ser excluido
            ps.setString(1, campoID.getText());
            System.out.println("campo id "+campoID.getText());
            // Executa a acao para excluir o registro do banco
            ps.executeUpdate();
            // Mensagem de confirmacao do cadastro
            JOptionPane.showMessageDialog(null, "Paciente excluído com sucesso!");
            
            campoID.setText("");
            campoNome.setText("");
            campoNomeMae.setText("");
            campoCPF.setText("");
            campoDataNasc.setText("");
            campoRGe.setText("");
            
            
                      // Finaliza conexao
            ps.close();
            con.close();
        } catch (Exception e) {
        }
    }
     
     public boolean dataHoraValida(String dataHora) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
            LocalDate d = LocalDate.parse(dataHora, formatter);
            System.out.println("Data/Hora valida: " + dataHora);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Data/Hora invalida: " + dataHora);
            return false;
        }
    }
        
    public boolean isDataValida() {
        boolean valido = false;
        String dataHora = campoDataNasc.getText();
        if (!dataHoraValida(dataHora)) {
            JOptionPane.showMessageDialog(null, "Informe uma data e hora válida!");
        } else {
            valido = true;
        }
        return valido;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoDataNasc;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNomeMae;
    private javax.swing.JTextField campoRGe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPaciente;
    // End of variables declaration//GEN-END:variables
}
