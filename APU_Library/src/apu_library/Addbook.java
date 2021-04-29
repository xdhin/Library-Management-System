package apu_library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Addbook extends javax.swing.JFrame {
private String ID;
private String Name;
private String Author;
private String Type;
private String Year;

    public Addbook() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        authorlbl = new javax.swing.JLabel();
        booktypelbl = new javax.swing.JLabel();
        yearlbl = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        authortxt = new javax.swing.JTextField();
        yeartxt = new javax.swing.JTextField();
        typecmb = new javax.swing.JComboBox<>();
        addbtn = new javax.swing.JButton();
        cancelbtn = new javax.swing.JButton();
        idbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add New Book");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(630, 180));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlelbl.setBackground(new java.awt.Color(255, 51, 204));
        titlelbl.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        titlelbl.setText("Add New Book");
        getContentPane().add(titlelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 38, -1, -1));

        idlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        idlbl.setText("Book ID:");
        getContentPane().add(idlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 138, -1, -1));

        namelbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        namelbl.setText("Book Name:");
        getContentPane().add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 220, -1, -1));

        authorlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        authorlbl.setText("Author:");
        getContentPane().add(authorlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 299, -1, -1));

        booktypelbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        booktypelbl.setText("Book Type:");
        getContentPane().add(booktypelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 373, -1, -1));

        yearlbl.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        yearlbl.setText("Published Year:");
        getContentPane().add(yearlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 456, -1, -1));

        idtxt.setEditable(false);
        idtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 131, 75, 40));

        nametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nametxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 213, 200, -1));

        authortxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        authortxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(authortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 292, 200, -1));

        yeartxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeartxt.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(yeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 449, 200, -1));

        typecmb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        typecmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Select a genre)", "Horror", "Sci-Fi", "Action", "Romance", "History", "Comic", "Adventure", "Cooking", "Art", "Health", "Travel" }));
        typecmb.setPreferredSize(new java.awt.Dimension(0, 40));
        getContentPane().add(typecmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 373, 200, -1));

        addbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Addbookbtn.jpg"))); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 140, 60));

        cancelbtn.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Exitbtn.jpg"))); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 140, 60));

        idbtn.setText("ID");
        idbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbtnActionPerformed(evt);
            }
        });
        getContentPane().add(idbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 138, 66, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Addpg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

public String getID(){
    return ID;
}

public String getName(){
    return Name;
}

public String getAuthor(){
    return Author;
}
 
public String getYear(){
    return Year;
}
    
    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        ID = idtxt.getText();
        Name = nametxt.getText();
        Author = authortxt.getText();
        Type = typecmb.getSelectedItem().toString();
        Year = yeartxt.getText();
        
        if(ID.equals(""))
            JOptionPane.showMessageDialog(null, "Please Insert ID.");
        else if(Name.equals(""))
            JOptionPane.showMessageDialog(null, "Please Insert Name.");
        else if(Author.equals(""))
            JOptionPane.showMessageDialog(null, "Please Insert Author.");
        else if(Type.equals("(Select a genre)"))
            JOptionPane.showMessageDialog(null, "Please Select a Genre.");
        else if(Year.equals(""))
            JOptionPane.showMessageDialog(null, "Please Insert Published Year.");
        else{
        try 
        {
            FileWriter writer = new FileWriter("Booklist.txt",true);
            writer.write(ID+","+Name+","+Author+","+Type+","+Year+"\n");
            writer.close();
            JOptionPane.showMessageDialog(null, "New Book Added");
            setVisible(false);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
       setVisible(false);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void idbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbtnActionPerformed
       try
        {
        String filePath = "Booklist.txt";
        File file = new File(filePath);
        String last=null, lastrow;
        BufferedReader in = new BufferedReader(new FileReader(file));
        while ((lastrow = in.readLine()) != null) {
            last = lastrow;
        if (lastrow != null) {
        last = lastrow;
        }
        }
        String[] columns = last.split(",");
        int lastID = Integer.parseInt(columns[0])+ 1;
        String slastnum = String.valueOf(lastID);
        idtxt.setText(slastnum);
        in.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "fail");
        }
                                           
    }//GEN-LAST:event_idbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(() -> {
            new Addbook().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel authorlbl;
    private javax.swing.JTextField authortxt;
    private javax.swing.JLabel booktypelbl;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton idbtn;
    private javax.swing.JLabel idlbl;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel titlelbl;
    private javax.swing.JComboBox<String> typecmb;
    private javax.swing.JLabel yearlbl;
    private javax.swing.JTextField yeartxt;
    // End of variables declaration//GEN-END:variables
}