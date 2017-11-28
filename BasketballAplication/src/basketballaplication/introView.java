
package basketballaplication;

import java.awt.event.ActionListener;

public class introView extends javax.swing.JFrame {

  
    public introView() {
        
        super("Basketball Teams Application");
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_teamOper = new javax.swing.JButton();
        btn_personOper = new javax.swing.JButton();
        btn_teamList = new javax.swing.JButton();
        btn_personList = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        btn_teamOper.setBackground(new java.awt.Color(0, 0, 255));
        btn_teamOper.setText("BASKETBALL TEAM OPERATIONS");
        btn_teamOper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teamOperActionPerformed(evt);
            }
        });
        jPanel2.add(btn_teamOper);
        btn_teamOper.setBounds(240, 80, 221, 61);

        btn_personOper.setBackground(new java.awt.Color(0, 0, 255));
        btn_personOper.setText("PERSON OPERATIONS");
        btn_personOper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_personOperActionPerformed(evt);
            }
        });
        jPanel2.add(btn_personOper);
        btn_personOper.setBounds(240, 180, 221, 60);

        btn_teamList.setBackground(new java.awt.Color(0, 0, 255));
        btn_teamList.setText("BASKETBALL TEAM LISTS");
        jPanel2.add(btn_teamList);
        btn_teamList.setBounds(240, 270, 221, 51);

        btn_personList.setBackground(new java.awt.Color(0, 0, 255));
        btn_personList.setText("ALL PERSONS OF TEAMS LIST");
        jPanel2.add(btn_personList);
        btn_personList.setBounds(240, 360, 221, 51);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("(For add,update and delete a person of team)");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(470, 200, 427, 25);

        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("(İnformations of a team or boar of directory of a team or persons of team) ");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(470, 280, 464, 28);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("(For add,update and delete team)");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(470, 100, 194, 26);

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("(All persons with team)");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(470, 370, 194, 24);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\where.jpg")); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 1180, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_teamOperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teamOperActionPerformed
     
    }//GEN-LAST:event_btn_teamOperActionPerformed

    private void btn_personOperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_personOperActionPerformed
 
    }//GEN-LAST:event_btn_personOperActionPerformed

     void btnTeamOpera(ActionListener forTO)
    {
        btn_teamOper.addActionListener(forTO);
    }
     
     void btnPersonOpera(ActionListener forPO)
     {
         btn_personOper.addActionListener(forPO);
     }
     
     void btnTeamList(ActionListener forTL)
     {
         btn_teamList.addActionListener(forTL);
     }
     
     void btnPersonList(ActionListener forPL)
     {
         btn_personList.addActionListener(forPL);
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_personList;
    private javax.swing.JButton btn_personOper;
    private javax.swing.JButton btn_teamList;
    private javax.swing.JButton btn_teamOper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

 
}
