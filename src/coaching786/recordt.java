/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package coaching786;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HUSSAIN
 */
public class recordt extends javax.swing.JFrame {

    /**
     * Creates new form recordt
     */
    public recordt() {
        initComponents();
        getRecordst();
    }

    public void getRecordst(){
        
       sql s=new sql();
       ResultSet rs=s.getteacherrecord();
       
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        try {
            while(rs.next()){
                 String row[]={rs.getString("id"),rs.getString("name"),rs.getString("faculity"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("sallery"),rs.getString("other"),rs.getString("total")};
                tb.addRow(row);
    
            }} 
        catch(Exception e){
            System.out.println(e);  
        }}

    /**
     ")
* This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        teachertext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        deletet = new javax.swing.JButton();
        searcht = new javax.swing.JButton();
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Capturek.PNG"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("TEACHERS RECORDS");

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "FACULITY", "MONTH", "DATE", "YEAR", "AMOUNT", "OTHER", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        teachertext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        teachertext.setText("ENTER TEACHER NAME");
        teachertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachertextActionPerformed(evt);
            }
        });
        teachertext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teachertextKeyReleased(evt);
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

        deletet.setBackground(new java.awt.Color(255, 0, 0));
        deletet.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deletet.setText("DELETE");
        deletet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletetActionPerformed(evt);
            }
        });
        deletet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deletetKeyPressed(evt);
            }
        });

        searcht.setBackground(new java.awt.Color(0, 153, 0));
        searcht.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searcht.setText("SEARCH");
        searcht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtActionPerformed(evt);
            }
        });
        searcht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtKeyPressed(evt);
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
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(teachertext, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(searcht)
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(deletet))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teachertext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searcht)
                    .addComponent(jButton1)
                    .addComponent(deletet))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//edit//
        EDITT E=new EDITT(teachertext.getText());
       E.setVisible(true);
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void teachertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teachertextActionPerformed

    private void searchtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtActionPerformed
        // TODO add your handling code here:
//search//
        sql s=new sql();
        ResultSet rs=s.Searchteacherrecords(teachertext.getText());
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        tb.setRowCount(0);
        try{
           while(rs.next()){
              String row[]={rs.getString("id"),rs.getString("name"),rs.getString("faculity"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("sallery"),rs.getString("other")};
                tb.addRow(row);
           }
        }catch(Exception e){
        System.out.println(e);
        }   
        
        
    }//GEN-LAST:event_searchtActionPerformed

    private void teachertextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teachertextKeyReleased
         sql s=new sql();
        ResultSet rs=s.Searchteacherrecords(teachertext.getText());
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        tb.setRowCount(0);
        try{
           while(rs.next()){
              String row[]={rs.getString("id"),rs.getString("name"),rs.getString("faculity"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("sallery"),rs.getString("other")};
                tb.addRow(row);
           }
        }catch(Exception e){
        System.out.println(e);
        }       // TODO add your handling code here:
    }//GEN-LAST:event_teachertextKeyReleased

    private void deletetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletetActionPerformed
//dlte//
        sql s=new sql();
    s.deleteteacherRecord(teachertext.getText());
        getRecordst();  
        JOptionPane.showMessageDialog(this, "RECORD DELETED SUCCESFULLY");        // TODO add your handling code here:
    }//GEN-LAST:event_deletetActionPerformed

    private void searchtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtKeyPressed


if(evt.getKeyCode()==KeyEvent.VK_ENTER){   sql s=new sql();
        ResultSet rs=s.Searchteacherrecords(teachertext.getText());
        DefaultTableModel tb=(DefaultTableModel)jTable1.getModel();
        tb.setRowCount(0);
        try{
           while(rs.next()){
              String row[]={rs.getString("id"),rs.getString("name"),rs.getString("faculity"),rs.getString("month"),rs.getString("date"),rs.getString("year"),rs.getString("sallery"),rs.getString("other")};
                tb.addRow(row);
           }
        }catch(Exception e){
        System.out.println(e);
        }   }        // TODO add your handling code here:
    }//GEN-LAST:event_searchtKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        

if(evt.getKeyCode()==KeyEvent.VK_ENTER){        EDITT E=new EDITT(teachertext.getText());
       E.setVisible(true);
       dispose(); }
    }//GEN-LAST:event_jButton1KeyPressed

    private void deletetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deletetKeyPressed


if(evt.getKeyCode()==KeyEvent.VK_ENTER){        sql s=new sql();
    s.deleteteacherRecord(teachertext.getText());
        getRecordst();  
        JOptionPane.showMessageDialog(this, "RECORD DELETED SUCCESFULLY");   }        // TODO add your handling code here:
    }//GEN-LAST:event_deletetKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        strecord s=new strecord();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
if(evt.getKeyCode()==KeyEvent.VK_ENTER){        strecord s=new strecord();
        s.setVisible(true);
        dispose();}
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(recordt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recordt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletet;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searcht;
    private javax.swing.JTextField teachertext;
    // End of variables declaration//GEN-END:variables
}
