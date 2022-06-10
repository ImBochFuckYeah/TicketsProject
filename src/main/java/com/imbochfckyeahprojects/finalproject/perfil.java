/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.imbochfckyeahprojects.finalproject;

import javax.swing.JOptionPane;
import java.util.regex.*;

/**
 *
 * @author imbochfuckyeah
 */
public class perfil extends javax.swing.JFrame {
    
    /**
     * Creates new form edituser
     */
    public perfil() {
        initComponents();
        this.setLocationRelativeTo(null);
        getdata();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbackground = new javax.swing.JPanel();
        jdivclass = new javax.swing.JPanel();
        jtitle = new javax.swing.JLabel();
        jsubtitle = new javax.swing.JLabel();
        btupdate = new javax.swing.JButton();
        jeditPassword = new javax.swing.JPasswordField();
        jeditName = new javax.swing.JTextField();
        jeditLastname = new javax.swing.JTextField();
        jeditEmail = new javax.swing.JTextField();
        jbackmenu = new javax.swing.JLabel();
        jeditUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbackground.setBackground(new java.awt.Color(0, 153, 204));

        jdivclass.setBackground(new java.awt.Color(255, 255, 255));

        jtitle.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jtitle.setForeground(new java.awt.Color(102, 102, 102));
        jtitle.setText("My perfil");

        jsubtitle.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jsubtitle.setForeground(new java.awt.Color(0, 153, 204));
        jsubtitle.setText("Update your user data.");

        btupdate.setBackground(new java.awt.Color(0, 153, 204));
        btupdate.setFont(new java.awt.Font("Montserrat", 1, 15)); // NOI18N
        btupdate.setForeground(new java.awt.Color(255, 255, 255));
        btupdate.setText("Update user");
        btupdate.setBorder(null);
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        jeditPassword.setBackground(new java.awt.Color(249, 249, 249));
        jeditPassword.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jeditPassword.setForeground(new java.awt.Color(153, 153, 153));
        jeditPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jeditPassword.setText("password");
        jeditPassword.setBorder(null);
        jeditPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditPasswordActionPerformed(evt);
            }
        });

        jeditName.setBackground(new java.awt.Color(249, 249, 249));
        jeditName.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jeditName.setForeground(new java.awt.Color(153, 153, 153));
        jeditName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jeditName.setText(" Name");
        jeditName.setToolTipText("");
        jeditName.setBorder(null);

        jeditLastname.setBackground(new java.awt.Color(249, 249, 249));
        jeditLastname.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jeditLastname.setForeground(new java.awt.Color(153, 153, 153));
        jeditLastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jeditLastname.setText("Lastname");
        jeditLastname.setToolTipText("");
        jeditLastname.setBorder(null);

        jeditEmail.setBackground(new java.awt.Color(249, 249, 249));
        jeditEmail.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jeditEmail.setForeground(new java.awt.Color(153, 153, 153));
        jeditEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jeditEmail.setText("Email");
        jeditEmail.setToolTipText("");
        jeditEmail.setBorder(null);

        jbackmenu.setFont(new java.awt.Font("Comfortaa", 0, 10)); // NOI18N
        jbackmenu.setForeground(new java.awt.Color(102, 102, 102));
        jbackmenu.setText("Back to menu");
        jbackmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbackmenuMouseClicked(evt);
            }
        });

        jeditUser.setBackground(new java.awt.Color(249, 249, 249));
        jeditUser.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jeditUser.setForeground(new java.awt.Color(153, 153, 153));
        jeditUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jeditUser.setText("User");
        jeditUser.setToolTipText("");
        jeditUser.setBorder(null);

        javax.swing.GroupLayout jdivclassLayout = new javax.swing.GroupLayout(jdivclass);
        jdivclass.setLayout(jdivclassLayout);
        jdivclassLayout.setHorizontalGroup(
            jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdivclassLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivclassLayout.createSequentialGroup()
                        .addComponent(jbackmenu)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivclassLayout.createSequentialGroup()
                        .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jeditPassword)
                                .addComponent(jeditName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jeditLastname)
                                .addComponent(jeditEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jeditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivclassLayout.createSequentialGroup()
                        .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtitle)
                            .addComponent(jsubtitle))
                        .addGap(140, 140, 140))))
        );
        jdivclassLayout.setVerticalGroup(
            jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdivclassLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jeditName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jeditLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jeditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jeditEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jeditPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbackmenu)
                .addContainerGap())
        );

        javax.swing.GroupLayout jbackgroundLayout = new javax.swing.GroupLayout(jbackground);
        jbackground.setLayout(jbackgroundLayout);
        jbackgroundLayout.setHorizontalGroup(
            jbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdivclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jbackgroundLayout.setVerticalGroup(
            jbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jdivclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jeditPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeditPasswordActionPerformed

    private void jbackmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbackmenuMouseClicked
        // TODO add your handling code here:
        menuusers view = new menuusers(menuusers.user);
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbackmenuMouseClicked

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // TODO add your handling code here:
        updatedata();
    }//GEN-LAST:event_btupdateActionPerformed

    public void getdata(){
        for(newusers u : masterclass.users){
            if(menuusers.user.getUser().equals(u.getUser())){
                jeditName.setText(u.getName());
                jeditLastname.setText(u.getLastname());
                jeditUser.setText(u.getUser());
                jeditEmail.setText(u.getEmail());
                jeditPassword.setText(u.getPassword());
            }
        }
    }
    
    public void updatedata(){
        for(newusers userdata : masterclass.users){
            if(userdata.getUser().equals(menuusers.user.getUser())){
                    //Password validation
                String PATTERN = "^(?=.*[AZ])(?=.*[az])(?=.*[0-9]).{8,20}$";
                Pattern patt = Pattern.compile(PATTERN);
                Matcher match = patt.matcher(jeditPassword.getText());
                /////////////////////
                if(!match.matches()){
                    JOptionPane.showMessageDialog(this, "Password format incorrect, try again.");
                }else{
                userdata.setName(jeditName.getText());
                userdata.setLastname(jeditLastname.getText());
                userdata.setUser(jeditUser.getText());
                userdata.setEmail(jeditEmail.getText());
                userdata.setPassword(jeditPassword.getText());
                menuusers.user.setName(jeditName.getText());
                menuusers.user.setLastname(jeditLastname.getText());
                menuusers.user.setUser(jeditUser.getText());
                menuusers.user.setEmail(jeditEmail.getText());
                menuusers.user.setPassword(jeditPassword.getText());
                JOptionPane.showMessageDialog(this, "User data updated successfully.");
                }
            }else{
                JOptionPane.showMessageDialog(this, "An error has occurred, plase try again.");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btupdate;
    private javax.swing.JPanel jbackground;
    private javax.swing.JLabel jbackmenu;
    private javax.swing.JPanel jdivclass;
    private javax.swing.JTextField jeditEmail;
    private javax.swing.JTextField jeditLastname;
    private javax.swing.JTextField jeditName;
    private javax.swing.JPasswordField jeditPassword;
    private javax.swing.JTextField jeditUser;
    private javax.swing.JLabel jsubtitle;
    private javax.swing.JLabel jtitle;
    // End of variables declaration//GEN-END:variables
}