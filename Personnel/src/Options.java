

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Options.java
 *
 * Created on Jun 11, 2012, 3:34:00 AM
 */

/**
 *
 * @author Moinul Joje
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
public class Options extends javax.swing.JFrame {

    /** Creates new form Options */
    public Options() {
        setTitle("OPTIONS");
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        newentryButton = new javax.swing.JRadioButton();
        updelButton = new javax.swing.JRadioButton();
        inquiryButton = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setText("Your Choices are Here");

        newentryButton.setText("New Entry");
        newentryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newentryButtonActionPerformed(evt);
            }
        });

        updelButton.setText("Update/Delete");
        updelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updelButtonActionPerformed(evt);
            }
        });

        inquiryButton.setText("Inquiry");
        inquiryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inquiryButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inquiryButton)
                                    .addComponent(updelButton)
                                    .addComponent(newentryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(333, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(72, 72, 72))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(newentryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updelButton)
                .addGap(26, 26, 26)
                .addComponent(inquiryButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(cancelButton))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newentryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newentryButtonActionPerformed
        // TODO add your handling code here:
        if(newentryButton.isSelected()){
            NewEntry nen=new NewEntry();
            nen.setVisible(true);
        }
        setVisible(false);

    }//GEN-LAST:event_newentryButtonActionPerformed

    private void inquiryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inquiryButtonActionPerformed
        // TODO add your handling code here:
        if(inquiryButton.isSelected()){
       MainScreen ms=new MainScreen();
       ms.setVisible(true);
        }
        setVisible(false);
    }//GEN-LAST:event_inquiryButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==backButton){
       loginforadmin lgin=new loginforadmin();
       lgin.setVisible(true);
        }
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==cancelButton){
        System.exit(0);
        }
        setVisible(false);
}//GEN-LAST:event_cancelButtonActionPerformed

    private void updelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updelButtonActionPerformed
        // TODO add your handling code here:
         if(updelButton.isSelected()){
            updel up=new updel();
            up.setVisible(true);
        }
         setVisible(false);
        
    }//GEN-LAST:event_updelButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Options().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton inquiryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton newentryButton;
    private javax.swing.JRadioButton updelButton;
    // End of variables declaration//GEN-END:variables

}
