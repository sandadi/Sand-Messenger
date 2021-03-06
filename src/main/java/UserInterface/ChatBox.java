/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DINESH
 */
public class ChatBox extends javax.swing.JFrame {

    /**
     * Creates new form ChatBox
     */
    public ChatBox(String title) {
        super(title);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Message_Display_Area = new javax.swing.JTextArea();
        SendButton = new javax.swing.JButton();
        Message_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Message_Display_Area.setColumns(20);
        Message_Display_Area.setRows(5);
        jScrollPane1.setViewportView(Message_Display_Area);

        SendButton.setText("Send");
//        SendButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                SendButtonActionPerformed(evt);
//            }
//        });

        Message_field.setText("Type your message here.");
        Message_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Message_fieldFocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                Message_fieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Message_field, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                        .addComponent(Message_field)))
        );

        pack();
    }// </editor-fold>                        

    private void Message_fieldFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if (Message_field.getText().equals("Type your message here.")) {
            Message_field.setText("");
        }
    }

    private void Message_fieldFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if (Message_field.getText().isEmpty()) {
            Message_field.setText("Type your message here.");
        }
    }

//    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {
//        // TODO add your handling code here:
//        String text = Message_field.getText();
//        if (!text.isEmpty()) {
//            Message_Display_Area.append("\n" + text);
//        }
//    }

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
            java.util.logging.Logger.getLogger(ChatBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatBox("Sand Messenger").setVisible(true);
            }
        });
    }

    public JButton getSendButton() {
        return SendButton;
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextArea Message_Display_Area;
    private javax.swing.JTextField Message_field;

    public JTextArea getMessage_Display_Area() {
        return Message_Display_Area;
    }

    public JTextField getMessage_field() {
        return Message_field;
    }
    private javax.swing.JButton SendButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   

}
