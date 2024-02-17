
package coaching786;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUSSAIN
 */
public class records extends javax.swing.JFrame {

    /**
     * Creates new form records
     */
    public records() {
        initComponents();
 getRecords();
    }

public void getRecords(){
        
       sql s=new sql();
       ResultSet rs=s.getstudentrecord();
       
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        try {
            while(rs.next()){
                 String row[]={rs.getString("id"),rs.getString("name"),rs.getString("class"),rs.getString("sec"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("fees"),rs.getString("other"),rs.getString("total")};
                tb.addRow(row);
    
            }} 
        catch(Exception e){
            System.out.println(e);  
        }}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        studenttext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/444-4446616_page-under-construction-ui-ux-design-illustration-hd.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("STUDENTS RECORDS");

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "CLASS", "SEC", "MONTH", "DATE", "YEAR", "AMOUNT", "OTHER", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        studenttext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        studenttext.setText("ENTER STUDENT NAME");
        studenttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studenttextActionPerformed(evt);
            }
        });
        studenttext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studenttextKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("EDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        search.setBackground(new java.awt.Color(0, 153, 0));
        search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(studenttext, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(search)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)))))
                        .addContainerGap(114, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(144, 144, 144))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studenttext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search)
                            .addComponent(jButton1)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){strecord s=new strecord();
            s.setVisible(true);
            dispose();}// TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        strecord s=new strecord();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){   sql s=new sql();
            ResultSet rs=s.Searchstudentrecords(studenttext.getText());
            DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
            tb.setRowCount(0);
            try{
                while(rs.next()){
                    String data[]={rs.getString("id"),rs.getString("name"),rs.getString("class"),rs.getString("sec"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("fees"),rs.getString("other")};

                    tb.addRow(data);
                }
            }catch(Exception e){
                System.out.println(e);
            }  }        // TODO add your handling code here:
    }//GEN-LAST:event_searchKeyPressed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        //search//
        sql s=new sql();
        ResultSet rs=s.Searchstudentrecords(studenttext.getText());    
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        tb.setRowCount(0);
        try{
            while(rs.next()){
                String data[]={rs.getString("id"),rs.getString("name"),rs.getString("class"),rs.getString("sec"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("fees"),rs.getString("other")};

                tb.addRow(data);
            }
        }catch(Exception e){
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    
    
    
    
    
    
    
    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){  sql s=new sql();
            s.deletestudentRecord(studenttext.getText());
            getRecords();
            JOptionPane.showMessageDialog(this, "RECORD DELETED SUCCESFULLY");}
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //dlete/
        sql s=new sql();
        s.deletestudentRecord(studenttext.getText());
        getRecords();
        JOptionPane.showMessageDialog(this, "RECORD DELETED SUCCESFULLY");// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){     EDIT E=new EDIT(studenttext.getText());
            E.setVisible(true);
            dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //edit//
        EDIT E=new EDIT(studenttext.getText());
        E.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void studenttextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studenttextKeyReleased
        // TODO add your handling code here:
        sql s=new sql();
        ResultSet rs=s.Searchstudentrecords(studenttext.getText());
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        tb.setRowCount(0);
        try{
            while(rs.next()){
                String data[]={rs.getString("id"),rs.getString("name"),rs.getString("class"),rs.getString("sec"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("fees"),rs.getString("other")};

                tb.addRow(data);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_studenttextKeyReleased

    private void studenttextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studenttextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studenttextActionPerformed

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
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton search;
    private javax.swing.JTextField studenttext;
    // End of variables declaration//GEN-END:variables
}
