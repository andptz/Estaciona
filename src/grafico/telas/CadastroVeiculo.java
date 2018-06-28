/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico.telas;

import grafico.utilidade.Grafico;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.componentes.Veiculo;
import persistencia.componentes.PersistenciaVeiculo;


public class CadastroVeiculo extends javax.swing.JFrame {

    
    private final Color minhaColor = new Color(96,102,96);
    private int id;
    
    public CadastroVeiculo(int id) throws ClassNotFoundException, SQLException {
        setDefaultLookAndFeelDecorated(true); 
        Grafico.lookAndFeel();
        this.getContentPane().setBackground(minhaColor);
        initComponents();
        this.id = id;
        
        ArrayList<Veiculo> v = new ArrayList<>();
        PersistenciaVeiculo pv = new PersistenciaVeiculo();
        
        v = pv.recuperarVeiculosMotorista(id);
        
        for(int i = 0; i < v.size();i++){
            
            tableVeiculo.setValueAt(v.get(i).getModelo(),i,0);
            tableVeiculo.setValueAt(v.get(i).getMarca(),i,1);
            tableVeiculo.setValueAt(v.get(i).getCor(),i,2);
            
            boxAlterarCor.addItem(v.get(i).getModelo());
            
        }
        
        
    }

    private CadastroVeiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        campoCPF1 = new javax.swing.JTextField();
        botaoConfirmaCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        botaoVoltarLogin = new javax.swing.JButton();
        campoModelo = new javax.swing.JTextField();
        campoAno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoMarca = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        campoCor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVeiculo = new javax.swing.JTable();
        campoPlaca = new javax.swing.JTextField();
        boxAlterarCor = new javax.swing.JComboBox<>();
        campoCor1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        botaoConfirmaCadastro1 = new javax.swing.JButton();
        botaoConfirmaCadastro2 = new javax.swing.JButton();

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CPF");

        campoCPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCPF1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 500));

        botaoConfirmaCadastro.setBackground(new java.awt.Color(255, 255, 255));
        botaoConfirmaCadastro.setText("Cadastrar Veiculo");
        botaoConfirmaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaCadastroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Placa");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Veiculo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Modelo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ano");

        botaoVoltarLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manel\\Documents\\Estaciona\\src\\grafico\\imagen\\return.png")); // NOI18N
        botaoVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarLoginActionPerformed(evt);
            }
        });

        campoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoModeloActionPerformed(evt);
            }
        });

        campoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAnoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manel\\Documents\\Estaciona\\src\\grafico\\imagen\\iconAccount.png")); // NOI18N

        campoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMarcaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Marca");

        campoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Cor");

        tableVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Cor"
            }
        ));
        jScrollPane1.setViewportView(tableVeiculo);

        campoPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPlacaActionPerformed(evt);
            }
        });

        boxAlterarCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione o Veiculo>" }));

        campoCor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCor1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cor");

        botaoConfirmaCadastro1.setBackground(new java.awt.Color(255, 255, 255));
        botaoConfirmaCadastro1.setText("Alterar Cor");
        botaoConfirmaCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaCadastro1ActionPerformed(evt);
            }
        });

        botaoConfirmaCadastro2.setBackground(new java.awt.Color(255, 255, 255));
        botaoConfirmaCadastro2.setText("Deleta Carro Selecionado");
        botaoConfirmaCadastro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmaCadastro2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(botaoVoltarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(campoModelo)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(botaoConfirmaCadastro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCor)
                    .addComponent(campoMarca)
                    .addComponent(campoPlaca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(campoAno)
                    .addComponent(boxAlterarCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCor1)
                    .addComponent(botaoConfirmaCadastro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoConfirmaCadastro2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(botaoVoltarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(botaoConfirmaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxAlterarCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCor1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoConfirmaCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoConfirmaCadastro2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoConfirmaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaCadastroActionPerformed

        try{
            String modelo = campoModelo.getText();
            String marca = campoMarca.getText();
            String placa = campoPlaca.getText();
            int ano =Integer.parseInt(campoAno.getText());
            String cor = campoCor.getText();
            
            Veiculo veiculo = new Veiculo(ano,modelo,marca,placa,cor);
            PersistenciaVeiculo pveiculo = new PersistenciaVeiculo();
            pveiculo.CriarVeiculoMotorista(veiculo,this.id);
            
            
        }catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(null,"Ano inválido");
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

        
    }//GEN-LAST:event_botaoConfirmaCadastroActionPerformed

    private void botaoVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarLoginActionPerformed
        setVisible(false);
        try {
            new Home(id).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_botaoVoltarLoginActionPerformed

    private void campoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoModeloActionPerformed

    private void campoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAnoActionPerformed

    private void campoCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPF1ActionPerformed

    private void campoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoMarcaActionPerformed

    private void campoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorActionPerformed
        
    }//GEN-LAST:event_campoCorActionPerformed

    private void campoPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPlacaActionPerformed

    private void campoCor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCor1ActionPerformed

    private void botaoConfirmaCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaCadastro1ActionPerformed
        String newCor = campoCor1.getText();
        String nome = (String) boxAlterarCor.getSelectedItem();
        PersistenciaVeiculo pv = new PersistenciaVeiculo();
        
        try {
            System.out.print(nome);
            System.out.print(newCor);
            pv.updateCorVeiculo(nome, newCor);
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoConfirmaCadastro1ActionPerformed

    private void botaoConfirmaCadastro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmaCadastro2ActionPerformed
        String nome = (String) boxAlterarCor.getSelectedItem();
        PersistenciaVeiculo pv = new PersistenciaVeiculo();
        try {
            pv.deletaVeiculo(nome);
        } catch (SQLException ex) {
            
            ex.printStackTrace();
            Logger.getLogger(CadastroVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_botaoConfirmaCadastro2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfirmaCadastro;
    private javax.swing.JButton botaoConfirmaCadastro1;
    private javax.swing.JButton botaoConfirmaCadastro2;
    private javax.swing.JButton botaoVoltarLogin;
    private javax.swing.JComboBox<String> boxAlterarCor;
    private javax.swing.JTextField campoAno;
    private javax.swing.JTextField campoCPF1;
    private javax.swing.JTextField campoCor;
    private javax.swing.JTextField campoCor1;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoModelo;
    private javax.swing.JTextField campoPlaca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableVeiculo;
    // End of variables declaration//GEN-END:variables
}
