package apu_library;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Renewpage extends javax.swing.JFrame {
int select = Homepage.issuebooklist.getSelectedRow();
public String filePath = "Issuebooklist.txt";
private Object IID;
private Object BID;
private Object UID;
private Object Borrow;
private Object Return;
private String sIID;
private String sUID;
private String sBID;
private String sBorrow;
private String sReturn;

private String newID;
private String newUID;
private String newBID;
private String newReturn;
private String newStatus;

   
    public Renewpage() {
        initComponents();
        
        IID = Homepage.issuebooklist.getModel().getValueAt(select, 0);
        BID = Homepage.issuebooklist.getModel().getValueAt(select, 1);
        UID = Homepage.issuebooklist.getModel().getValueAt(select, 2);
        Borrow = Homepage.issuebooklist.getModel().getValueAt(select, 3);
        Return = Homepage.issuebooklist.getModel().getValueAt(select, 4);
        
        sIID = String.valueOf(IID);
        sBID = String.valueOf(BID);
        sUID = String.valueOf(UID);
        sBorrow = String.valueOf(Borrow);
        sReturn = String.valueOf(Return);
        LocalDate newDate = LocalDate.parse(sReturn, DateTimeFormatter.ISO_LOCAL_DATE).plusDays(7);
        Date date = Date.from(newDate.atStartOfDay().toInstant(ZoneOffset.UTC));
        
        iidtxt.setText(sIID);
        bidtxt.setText(sBID);
        uidtxt.setText(sUID);
        borrowtxt.setText(sBorrow);
        oldreturntxt.setText(sReturn);
        newreturntxt.setDate(date);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bidlbl = new javax.swing.JLabel();
        returnlbl = new javax.swing.JLabel();
        uidlbl = new javax.swing.JLabel();
        borrowlbl = new javax.swing.JLabel();
        iidtxt = new javax.swing.JTextField();
        bidtxt = new javax.swing.JTextField();
        uidtxt = new javax.swing.JTextField();
        titlelbl = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        iidlbl = new javax.swing.JLabel();
        borrowtxt = new javax.swing.JTextField();
        cancelbtn = new javax.swing.JButton();
        newreturntxt = new com.toedter.calendar.JDateChooser();
        returnlbl1 = new javax.swing.JLabel();
        oldreturntxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Renew Issue");
        setLocation(new java.awt.Point(600, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bidlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        bidlbl.setText("Book ID:");
        getContentPane().add(bidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 228, -1, -1));

        returnlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        returnlbl.setText("Old Return Date:");
        getContentPane().add(returnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        uidlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        uidlbl.setText("User ID:");
        getContentPane().add(uidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 307, -1, -1));

        borrowlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        borrowlbl.setText("Borrow Date:");
        getContentPane().add(borrowlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        iidtxt.setEditable(false);
        iidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        iidtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(iidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 139, 75, 40));

        bidtxt.setEditable(false);
        bidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bidtxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(bidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 221, 200, -1));

        uidtxt.setEditable(false);
        uidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uidtxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(uidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 300, 200, -1));

        titlelbl.setBackground(new java.awt.Color(255, 51, 204));
        titlelbl.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        titlelbl.setText("Renew Issue");
        getContentPane().add(titlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        updatebtn.setBackground(new java.awt.Color(255, 255, 255));
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Updatebtn.jpg"))); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, -1));

        iidlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        iidlbl.setText("Issue ID:");
        getContentPane().add(iidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 146, -1, -1));

        borrowtxt.setEditable(false);
        borrowtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        borrowtxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(borrowtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 200, -1));

        cancelbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Exitbtn.jpg"))); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, -1));

        newreturntxt.setDateFormatString("yyyy-MM-dd");
        newreturntxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newreturntxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                newreturntxtPropertyChange(evt);
            }
        });
        getContentPane().add(newreturntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 200, 40));

        returnlbl1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        returnlbl1.setText("New Return Date:");
        getContentPane().add(returnlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        oldreturntxt.setEditable(false);
        oldreturntxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        oldreturntxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(oldreturntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Updatepg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

public String getsIID(){
    return sIID;
}

public String getsBID(){
    return sBID;
}

public String getsUID(){
    return sUID;
}

public String getsBorrow(){
    return sBorrow;
}

public String getsReturn(){
    return sReturn;
}

public String getnewID(){
    return newID;
}

public String getnewUID(){
    return newUID;
}

public String getnewBID(){
    return newBID;
}

public String setnewReturn(){
    return newReturn;
}

public String setnewStatus(){
    return newStatus;
}

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        Date date = newreturntxt.getDate();        
        SimpleDateFormat abc = new SimpleDateFormat("yyyy-MM-dd");
        String strdate = abc.format(date);
        
        newID = iidtxt.getText();
        newBID = bidtxt.getText();
        newUID = uidtxt.getText();
        newReturn = borrowtxt.getText();
        newStatus = "Renewed";
        
        Homepage.issuebooklist.getModel().setValueAt(newID, select, 0);
        Homepage.issuebooklist.getModel().setValueAt(newBID, select, 1);
        Homepage.issuebooklist.getModel().setValueAt(newUID, select, 2);
        Homepage.issuebooklist.getModel().setValueAt(newReturn, select, 3);
        Homepage.issuebooklist.getModel().setValueAt(strdate, select, 4);
        Homepage.issuebooklist.getModel().setValueAt(newStatus, select, 6);
        
        File file = new File(filePath);
      try {
          FileWriter fw = new FileWriter(file);
          BufferedWriter bw = new BufferedWriter(fw);
          
          for(int i = 0; i < Homepage.issuebooklist.getRowCount(); i++){
              for(int j = 0; j < Homepage.issuebooklist.getColumnCount(); j++){
                  bw.write(Homepage.issuebooklist.getValueAt(i,j).toString()+",");
              }
              bw.newLine();
      }
          JOptionPane.showMessageDialog(null, "Book Renewed!");
          bw.close();
          fw.close();
          setVisible(false);
      }
      catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Fail");
      }
       
    }//GEN-LAST:event_updatebtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void newreturntxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_newreturntxtPropertyChange
        updatebtn.setEnabled(true);
    }//GEN-LAST:event_newreturntxtPropertyChange

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
            java.util.logging.Logger.getLogger(Renewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renewpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renewpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bidlbl;
    private javax.swing.JTextField bidtxt;
    private javax.swing.JLabel borrowlbl;
    private javax.swing.JTextField borrowtxt;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JLabel iidlbl;
    private javax.swing.JTextField iidtxt;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser newreturntxt;
    private javax.swing.JTextField oldreturntxt;
    private javax.swing.JLabel returnlbl;
    private javax.swing.JLabel returnlbl1;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel uidlbl;
    private javax.swing.JTextField uidtxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}