/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;
import DAO.Student;
import javax.swing.JOptionPane;
/**
 *
 * @author ayush
 */
public class DeleteStudent extends javax.swing.JFrame {

    /**
     * Creates new form DeleteStudent
     */
    String id = "";      // stores the id from the text field to be deleted
    Student user = new Student();
    public DeleteStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbutton = new javax.swing.JButton();
        idfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DELETE STUDENT");
        setResizable(false);
        getContentPane().setLayout(null);

        backbutton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton);
        backbutton.setBounds(479, 434, 80, 30);

        idfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfieldActionPerformed(evt);
            }
        });
        getContentPane().add(idfield);
        idfield.setBounds(329, 161, 170, 43);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter ID of the student to be deleted:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(31, 161, 300, 43);

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(264, 263, 102, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/delete_student.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 515);

        setSize(new java.awt.Dimension(642, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // when the back button is clicked
    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        AdminDashboard.main(new String []{});
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    // when the data is entered in the id field
    private void idfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfieldActionPerformed
        // TODO add your handling code here:
        id = idfield.getText();
    }//GEN-LAST:event_idfieldActionPerformed

    
    // when the delete student is clicked
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(idfield.getText().equals(""))
                JOptionPane.showMessageDialog(DeleteStudent.this,"Student id cannot be empty!","ERROR",JOptionPane.ERROR_MESSAGE);
        else if(!idfield.getText().trim().matches("[0-9]+"))
                JOptionPane.showMessageDialog(DeleteStudent.this,"Student id can only contain numbers!","ERROR",JOptionPane.ERROR_MESSAGE);
        else{
            int input;
            input = JOptionPane.showConfirmDialog(DeleteStudent.this,"Do you really want to delete this user ?","Are you sure?",JOptionPane.YES_NO_OPTION);
            if( input == 0){
            int int_id = Integer.parseInt(id);
            int status = user.delete(int_id);
            if(status>0){
                JOptionPane.showMessageDialog(DeleteStudent.this,"Student deleted successfully","Success!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(DeleteStudent.this,"Sorry, unable to delete!","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField idfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
