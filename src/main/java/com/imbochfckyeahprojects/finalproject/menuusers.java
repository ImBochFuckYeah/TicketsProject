/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.imbochfckyeahprojects.finalproject;

/**
 *
 * @author imbochfuckyeah
 */
public class menuusers extends javax.swing.JFrame {

public static newusers user;
public static String usercoockie = "";
public static String rolcoockie = "";
public static String teamcookie= "";

    /**
     * Creates new form welcomepage
     */
    public menuusers(newusers user) {
        this.user = user;
        initComponents();
        jtitleuser.setText(this.user.getUser());
        this.setLocationRelativeTo(null);
        getusercookie();
        getrolcookie();
        System.out.println(rolcoockie);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jsubtitle = new javax.swing.JLabel();
        jtitle = new javax.swing.JLabel();
        jtitleuser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jsubtitle.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jsubtitle.setForeground(new java.awt.Color(0, 153, 204));
        jsubtitle.setText("You're register, this is a welcome page");

        jtitle.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jtitle.setForeground(new java.awt.Color(102, 102, 102));
        jtitle.setText("Hello! Welcome");

        jtitleuser.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jtitleuser.setForeground(new java.awt.Color(0, 153, 204));
        jtitleuser.setText("Example");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsubtitle)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtitleuser)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtitleuser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsubtitle)
                .addContainerGap(343, Short.MAX_VALUE))
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

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));

        jMenu1.setText("Files");

        jMenuItem7.setText("view perfil");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem1.setText("create ticket");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("view tickets");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("asigned ticket");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem3MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("LogOut");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        login log = new login();
        log.setVisible(true);
        this.dispose();
        user = null;
        usercoockie = "";
        rolcoockie = "";
        teamcookie = "";
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        perfil view = new perfil();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        // TODO add your handling code here:
        createticket view = new createticket();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
        // TODO add your handling code here:
        viewalltickets view = new viewalltickets();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void jMenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MousePressed
        // TODO add your handling code here:
        addtoticket view = new addtoticket();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3MousePressed
    
    public void getusercookie(){
        for(newusers u : masterclass.users){
            if(menuusers.user.getUser().equals(u.getUser())){
                usercoockie = u.getUser();
            }
        }
    }
    
    public void getrolcookie(){
        for(newusers u : masterclass.users){
            if(menuusers.user.getRol().equals(u.getRol())){
                rolcoockie = u.getRol();
                teamcookie = u.getTeam();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jsubtitle;
    private javax.swing.JLabel jtitle;
    private javax.swing.JLabel jtitleuser;
    // End of variables declaration//GEN-END:variables
}
