package apu_library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Issuebook extends javax.swing.JFrame {
private String ID;
private String BID;
private String UID;
private String Borrow;
private String Return;
private String fine = "0.00";
private String status = "Borrowed";
public String filePath = "IssueBooklist.txt";
public FileWriter fw;
public BufferedReader br;

    public Issuebook() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uidlbl = new javax.swing.JLabel();
        borrowlbl = new javax.swing.JLabel();
        iidtxt = new javax.swing.JTextField();
        bidtxt = new javax.swing.JTextField();
        uidtxt = new javax.swing.JTextField();
        titlelbl = new javax.swing.JLabel();
        issuebtn = new javax.swing.JButton();
        iidlbl = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JButton();
        bidlbl = new javax.swing.JLabel();
        iidbtn = new javax.swing.JButton();
        returnlbl = new javax.swing.JLabel();
        borrowtxt = new javax.swing.JTextField();
        returntxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Book");
        setLocation(new java.awt.Point(630, 180));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uidlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        uidlbl.setText("User ID:");
        getContentPane().add(uidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        borrowlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        borrowlbl.setText("Borrow Date:");
        getContentPane().add(borrowlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        iidtxt.setEditable(false);
        iidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        iidtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(iidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 75, 40));

        bidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bidtxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(bidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 200, -1));

        uidtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uidtxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(uidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 199, -1));

        titlelbl.setBackground(new java.awt.Color(255, 51, 204));
        titlelbl.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        titlelbl.setText("Issue Book");
        getContentPane().add(titlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 32, -1, -1));

        issuebtn.setBackground(new java.awt.Color(255, 255, 255));
        issuebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Issuebookbtn.jpg"))); // NOI18N
        issuebtn.setText("Issue");
        issuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebtnActionPerformed(evt);
            }
        });
        getContentPane().add(issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 143, -1));

        iidlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        iidlbl.setText("Issue ID:");
        getContentPane().add(iidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        cancelbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Exitbtn.jpg"))); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 143, -1));

        bidlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        bidlbl.setText("Book ID:");
        getContentPane().add(bidlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        iidbtn.setText("ID");
        iidbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iidbtnActionPerformed(evt);
            }
        });
        getContentPane().add(iidbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 66, -1));

        returnlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        returnlbl.setText("Return Date:");
        getContentPane().add(returnlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        borrowtxt.setEditable(false);
        borrowtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        borrowtxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(borrowtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 199, -1));

        returntxt.setEditable(false);
        returntxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        returntxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(returntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Issuepg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


public String getBID(){
    return BID;
}

public String getUID(){
    return UID;
}

public String getBorrow(){
    return Borrow;
}

public String getReturn(){
    return Return;
}

public String getstatus(){
    return status;
}
    
    private void issuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebtnActionPerformed
        ID = iidtxt.getText();
        BID = bidtxt.getText();
        UID = uidtxt.getText();
        Borrow = borrowtxt.getText();
        Return = returntxt.getText();
        fine = "0.00";
        status = "Borrowed";
        if(ID.equals(""))
        JOptionPane.showMessageDialog(null, "Please Insert ID.");
        else if(BID.equals(""))
        JOptionPane.showMessageDialog(null, "Please Insert Book ID.");
        else if(UID.equals(""))
        JOptionPane.showMessageDialog(null, "Please Insert User ID.");
        else if(Borrow.equals(""))
        JOptionPane.showMessageDialog(null, "Please Select the date.");
        else if(Return.equals(""))
        JOptionPane.showMessageDialog(null, "Please Select the date.");
       
        else{
            try
            {
                fw = new FileWriter(filePath,true);
                fw.write(ID+","+BID+","+UID+","+Borrow+","+Return+","+fine+","+status+"\n");
                fw.close();
                JOptionPane.showMessageDialog(null, "Book Issued successfully!");
                setVisible(false);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
    }//GEN-LAST:event_issuebtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void iidbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iidbtnActionPerformed
        try
        {
        File file = new File(filePath);
        String last=null, lastrow;
        br = new BufferedReader(new FileReader(file));
        while ((lastrow = br.readLine()) != null) {
            last = lastrow;
        if (lastrow != null) {
        last = lastrow;
        }
        }
        String[] columns = last.split(",");
        int lastID = Integer.parseInt(columns[0])+ 1;
        String slatestID = String.valueOf(lastID);
        iidtxt.setText(slatestID);
        br.close();
        LocalDate b = java.time.LocalDate.now();
        LocalDate r = LocalDate.now().plusDays(14);
        String bb = String.valueOf(b);
        String rr = String.valueOf(r);
        borrowtxt.setText(bb);
        returntxt.setText(rr);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "fail");
        }

    }//GEN-LAST:event_iidbtnActionPerformed

    public static void main(String args[]) {      
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
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issuebook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issuebook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bidlbl;
    private javax.swing.JTextField bidtxt;
    private javax.swing.JLabel borrowlbl;
    private javax.swing.JTextField borrowtxt;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton iidbtn;
    private javax.swing.JLabel iidlbl;
    private javax.swing.JTextField iidtxt;
    private javax.swing.JButton issuebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel returnlbl;
    private javax.swing.JTextField returntxt;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel uidlbl;
    private javax.swing.JTextField uidtxt;
    // End of variables declaration//GEN-END:variables
}