/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.imbochfckyeahprojects.finalproject;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;

/**
 *
 * @author imbochfuckyeah
 */
public class viewalltickets extends javax.swing.JFrame {

    /**
     * Creates new form viewallusers
     */
    public viewalltickets() {
        initComponents();
        this.setLocationRelativeTo(null);
        validaterol();
    }

private void setdatatable(ArrayList<newticket> ticket, String filter){

        if (filter.equals("all")) {
            DefaultTableModel data = new DefaultTableModel(new String[]{"Id", "Title", "Descrip", "Date i", "User c", "User a", "Status", "Date f"}, ticket.size());
            datausers.setModel(data);

            TableModel model = datausers.getModel();

            for (int i = 0; i < ticket.size(); i++) {
                newticket datau = ticket.get(i);
                model.setValueAt(datau.getId(), i, 0);
                model.setValueAt(datau.getTitle(), i, 1);
                model.setValueAt(datau.getDescrip(), i, 2);
                model.setValueAt(datau.getStartdate(), i, 3);
                model.setValueAt(datau.getUsercreated(), i, 4);
                model.setValueAt(datau.getUserasigned(), i, 5);
                model.setValueAt(datau.getStatus(), i, 6);
                model.setValueAt(datau.getFinishdate(), i, 7);
            }
        }

         else if(filter.equals("Not assigned")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Id", "Title", "Descrip", "Date i", "User c", "User a", "Status", "Date f"}, ticket.size());
            datausers.setModel(dataM);

            TableModel model = datausers.getModel();

            for (int i = 0; i < ticket.size(); i++) {
                newticket datau = ticket.get(i);
                model.setValueAt(datau.getId(), i, 0);
                model.setValueAt(datau.getTitle(), i, 1);
                model.setValueAt(datau.getDescrip(), i, 2);
                model.setValueAt(datau.getStartdate(), i, 3);
                model.setValueAt(datau.getUsercreated(), i, 4);
                model.setValueAt(datau.getUserasigned(), i, 5);
                model.setValueAt(datau.getStatus(), i, 6);
                model.setValueAt(datau.getFinishdate(), i, 7);
            }
        }
        
        else if(filter.equals("In process")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Id", "Title", "Descrip", "Date i", "User c", "User a", "Status", "Date f"}, ticket.size());
            datausers.setModel(dataM);

            TableModel model = datausers.getModel();

            for (int i = 0; i < ticket.size(); i++) {
                newticket datau = ticket.get(i);
                model.setValueAt(datau.getId(), i, 0);
                model.setValueAt(datau.getTitle(), i, 1);
                model.setValueAt(datau.getDescrip(), i, 2);
                model.setValueAt(datau.getStartdate(), i, 3);
                model.setValueAt(datau.getUsercreated(), i, 4);
                model.setValueAt(datau.getUserasigned(), i, 5);
                model.setValueAt(datau.getStatus(), i, 6);
                model.setValueAt(datau.getFinishdate(), i, 7);
            }
        }
        
        else if(filter.equals("Refused")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Id", "Title", "Descrip", "Date i", "User c", "User a", "Status", "Date f"}, ticket.size());
            datausers.setModel(dataM);

            TableModel model = datausers.getModel();

            for (int i = 0; i < ticket.size(); i++) {
                newticket datau = ticket.get(i);
                model.setValueAt(datau.getId(), i, 0);
                model.setValueAt(datau.getTitle(), i, 1);
                model.setValueAt(datau.getDescrip(), i, 2);
                model.setValueAt(datau.getStartdate(), i, 3);
                model.setValueAt(datau.getUsercreated(), i, 4);
                model.setValueAt(datau.getUserasigned(), i, 5);
                model.setValueAt(datau.getStatus(), i, 6);
                model.setValueAt(datau.getFinishdate(), i, 7);
            }
        }
        
        else if(filter.equals("Resolved")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Id", "Title", "Descrip", "Date i", "User c", "User a", "Status", "Date f"}, ticket.size());
            datausers.setModel(dataM);

            TableModel model = datausers.getModel();

            for (int i = 0; i < ticket.size(); i++) {
                newticket datau = ticket.get(i);
                model.setValueAt(datau.getId(), i, 0);
                model.setValueAt(datau.getTitle(), i, 1);
                model.setValueAt(datau.getDescrip(), i, 2);
                model.setValueAt(datau.getStartdate(), i, 3);
                model.setValueAt(datau.getUsercreated(), i, 4);
                model.setValueAt(datau.getUserasigned(), i, 5);
                model.setValueAt(datau.getStatus(), i, 6);
                model.setValueAt(datau.getFinishdate(), i, 7);
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        divclass = new javax.swing.JPanel();
        jtitle = new javax.swing.JLabel();
        jsubtitle = new javax.swing.JLabel();
        jbackmenu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datausers = new javax.swing.JTable();
        jsubtitle2 = new javax.swing.JLabel();
        jstatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 153, 204));
        background.setForeground(new java.awt.Color(0, 153, 204));

        divclass.setBackground(new java.awt.Color(255, 255, 255));

        jtitle.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jtitle.setForeground(new java.awt.Color(102, 102, 102));
        jtitle.setText("View users");

        jsubtitle.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jsubtitle.setForeground(new java.awt.Color(0, 153, 204));
        jsubtitle.setText("Here you can check all the data about the users.");

        jbackmenu.setFont(new java.awt.Font("Comfortaa", 0, 10)); // NOI18N
        jbackmenu.setForeground(new java.awt.Color(102, 102, 102));
        jbackmenu.setText("Back to menu");
        jbackmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbackmenuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbackmenuMousePressed(evt);
            }
        });

        datausers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(datausers);

        jsubtitle2.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jsubtitle2.setForeground(new java.awt.Color(102, 102, 102));
        jsubtitle2.setText("Filter by status:");

        jstatus.setBackground(new java.awt.Color(249, 249, 249));
        jstatus.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jstatus.setForeground(new java.awt.Color(153, 153, 153));
        jstatus.setBorder(null);
        jstatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jstatusItemStateChanged(evt);
            }
        });
        jstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout divclassLayout = new javax.swing.GroupLayout(divclass);
        divclass.setLayout(divclassLayout);
        divclassLayout.setHorizontalGroup(
            divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(divclassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addGroup(divclassLayout.createSequentialGroup()
                        .addComponent(jtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbackmenu))
                    .addGroup(divclassLayout.createSequentialGroup()
                        .addComponent(jsubtitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(divclassLayout.createSequentialGroup()
                        .addComponent(jsubtitle2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        divclassLayout.setVerticalGroup(
            divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divclassLayout.createSequentialGroup()
                .addGroup(divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(divclassLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(divclassLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbackmenu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsubtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsubtitle2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(divclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(divclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbackmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbackmenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbackmenuMouseClicked

    private void jstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstatusActionPerformed

    private void jstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jstatusItemStateChanged
        // TODO add your handling code here:
        String filter = "";
        String filterUser = menuusers.usercoockie;
        String filterRol = menuusers.rolcoockie;
        String filterTeam = menuusers.teamcookie;
        ArrayList<newticket> ticketu = new ArrayList<>();

        switch (jstatus.getSelectedIndex()){
            case 0:
                filter = "all";
            break;
            case 1:
                filter = "Not assigned";
            break;
            case 2:
                filter = "In process";
            break;
            case 3:
                filter = "Refused";
            break;
            case 4:
                filter = "Resolved";
            break;
        }
        
        if(filterRol.equals("Normal user")){ //Si es usuario normal
            
            if(filter.equals("all")){
                for (newticket u: masterclass.ticket) {
                    if (filterUser.equals(u.getUsercreated())){
                        ticketu.add(u);
                    }
                }
            }else{
                for (newticket u: masterclass.ticket) {
                    if (filter.equals(u.getStatus())&&filterUser.equals(u.getUsercreated())){
                        ticketu.add(u);
                    }
                }
            }
            
        }else if(filterRol.equals("Team lead user")){ //Si es lider de equipo
            
            if(filter.equals("all")){
                for (newticket u: masterclass.ticket) {
                    if (filterTeam.equals(u.getTeamasigned())){
                        ticketu.add(u);
                    }
                }
            }else{
                for (newticket u: masterclass.ticket) {
                    if (filter.equals(u.getStatus())&&filterTeam.equals(u.getTeamasigned())){
                        ticketu.add(u);
                    }
                }
            }
            
        }else if(filterRol.equals("Team member user")){ //Si es usuario miembro
        }else{ //Si no encuentra el rol
            JOptionPane.showMessageDialog(this, "Nonexistent role");
        }
        
        setdatatable(ticketu, filter);
    }//GEN-LAST:event_jstatusItemStateChanged

    private void jbackmenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbackmenuMousePressed
        // TODO add your handling code here:
        if(menuusers.rolcoockie.equals("admin")){
            menuadmin view = new menuadmin();
            view.setVisible(true);
            this.dispose();
        
        }else{
            menuusers view = new menuusers(menuusers.user);
            view.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbackmenuMousePressed

    public void setcombo() {
        jstatus.addItem("Select status");
        jstatus.addItem("Not assigned");
        jstatus.addItem("In process");
        jstatus.addItem("Refused");
        jstatus.addItem("Resolved");
    }
    
    public void validaterol(){
        switch(menuusers.rolcoockie){
            case "admin":
                setdatatableadmin();
                break;
            case "Normal user":
                setcombo();
                break;
            case "Team lead user":
                setcombo();
                break;
        }
    }
    
    public void setdatatableadmin(){
        
            jsubtitle2.setVisible(false);
            jstatus.setVisible(false);
        
            DefaultTableModel data = new DefaultTableModel(new String[]{"Id", "Title", "Descrip", "Date i", "User c", "User a", "Status", "Date f"}, masterclass.ticket.size());
            datausers.setModel(data);
            TableModel model = datausers.getModel();

            for (int i = 0; i < masterclass.ticket.size(); i++) {
                newticket datau = masterclass.ticket.get(i);
                model.setValueAt(datau.getId(), i, 0);
                model.setValueAt(datau.getTitle(), i, 1);
                model.setValueAt(datau.getDescrip(), i, 2);
                model.setValueAt(datau.getStartdate(), i, 3);
                model.setValueAt(datau.getUsercreated(), i, 4);
                model.setValueAt(datau.getUserasigned(), i, 5);
                model.setValueAt(datau.getStatus(), i, 6);
                model.setValueAt(datau.getFinishdate(), i, 7);
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTable datausers;
    private javax.swing.JPanel divclass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbackmenu;
    private javax.swing.JComboBox<String> jstatus;
    private javax.swing.JLabel jsubtitle;
    private javax.swing.JLabel jsubtitle2;
    private javax.swing.JLabel jtitle;
    // End of variables declaration//GEN-END:variables
}
