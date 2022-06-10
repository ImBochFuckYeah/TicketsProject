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
public class edituser extends javax.swing.JFrame {
    
    private newusers update;
    /**
     * Creates new form edituser
     */
    public edituser() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jsearchUser = new javax.swing.JTextField();
        jdivclass = new javax.swing.JPanel();
        jtitle = new javax.swing.JLabel();
        jsubtitle = new javax.swing.JLabel();
        btupdate = new javax.swing.JButton();
        jeditPassword = new javax.swing.JPasswordField();
        jeditName = new javax.swing.JTextField();
        jeditLastname = new javax.swing.JTextField();
        jeditEmail = new javax.swing.JTextField();
        jbackmenu = new javax.swing.JLabel();
        jeditAge = new javax.swing.JTextField();
        jeditDepartament = new javax.swing.JComboBox<>();
        jtitle1 = new javax.swing.JLabel();
        searchuser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbackground.setBackground(new java.awt.Color(0, 153, 204));

        jsearchUser.setBackground(new java.awt.Color(249, 249, 249));
        jsearchUser.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jsearchUser.setForeground(new java.awt.Color(153, 153, 153));
        jsearchUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jsearchUser.setText("User");
        jsearchUser.setToolTipText("");
        jsearchUser.setBorder(null);
        jsearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchUserActionPerformed(evt);
            }
        });

        jdivclass.setBackground(new java.awt.Color(255, 255, 255));

        jtitle.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jtitle.setForeground(new java.awt.Color(102, 102, 102));
        jtitle.setText("Edit user");

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

        jeditAge.setBackground(new java.awt.Color(249, 249, 249));
        jeditAge.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jeditAge.setForeground(new java.awt.Color(153, 153, 153));
        jeditAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jeditAge.setText("Edad");
        jeditAge.setToolTipText("");
        jeditAge.setBorder(null);
        jeditAge.setEnabled(false);

        jeditDepartament.setBackground(new java.awt.Color(249, 249, 249));
        jeditDepartament.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jeditDepartament.setForeground(new java.awt.Color(153, 153, 153));
        jeditDepartament.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select department", "Sales", "RRHH", "IT", "Accounting" }));
        jeditDepartament.setBorder(null);
        jeditDepartament.setEnabled(false);
        jeditDepartament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditDepartamentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jdivclassLayout = new javax.swing.GroupLayout(jdivclass);
        jdivclass.setLayout(jdivclassLayout);
        jdivclassLayout.setHorizontalGroup(
            jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivclassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbackmenu)
                .addGap(209, 209, 209))
            .addGroup(jdivclassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdivclassLayout.createSequentialGroup()
                        .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivclassLayout.createSequentialGroup()
                        .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivclassLayout.createSequentialGroup()
                                .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtitle)
                                    .addComponent(jsubtitle))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jeditPassword)
                                .addComponent(jeditName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jeditLastname)
                                .addComponent(jeditEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jeditAge)
                            .addComponent(jeditDepartament, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jdivclassLayout.setVerticalGroup(
            jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdivclassLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdivclassLayout.createSequentialGroup()
                        .addGroup(jdivclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jeditName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jeditDepartament, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jeditLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdivclassLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jeditAge, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jeditEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jeditPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jbackmenu)
                .addContainerGap())
        );

        jtitle1.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jtitle1.setForeground(new java.awt.Color(255, 255, 255));
        jtitle1.setText("Search user");

        searchuser.setBackground(new java.awt.Color(255, 255, 255));
        searchuser.setFont(new java.awt.Font("Montserrat", 1, 15)); // NOI18N
        searchuser.setForeground(new java.awt.Color(0, 153, 204));
        searchuser.setText("Search");
        searchuser.setBorder(null);
        searchuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchuserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jbackgroundLayout = new javax.swing.GroupLayout(jbackground);
        jbackground.setLayout(jbackgroundLayout);
        jbackgroundLayout.setHorizontalGroup(
            jbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbackgroundLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsearchUser)
                    .addComponent(jtitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jdivclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jbackgroundLayout.setVerticalGroup(
            jbackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbackgroundLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jdivclass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jbackgroundLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jtitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchuser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jsearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jsearchUserActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // TODO add your handling code here:
        if(update !=  null){
            //Password validation
            String PATTERN = "^(?=.*[AZ])(?=.*[az])(?=.*[0-9]).{8,20}$";
            Pattern patt = Pattern.compile(PATTERN);
            Matcher match = patt.matcher(jeditPassword.getText());
            /////////////////////
            if(!match.matches()){
                JOptionPane.showMessageDialog(this, "Password format incorrect, try again.");
            }else{
            update.setName(jeditName.getText());
            update.setLastname(jeditLastname.getText());
            update.setEmail(jeditEmail.getText());
            update.setPassword(jeditPassword.getText());
            if(update.getRol().equals("Team lead user")){
                update.setDepartament(jeditDepartament.getSelectedItem().toString());
            }else if(update.getRol().equals("Team member user")){
                update.setAge(jeditAge.getText());
            }
            JOptionPane.showMessageDialog(this, "User data updated successfully.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Search  by username.");
        }
    }//GEN-LAST:event_btupdateActionPerformed

    private void jeditPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeditPasswordActionPerformed

    private void jbackmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbackmenuMouseClicked
        // TODO add your handling code here:
        menuadmin m = new menuadmin();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbackmenuMouseClicked

    private void searchuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchuserActionPerformed
        // TODO add your handling code here:
        update = null;

        for(newusers u : masterclass.users){
            if(u.getUser().equals(jsearchUser.getText())){
                update = u;
                break;
            }
        }

        if(update!=null){
            jeditName.setText(update.getName());
            jeditLastname.setText(update.getLastname());
            jeditEmail.setText(update.getEmail());
            jeditPassword.setText(update.getPassword());
            jeditDepartament.setSelectedItem(update.getDepartament());
            jeditAge.setText(update.getAge());
            if(update.getRol().equals("Team lead user")){
                jeditAge.setEditable(true);
                jeditDepartament.setEditable(false);
                jeditDepartament.setSelectedItem("Departament");
            }else if(update.getRol().equals("Team member user")){
                jeditDepartament.setEditable(true);
                jeditAge.setEditable(false);
                jeditAge.setText("Age");
            }
        }else{
            JOptionPane.showMessageDialog(this, "User not exist");
        }
    }//GEN-LAST:event_searchuserActionPerformed

    private void jeditDepartamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditDepartamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jeditDepartamentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btupdate;
    private javax.swing.JPanel jbackground;
    private javax.swing.JLabel jbackmenu;
    private javax.swing.JPanel jdivclass;
    private javax.swing.JTextField jeditAge;
    private javax.swing.JComboBox<String> jeditDepartament;
    private javax.swing.JTextField jeditEmail;
    private javax.swing.JTextField jeditLastname;
    private javax.swing.JTextField jeditName;
    private javax.swing.JPasswordField jeditPassword;
    private javax.swing.JTextField jsearchUser;
    private javax.swing.JLabel jsubtitle;
    private javax.swing.JLabel jtitle;
    private javax.swing.JLabel jtitle1;
    private javax.swing.JButton searchuser;
    // End of variables declaration//GEN-END:variables
}