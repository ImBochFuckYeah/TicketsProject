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
public class viewallusers extends javax.swing.JFrame {

    //private newusers search;
    /**
     * Creates new form viewallusers
     */
    public viewallusers() {
        initComponents();
        this.setLocationRelativeTo(null);
        setdatatable(masterclass.users, "all");
    }

private void setdatatable(ArrayList<newusers> users, String filter){

        if (filter.equals("all") || filter.equals("normal")) {
            DefaultTableModel data = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol"}, users.size());
            datausers.setModel(data);

            TableModel model = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                model.setValueAt(datau.getName(), i, 0);
                model.setValueAt(datau.getLastname(), i, 1);
                model.setValueAt(datau.getEmail(), i, 2);
                model.setValueAt(datau.getUser(), i, 3);
                model.setValueAt(datau.getRol(), i, 4);
            }
        }

         else if(filter.equals("member")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol", "Departament"}, users.size());
            datausers.setModel(dataM);

            TableModel modelM = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                modelM.setValueAt(datau.getName(), i, 0);
                modelM.setValueAt(datau.getLastname(), i, 1);
                modelM.setValueAt(datau.getEmail(), i, 2);
                modelM.setValueAt(datau.getUser(), i, 3);
                modelM.setValueAt(datau.getRol(), i, 4);
                modelM.setValueAt(datau.getDepartament(), i, 5);
            }
        }

         else if(filter.equals("leader")) {
            DefaultTableModel dataL = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol", "Age"}, users.size());
            datausers.setModel(dataL);

            TableModel modelL = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                modelL.setValueAt(datau.getName(), i, 0);
                modelL.setValueAt(datau.getLastname(), i, 1);
                modelL.setValueAt(datau.getEmail(), i, 2);
                modelL.setValueAt(datau.getUser(), i, 3);
                modelL.setValueAt(datau.getRol(), i, 4);
                modelL.setValueAt(datau.getAge(), i, 5);
            }
        }
        
        else if(filter.equals("alldepartament")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol", "Departament"}, users.size());
            datausers.setModel(dataM);

            TableModel modelM = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                modelM.setValueAt(datau.getName(), i, 0);
                modelM.setValueAt(datau.getLastname(), i, 1);
                modelM.setValueAt(datau.getEmail(), i, 2);
                modelM.setValueAt(datau.getUser(), i, 3);
                modelM.setValueAt(datau.getRol(), i, 4);
                modelM.setValueAt(datau.getDepartament(), i, 5);
            }
        }
        
        else if(filter.equals("sales")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol", "Departament"}, users.size());
            datausers.setModel(dataM);

            TableModel modelM = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                modelM.setValueAt(datau.getName(), i, 0);
                modelM.setValueAt(datau.getLastname(), i, 1);
                modelM.setValueAt(datau.getEmail(), i, 2);
                modelM.setValueAt(datau.getUser(), i, 3);
                modelM.setValueAt(datau.getRol(), i, 4);
                modelM.setValueAt(datau.getDepartament(), i, 5);
            }
        }
        
        else if(filter.equals("rrhh")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol", "Departament"}, users.size());
            datausers.setModel(dataM);

            TableModel modelM = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                modelM.setValueAt(datau.getName(), i, 0);
                modelM.setValueAt(datau.getLastname(), i, 1);
                modelM.setValueAt(datau.getEmail(), i, 2);
                modelM.setValueAt(datau.getUser(), i, 3);
                modelM.setValueAt(datau.getRol(), i, 4);
                modelM.setValueAt(datau.getDepartament(), i, 5);
            }
        }
        
        else if(filter.equals("it")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol", "Departament"}, users.size());
            datausers.setModel(dataM);

            TableModel modelM = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                modelM.setValueAt(datau.getName(), i, 0);
                modelM.setValueAt(datau.getLastname(), i, 1);
                modelM.setValueAt(datau.getEmail(), i, 2);
                modelM.setValueAt(datau.getUser(), i, 3);
                modelM.setValueAt(datau.getRol(), i, 4);
                modelM.setValueAt(datau.getDepartament(), i, 5);
            }
        }
        
        else if(filter.equals("accounting")) {
            DefaultTableModel dataM = new DefaultTableModel(new String[]{"Name", "Lastname", "Email", "User", "Rol", "Departament"}, users.size());
            datausers.setModel(dataM);

            TableModel modelM = datausers.getModel();

            for (int i = 0; i < users.size(); i++) {
                newusers datau = users.get(i);
                modelM.setValueAt(datau.getName(), i, 0);
                modelM.setValueAt(datau.getLastname(), i, 1);
                modelM.setValueAt(datau.getEmail(), i, 2);
                modelM.setValueAt(datau.getUser(), i, 3);
                modelM.setValueAt(datau.getRol(), i, 4);
                modelM.setValueAt(datau.getDepartament(), i, 5);
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
        jrol = new javax.swing.JComboBox<>();
        jsubtitle1 = new javax.swing.JLabel();
        jsubtitle2 = new javax.swing.JLabel();
        jdepartament = new javax.swing.JComboBox<>();

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

        jrol.setBackground(new java.awt.Color(249, 249, 249));
        jrol.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jrol.setForeground(new java.awt.Color(153, 153, 153));
        jrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All users", "Normal users", "Lead team users", "Team member users" }));
        jrol.setBorder(null);
        jrol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jrolItemStateChanged(evt);
            }
        });
        jrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrolActionPerformed(evt);
            }
        });

        jsubtitle1.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jsubtitle1.setForeground(new java.awt.Color(102, 102, 102));
        jsubtitle1.setText("Filter by:");

        jsubtitle2.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jsubtitle2.setForeground(new java.awt.Color(102, 102, 102));
        jsubtitle2.setText("Filter by departament:");

        jdepartament.setBackground(new java.awt.Color(249, 249, 249));
        jdepartament.setFont(new java.awt.Font("Comfortaa", 0, 15)); // NOI18N
        jdepartament.setForeground(new java.awt.Color(153, 153, 153));
        jdepartament.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select the department", "Sales", "RRHH", "IT", "Accounting" }));
        jdepartament.setBorder(null);
        jdepartament.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jdepartamentItemStateChanged(evt);
            }
        });
        jdepartament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdepartamentActionPerformed(evt);
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
                        .addComponent(jsubtitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(divclassLayout.createSequentialGroup()
                        .addComponent(jtitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbackmenu))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, divclassLayout.createSequentialGroup()
                        .addGroup(divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jsubtitle2)
                            .addComponent(jsubtitle1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jdepartament, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrol, 0, 502, Short.MAX_VALUE))))
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
                    .addComponent(jrol, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsubtitle1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(divclassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdepartament, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsubtitle2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
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
        menuadmin m = new menuadmin();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbackmenuMouseClicked

    private void jrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrolActionPerformed

    private void jrolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jrolItemStateChanged
        String filter = jrol.getSelectedItem().toString();
        String filter2 = "";
        ArrayList<newusers> dataUsers = new ArrayList<>();

        switch(filter){
            case "All users":
                filter = "all";
                filter2 = "all";
                break;
            case "Normal users":
                filter = "Normal user";
                filter2 = "normal";
                break;
            case "Lead team users":
                filter = "Team lead user";
                filter2 = "leader";
                break;
            case "Team member users":
                filter = "Team member user";
                filter2 = "member";
                break;
        }

        if(filter.equals("all")){
            dataUsers = masterclass.users;
        }else{
            for (newusers u: masterclass.users) {
                if (filter.equals(u.getRol())){
                    dataUsers.add(u);
                }
            }
        }

        setdatatable(dataUsers, filter2);
    }//GEN-LAST:event_jrolItemStateChanged

    private void jdepartamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdepartamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdepartamentActionPerformed

    private void jdepartamentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jdepartamentItemStateChanged
        // TODO add your handling code here:
        String filterD = jdepartament.getSelectedItem().toString();
        String filter2 = "";
        ArrayList<newusers> dataUsers = new ArrayList<>();

        switch(filterD){
            case "Select the department":
                filterD = "alldepartament";
                filter2 = "alldepartament";
                break;
            case "Sales":
                filterD = "Sales";
                filter2 = "sales";
                break;
            case "RRHH":
                filterD = "RRHH";
                filter2 = "rrhh";
                break;
            case "IT":
                filterD = "IT";
                filter2 = "it";
                break;
            case "Accounting":
                filterD = "Accounting";
                filter2 = "accounting";
                break;    
        }

        if(filterD.equals("alldepartament")){
            dataUsers = masterclass.users;
        }else{
            for (newusers u: masterclass.users) {
                if (filterD.equals(u.getDepartament())){
                    dataUsers.add(u);
                }
            }
        }

        setdatatable(dataUsers, filter2);
    }//GEN-LAST:event_jdepartamentItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTable datausers;
    private javax.swing.JPanel divclass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbackmenu;
    private javax.swing.JComboBox<String> jdepartament;
    private javax.swing.JComboBox<String> jrol;
    private javax.swing.JLabel jsubtitle;
    private javax.swing.JLabel jsubtitle1;
    private javax.swing.JLabel jsubtitle2;
    private javax.swing.JLabel jtitle;
    // End of variables declaration//GEN-END:variables
}
