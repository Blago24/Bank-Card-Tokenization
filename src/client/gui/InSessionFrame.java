/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.gui;

import communication.ClientServerCommunication;
import javax.swing.JOptionPane;
import primitives.CreditCard;
import primitives.Token;
import server.Session;

/**
 *
 * @author a
 */
public class InSessionFrame extends javax.swing.JFrame {

    private Session session;
    private ClientServerCommunication communication;// = new ClientServerCommunication();

    /**
     * Creates new form InSessionFrame
     */
    public InSessionFrame() {
        initComponents();
    }

    /**
     *
     * @param session
     * @param communication
     */
    public InSessionFrame(Session session, ClientServerCommunication communication) {
        this();
        this.session = session;
        this.communication = communication;
        lblUser.setText(session.getUser().getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegCard = new javax.swing.JButton();
        btnExportCreditCards = new javax.swing.JButton();
        btnExportTokens = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnGetCard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegCard.setText("Register Card");
        btnRegCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegCardActionPerformed(evt);
            }
        });

        btnExportCreditCards.setText("Export Credit Cards");
        btnExportCreditCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportCreditCardsActionPerformed(evt);
            }
        });

        btnExportTokens.setText("Export Tokens");
        btnExportTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportTokensActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblWelcome.setText("Welcome,");

        lblUser.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        lblUser.setText("user");

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnGetCard.setText("Get credit card number");
        btnGetCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnExportCreditCards)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnLogout)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGetCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegCard)
                                    .addComponent(btnExportTokens))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegCard)
                .addGap(8, 8, 8)
                .addComponent(btnExportTokens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportCreditCards)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetCard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegCardActionPerformed

        CardRegFrame regFrame = new CardRegFrame(session, communication);
        regFrame.setVisible(true);
    }//GEN-LAST:event_btnRegCardActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        SignFrame sf = new SignFrame();
        dispose();
        communication.sendMessage(null, "Close");
        sf.setVisible(true);

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnExportTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportTokensActionPerformed
        communication.sendMessage(session, "Export Tokens");
        String ack = (String) communication.recieveObj();
        communication.handleAck(ack);
    }//GEN-LAST:event_btnExportTokensActionPerformed

    private void btnExportCreditCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportCreditCardsActionPerformed
        communication.sendMessage(session, "Export Credit Card");
        String ack = (String) communication.recieveObj();
        communication.handleAck(ack);
    }//GEN-LAST:event_btnExportCreditCardsActionPerformed

    private void btnGetCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCardActionPerformed
        boolean success;
        String token = JOptionPane.showInputDialog(null, "Enter the token: ");
        communication.sendMessage(new Token(token), "Get card");
        String ack = (String) communication.recieveObj();

        if (communication.handleAck(ack)) {
            CreditCard card = (CreditCard) communication.recieveObj();
            JOptionPane.showMessageDialog(null, "The card is: " + card);
        }
    }//GEN-LAST:event_btnGetCardActionPerformed

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
            java.util.logging.Logger.getLogger(InSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InSessionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InSessionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportCreditCards;
    private javax.swing.JButton btnExportTokens;
    private javax.swing.JButton btnGetCard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegCard;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
