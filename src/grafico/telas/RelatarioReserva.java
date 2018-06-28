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
import modelo.componentes.Estacionamento;
import modelo.componentes.Veiculo;
import modelo.locais.Bairro;
import modelo.operacoes.Reserva;
import persistencia.componentes.PersistenciaEstacionamento;
import persistencia.componentes.PersistenciaVeiculo;
import persistencia.locais.PersistenciaBairro;
import persistencia.operacoes.PersistenciaReserva;


public class RelatarioReserva extends javax.swing.JFrame {

    
    private final Color minhaColor = new Color(96,102,96);
    private int id;
    private int cont_itens;
    
    public RelatarioReserva(int id) throws ClassNotFoundException, SQLException {
        setDefaultLookAndFeelDecorated(true); 
        Grafico.lookAndFeel();
        this.getContentPane().setBackground(minhaColor);
        initComponents();
        this.id = id;
        cont_itens = 0;
        
        //Carrega Bairros;
        ArrayList <Bairro> instance = new ArrayList<>();
        PersistenciaBairro pInstance = new PersistenciaBairro();
        instance = pInstance.recuperarBairros(1);
        String aux;
        
        for(int i = 0; i < instance.size();i++){
            
            aux = instance.get(i).getNome();
            bairroBox.addItem(aux);

        }
        
        
        
    }

    private RelatarioReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        campoCPF1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botaoVoltarLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReserva = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        estadoBox = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        bairroBox = new javax.swing.JComboBox<>();

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reserva");

        botaoVoltarLogin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manel\\Documents\\Estaciona\\src\\grafico\\imagen\\return.png")); // NOI18N
        botaoVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarLoginActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manel\\Documents\\Estaciona\\src\\grafico\\imagen\\iconAccount.png")); // NOI18N

        tableReserva.setModel(new javax.swing.table.DefaultTableModel(
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
                "Data Reserva", "Hora Reserva", "Hora Saida"
            }
        ));
        jScrollPane1.setViewportView(tableReserva);

        jButton4.setText("Confirma");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Estado");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bairro");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cidade");

        estadoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espirito Santo" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vitória" }));

        bairroBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>" }));

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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bairroBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(estadoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(estadoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(bairroBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarLoginActionPerformed
        setVisible(false);
        try {
            new Home(id).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(RelatarioReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RelatarioReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_botaoVoltarLoginActionPerformed

    private void campoCPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCPF1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       ArrayList<Reserva> listRes = new ArrayList<>();
       PersistenciaReserva pRes = new PersistenciaReserva();
       String bairro = (String)bairroBox.getSelectedItem();
        try {
            
            listRes = pRes.selectFiltroBairro2(bairro);
            
             for(int i = 0 ; i < cont_itens;i++){
                tableReserva.setValueAt("", i,0);
                tableReserva.setValueAt("", i,1);
                tableReserva.setValueAt("", i,2);
                
            }
            
            cont_itens = 0;
            
            for(int i = 0; i < listRes.size();i++){
            
                String dataReserva = listRes.get(i).getDataReserva();
                String horaReserva = listRes.get(i).getHoraReserva();
                String horaSaida = listRes.get(i).getHoraSaida();
                
                tableReserva.setValueAt(dataReserva, i,0);
                tableReserva.setValueAt(horaReserva, i,1);
                tableReserva.setValueAt(horaSaida, i,2);
               
                cont_itens++;

            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RelatarioReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }//GEN-LAST:event_jButton4ActionPerformed

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
                new RelatarioReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bairroBox;
    private javax.swing.JButton botaoVoltarLogin;
    private javax.swing.JTextField campoCPF1;
    private javax.swing.JComboBox<String> estadoBox;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReserva;
    // End of variables declaration//GEN-END:variables
}
