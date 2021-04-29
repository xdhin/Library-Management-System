package apu_library;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Homepage extends javax.swing.JFrame {
public String filePath1 = "Booklist.txt";
public String filePath2 = "IssueBooklist.txt";
public FileWriter fw;
public BufferedReader br;
public BufferedWriter bw;

    public Homepage() {
        initComponents();
        savebookbtn.setEnabled(false);
        renewbtn.setEnabled(false);
        returnbtn.setEnabled(false);
        booktxt.setEnabled(false);
        issuetxt.setEnabled(false);
        booklist.setRowHeight(booklist.getRowHeight() + 10);
        issuebooklist.setRowHeight(issuebooklist.getRowHeight() + 10);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addbookbtn = new javax.swing.JButton();
        issuebtn = new javax.swing.JButton();
        viewissuebtn = new javax.swing.JButton();
        renewbtn = new javax.swing.JButton();
        savebookbtn = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        logoutbtn = new javax.swing.JButton();
        titlelbl2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        booklist = new javax.swing.JTable();
        viewbookbtn = new javax.swing.JButton();
        deletebookbtn = new javax.swing.JButton();
        titlelbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        issuebooklist = new javax.swing.JTable();
        booktxt = new javax.swing.JTextField();
        issuetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homepage");
        setLocation(new java.awt.Point(300, 140));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addbookbtn.setBackground(new java.awt.Color(255, 255, 255));
        addbookbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        addbookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Addbookbtn.jpg"))); // NOI18N
        addbookbtn.setText("          Add New Book");
        addbookbtn.setPreferredSize(new java.awt.Dimension(265, 60));
        addbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 300, -1));
        addbookbtn.getAccessibleContext().setAccessibleName("");

        issuebtn.setBackground(new java.awt.Color(255, 255, 255));
        issuebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        issuebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Issuebookbtn.jpg"))); // NOI18N
        issuebtn.setText("               Issue Book");
        issuebtn.setPreferredSize(new java.awt.Dimension(265, 60));
        issuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebtnActionPerformed(evt);
            }
        });
        getContentPane().add(issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 300, -1));
        issuebtn.getAccessibleContext().setAccessibleName("");

        viewissuebtn.setBackground(new java.awt.Color(255, 255, 255));
        viewissuebtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        viewissuebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Viewbookbtn.jpg"))); // NOI18N
        viewissuebtn.setText("View Issued Booklist");
        viewissuebtn.setPreferredSize(new java.awt.Dimension(265, 60));
        viewissuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewissuebtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewissuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 300, 60));
        viewissuebtn.getAccessibleContext().setAccessibleName("");

        renewbtn.setBackground(new java.awt.Color(255, 255, 255));
        renewbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        renewbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Updatebtn.jpg"))); // NOI18N
        renewbtn.setText("  Renew Issued Book");
        renewbtn.setPreferredSize(new java.awt.Dimension(265, 60));
        renewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renewbtnActionPerformed(evt);
            }
        });
        getContentPane().add(renewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 300, 60));

        savebookbtn.setBackground(new java.awt.Color(255, 255, 255));
        savebookbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        savebookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Savebookbtn.jpg"))); // NOI18N
        savebookbtn.setText("          Save Book List");
        savebookbtn.setPreferredSize(new java.awt.Dimension(265, 60));
        savebookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 300, -1));
        savebookbtn.getAccessibleContext().setAccessibleName("");

        returnbtn.setBackground(new java.awt.Color(255, 255, 255));
        returnbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        returnbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Returnbtn.jpg"))); // NOI18N
        returnbtn.setText("                       Return");
        returnbtn.setPreferredSize(new java.awt.Dimension(265, 60));
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        getContentPane().add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 300, 60));

        logoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        logoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Logoutbtn.jpg"))); // NOI18N
        logoutbtn.setText("Logout");
        logoutbtn.setPreferredSize(new java.awt.Dimension(265, 45));
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 710, -1, 60));
        logoutbtn.getAccessibleContext().setAccessibleName("");

        titlelbl2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        titlelbl2.setForeground(new java.awt.Color(255, 255, 255));
        titlelbl2.setText("Issue Book List");
        getContentPane().add(titlelbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 400, -1));

        booklist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        booklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Author", "Book Type", "Published Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(booklist);
        if (booklist.getColumnModel().getColumnCount() > 0) {
            booklist.getColumnModel().getColumn(0).setResizable(false);
            booklist.getColumnModel().getColumn(0).setPreferredWidth(20);
            booklist.getColumnModel().getColumn(1).setResizable(false);
            booklist.getColumnModel().getColumn(2).setResizable(false);
            booklist.getColumnModel().getColumn(3).setResizable(false);
            booklist.getColumnModel().getColumn(3).setPreferredWidth(30);
            booklist.getColumnModel().getColumn(4).setResizable(false);
            booklist.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 760, 230));

        viewbookbtn.setBackground(new java.awt.Color(255, 255, 255));
        viewbookbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        viewbookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Viewbookbtn.jpg"))); // NOI18N
        viewbookbtn.setText("         View Book List");
        viewbookbtn.setMinimumSize(new java.awt.Dimension(233, 60));
        viewbookbtn.setPreferredSize(new java.awt.Dimension(265, 60));
        viewbookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewbookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 300, 60));

        deletebookbtn.setBackground(new java.awt.Color(255, 255, 255));
        deletebookbtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        deletebookbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Deletebookbtn.jpg"))); // NOI18N
        deletebookbtn.setText("              Delete Book");
        deletebookbtn.setPreferredSize(new java.awt.Dimension(265, 60));
        deletebookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebookbtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 300, -1));

        titlelbl1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        titlelbl1.setForeground(new java.awt.Color(255, 255, 255));
        titlelbl1.setText("Book List");
        getContentPane().add(titlelbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 343, -1));

        issuebooklist.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        issuebooklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Issue ID", "Book ID", "User ID", "Borrow Date", "Return Date", "Fine", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issuebooklist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                issuebooklistFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(issuebooklist);
        if (issuebooklist.getColumnModel().getColumnCount() > 0) {
            issuebooklist.getColumnModel().getColumn(0).setResizable(false);
            issuebooklist.getColumnModel().getColumn(0).setPreferredWidth(10);
            issuebooklist.getColumnModel().getColumn(1).setResizable(false);
            issuebooklist.getColumnModel().getColumn(1).setPreferredWidth(10);
            issuebooklist.getColumnModel().getColumn(2).setResizable(false);
            issuebooklist.getColumnModel().getColumn(2).setPreferredWidth(50);
            issuebooklist.getColumnModel().getColumn(3).setResizable(false);
            issuebooklist.getColumnModel().getColumn(4).setResizable(false);
            issuebooklist.getColumnModel().getColumn(5).setResizable(false);
            issuebooklist.getColumnModel().getColumn(5).setPreferredWidth(30);
            issuebooklist.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 760, 280));

        booktxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        booktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                booktxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                booktxtKeyReleased(evt);
            }
        });
        getContentPane().add(booktxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 60, 90, -1));

        issuetxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        issuetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                issuetxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                issuetxtKeyReleased(evt);
            }
        });
        getContentPane().add(issuetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, 90, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apu_library/picture/Homepg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

public String getfilePath1(){
    return filePath1;
}

public String getfilePath2(){
    return filePath2;
}
    
    private void addbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbookbtnActionPerformed
        new Addbook().setVisible(true);
    }//GEN-LAST:event_addbookbtnActionPerformed

    private void viewbookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbookbtnActionPerformed
        File file = new File(filePath1);
        try
        {
            br = new BufferedReader (new FileReader(file));
            DefaultTableModel model = (DefaultTableModel)booklist.getModel();
            Object[] tableLines = br.lines().toArray();
            model.setRowCount(0);
            if (booklist.getRowCount() < 0)
                savebookbtn.setEnabled(false);
            else {
                savebookbtn.setEnabled(true);
            }
            
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Booklist failed to retrieve");
        }
        
        booktxt.setEnabled(true);
        
    }//GEN-LAST:event_viewbookbtnActionPerformed

    private void savebookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebookbtnActionPerformed
        File file = new File(filePath1);
        try {
          fw = new FileWriter(file);
          bw = new BufferedWriter(fw);
          
          for(int i = 0; i < booklist.getRowCount(); i++){
              for(int j = 0; j < booklist.getColumnCount(); j++){
                  bw.write(booklist.getValueAt(i,j).toString()+",");
              }
              bw.newLine();
              }
          JOptionPane.showMessageDialog(null, "Saved");
          bw.close();
          fw.close();
        }
        catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Fail");
        }      
    }//GEN-LAST:event_savebookbtnActionPerformed

    private void deletebookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebookbtnActionPerformed
        try{
        DefaultTableModel tblModel = (DefaultTableModel) booklist.getModel();
        tblModel.removeRow(booklist.getSelectedRow());
        }
        catch (Exception e){
          JOptionPane.showMessageDialog(null, "Please Select a Book");
        }
    }//GEN-LAST:event_deletebookbtnActionPerformed

    private void issuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebtnActionPerformed
        new Issuebook().setVisible(true);
    }//GEN-LAST:event_issuebtnActionPerformed

    private void viewissuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewissuebtnActionPerformed
            File file = new File(filePath2);
            try {
                br = new BufferedReader (new FileReader(file));
                DefaultTableModel model = (DefaultTableModel)issuebooklist.getModel();
                Object[] tableLines = br.lines().toArray();
                model.setRowCount(0);
                
                for(int i = 0; i < tableLines.length; i++)
                {
                    String line = tableLines[i].toString().trim();
                    String[] dataRow = line.split(",");
                    model.addRow(dataRow);
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Booklist failed to retrieve");
            }
            
            for (int rows = 0; rows < issuebooklist.getRowCount(); rows++) {
            Object rdate = issuebooklist.getValueAt(rows,4);
            String d2 = String.valueOf(rdate); 
            
            LocalDate today = LocalDate.now();            
            LocalDate due = LocalDate.parse(d2, DateTimeFormatter.ISO_LOCAL_DATE);
            Duration diff = Duration.between(due.atStartOfDay(), today.atStartOfDay());
            long diffDays = diff.toDays();
            
            double i = 0.00;
            if(diffDays > 0){
                issuebooklist.setValueAt((i+diffDays+"0"), rows, 5);
            
                if (diffDays > 0 && issuebooklist.getValueAt(rows,6).equals("Returned")){
                issuebooklist.setValueAt("N/A",rows,5);
                }
                else if (diffDays > 0 && issuebooklist.getValueAt(rows,6).equals("Borrowed")){
                        issuebooklist.setValueAt("Overdue",rows,6);
                        }
                }
            }
            renewbtn.setEnabled(false);
            returnbtn.setEnabled(false);
            issuetxt.setEnabled(true);
    }//GEN-LAST:event_viewissuebtnActionPerformed

    private void renewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renewbtnActionPerformed
            int i = issuebooklist.getSelectedRow();
            Object rdate = issuebooklist.getValueAt(i,4);
            Object fine = issuebooklist.getValueAt(i,5);
            Object status = issuebooklist.getValueAt(i,6);
            
            String d2 = String.valueOf(rdate); 
            String sstatus = String.valueOf(status);
            String sfine = String.valueOf(fine);
            
            LocalDate today = LocalDate.now();            
            LocalDate due = LocalDate.parse(d2, DateTimeFormatter.ISO_LOCAL_DATE);
            
            Duration diff = Duration.between(due.atStartOfDay(), today.atStartOfDay());
            long diffDays = diff.toDays();
            
            if (sstatus.equals("Renewed")){
                JOptionPane.showMessageDialog(null, "Renewal limit reached.");
                }
            else if(diffDays <= 21 && sstatus.equals("Returned")){
                JOptionPane.showMessageDialog(null, "The book is returned.");
            }
            else if (diffDays > 21 && sstatus.equals("Returned")){
                JOptionPane.showMessageDialog(null, "The book is returned.");
            }
            else if (sstatus.equals("Overdue")){
                JOptionPane.showMessageDialog(null, "The book is expired, unable to renew and the fine is"+" RM"+sfine+".");
            }
            else{
                new Renewpage().setVisible(true); 
            }
    }//GEN-LAST:event_renewbtnActionPerformed

    private void issuebooklistFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_issuebooklistFocusGained
        renewbtn.setEnabled(true);
        returnbtn.setEnabled(true);
    }//GEN-LAST:event_issuebooklistFocusGained

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        File file = new File(filePath2);
        int selectrow = issuebooklist.getSelectedRow();
        issuebooklist.getModel().setValueAt("N/A", selectrow, 5);
        issuebooklist.getModel().setValueAt("Returned", selectrow, 6);
        
            try {
                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);
                for(int i = 0; i < Homepage.issuebooklist.getRowCount(); i++){
                    for(int j = 0; j < Homepage.issuebooklist.getColumnCount(); j++){
                        bw.write(Homepage.issuebooklist.getValueAt(i,j).toString()+",");
                    }
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(null, "The book returned.");
                bw.close();
                fw.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Fail");
            } 
        
    }//GEN-LAST:event_returnbtnActionPerformed

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        setVisible(false);
        new Loginpage().setVisible(true);
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void booktxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_booktxtKeyPressed
       DefaultTableModel table = (DefaultTableModel)booklist.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        booklist.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(booktxt.getText().trim()));
    }//GEN-LAST:event_booktxtKeyPressed

    private void booktxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_booktxtKeyReleased
        DefaultTableModel table = (DefaultTableModel)booklist.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        booklist.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(booktxt.getText().trim()));
    }//GEN-LAST:event_booktxtKeyReleased

    private void issuetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_issuetxtKeyPressed
        DefaultTableModel table = (DefaultTableModel)issuebooklist.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        issuebooklist.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(issuetxt.getText().trim()));
    }//GEN-LAST:event_issuetxtKeyPressed

    private void issuetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_issuetxtKeyReleased
        DefaultTableModel table = (DefaultTableModel)issuebooklist.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        issuebooklist.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(issuetxt.getText().trim()));
    }//GEN-LAST:event_issuetxtKeyReleased
            
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbookbtn;
    private javax.swing.JTable booklist;
    private javax.swing.JTextField booktxt;
    private javax.swing.JButton deletebookbtn;
    public static javax.swing.JTable issuebooklist;
    private javax.swing.JButton issuebtn;
    private javax.swing.JTextField issuetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutbtn;
    public static javax.swing.JButton renewbtn;
    private javax.swing.JButton returnbtn;
    private javax.swing.JButton savebookbtn;
    private javax.swing.JLabel titlelbl1;
    private javax.swing.JLabel titlelbl2;
    private javax.swing.JButton viewbookbtn;
    private javax.swing.JButton viewissuebtn;
    // End of variables declaration//GEN-END:variables
}