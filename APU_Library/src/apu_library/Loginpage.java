package apu_library;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Loginpage extends javax.swing.JFrame {
public String filePath = "Adminlist.txt";
public String userNameInput;
public String passwordInput;
public FileReader fr;
public BufferedReader br;

    public Loginpage() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordtxt = new javax.swing.JPasswordField();
        usernametxt = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        titlelbl = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();
        usernamelbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APU Library Management System");
        setLocation(new java.awt.Point(480, 230));
        setPreferredSize(new java.awt.Dimension(920, 506));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordtxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 300, 40));

        usernametxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 300, 40));

        passwordlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(255, 255, 255));
        passwordlbl.setText("Password:");
        getContentPane().add(passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        titlelbl.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        titlelbl.setText("APU Library Management System");
        getContentPane().add(titlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));
        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Exitbtn.jpg"))); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 140, 60));

        loginbtn.setBackground(new java.awt.Color(255, 255, 255));
        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Loginbtn.jpg"))); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 140, 60));

        showpass.setBackground(java.awt.SystemColor.text);
        showpass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showpass.setForeground(new java.awt.Color(255, 255, 255));
        showpass.setText("Show Password");
        showpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpassMouseClicked(evt);
            }
        });
        getContentPane().add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        usernamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        usernamelbl.setText("Username:");
        usernamelbl.setToolTipText("");
        usernamelbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(usernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Loginpg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

public String getfilePath(){
    return filePath;
}

public String getuserNameInput(){
    return userNameInput;
}

public String getpasswordInput(){
    return passwordInput;
}
    
    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        try {
            userNameInput = usernametxt.getText();
            passwordInput = passwordtxt.getText();

            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            boolean LoginSuccess = false;
            String record;

            while ((record = br.readLine()) != null) {
                String[] split = record.split(",");

                if (userNameInput.equals(split[0]) && passwordInput.equals(split[1])) {
                    JOptionPane.showMessageDialog(null, "Login Successfully!");
                    setVisible(false);
                    LoginSuccess = true;
                    new Homepage().setVisible(true);
                    break;
                }
            }

            if (userNameInput.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your username.");
            } else if (passwordInput.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your password.");
            } else if (!LoginSuccess) {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void showpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpassMouseClicked
        if (showpass.isSelected()) {
            passwordtxt.setEchoChar((char) 0);
        } else {
            passwordtxt.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassMouseClicked

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
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
