/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.io.File;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import DAO.My_CNX;
import DAO.My_CNX;
import Controller.Controler_Patient;
import Model.UserList;



/**
 *
 * @author Paul
 */
public class Register_form_patient extends javax.swing.JFrame {

    /**
     * Creates new form Register_form_patient
     */
    
    //Create a variable to set the image path
    String image_path=null;
    private Controler_Patient ConPatient;
    private UserList UL;
    public Register_form_patient(UserList U) {
        UL=U;
        initComponents();
        //center form
        this.setLocationRelativeTo(null);
        ConPatient = new Controler_Patient(UL);
         //Creer une borbure jaune pour le Jpanel titre
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        jPanel_title.setBorder(jpanel_title_border);
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_hind.setBorder(label_border);
        
        //create a group for radiobutton
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Male);
        bg.add(jRadioButton_Female);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField_Phone1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_hind = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton_Register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Phone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Fullname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_Phone2 = new javax.swing.JTextField();

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextField_Phone1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jLabel_hind.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_hind.setText(" -");
        jLabel_hind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_hind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_hindMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_hindMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_hindMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_close.setText(" X");
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jPanel_title.setBackground(new java.awt.Color(110, 89, 222));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("New Client");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(74, 74, 74))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel_hind, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_hind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        jButton_Register.setBackground(new java.awt.Color(110, 89, 222));
        jButton_Register.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Register.setText("Register");
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseExited(evt);
            }
        });
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Full Name :");

        jTextField_Phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Confirm Password :");

        jTextField_Fullname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email :");

        jTextField_Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Password :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Gender :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Phone Number :");

        jRadioButton_Male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        jRadioButton_Female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton_Female.setText("Female");

        jPasswordField_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPasswordField_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Your age :");

        jTextField_Phone2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Phone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Phone2ActionPerformed(evt);
            }
        });
        jTextField_Phone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Phone2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPasswordField_1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addComponent(jPasswordField_2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Phone2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(135, 135, 135))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton_Male)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Female)))))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_Phone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton_Male)
                    .addComponent(jRadioButton_Female))
                .addGap(35, 35, 35)
                .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_hindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_hindMouseClicked

    }//GEN-LAST:event_jLabel_hindMouseClicked

    private void jLabel_hindMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_hindMouseEntered

        // change kes bords en blanc
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_hind.setBorder(label_border);
        // Change le trait en blanc
        jLabel_hind.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_hindMouseEntered

    private void jLabel_hindMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_hindMouseExited

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_hind.setBorder(label_border);
        jLabel_hind.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_hindMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked

        new menu().setVisible(true);
        dispose();

    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered

        // change kes bords en blanc
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        // Change le trait en blanc
        jLabel_close.setForeground(Color.white);

    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited

        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.black);

    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
        // get data from fields
         String fname = jTextField_Fullname.getText();
         String email = jTextField_Email.getText();
         String pass1 = String.valueOf(jPasswordField_1.getPassword());
         String pass2 = String.valueOf(jPasswordField_2.getPassword());
         String phone = jTextField_Phone.getText();
         String age = jTextField_Phone2.getText();
         String gender = "Male";
         
         if(jRadioButton_Female.isSelected()){
             gender = "Female";
         }
         
        ConPatient.Verify_Register(fname,email,pass1,pass2,phone,age,gender);
        
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jButton_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseEntered
        // TODO add your handling code here:
        jButton_Register.setForeground(Color.white);
    }//GEN-LAST:event_jButton_RegisterMouseEntered

    private void jButton_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseExited
        // TODO add your handling code here:
        jButton_Register.setForeground(Color.black);
    }//GEN-LAST:event_jButton_RegisterMouseExited

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        // allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_PhoneKeyTyped
                                                             

    private void jTextField_Phone2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Phone2KeyTyped

        // allow only numbers
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_jTextField_Phone2KeyTyped

    private void jTextField_Phone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Phone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Phone2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Register;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_hind;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Fullname;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Phone1;
    private javax.swing.JTextField jTextField_Phone2;
    // End of variables declaration//GEN-END:variables
}
